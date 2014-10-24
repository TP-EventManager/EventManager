package controllers.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

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
		
		UsersEntity user = new UsersPersistenceJPA().load(email);
		if (user == null)
			redirectTo("/login?error=credentials", request, response);
		else if (user.getPassword().equals(password)) {
			session.setAttribute("token", email);
			redirectTo("/events", request, response);
		}
		else {
			redirectTo("/login?error=credentials", request, response);
		}
	}
}
