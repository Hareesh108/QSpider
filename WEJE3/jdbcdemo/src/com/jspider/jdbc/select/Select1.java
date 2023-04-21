package com.jspider.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Select1 {
	
	public static void main(String[] args) {
		
		try {
//		step 01 : Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//		step 02 : Open Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje3?"
					+ "user=root & password=root");
//		step 03 : Create Statement
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from student");
			
//		step 04: Process the result
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getString(4));
			}
			
//		step 05: Close the connection
			connection.close();
			statement.close();
			resultSet.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
