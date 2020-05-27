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
public interface VMInterface 
{
    public int vehicleInsert(String numPlate, String Model, int year, 
            String owner, String address, long phone); 
    public void close();
}
