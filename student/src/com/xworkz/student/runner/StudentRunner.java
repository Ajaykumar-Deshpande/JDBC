package com.xworkz.student.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/student";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO student_table  VALUES"
				
				+ "(1,'Alice Johnson', 'Computer Science', 'alice.johnson@example.com', 'password123', '555-0101', '2000-01-15', 'A', '123 College Rd', 'CS001', 'Yes', 'Top Performer 2023'),"
				+ "(2,'Bob Smith', 'Mechanical Engineering', 'bob.smith@example.com', 'password123', '555-0102', '1999-03-22', 'B', '456 University Ave', 'ME001', 'No', 'Best Design 2023'),"
				+ "(3,'Charlie Brown', 'Electrical Engineering', 'charlie.brown@example.com', 'password123', '555-0103', '2001-07-30', 'A', '789 Campus St', 'EE001', 'Yes', 'Outstanding Student 2023'),"
				+ "(4,'David White', 'Business Administration', 'david.white@example.com', 'password123', '555-0104', '2000-10-12', 'C', '101 College Park', 'BA001', 'No', 'Leadership Award 2023'),"
				+ "(5,'Eve Black', 'Chemical Engineering', 'eve.black@example.com', 'password123', '555-0105', '1999-11-05', 'B+', '202 Scholar Blvd', 'CE001', 'Yes', 'Innovation in Chemistry 2023'),"
				+ "(6,'Frank Green', 'Civil Engineering', 'frank.green@example.com', 'password123', '555-0106', '2001-02-18', 'B-', '303 University Dr', 'CE002', 'No', 'Research Excellence 2023'),"
				+ "(7,'Grace Lee', 'Mathematics', 'grace.lee@example.com', 'password123', '555-0107', '2000-09-01', 'A+', '404 Elm St', 'MATH001', 'Yes', 'Gold Medal in Mathematics 2023'),"
				+ "(8,'Hannah Clark', 'Biology', 'hannah.clark@example.com', 'password123', '555-0108', '2001-04-10', 'B', '505 Oak St', 'BIO001', 'Yes', 'Research in Biology 2023'),"
				+ "(9,'Isaac Scott', 'Physics', 'isaac.scott@example.com', 'password123', '555-0109', '2000-12-25', 'A', '606 Maple Rd', 'PHY001', 'Yes', 'Physics Olympiad Gold 2023'),"
				+ "(10,'Jackie Taylor', 'Computer Science', 'jackie.taylor@example.com', 'password123', '555-0110', '1999-08-15', 'A-', '707 Pine Blvd', 'CS002', 'No', 'Hackathon Winner 2023'),"
				+ "(11,'Kathy Davis', 'Law', 'kathy.davis@example.com', 'password123', '555-0111', '2000-06-03', 'B+', '808 Birch Ln', 'LAW001', 'Yes', 'Best Moot Court Advocate 2023'),"
				+ "(12,'Liam Wilson', 'Psychology', 'liam.wilson@example.com', 'password123', '555-0112', '2001-05-09', 'A', '909 Cedar Rd', 'PSY001', 'Yes', 'Best Psychology Thesis 2023'),"
				+ "(13,'Mona Harris', 'Art History', 'mona.harris@example.com', 'password123', '555-0113', '2000-08-25', 'B', '1010 Willow Way', 'AH001', 'No', 'Art Exhibition Award 2023'),"
				+ "(14,'Nathan Martin', 'Sociology', 'nathan.martin@example.com', 'password123', '555-0114', '2001-11-11', 'A-', '1111 Oak St', 'SOC001', 'Yes', 'Best Sociology Paper 2023'),"
				+ "(15,'Olivia Carter', 'Architecture', 'olivia.carter@example.com', 'password123', '555-0115', '1999-12-20', 'B+', '1212 Maple Dr', 'ARC001', 'Yes', 'Best Design Project 2023'),"
				+ "(16,'Paul Walker', 'Philosophy', 'paul.walker@example.com', 'password123', '555-0116', '2000-09-30', 'B-', '1313 Redwood Rd', 'PHI001', 'No', 'Best Research in Philosophy 2023'),"
				+ "(17,'Quincy King', 'Political Science', 'quincy.king@example.com', 'password123', '555-0117', '2001-01-13', 'A', '1414 Pinecrest Rd', 'POLSCI001', 'Yes', 'Political Debate Champion 2023'),"
				+ "(18,'Rita Adams', 'Marketing', 'rita.adams@example.com', 'password123', '555-0118', '2000-10-01', 'B', '1515 Cherry Ln', 'MKT001', 'No', 'Top Sales Pitch 2023'),"
				+ "(19,'Steve Hall', 'Journalism', 'steve.hall@example.com', 'password123', '555-0119', '2001-03-18', 'B+', '1616 Elm Cir', 'JOUR001', 'Yes', 'Best News Report 2023'),"
				+ "(20,'Tracy White', 'History', 'tracy.white@example.com', 'password123', '555-0120', '2000-07-05', 'A+', '1717 Maple Rd', 'HIS001', 'Yes', 'Historical Research Award 2023')";

		String selectQuery = "select student_name from student_table where student_email='alice.johnson@example.com' and student_password='password123';";
		String selectQuery1 = "select student_address from student_table where student_name='Steve Hall' and student_phoneNo='555-0119';";
		String selectQuery2 = "select student_email,student_password from student_table where student_phoneNo='555-0118';";
		String selectQuery3 = "select student_email,student_password from student_table where student_phoneNo='555-0105' and student_name='Eve Black';";
		String selectQuery4 = "select student_name from student_table where id>10";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			// int result = statement.executeUpdate(insertQuery);
			// if (result > 0)
			// System.out.println("Saved into Database");
			// else
			// System.err.println("Not saved into Database");

			ResultSet resultSet = statement.executeQuery(selectQuery);
			if (resultSet.next()) {
				System.out.println(resultSet.getString("student_name"));
			} else
				System.err.println("Not Found");

			System.out.println("###############################");

			ResultSet resultSet1 = statement.executeQuery(selectQuery1);
			if (resultSet1.next()) {
				System.out.println(resultSet1.getString("student_address"));
			} else
				System.err.println("Not Found");
			System.out.println("###############################");

			ResultSet resultSet2 = statement.executeQuery(selectQuery2);
			if (resultSet2.next()) {
				System.out.println(resultSet2.getString("student_email"));
				System.out.println(resultSet2.getString("student_password"));
			} else
				System.err.println("Not Found");

			System.out.println("###############################");

			ResultSet resultSet3 = statement.executeQuery(selectQuery3);
			if (resultSet3.next()) {
				System.out.println(resultSet3.getString("student_email"));
				System.out.println(resultSet3.getString("student_password"));

			} else
				System.err.println("Not Found");

			System.out.println("###############################");

			ResultSet resultSet4 = statement.executeQuery(selectQuery4);
			if (resultSet4.next()) {
				System.out.println(resultSet4.getString("student_name"));
			} else {
				System.err.println("Not Found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
