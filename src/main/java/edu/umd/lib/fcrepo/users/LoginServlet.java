package edu.umd.lib.fcrepo.users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher dispatcher;
    if (request.getRemoteUser() == null) {
      // display the login form
      dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
    } else {
      // already logged in, display the profile page
      dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
    }
    dispatcher.forward(request, response);
  }
}
