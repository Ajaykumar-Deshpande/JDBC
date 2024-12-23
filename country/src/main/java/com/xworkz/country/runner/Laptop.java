package com.xworkz.country.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Laptop {
    public static void main(String[] args) {
        System.out.println("runnin main method");
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection established");
            String url="jdbc:mysql://localhost:3306/collage";
            String userName="root";
            String password="Ajay@787898";
            connection= DriverManager.getConnection(url,userName,password);
            System.out.println("JDBC Connection Estrablished");
            String insert ="insert into laptop(laptop_brand,laptop_price) values('Dell',25000)";
            String insert1 ="insert into laptop(laptop_brand,laptop_price) values('Hp',35000)";
            String insert2 ="insert into laptop(laptop_brand,laptop_price) values('Samsung',55000)";
            String insert3 ="insert into laptop(laptop_brand,laptop_price) values('LG',23000)";
            String insert4="insert into laptop(laptop_brand,laptop_price) values('Realme',35000)";
            String insert5 ="insert into laptop(laptop_brand,laptop_price) values('Lenevo',45000)";
            String insert6="insert into laptop(laptop_brand,laptop_price) values('Microsoft',85000)";
            String insert7="insert into laptop(laptop_brand,laptop_price) values('Acer',45000)";
            String insert8="insert into laptop(laptop_brand,laptop_price) values('Asus',48000)";
            String insert9="insert into laptop(laptop_brand,laptop_price) values('Ipad',100000)";
            Statement statement=connection.createStatement();
            int row=statement.executeUpdate(insert9);
            System.out.println("number of row inserted"+ row);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
