
package Presenter;


import Model.VMInterface;
import Model.Vehicle;
import Model.Accident;
import Model.AccidentInterface;
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
    AccidentInterface AI;
    viewInterface IV;
    Vehicle current;
    Accident result;
    public Presenter(VMInterface vInt, viewInterface vI, AccidentInterface Ai)
    {
        VMI = vInt;
        IV = vI;
        AI = Ai;
        current = null;
    }
    
    
    public void vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone)
    {
        int Vresult = VMI.vehicleInsert(numPlate, Model, year, owner, address, phone);
      if ( Vresult == 1 )
          System.out.println("Vehicle added");
      else
          System.out.println("Vehicle was not added");
    }
    
    public void update(String numPlate, int Acc_ID, String Model, int year, 
            String owner, String address, long phone, String location, 
            String comments)
    {
        int modelUpdate = VMI.updateModel(numPlate, Model);
        if(modelUpdate == 1)
        {
            System.out.println("Model Updated");
        }
        else
        {
            System.out.println("Model not updated");
        }
        int yearUpdate = VMI.updateYear(numPlate, year);
        if(yearUpdate == 1)
        {
            System.out.println("Year Updated");
        }
        else
        {
            System.out.println("Year not updated");
        }
        int ownerUpdate = VMI.updateOwner(numPlate, owner);
        if(ownerUpdate == 1)
        {
            System.out.println("Owner Updated");
        }
        else
        {
            System.out.println("Owner not updated");
        }
        int addressUpdate = VMI.updateAddress(numPlate, address);
        if(addressUpdate == 1)
        {
            System.out.println("Address Updated");
        }
        else
        {
            System.out.println("Address not updated");
        }
        int phoneUpdate = VMI.updatePhone(numPlate, phone);
        if(phoneUpdate == 1)
        {
            System.out.println("Phone Updated");
        }
        else
        {
            System.out.println("Phone not updated");
        }
    }
    
    public void AccidentInsert(String location, String comments, String numPlate)
    {
        int Aresult = AI.insertAccident(location, comments, numPlate);
        if (Aresult == 1)
        {
             System.out.println("Accident was not added");
        }
        else
        {
            System.out.println("Accident was not added");
        }
    }
    
    public void vehicleSearch(String numPlate)
    {
        boolean vSearch = VMI.searchVehicle(numPlate);
        if(vSearch == true)
        {
            IV.vDisplay(current);
        }
        else
        {
            IV.MessagePopup("Vehicle not found");
        }
    }
    public void accidentSearch(int Acc_ID)
    {
        boolean aSearch = AI.searchAccident(Acc_ID);
        if(aSearch == true)
        {
            IV.aDisplay(result);
        }
        else
        {
            IV.MessagePopup("Accident not found");
        }
    }
}
