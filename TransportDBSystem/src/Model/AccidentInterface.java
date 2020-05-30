/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Bradey
 * Date: 20/05/2020
 */
public interface AccidentInterface 
{
    public int getAccidents();
    public int insertAccident(String location, String comments, int numVehicles);
    public int updateLocation(int Acc_ID, String location);
    public int updateComments(int Acc_ID, String comments);
    public int updateNumPlate(int Acc_ID, String numPlate);
    public boolean searchAccident(int Acc_ID);
    public void close();
}
