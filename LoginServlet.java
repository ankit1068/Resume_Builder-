
package com.example.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet") // Ensure this matches the `action` in your HTML form
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        response.setContentType("text/html");
        
        // Simple validation logic (replace with database check as needed)
        if ("admin".equals(username) && "password".equals(password)) {
            // Redirect to index2.html on successful login
            response.sendRedirect("index2.html");
        } else {
            // Display an error message if login fails
            PrintWriter out = response.getWriter();
            out.println("<h3>Invalid username or password. Please try again.</h3>");
            out.println("<a href='loginpage2.html'>Back to Login</a>");
        }
    }
}

