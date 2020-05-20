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
                    "INSERT INTO QRTADatabase.VEHICLE(VEHICLE_ID) VALUES('"+numPlate+"')");
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
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    
    public int yearInsert(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int ownerInsert(String owner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int addressInsert(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int phoneInsert(long phone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
