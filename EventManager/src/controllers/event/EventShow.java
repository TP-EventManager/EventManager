package controllers.event;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.common.EventManagerServlet;
import controllers.user.UserBean;

@WebServlet("/event")
public class EventShow extends EventManagerServlet {
	
    public EventShow() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EventBean event = new EventBean();
		request.setAttribute("event", event);
		renderView("event/EventShow.jsp", request, response);
	}
}
