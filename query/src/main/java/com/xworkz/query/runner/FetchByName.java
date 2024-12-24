package com.xworkz.query.runner;

import java.sql.*;

public class FetchByName {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/collage";
            String userName = "root";
            String password = "Ajay@787898";
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            String query = "select * from laptop where laptop_brand='samsung'";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int laptop_id = resultSet.getInt(1);
                String laptop_brand = resultSet.getString(2);
                Double laptop_price = resultSet.getDouble(3);

                System.out.println("laptop_id: " + laptop_id + "  laptop_brand: " + laptop_brand + "  laptop_price: " + laptop_price);
            }

    } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (connection !=null){
                    connection.close();
                }
                if (statement !=null){
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        }
    }