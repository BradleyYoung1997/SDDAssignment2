package view;

import Model.Accident;
import Presenter.Presenter;
import Model.VMInterface;
import Model.Vehicle;
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
    private JButton update;
    
    private JLabel numPlateLabel;
    private JLabel modelLabel;
    private JLabel yearLabel;
    private JLabel ownerLabel;
    private JLabel addressLabel;
    private JLabel phoneLabel;
    
    private JLabel AccLabel;
    private JLabel locationLabel;
    private JLabel commentLabel;
    private JLabel numVehicleLabel;
    
    
    private JTextField numPlateText;
    private JTextField modelText;
    private JTextField yearText;
    private JTextField ownerText;
    private JTextField addressText;
    private JTextField phoneText;
    
    private JTextField AccIDText;
    private JTextField locationText;
    private JTextField commentText;
    private JTextField numVehicleText;
    
    public View()
    {
        super();
        
        Vehicle = new JPanel();
        Accident = new JPanel();
        Buttons = new JPanel();
        
        newVehicle = new JButton("New Vehicle");
        newAccident = new JButton("New Accident");
        update = new JButton("Update all");
        
        numPlateLabel = new JLabel("Vehicle ID: ");
        modelLabel = new JLabel("Car Model: ");
        yearLabel = new JLabel("Year Made: ");
        ownerLabel = new JLabel("Owner: ");
        addressLabel = new JLabel("Addeess: ");
        phoneLabel = new JLabel("Phone Number: ");
        
        AccLabel = new JLabel();
        locationLabel = new JLabel();
        commentLabel = new JLabel();
        numVehicleLabel = new JLabel();
        
        numPlateText = new JTextField(10);
        modelText = new JTextField(20);
        yearText = new JTextField(4);
        ownerText = new JTextField(30);
        addressText = new JTextField(50);
        phoneText = new JTextField(10);
        
        AccIDText = new JTextField(3);
        locationText = new JTextField(70);
        commentText = new JTextField(100);
        numVehicleText = new JTextField(3);
        
        this.setLayout(new BorderLayout());
        setSize(1200, 750);
        setResizable(false);
        
        
        Buttons.setLocation(0, 680);
        Buttons.setSize(1200, 70);
        Buttons.add(newVehicle);
        Buttons.add(newAccident);
        Buttons.add(update);
        
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
        
        update.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        updateActionPerformed(e);
                    }
                }
            );
        
        add(Buttons, BorderLayout.SOUTH);
        add(Vehicle, BorderLayout.NORTH);
        add(Accident, BorderLayout.PAGE_END);
        
        Vehicle.add(getVehicle());
        Vehicle.setLocation(0, 600);
        //Accident.add(getAccident());
        Accident.setLocation(601, 1200);
       
        setVisible(true); 
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
    /*
    private JComponent getAccident()
    {
        JPanel aInfo = new JPanel();
        aInfo.setLayout(new GridLayout(4,4));
        aInfo.add(AccLabel);
        aInfo.add(AccIDText);
        aInfo.add(locationLabel);
        aInfo.add(locationText);
        aInfo.add(commentLabel);
        aInfo.add(commentText);
        aInfo.add(numVehicleLabel);
        aInfo.add(numVehicleText);
        
        return aInfo;
    }
    */
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
        String location = locationText.getText();
        String comments = commentText.getText();
        String numPlate = numPlateText.getText();
        VP.AccidentInsert(location, comments, numPlate);
    }
    
    private void updateActionPerformed(ActionEvent e)
    {
        String numPlate = numPlateText.getText();
        int Acc_ID = Integer.parseInt(AccIDText.getText());
        String Model = modelText.getText();
        int year = Integer.parseInt(yearText.getText());
        String owner = ownerText.getText();
        String address = addressText.getText();
        long phone = Long.parseLong(phoneText.getText());
        String location = locationText.getText();
        String comments = commentText.getText();
        VP.update(numPlate, Acc_ID, Model, year, owner, address, phone, location, comments);
    }
    
    public void vDisplay(Vehicle v)
    {
        numPlateText.setText("" + v.getNumPlate());
        modelText.setText("" + v.getModel());
        yearText.setText("" + v.getYear());
        ownerText.setText("" + v.getOwner());
        addressText.setText("" + v.getAddress());
        phoneText.setText(""+ v.getPhone());
    }
    public void aDisplay(Accident a)
    {
        AccIDText.setText("" + a.getAccID());
        locationText.setText("" + a.getLocation());
        commentText.setText("" + a.getComments());
    }
    
    public void MessagePopup(String message)
    {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void show(Presenter pp)
    {
        VP = pp;
    }
    
    public void systemExit()
    {
        System.exit(0);
    }
}
