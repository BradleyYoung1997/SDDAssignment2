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
    private PreparedStatement searchAccident = null;
    private PreparedStatement insertAccident = null;
    private PreparedStatement updateLocation = null;
    private PreparedStatement updateComments = null;
    private PreparedStatement updateNumPlate = null;
       
    public int insertAccident(String location, String comments, String numPlate) 
    {
        int result = 0;
        try
        {
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertAccident = c.prepareStatement(
                    "INSERT INTO TEST.ACCIDENT(LOCATION, COMMENTS) VALUES"
                            + "(?,?)");
            
            insertAccident = c.prepareStatement(
                    "INSERT INTO TEST.ACCIDENT_VEHICLE(VEHICLE_ID)"
                            + "VALUES ('"+numPlate+"')");
            
            insertAccident.setString(1, location);
            insertAccident.setString(2, comments); 
            insertAccident.setString(3, numPlate);
            
            insertAccident.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return result;
    }
    public void close()
    {
        try
        {
            c.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
