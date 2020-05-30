/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QRTAMain;

import Model.AccidentInterface;
import Model.AccidentModel;
import Model.VehicleModel;
import Model.VMInterface;
import Presenter.Presenter;
import view.viewInterface;
import view.QRTAEntryForm;

/*
 * Author: Bradley Young 12110283
 * Date: 
 * Purpose:
 */
public class QRTAMain {

   
    
    public static void main(String[] args) 
    {
        System.out.println("Program Test");
        
        VMInterface VM = new VehicleModel();
        AccidentInterface AI = new AccidentModel();
        viewInterface VI  = new QRTAEntryForm();
        Presenter VP = new Presenter(VM, VI, AI);
        VI.show(VP);        
    }

}
