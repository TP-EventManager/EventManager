package controllers.event;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.EventsEntity;
import org.demo.persistence.services.jpa.EventsPersistenceJPA;

import controllers.common.EventManagerServlet;

@WebServlet("/event")
public class EventShow extends EventManagerServlet {
	
    public EventShow() { super(); }

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
		int eventId = validateId(request, response);
		if (eventId == -1) return;
		
		EventsEntity event = new EventsPersistenceJPA().load(eventId);
		if (event == null || event.getPublished() == 0)
			renderView("event/EventNotFound.jsp", request, response);
		else {
			request.setAttribute("event", event);
			renderView("event/EventShow.jsp", request, response);
		}
	}
}
