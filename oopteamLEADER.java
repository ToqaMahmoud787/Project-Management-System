/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package admin;

//import static project_manager.tmassigntask.c;
//import static project_manager.tmassigntask.ss;
//import static Project_manager.c;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

/**
 *
 * @author IT
 */
public class oopteamLEADER {
    private int emp_id;
    private String t_name;
    private int P_NUM;
    private String state;
    
    
    
static Connection c;
    static Statement ss;
    static String query;

public void assigntasks () {
    sec s1= new sec();
        try{
            c=s1.connect();
            ss=c.createStatement();
           
            //String id = employeeid.getText();
        //String tname = taskname.getText();
        //String pnum = projnum.getText();
        
        
        this.state = "A";
       
        String query = "insert into tasks values('" + this.emp_id+ "','" + this.t_name + "','" + this.P_NUM + "','" + this.state + "')";
        ss.executeUpdate(query);
        //JOptionPane.showMessageDialog(null, "Done", "Assgin Task ", JOptionPane.INFORMATION_MESSAGE);
            
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