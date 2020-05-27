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

    final String URL = "jdbc:derby://localhost:1527/QRTADatabase";
    final String USERNAME = "Test";
    final String PASSWORD = "1234";
    Connection c = null;
    public int plateInsert(String numPlate) 
    {
       
        try
        {
            PreparedStatement insertNewPlate = null;
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewPlate = c.prepareStatement(
                    "INSERT INTO TEST.VEHICLE(VEHICLE_ID) VALUES"
                            + "('"+numPlate+"')");
            insertNewPlate.executeUpdate();
            insertNewPlate = c.prepareStatement(
                    "INSERT INTO TEST.ACCIDENT_VEHICLE(VEHICLE_ID)"
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
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewModel = c.prepareStatement(
                  "INSERT INTO TEST.VEHICLE(MODLE) VALUES('"+model+"')");
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
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewYear = c.prepareStatement(
            "INSERT INTO TEST.VEHICLE(MAKE_YEAR) VALUES("+year+"')");
            insertNewYear.executeUpdate();
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
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewOwner = c.prepareStatement(
            "INSERT INTO TEST.VEHICLE(OWNER_NAME) VALUES("+owner+"')");
            insertNewOwner.executeUpdate();
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
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewAddress = c.prepareStatement(
            "INSERT INTO TEST.VEHICLE(ADDRESS) VALUES("+address+"')");
            insertNewAddress.executeUpdate();
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
            
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            insertNewPhone = c.prepareStatement(
            "INSERT INTO TEST.VEHICLE(PHONE) VALUES("+phone+"')");
            insertNewPhone.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        return 0;
    }

}
