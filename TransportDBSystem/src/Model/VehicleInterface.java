/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bradley
 * Date:10/05/2020
 * Purpose:
 */
public interface VehicleInterface 
{
    public int plateInsert(String numPlate);
    public int modelInsert(String model);
    public int yearInsert(int year);
    public int ownerInsert(String owner);
    public int addressInsert(String address);
    public int phoneInsert(long phone);
    
}
