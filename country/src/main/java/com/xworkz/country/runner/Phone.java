package com.xworkz.country.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Phone {
    public static void main(String[] args) {
        System.out.println("running main method ");
        Connection conncetion=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successfully");
            String url="jdbc:mysql://localhost:3306/country";
            String userName="root";
            String password="Ajay@787898";
            conncetion= DriverManager.getConnection(url,userName,password);
            System.out.println("JDBC Connection Estrablished");
            String insert1 ="insert into phones values(1,'Vivo',25000)";
            String insert2="insert into phones values(2,'Mi','20000')";
            String insert3="insert into phones values(3,'Samusng',55000)";
            String insert4 ="insert into phones values(4,'Iphone',100000)";
            String insert5 ="insert into phones values(5,'Opo',23000)";
            Statement statement=conncetion.createStatement();
            statement.addBatch(insert1);
            statement.addBatch(insert2);
            statement.addBatch(insert3);
            statement.addBatch(insert4);
            statement.addBatch(insert5);
            int[] row=statement.executeBatch();
            System.out.println("number of row inserted"+row.length);

    }         catch (ClassNotFoundException | SQLException j){
            System.out.println("jdbc class not found"+ j.getMessage());
        }
        finally {
            try {
                conncetion.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            }

        }
    }
}
