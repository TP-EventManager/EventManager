package controllers.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllers.common.EventManagerServlet;

@WebServlet("/login")
public class SessionNew extends EventManagerServlet {

    public SessionNew() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		renderView("session/SessionNew.jsp", request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String email    = request.getParameter("userEmail");
		String password = request.getParameter("userPassword");
		
		if ("secret".equals(password)) {
			session.setAttribute("token", email);
			response.sendRedirect("/EventManager/user");
		}
		else {
			response.sendRedirect("/EventManager/login?error=true");
		}
	}
}
