
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
        
    }
    
    public void vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone)
    {
        int Vresult = VMI.vehicleInsert(numPlate, Model, year, owner, address, phone);
        if ( Vresult == 1 )
            IV.VehicleDisplay("Vehicle added");
        else
            IV.VehicleDisplay("Vehicle was not added");
    }
    
    public void modelUpdate(String numPlate, String Model)
    {
        int modelUpdate = VMI.updateModel(numPlate, Model);
        if(modelUpdate == 1)
        {
            IV.VehicleDisplay("Model Updated");
        }
        else
        {
            IV.VehicleDisplay("Model not updated");
        }       
    }
    
    public void yearUpdate(String numPlate,int year)
    {
        int yearUpdate = VMI.updateYear(numPlate, year);
        if(yearUpdate == 1)
        {
            IV.VehicleDisplay("Year Updated");
        }
        else
        {
            IV.VehicleDisplay("Year not updated");
        } 
    }
    public void ownerUpdate(String numPlate,String owner)
    {
        int ownerUpdate = VMI.updateOwner(numPlate, owner);
        if(ownerUpdate == 1)
        {
            IV.VehicleDisplay("Owner Updated");
        }
        else
        {
            IV.VehicleDisplay("Owner not updated");
        }
    }
    
    public void addressUpdate(String numPlate,String address)
    {
        int addressUpdate = VMI.updateAddress(numPlate, address);
        if(addressUpdate == 1)
        {
            IV.VehicleDisplay("Address Updated");
        }
        else
        {
            IV.VehicleDisplay("Address not updated");
        }
    }
    
    public void phoneUpdate(String numPlate,long phone)
    {
        int phoneUpdate = VMI.updatePhone(numPlate, phone);
        if(phoneUpdate == 1)
        {
            IV.VehicleDisplay("Phone Updated");
        }
        else
        {
            IV.VehicleDisplay("Phone not updated");
        }
    }
    
    public void locaitionUpdate(int Acc_ID, String location)
    {
        int locUpdate = AI.updateLocation(Acc_ID, location);
        if(locUpdate == 1)
        {
            IV.AccidentDisplay("Location Updated");
        }
        else
        {
            IV.VehicleDisplay("Location not updated");
        }
    }
    
    public void commentsUpdate(int Acc_ID, String comments)
    {
        int commUpdate = AI.updateLocation(Acc_ID, comments);
        if(commUpdate == 1)
        {
            IV.AccidentDisplay("Comments Updated");
        }
        else
        {
            IV.VehicleDisplay("Comments not updated");
        }
    }
    
    public void AccidentInsert(String location, String comments, int numVehicles)
    {
        int Aresult = AI.insertAccident(location, comments, numVehicles);
        if (Aresult == 1)
        {
            IV.AccidentDisplay("Accident was added");
        }
        else
        {
            IV.AccidentDisplay("Accident was not added");
        }
    }
    
    public void vehicleSearch(String numPlate)
    {
        boolean vSearch = VMI.searchVehicle(numPlate);
        if(vSearch == true)
        {
            
            IV.VehicleDisplay("Vehicle found");
            IV.vDisplay(current);
        }
        else
        {
            IV.VehicleDisplay("Vehicle not found");
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
            IV.AccidentDisplay("Accident not found");
        }
    }
    public void getAccident(int Acc_ID)
    {
        int aResult = AI.getAccidents();
        if(aResult < 0)
        {
            IV.aDisplay(result);
        }
        else
        {
            IV.AccidentDisplay("No accidents to display");
        }
    }
    
    public void damagedVehicles(String numPlate)
    {
        int damage = VMI.damagedVehicle(numPlate);
        if(damage <  0)
        {
            IV.VehicleDisplay("Vehicle registered to accident");
        }
    }
}
