package com.xworkz.temples.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.temples.constants.ConnectionConst;

public class SelectQuery3 {
	public static void main(String[] args) {

		String query = "(select address from temples_table where name='Badrinath Temple' and phone_number=01382-250129)";
		try {
			Connection connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (!resultSet.next()) {
				System.out.println("No data found in database");
			} else {

				do {

					String address = resultSet.getString("address");
					System.out.println("Address: " + address);
				} while (resultSet.next());
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}