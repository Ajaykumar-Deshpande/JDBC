package com.xworkz.query.runner;

import java.sql.*;

public class FetchALL {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage";
            String userName = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, userName, password);

            statement = connection.createStatement();
            String query = "select * from laptop";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int productID = resultSet.getInt(1);
                String productName = resultSet.getString(2);
                Double productPrice = resultSet.getDouble(3);

                System.out.println("laptop_Id: " + productID + "  laptop_name: " + productName + "  laptop_price: " + productPrice);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();


                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
