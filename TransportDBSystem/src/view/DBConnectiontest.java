package view;

import Presenter.vehiclePresenter;
import Model.VehicleInterface;
import java.util.Scanner;

/*
 * Author: Bradley Young 12110283
 * Date: 20/05/2020
 * Purpose: Class to test the functionality of the program.
 */
public class DBConnectiontest implements viewInterface
{
    public VehicleInterface VI;
    public vehiclePresenter VP;
    public void Test()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter choice");
        System.out.println("1. New Vehicle");
        System.out.println("2. New Accident");
        System.out.println("3. Update Vehicle");
        System.out.println("4. Update Accident");
        System.out.println("5. Exit");
        
        int choice = Integer.parseInt(input.nextLine());
        while(choice != 5)
        {
            if(choice == 1)
            {
                System.out.println("Enter Number Plate");
                VI.plateInsert(input.nextLine());
                System.out.println("Enter choice");
                System.out.println("Enter choice");
                System.out.println("Enter choice");
                System.out.println("Enter choice");
            }
        }
    }

    @Override
    public void show(vehiclePresenter vp) 
    {
        VP = vp;
    }

}
