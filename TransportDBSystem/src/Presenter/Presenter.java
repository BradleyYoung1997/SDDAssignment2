
package Presenter;


import Model.VMInterface;
import Model.Vehicle;
import java.util.List;
import view.viewInterface;

/*
 * Author: Bradley Young 12110283
 * Date:
 * Purpose: 
 */
public class Presenter 
{
    VMInterface VMI;
    viewInterface IV;
    List <Vehicle> results;
    Vehicle current;
    public Presenter(VMInterface vInt, viewInterface vI)
    {
        VMI = vInt;
        IV = vI;
        results = null;
        current = null;
    }
    
    
    public void vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone)
    {
        int result = VMI.vehicleInsert(numPlate, Model, year, owner, address, phone);
      if ( result == 1 )
          System.out.println("Patient added");
      else
          System.out.println("Patient not added");
    }
}
