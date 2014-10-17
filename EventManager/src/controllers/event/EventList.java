package controllers.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.common.EventManagerServlet;
import controllers.user.UserBean;

@WebServlet("/events")
public class EventList extends EventManagerServlet {
	
    public EventList() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<EventBean> events = new ArrayList<EventBean>();
		events.add(new EventBean());
		events.add(new EventBean());
		events.add(new EventBean());
		events.add(new EventBean());
		UserBean user = new UserBean();
		request.setAttribute("events", events);
		request.setAttribute("user", user);
		renderView("event/EventList.jsp", request, response);
	}
}

