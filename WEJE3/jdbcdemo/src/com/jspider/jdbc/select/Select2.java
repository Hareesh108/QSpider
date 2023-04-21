package com.jspider.jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select2 {
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String url = "jdbc:mysql://localhost:3306/weje3?"+"user=root & password=root";
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url);
			
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from student");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " || "
						+ resultSet.getString(2) + " || "
						+ resultSet.getString(3) + " || "
						+ resultSet.getString(4));
			}
			
			connection.close();
			statement.close();
			resultSet.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
