package com.xworkz.bag.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bag.constants.ConnectionBag;
import com.xworkz.bag.dto.BagDto;

public class BagRepositoryImpl implements BagRepository {

	@Override
	public boolean save(BagDto bagDto) {

		Connection connection = null;
		PreparedStatement prep = null;
		boolean isValid = false;

		try {
			connection = DriverManager.getConnection(ConnectionBag.URL.getValue(), ConnectionBag.PASSWORD.getValue(),
					ConnectionBag.USERNAME.getValue());

			prep = connection.prepareStatement("INSERT INTO form_data (name, email, age, contact) VALUES (?, ?, ?, ?)");
			prep.setString(1, bagDto.getName());
			prep.setString(2, bagDto.getEmail());
			prep.setInt(3, bagDto.getAge());
			prep.setLong(4, bagDto.getContact());

			int value = prep.executeUpdate();
			if (value > 0) {
				System.out.println("data saved");
				isValid = true;
			} else {
				System.out.println("data not saved");
				isValid = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
