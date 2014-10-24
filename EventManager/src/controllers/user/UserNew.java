package controllers.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.UsersEntity;
import org.demo.persistence.services.jpa.UsersPersistenceJPA;

import controllers.common.EventManagerServlet;

@WebServlet({"/user_new", "/"})
public class UserNew extends EventManagerServlet {

    public UserNew() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		renderView("user/UserNew.jsp", request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		renderView("user/UserNew.jsp", request, response);
		String user_email = request.getParameter("userEmail");
		String user_password = request.getParameter("userPassword");
		
		UsersEntity new_user = new UsersEntity();
		new_user.setEmail(user_email);
		new_user.setPassword(user_password);

		new UsersPersistenceJPA().insert(new_user);
		
		redirectTo("/events", request, response);
	}
}
