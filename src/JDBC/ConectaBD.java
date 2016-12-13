/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Esta é a classe de conexão com o banco de dados
 *
 * @author Claudio Pedra
 *
 */
public class ConectaBD {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/trocarefil", "root", "root");


        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());
        }

    }
}
