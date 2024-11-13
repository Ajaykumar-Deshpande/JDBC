package com.xworkz.animal.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.animal.constants.AnimalConnection;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(AnimalConnection.URL.getValue(),
					AnimalConnection.USERNAME.getValue(), AnimalConnection.PASSWORD.getValue());
			PreparedStatement preparedStatement = connection.prepareStatement("insert into animal_table values(?,?,?)");

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "DOG");
			preparedStatement.setInt(3, 3000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "CAT");
			preparedStatement.setInt(3, 2000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Puppy");
			preparedStatement.setInt(3, 1500);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Snake");
			preparedStatement.setInt(3, 7000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Dove");
			preparedStatement.setInt(3, 200);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "Cow");
			preparedStatement.setInt(3, 30000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "Ox");
			preparedStatement.setInt(3, 20000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "Goat");
			preparedStatement.setInt(3, 12000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "Parrots");
			preparedStatement.setInt(3, 1200);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "Sheep");
			preparedStatement.setInt(3, 35000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "ELEPHENT");
			preparedStatement.setInt(3, 80000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "Birds");
			preparedStatement.setInt(3, 500);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 13);
			preparedStatement.setString(2, "Hybdrid Dog");
			preparedStatement.setInt(3, 9000);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 14);
			preparedStatement.setString(2, "Hybrid Cat");
			preparedStatement.setInt(3, 2200);
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "Mudhol Dog");
			preparedStatement.setInt(3, 23000);
			preparedStatement.addBatch();

			int[] rowInserted = preparedStatement.executeBatch();
			System.out.println(rowInserted.length + " added values into animal_table ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
