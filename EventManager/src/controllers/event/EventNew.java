package controllers.event;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EventsValidator;

import org.demo.bean.jpa.EventsEntity;
import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.UsersPersistence;
import org.demo.persistence.services.jpa.EventsPersistenceJPA;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

import controllers.common.EventManagerServlet;


@WebServlet("/event_new")
public class EventNew extends EventManagerServlet {

    public EventNew() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		renderView("event/EventNew.jsp", request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EventsEntity e = new EventsValidator().validate(
				request.getParameter("eventName"), 
				request.getParameter("eventAddress"), 
				request.getParameter("eventBegDate"), 
				request.getParameter("eventEndDate"), 
				request.getParameter("eventPublished"), 
				(String)request.getSession(false).getAttribute("token"));
		
		if (e != null) {
			new EventsPersistenceJPA().insert(e);
			redirectTo("/events", request, response);
		}
		else {
			redirectTo("/event_new?invalid=true", request, response);
		}
	}

}
