package com.iansky.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// test connection to database
		String username="springstudent";
		String password="springstudent";
		String jdbcUrl="jdbc:mysql://localhost:3306/web_contact_manager?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter writer = response.getWriter();
			
			writer.println("Connecting to database....");
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			
			writer.println("Connection successful");
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
