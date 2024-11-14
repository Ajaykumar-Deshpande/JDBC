package com.xworkz.temples.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.temples.constants.ConnectionConst;

public class SelectQuery4 {
	public static void main(String[] args) {

		String query = "(select email,epassword from product_table where phone_number='8953345000')";
		try {
			Connection connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (!resultSet.next()) {
				System.out.println("No data found in database");
			} else {

				do {

					String email = resultSet.getString("email");
					String epassword = resultSet.getString("epassword");
					System.out.println("Email: " + email + ", Password: " + epassword);
				} while (resultSet.next());
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
