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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eventId = request.getParameter("id");
		EventsEntity event = new EventsPersistenceJPA().load(Integer.parseInt(eventId));
		request.setAttribute("event", event);
		renderView("event/EventShow.jsp", request, response);
	}
}
