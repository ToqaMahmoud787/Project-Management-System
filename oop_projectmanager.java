
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author w
 */
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class oop_projectmanager {
    private String id;
    
    private String report;
    static Connection c;
    static Statement ss;
    static String query;
  public void writereport(String id , String report){
    
   sec s1= new sec();
        try{
            c=s1.connect();
            ss=c.createStatement();
         
//         String id=empid2.getText();
//        String report = report1.getText();
        String query = "insert into report values('" + this.id + "','" + this.report + "')";
        ss.executeUpdate(query);
        
       
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



    


