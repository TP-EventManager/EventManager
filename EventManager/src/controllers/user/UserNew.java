package controllers.user;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.bean.jpa.UsersEntity;

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
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit1");
		EntityManager em = emf.createEntityManager();
		
		 em.persist(new_user);
		
		
		em.close();
		emf.close();
	}
}
