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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventId = request.getParameter("id");
		List<SubscriptionsEntity> subscriptions = new SubscriptionsListQuery().execute(eventId);
		request.setAttribute("subscriptions", subscriptions);
		request.setAttribute("eventId", eventId);
		renderView("subscriptions/SubscriptionList.jsp", request, response);
	}
}