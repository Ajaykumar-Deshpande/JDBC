package com.xworkz.officer.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.officer.constants.ConnnectionConst;
import com.xworkz.officer.query.OfficerInsert;
import com.xworkz.officer.readoperation.SelectQuery1;
import com.xworkz.officer.readoperation.SelectQuery2;
import com.xworkz.officer.readoperation.SelectQuery3;
import com.xworkz.officer.readoperation.SelectQuery4;
import com.xworkz.officer.readoperation.SelectQuery5;
import com.xworkz.officer.readoperation.SelectQuery6;

public class OfficerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnnectionConst.URL.getValue(),
					ConnnectionConst.USERNAME.getValue(), ConnnectionConst.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			// int result = statement.executeUpdate(new OfficerInsert().getInsertQuery());
			// if (result > 0)
			// System.out.println("Saved into Database");
			// else
			// System.err.println("Not saved into Database");

			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("officer_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("officer_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("officer_address"));
			}

			System.out.println("###############################");

			ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("officer_email"));
				System.out.println(resultSet4.getString("officer_password"));
			}
			System.out.println("###############################");

			ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("officer_email"));
				System.out.println(resultSet5.getString("officer_password"));

			}

			System.out.println("###############################");

			ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("officer_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
