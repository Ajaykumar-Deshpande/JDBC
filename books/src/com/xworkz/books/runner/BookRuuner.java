package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.books.constants.BooksCoonection;

public class BookRuuner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Connection connection=null;
			try {
			connection=	DriverManager.getConnection(BooksCoonection.URL.getValue(),BooksCoonection.USERNAME.getValue(),BooksCoonection.PASSWORD.getValue());
			PreparedStatement preparedStatement=connection.prepareStatement("insert into books_table values(?,?,?)");
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "monkey_king");
			preparedStatement.setInt(3, 120);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Mahabaharta");
			preparedStatement.setInt(3, 130);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Loyality");
			preparedStatement.setInt(3, 145);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "RomeyoJuliate");
			preparedStatement.setInt(3, 170);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "kingdom");
			preparedStatement.setInt(3, 180);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "Queen of Village");
			preparedStatement.setInt(3, 150);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "Corona");
			preparedStatement.setInt(3, 200);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "Consitution");
			preparedStatement.setInt(3, 170);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "Indian");
			preparedStatement.setInt(3,160);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "Election");
			preparedStatement.setInt(3, 145);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Knock Out");
			preparedStatement.setInt(3, 120);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "Ub Eport");
			preparedStatement.setInt(3, 145);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 13);
			preparedStatement.setString(2, "Original Bira");
			preparedStatement.setInt(3, 180);
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1,14);
			preparedStatement.setString(2, "Moral Book");
			preparedStatement.setInt(3, 200);
			preparedStatement.addBatch();
			
			
			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "JungleBook");
			preparedStatement.setInt(3, 130);
			preparedStatement.addBatch();
			
			int[] rowInserted=preparedStatement.executeBatch();
			System.out.println(rowInserted.length+" added values into books_table ");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}


