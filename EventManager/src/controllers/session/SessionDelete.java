package controllers.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controllers.common.EventManagerServlet;

@WebServlet("/logout")
public class SessionDelete extends EventManagerServlet {

    public SessionDelete() { super(); }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession(false).invalidate();
		redirectTo("/", request, response);
	}

}
