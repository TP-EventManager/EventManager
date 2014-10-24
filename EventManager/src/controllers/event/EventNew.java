package controllers.event;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.EventsEntity;
import org.demo.persistence.services.jpa.EventsPersistenceJPA;

import controllers.common.EventManagerServlet;


@WebServlet("/event_new")
public class EventNew extends EventManagerServlet {

    public EventNew() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		renderView("event/EventNew.jsp", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name      = request.getParameter("eventName");
		String address   = request.getParameter("eventAddress");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		Date begDate;
		Date endDate;
		try {
			begDate = sdf.parse(request.getParameter("eventBegDate"));
			endDate = sdf.parse(request.getParameter("eventEndDate"));
		}
		catch (ParseException e) { throw new ServletException(); }
		int published = "on".equals(request.getParameter("eventPublished")) ? 1 : 0;

		EventsEntity e = new EventsEntity();
		e.setName(name);
		e.setAddress(address);
		e.setBeginningDate(begDate);
		e.setEndDate(endDate);
		e.setPublished(published);
		
		new EventsPersistenceJPA().insert(e);
		
		redirectTo("/events", request, response);
	}

}
