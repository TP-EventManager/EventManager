package controllers.common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class EventManagerServlet extends HttpServlet {

	public void renderView(String viewPath, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/templates/Main.jsp");
		request.setAttribute("view", "/jsp/" + viewPath);
		rd.forward(request, response);
	}
	
	public void redirectTo(String url, HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect(request.getContextPath() + url);
	}
}
