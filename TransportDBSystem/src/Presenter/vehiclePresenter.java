
package Presenter;


import Model.VehicleInterface;
import view.DBConnectiontest;

import view.viewInterface;

/*
 * Author: Bradley Young 12110283
 * Date:
 * Purpose: 
 */
public class vehiclePresenter 
{
    VehicleInterface VI;
    viewInterface IV;
    
    public vehiclePresenter(VehicleInterface vInt, viewInterface vI)
    {
        VI = vInt;
        IV = vI;
    }
    int response;
    
    public void insertPlates(String numPlate)
    {
        System.out.println("Number Plates: ");
        System.out.println(numPlate);
        
        VI.plateInsert(numPlate);
        System.out.println(response);
    }
}
