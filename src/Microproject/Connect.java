/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Microproject;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Connect {
    public static Connection connectdb(){
    try{
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
    return con;
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
}
