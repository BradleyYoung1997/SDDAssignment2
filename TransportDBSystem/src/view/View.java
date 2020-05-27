package view;

import Presenter.Presenter;
import Model.VMInterface;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

/*
 * Author: Bradley Young 12110283
 * Date: 20/05/2020
 * Purpose: Class to test the functionality of the program.
 */
public class View extends JFrame implements viewInterface
{
    
    private Presenter VP;
    
    private JPanel Vehicle;
    private JPanel Accident;
    private JPanel Buttons;
    
    private JButton newVehicle;
    private JButton newAccident;
    
    private JLabel numPlateLabel;
    private JLabel modelLabel;
    private JLabel yearLabel;
    private JLabel ownerLabel;
    private JLabel addressLabel;
    private JLabel phoneLabel;
    
    private JTextField numPlateText;
    private JTextField modelText;
    private JTextField yearText;
    private JTextField ownerText;
    private JTextField addressText;
    private JTextField phoneText;
    
    public View()
    {
        super();
        
        Vehicle = new JPanel();
        Accident = new JPanel();
        Buttons = new JPanel();
        
        newVehicle = new JButton();
        newAccident = new JButton();
        
        numPlateLabel = new JLabel();
        modelLabel = new JLabel();
        yearLabel = new JLabel();
        ownerLabel = new JLabel();
        addressLabel = new JLabel();
        phoneLabel = new JLabel();
        
        numPlateText = new JTextField(10);
        modelText = new JTextField(20);
        yearText = new JTextField(4);
        ownerText = new JTextField(30);
        addressText = new JTextField(50);
        phoneText = new JTextField(10);
        
        this.setLayout(new BorderLayout());
        setSize(1200, 750);
        setResizable(false);
        
        
        Buttons.setLocation(0, 680);
        Buttons.setSize(1200, 70);
        Buttons.add(newVehicle);
        Buttons.add(newAccident);
        
        newVehicle.addActionListener(
                new ActionListener()
                {
                    
                    public void actionPerformed(ActionEvent e) 
                    {
                        newVehicleActionPerformed(e);
                    }

           
                }
            );
        newAccident.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        newAccidentActionPerformed(e);
                    }

            
                }
            );
        
        add(Buttons, BorderLayout.SOUTH);
        add(Vehicle, BorderLayout.PAGE_START);
        add(Accident, BorderLayout.PAGE_END);
        
        Vehicle.add(getVehicle());
        Accident.setLocation(601, 1200);
        
    }
    
    private JComponent getVehicle()
    {
        JPanel vInfo = new JPanel();
        vInfo.setLayout(new GridLayout(6,6)); 
        vInfo.add(numPlateLabel);
        vInfo.add(numPlateText);
        vInfo.add(modelLabel);
        vInfo.add(modelText);
        vInfo.add(yearLabel);
        vInfo.add(yearText);
        vInfo.add(ownerLabel);
        vInfo.add(ownerText);
        vInfo.add(addressLabel);
        vInfo.add(addressText);
        vInfo.add(phoneLabel);
        vInfo.add(phoneText);
        
        return vInfo;
    }
    private void newVehicleActionPerformed(ActionEvent e) 
    {
        String numPlate = numPlateText.getText();
        String Model = modelText.getText();
        int year = Integer.parseInt(yearText.getText());
        String owner = ownerText.getText();
        String address = addressText.getText();
        long phone = Long.parseLong(phoneText.getText());
        VP.vehicleInsert(numPlate, Model, year, owner, address, phone);
    }
    
    private void newAccidentActionPerformed(ActionEvent e) 
    {
        
    }
    
    public void bind(Presenter pp)
    {
        VP = pp;
    }
}
