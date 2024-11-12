package com.xworkz.worker.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.worker.constants.ConnectionConst;
import com.xworkz.worker.query.WorkerInsert;
import com.xworkz.worker.readoperation.SelectQuery1;
import com.xworkz.worker.readoperation.SelectQuery2;
import com.xworkz.worker.readoperation.SelectQuery3;
import com.xworkz.worker.readoperation.SelectQuery4;
import com.xworkz.worker.readoperation.SelectQuery5;
import com.xworkz.worker.readoperation.SelectQuery6;

public class WorkerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();
			// int result = statement.executeUpdate(new WorkerInsert().getInsertQuery());
			// if (result > 0)
			// System.out.println("Saved into Database");
			// else
			// System.err.println("Not saved into Database");

			ResultSet resultSet1 = statement.executeQuery(new SelectQuery1().getSelectQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("worker_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(new SelectQuery2().getSelectQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("worker_name"));
			}
			System.out.println("###############################");

			ResultSet resultSet3 = statement.executeQuery(new SelectQuery3().getSelectQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("worker_address"));
			}

			System.out.println("###############################");

			ResultSet resultSet4 = statement.executeQuery(new SelectQuery4().getSelectQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("worker_emaill"));
				System.out.println(resultSet4.getString("worker_password"));
			}
			System.out.println("###############################");

			ResultSet resultSet5 = statement.executeQuery(new SelectQuery5().getSelectQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("worker_emaill"));
				System.out.println(resultSet5.getString("worker_password"));

			}

			System.out.println("###############################");

			ResultSet resultSet6 = statement.executeQuery(new SelectQuery6().getSelectQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("worker_name"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
