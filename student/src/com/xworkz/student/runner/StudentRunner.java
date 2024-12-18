package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.student.constants.ConnectionConst;
import com.xworkz.student.readoperation.SelectQuery1;
import com.xworkz.student.readoperation.SelectQuery2;
import com.xworkz.student.readoperation.SelectQuery3;
import com.xworkz.student.readoperation.SelectQuery4;
import com.xworkz.student.readoperation.SelectQuery5;
import com.xworkz.student.readoperation.SelectQuery6;

public class StudentRunner {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			// int result = statement.executeUpdate(insertQuery);
			// if (result > 0)
			// System.out.println("Saved into Database");
			// else
			// System.err.println("Not saved into Database");

			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("student_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("student_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("student_address"));
			}

			System.out.println("###############################");

			ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getselectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("student_email"));
				System.out.println(resultSet4.getString("student_password"));
			}
			System.out.println("###############################");

			ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getselectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("student_email"));
				System.out.println(resultSet5.getString("student_password"));

			}

			System.out.println("###############################");

			ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("student_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
