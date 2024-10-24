package com.xworkz.hospital.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "Ajay@787898";
		String insertQuery = "INSERT INTO hospital_table VALUES (1, 'City Hospital', 'Emergency Department'),"
				+ "(2, 'General Hospital', 'Cardiology')," + "(3, 'State Hospital', 'Pediatrics'),"
				+ "(4, 'Community Health Center', 'Outpatient Services'),"
				+ "(5, 'Central Medical Clinic', 'Inpatient Services')," + "(6, 'Westside Hospital', 'Surgery'),"
				+ "(7, 'Eastside Medical Center', 'Radiology')," + "(8, 'Northview Hospital', 'Rehabilitation'),"
				+ "(9, 'Southtown Clinic', 'Pharmacy')," + "(10, 'Downtown Medical Center', 'Laboratory'),"
				+ "(11, 'Riverside Hospital', 'Maternity')," + "(12, 'Sunnydale Clinic', 'Urgent Care'),"
				+ "(13, 'Valley View Hospital', 'Intensive Care Unit')," + "(14, 'Hilltop Hospital', 'Geriatrics'),"
				+ "(15, 'Lakeside Medical Center', 'Neurology')," + "(16, 'Crescent City Hospital', 'Oncology'),"
				+ "(17, 'Greenfield Health Center', 'Dental')," + "(18, 'Maplewood Hospital', 'Orthopedics'),"
				+ "(19, 'Brookstone Clinic', 'Endoscopy')," + "(20, 'Silver Lake Hospital', 'Anesthesiology')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
