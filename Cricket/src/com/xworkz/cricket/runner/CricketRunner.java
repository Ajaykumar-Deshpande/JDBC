package com.xworkz.cricket.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CricketRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/Cap";
		String userName = "root";
		String password = "Ajay@787898";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null)
				System.out.println("this is connection can be established");
			else
				System.out.println("connection is not established");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
