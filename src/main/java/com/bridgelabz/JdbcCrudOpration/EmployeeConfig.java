package com.bridgelabz.JdbcCrudOpration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig 
{
	 public Connection getConfig() {
	        String dbURL = "jdbc:mysql://localhost:3306/employee_payroll_service";
	        String uname = "root";
	        String pass = "Pranay@1996";
	        Connection connection = null;

	        try {
	            connection = DriverManager.getConnection(dbURL, uname, pass);
	            if (connection != null) {
	                System.out.println("Connected!");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}
	