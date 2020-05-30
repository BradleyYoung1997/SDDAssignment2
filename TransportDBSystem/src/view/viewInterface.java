/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Model.Accident;
import Model.Vehicle;
import Presenter.Presenter;
/**
 *
 * @author Bradey
 */
public interface viewInterface 
{
    public void show(Presenter VP);
    public void vDisplay(Vehicle v);
    public void aDisplay(Accident a);
    public void AccidentDisplay(String aMessage);
    public void VehicleDisplay(String vMessage);
}
