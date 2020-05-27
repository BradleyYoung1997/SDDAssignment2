
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
    
    public void AccidentInsert(String location, String comments, String numPlate)
    {
        int Aresult = AI.insertAccident(location, comments, numPlate);
      if ( Aresult == 1 )
          System.out.println("Accident added");
      else
          System.out.println("Accident was not added");
    }
}
