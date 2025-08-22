package servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // DB Credentials
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "welcome";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");

            ps.setString(1, username);
            ps.setString(2, password);

            int rows = ps.executeUpdate();
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");

            if (rows > 0) {
                out.println("<h3 style='color:green;'>Registration Successful!</h3>");
                out.println("<a href='login.html'>Click here to login</a>");
            } else {
                out.println("<h3 style='color:red;'>Registration Failed!</h3>");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
        }
    }
}
