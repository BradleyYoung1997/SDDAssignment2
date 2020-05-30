/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private PreparedStatement damagedVehicles = null;
    private PreparedStatement insertVehicle = null;
    private PreparedStatement updateModel = null;
    private PreparedStatement updateYear = null;
    private PreparedStatement updateOwner = null;
    private PreparedStatement updateAddress = null;
    private PreparedStatement updatePhone = null;
    private ResultSet rs;
    
    public int vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone) 
    {
        int result = 0;
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            insertVehicle = c.prepareStatement(
                    "INSERT INTO TEST.VEHICLE(VEHICLE_ID, MODEL, MAKE_YEAR,"
                            + "OWNER_NAME, ADDRESS, PHONE) VALUES"
                            + "(?,?,?,?,?,?)");        
            
            insertVehicle.setString(1, numPlate);
            insertVehicle.setString(2, Model);
            insertVehicle.setInt(3, year);
            insertVehicle.setString(4, owner);
            insertVehicle.setString(5, address);
            insertVehicle.setLong(6, phone);
            
            insertVehicle.executeUpdate();
            result++;
            c.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VehicleModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;  
    }//new Vehicle end
    
    public int updateModel(String numPlate,String Model)
    {
        int result = 0;
        try
        {
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            updateModel = c.prepareStatement(
            "UPDATE TEST.VEHICLE SET MODEL = ? WHERE VEHICLE_ID = ?");
            updateModel.setString(1, numPlate);
            updateModel.setString(2, Model);
            updateModel.executeUpdate();
            result++;
            c.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
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

    public int updateYear(String numPlate, int year) 
    {
        int result = 0;
        
        try
        {
             c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            updateYear = c.prepareStatement(
            "UPDATE TEST.VEHICLE SET MAKE_YEAR = ? WHERE VEHICLE_ID = ?");
            updateYear.setString(1, numPlate);
            updateYear.setInt(2, year);
            
            updateYear.executeUpdate();
            result++;
            c.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return result;
    }

    public int updateOwner(String numPlate, String owner) 
    {
        int result = 0;
        
        try
        {
             c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            updateOwner = c.prepareStatement(
            "UPDATE TEST.VEHICLE SET OWNER_NAME = ? WHERE VEHICLE_ID = ?");
            updateOwner.setString(1, numPlate);
            updateOwner.setString(2, owner);
            
            updateOwner.executeUpdate();
            result++;
            c.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return result;
    }

    public int updateAddress(String numPlate, String address) 
    {
        int result = 0;
        
        try
        {
             c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            updateAddress = c.prepareStatement(
            "UPDATE TEST.VEHICLE SET OWNER_NAME = ? WHERE VEHICLE_ID = ?");
            updateAddress.setString(1, numPlate);
            updateAddress.setString(2, address);
            
            updateAddress.executeUpdate();
            result++;
            c.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return result;
    }

    public int updatePhone(String numPlate, long phone) 
    {
        int result = 0;
        
        try
        {
             c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            updateYear = c.prepareStatement(
            "UPDATE TEST.VEHICLE SET PHONE = ? WHERE VEHICLE_ID = ?");
            updateYear.setString(1, numPlate);
            updateYear.setLong(2, phone);
            
            updateYear.executeUpdate();
            result++;
            c.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return result;
    }

    public boolean searchVehicle(String numPlate) 
    {
        boolean search = false;
        
        try
        {
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            searchVehicles = c.prepareStatement(
            "SELECT * FROM TEST.VEHICLE WHERE VEHICLE_ID = ?");
            searchVehicles.setString(1, numPlate);
            
                    
            searchVehicles.executeQuery();
            rs = searchVehicles.getResultSet();
            
            if(rs.next())
            {
                rs.getString(1);
                rs.getString(2);
                rs.getInt(3);
                rs.getString(4);
                rs.getString(5);
                rs.getLong(6);
                search = true;
            }
            else
            {
                search = false;
            }
            
            c.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return search;
    }

   
    public int damagedVehicle(String numPlate) 
    {
        int Damage = 0;
        
        try 
        {
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            damagedVehicles = c.prepareStatement(
            "INSERT INTO TEST.ACCIDENT_VEHICLE (VEHICLE_ID)"+
            "VALUES (?)");
            
            damagedVehicles.setString(1, numPlate);
            
            damagedVehicles.executeUpdate();
            Damage++;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(VehicleModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Damage;
    }
    
}
