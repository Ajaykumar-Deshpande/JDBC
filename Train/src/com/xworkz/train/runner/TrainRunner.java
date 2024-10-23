package com.xworkz.train.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrainRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/collage";
		String userName = "root";
		String password = "Ajay@787898";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			if (connection != null)
				System.out.println("this is connection is connected");
			else
				System.out.println("connection is not created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}