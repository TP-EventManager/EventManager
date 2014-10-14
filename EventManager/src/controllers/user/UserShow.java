package controllers.user;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class UserShow extends HttpServlet {

    public UserShow() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean user = new UserBean();
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/UserShow.jsp");
		rd.forward(request, response);
	
	}
}
