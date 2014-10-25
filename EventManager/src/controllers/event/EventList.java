package controllers.event;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.EventsEntity;

import controllers.common.EventManagerServlet;
import model.EventsListQuery;

@WebServlet("/events")
public class EventList extends EventManagerServlet {
	
    public EventList() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMail  = (String)request.getSession(false).getAttribute("token");
		List<EventsEntity> events = new EventsListQuery().execute(userMail);
		request.setAttribute("events", events);
		renderView("event/EventList.jsp", request, response);
	}
}