package com.xworkz.flower.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xwokz.flower.constants.FlowerConnection;

public class FlowerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(FlowerConnection.URL.getValue(),
					FlowerConnection.USERNAME.getValue(), FlowerConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into flower_table values(?,?,?)");

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "ROSE");
			preparedStatement.setInt(3, 30);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Black Orchid");
			preparedStatement.setInt(3, 50);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Kadpul Flower");
			preparedStatement.setInt(3, 25);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Gloriosa Lily");
			preparedStatement.setInt(3, 60);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Gold Kinabalu Orchid");
			preparedStatement.setInt(3, 80);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "Lotas");
			preparedStatement.setInt(3, 10);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "Jullite Rose");
			preparedStatement.setInt(3, 55);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "Hydranges");
			preparedStatement.setInt(3, 20);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "Saffron crocous");
			preparedStatement.setInt(3, 15);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "Snenzhen Nongke");
			preparedStatement.setInt(3, 80);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Black Orcid");
			preparedStatement.setInt(3, 25);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "Local Flower");
			preparedStatement.setInt(3, 22);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 13);
			preparedStatement.setString(2, "Mango Flower");
			preparedStatement.setInt(3, 5);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 14);
			preparedStatement.setString(2, " Dragon Flower");
			preparedStatement.setInt(3, 25);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "Komal Flower");
			preparedStatement.setInt(3, 605);
			preparedStatement.addBatch();

			int[] rowInserted = preparedStatement.executeBatch();
			System.out.println(rowInserted.length + " added values into flower_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
