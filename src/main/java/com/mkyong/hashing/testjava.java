package com.mkyong.hashing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testjava {
    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/" + "myfirstwebapp";

    private final static String DB_USER = "eiu2";

    private final static String DB_PASSWORD = "4#Eiumysql";

    public static void main(String args[]) {
        
      
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            Connection mySQLClient = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
            PreparedStatement st = mySQLClient.prepareStatement("SELECT COUNT(*) as count FROM account");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("count"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}