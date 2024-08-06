package com.unimater;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meu_db",
                    "root",
                    "root"
            );

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE pessoa(nome VARCHAR(50))");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
