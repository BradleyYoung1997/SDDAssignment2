/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bradey
 * Date: 20/05/2020
 */
public interface AccidentInterface 
{
    public int locInsert(String location);
    public int commInsert(String comments);
    public int vehcileInsert(int numVehicles);
    public int plateInsert(String numPlates);
    
}
