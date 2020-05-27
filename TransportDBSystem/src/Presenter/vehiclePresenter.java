
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
    
    public void insertModel(String model)
    {
        System.out.println("Car Model: ");
        System.out.println(model);
        
        VI.modelInsert(model);
    }
    public void insertYear(int year)
    {
        System.out.println("Year Model: ");
        System.out.println(year);
        
        VI.yearInsert(year);
    }
    public void insertOwner(String Owner)
    {
        System.out.println("Owner: ");
        
        VI.ownerInsert(Owner);
    }
    public void insertAddress(String Address)
    {
        System.out.println("Address: ");
        
        VI.addressInsert(Address);
    }
    public void insertPhone(long phone)
    {
        System.out.println("Phone: ");
        
        VI.phoneInsert(phone);
    }
}
