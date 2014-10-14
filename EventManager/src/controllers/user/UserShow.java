package controllers.user;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.common.EventManagerServlet;

@WebServlet("/user")
public class UserShow extends EventManagerServlet {

    public UserShow() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user = new UserBean();
		request.setAttribute("user", user);
		renderView("user/UserShow.jsp", request, response);
	}
}
