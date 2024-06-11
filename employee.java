/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package softdemo;
//
//import java.sql.SQLException;
//import javax.swing.table.DefaultTableModel;
//import static softdemo.Attendence.c;
//import static softdemo.Attendence.ss;
//import java.sql.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Lapshop
 */
public class employee {
    private String id;
    static Connection c;
    static Statement ss;
    static String query;
    public void entryTime(){
    
         sec s1= new sec();


        try{
            c=s1.connect();
            ss=c.createStatement();
             String query = "insert into attendence values('"+java.time.LocalTime.now()+"',' ','"+java.time.LocalDate.now()+"')";
      
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
    
    public void exitTime(){
        
                                  sec s1= new sec();


        try{
            c=s1.connect();
            ss=c.createStatement();
             String query = "update attendance set exit_time ='"+java.time.LocalTime.now()+"'"
//                +  "where id= '" + id + "'"
                + "where data_time = '" + java.time.LocalDate.now() + "'";
      
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
            
            
        }  // TODO add your handling code here:
    }                                        

   public void Myvaction(){
//                DefaultTableModel t = new DefaultTableModel();
//
//    
//                          DB s1= new DB();
//
//      
//        try{
//            c=s1.connect();
//            ss=c.createStatement();
//      // String id=jt1.getText();
//            String query = "select from_v,to_v,p_state from vaction where id =" + this.id;
//            ResultSet result = ss.executeQuery(query);
//            while (result.next()) {
//                t.addRow(new String[]{
//                    result.getString(1),
//                    result.getString(2),
//                    result.getString(3)
//                });
//            }
//            ss.execute(query);
//            System.out.println("Done");
//        }
//        catch(SQLException ex){
//            System.out.println("Error");
//            System.out.println(ex.getMessage());
//        }
//        finally{
//            try{
//                c.close();
//                ss.close();
//            }catch(SQLException ex)
//            {
//                System.out.println(ex.getMessage());
//            }
//            
//            
//        }
//    
//       
    
    
    }
    
    
    
    
    
    
    
    }

