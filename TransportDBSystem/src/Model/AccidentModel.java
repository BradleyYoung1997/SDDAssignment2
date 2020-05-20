/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Author: Bradley Young 12110283
 * Date:20/05/2020
 * Purpose: 
 */
public class AccidentModel implements AccidentInterface
{
    final String URL = "jdbc:derby://localhost:1527/QRTADatabase";
    final String USERNAME = "Test";
    final String PASSWORD = "1234";
    Connection c = null;
    
    public int IDInsert(int Acc_ID) 
    {
        try
        {
             PreparedStatement insertNewID = null;
             
             c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             insertNewID = c.prepareStatement("INSERT INTO TEST.ACCIDENT_VEHICLE"
                     + "(ACCIDENTID) VALUES ('"+Acc_ID+"')");
             insertNewID.executeUpdate();
             
        } catch (SQLException e) 
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }
    
    public int locInsert(String location) 
    {
        try
        {
            PreparedStatement insertNewLocation = null;
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewLocation = c.prepareStatement(
                   "INSERT INTO TEST.ACCIDENT(LOCATION) VALUES("+location+"')");
            insertNewLocation.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int commInsert(String comments) 
    {
        try
        {
            PreparedStatement insertNewComments = null;
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
            insertNewComments = c.prepareStatement(
                    "INSERT INTO TEST.ACCIDENT(COMMENTS) VALUES('"
                            +comments+"')");
            insertNewComments.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }  

    
    
}
