package controllers.subscription;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SubscriptionsValidator;

import org.demo.bean.jpa.SubscriptionsEntity;
import org.demo.persistence.services.jpa.SubscriptionsPersistenceJPA;

import controllers.common.EventManagerServlet;

@WebServlet("/subscribe")
public class SubscriptionNew extends EventManagerServlet {

    public SubscriptionNew() { super(); }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventId = request.getParameter("eventId");
		
		SubscriptionsEntity s = new SubscriptionsValidator().validate(
				request.getParameter("userEmail"), 
				request.getParameter("eventFirstName"), 
				request.getParameter("userLastName"), 
				request.getParameter("userCompany"),
				eventId);
		
		if (s != null) {
			new SubscriptionsPersistenceJPA().insert(s);
			redirectTo("/event?id=" + eventId + "&subscribed=true", request, response);
		}
		else {
			redirectTo("/event?id=" + eventId + "&invalid=true", request, response);
		}
	}
}
