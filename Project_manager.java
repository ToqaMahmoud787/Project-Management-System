/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author w
 */
public class Project_manager {
 static Connection c;
    static Statement ss;
    static String query;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    sec s1= new sec();
        try{
            c=s1.connect();
            ss=c.createStatement();
            query="INSERT INTO t1(first_name,las_name) " +" VALUES ('ggggggg', 'mmmmm')";// To insert in The database
           
            ss.execute(query);
            System.out.println("Done");
        }
        catch(SQLException ex){
            System.out.println("Error");
            System.out.println(ex.getMessage());
        }
        finally{
            try{
                c.close();
                ss.close();
            }catch(SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
            
            
        }
    }
}
    
