/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.*;
import java.sql.DriverManager;
//import java.sql.SQLException;

/**
 *
 * @author CodeHub
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","secure@16");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
		return null;
    }
}