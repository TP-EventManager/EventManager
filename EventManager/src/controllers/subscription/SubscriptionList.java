package controllers.subscription;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SubscriptionsListQuery;

import org.demo.bean.jpa.SubscriptionsEntity;

import controllers.common.EventManagerServlet;

@WebServlet("/subscribers")
public class SubscriptionList extends EventManagerServlet {
	
    public SubscriptionList() { super(); }
    
    private int validateId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eventId;
		try { eventId = Integer.parseInt(request.getParameter("id")); }
		catch (NumberFormatException e) {
			renderView("event/EventNotFound.jsp", request, response);
			return -1;
		}
		return eventId;
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// validate id before using it
		int eventIdInteger = validateId(request, response);
		if (eventIdInteger == -1) return;
		
		String eventId = request.getParameter("id");
		List<SubscriptionsEntity> subscriptions = new SubscriptionsListQuery().execute(eventId);
		request.setAttribute("subscriptions", subscriptions);
		request.setAttribute("eventId", eventId);
		renderView("subscriptions/SubscriptionList.jsp", request, response);
	}
}