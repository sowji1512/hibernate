package com.hib.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hib.dao.User1Dao;
import com.hib.dao.Successservlet;;




public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserControllerServlet() {
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
        String password = request.getParameter("password1");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
     
        System.out.println(city);

            User1Dao u = new User1Dao();
            System.out.println("sowji");
            u.addUserDetails(userName, password, email, phone, city);
            RequestDispatcher rd=request.getRequestDispatcher("Success");  
            
          rd.forward(request, response);
       
	}

}
