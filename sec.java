/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author w
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class sec {

    private final String user = "sa";
    private final String password = "123";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=NewDatabase";
    public Connection connect()  throws SQLException
    {
         return DriverManager.getConnection(url, user, password);
    }
}
    

