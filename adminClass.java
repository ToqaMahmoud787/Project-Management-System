/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package softdemo;
//import java.sql.*;
//import java.util.*;
//import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Lapshop
 */
public class adminClass {
    static Connection c;
    static Statement ss;
    static String query;
    private String id;
    private String Name;
    private String Pass;
        private double Salary;
 private String Poss;
    public void AddUser(String id,String Name,String Pass,double Salary,String Poss){
    
     sec s1= new sec();

        try{
            c=s1.connect();
            ss=c.createStatement();
//            int id = Integer.parseInt(id.getText());
//        String Name = name.getText();
//        int Pass = Integer.parseInt(pass.getText());
//        float Salary = Float.parseFloat(salary.getText());
//        String Poss = poss.getSelectedItem().toString();
       
        String query = "insert into users values(" + this.id + ",'" + this.Name + "'," +this.Pass + "," + this.Salary + ",'" +this.Poss + "')";
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
  public void UpdateUser(double Salary,String Poss,String id){
  
       sec s1= new sec();

        try{
            c=s1.connect();
            ss=c.createStatement();

        sec d = new sec();
        String query = "update users set salary=" +this.Salary + ""
                + ",position='" + this.Poss + "'"
                + "where id_all=" + this.id + "";    ss.executeUpdate(query);
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
    
  
  }}  

    
    
    
    
