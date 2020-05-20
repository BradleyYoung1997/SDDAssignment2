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
public class VehicleModel implements VehicleInterface
{

    String URL = "jdbc:derby://localhost:1527/QRTADatabase";
    String Username = "Test";
    String Password = "1234";
    Connection c = null;
    public int plateInsert(String numPlate) 
    {
        try
        {
            PreparedStatement insertNewPlate = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewPlate = c.prepareStatement(
                    "INSERT INTO QRTADatabase.VEHICLE(VEHICLE_ID) VALUES"
                            + "('"+numPlate+"')");
            insertNewPlate.executeUpdate();
            insertNewPlate = c.prepareStatement(
                    "INSERT INTO QRTADatabase.ACCIDENT_VEHICLE(VEHICLE_ID)"
                            + "VALUES ('"+numPlate+"')");
            insertNewPlate.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int modelInsert(String model) 
    {
        try
        {
            PreparedStatement insertNewModel = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewModel = c.prepareStatement(
                  "INSERT INTO QRTADatabase.VEHICLE(MODLE) VALUES('"+model+"')");
            insertNewModel.executeUpdate();  
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int yearInsert(int year) 
    {
        try
        {
            PreparedStatement insertNewYear = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewYear = c.prepareStatement(
            "INSERT INTO QRTADatabase.VEHICLE(MAKE_YEAR) VALUES("+year+"')");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int ownerInsert(String owner) 
    {
        try
        {
            PreparedStatement insertNewOwner = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewOwner = c.prepareStatement(
            "INSERT INTO QRTADatabase.VEHICLE(OWNER_NAME) VALUES("+owner+"')");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int addressInsert(String address) 
    {
        try
        {
            PreparedStatement insertNewAddress = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewAddress = c.prepareStatement(
            "INSERT INTO QRTADatabase.VEHICLE(ADDRESS) VALUES("+address+"')");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

    
    public int phoneInsert(long phone) 
    {
        try
        {
            PreparedStatement insertNewPhone = null;
            
            c = DriverManager.getConnection(URL, Username, Password);
            insertNewPhone = c.prepareStatement(
            "INSERT INTO QRTADatabase.VEHICLE(PHONE) VALUES("+phone+"')");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

}
