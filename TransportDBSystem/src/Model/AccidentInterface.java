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
    public int IDInsert(int Acc_ID);
    public int locInsert(String location);
    public int commInsert(String comments);   
}
