/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package QRTAMain;

import Model.VehicleModel;
import Model.VehicleInterface;
import view.viewInterface;
import view.DBConnectiontest;
import Presenter.vehiclePresenter;

/*
 * Author: Bradley Young 12110283
 * Date: 
 * Purpose:
 */
public class QRTAMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Program Test");
        
        VehicleInterface VI = new VehicleModel();
        viewInterface Test  = new DBConnectiontest();
        vehiclePresenter VP = new vehiclePresenter(VI, Test);
        Test.show(VP);
    }

}
