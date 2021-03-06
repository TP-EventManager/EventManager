package controllers.event;

import controllers.common.EventManagerServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.EventsEntity;
import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.EventsPersistence;
import org.demo.persistence.services.jpa.EventsPersistenceJPA;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

@WebServlet("/publish")
public class EventPublish extends EventManagerServlet {

    public EventPublish() { super(); }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMail  = (String)request.getSession(false).getAttribute("token");
		UsersEntity user = new UsersPersistenceJPA().load(userMail);
    	
    	int eventId = Integer.parseInt(request.getParameter("eventId"));
    	EventsPersistence ep = new EventsPersistenceJPA();
    	EventsEntity event = ep.load(eventId);
    	
    	if (user.getEmail().equals(event.getUsers().getEmail())) {
    		event.setPublished(1);
    		ep.save(event);
    		redirectTo("/event?id=" + eventId, request, response);
    	}
    }
}
