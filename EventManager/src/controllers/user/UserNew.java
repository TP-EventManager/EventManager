package controllers.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsersValidator;

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
		UsersEntity user = new UsersValidator().validate(
				request.getParameter("userEmail"),
				request.getParameter("userPassword"));

		if (user != null) {
			new UsersPersistenceJPA().insert(user);
			request.getSession(true).setAttribute("token", user.getEmail());
			redirectTo("/events", request, response);
		}
		else {
			redirectTo("/user_new?invalid=true", request, response);
		}
	}
}
