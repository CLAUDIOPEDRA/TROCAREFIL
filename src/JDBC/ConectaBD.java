/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;

/**
 *
 *
 */
public class ConectaBD {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/trocarefil", "root", "CL4UDI0P3DR4");
        //return DriverManager.getConnection("jdbc:mysql://200.132.7.1:1080/ads-db-06","ads-db-06","%eN8$J");
    }

}
