/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QRTAMain;

import Model.VehicleModel;
import Model.VMInterface;
import Presenter.Presenter;
import view.viewInterface;
import view.View;

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
        viewInterface in  = new View();
        Presenter VP = new Presenter(VM, in);
        in.bind(VP);
        
        //DBConnectiontest Test = new DBConnectiontest();
        
    }

}
