package database;


import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayank Kanodia
 */
public class javaconnect {
    Connection conn;
    public static Connection Connectdb(){
        try{
            String host="jdbc:derby://localhost:1527/Database1";
            String uname="prachika";
            String upass="kanodia";
            Connection conn=DriverManager.getConnection(host,uname,upass);
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
