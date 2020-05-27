/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Author: Bradley Young 12110283
 * Date:
 * Purpose: 
 */
public class VehicleModel implements VMInterface
{

    private static final String URL = "jdbc:derby://localhost:1527/QRTADatabase";
    private static final String USERNAME = "Test";
    private static final String PASSWORD = "1234";
    
    private Connection c = null;
    private PreparedStatement searchVehicles = null;
    private PreparedStatement insertVehicle = null;
    
    public int vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone) 
    {
        int result = 0;
        try
        {
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertVehicle = c.prepareStatement(
                    "INSERT INTO TEST.VEHICLE(VEHICLE_ID, MODEL, MAKE_YEAR"
                            + "OWNER_NAME, ADDRESS, PHONE) VALUES"
                            + "(?,?,?,?,?,?)");
            
            insertVehicle = c.prepareStatement(
                    "INSERT INTO TEST.ACCIDENT_VEHICLE(VEHICLE_ID)"
                            + "VALUES ('"+numPlate+"')");
            
            
            insertVehicle.setString(1, numPlate);
            insertVehicle.setString(2, Model);
            insertVehicle.setInt(3, year);
            insertVehicle.setString(4, owner);
            insertVehicle.setString(5, address);
            insertVehicle.setLong(6, phone);
            
            insertVehicle.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return result;  
    }//new Vehicle end
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
