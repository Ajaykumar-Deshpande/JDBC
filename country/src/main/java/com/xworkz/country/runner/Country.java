package com.xworkz.country.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Country {
    public static void main(String[] args) {
        System.out.println("running mai in Country");
        Connection connection=null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successfully");
            String url="jdbc:mysql://localhost:3306/country";
            String userName="root";
            String password="Ajay@787898";
            connection=DriverManager.getConnection(url,userName,password);
            System.out.println("JDBC Connection Estrablished");
            String insert ="insert into country_info values(0,'india','delhi')";
            String insert1="insert into country_info values(1,'Afghanistan','kabul')";
            String insert2 ="insert into country_info values(2,'Argentina','Buenos_Aires')";
            String insert3 ="insert into country_info values(3,'Australia','Canberra')";
            String insert4 ="insert into country_info values(4,'Belgium','Brusssels')";
            Statement statement=connection.createStatement();
            int row=statement.executeUpdate(insert4);
            System.out.println("number of row inserted"+ row);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    }

