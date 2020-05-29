package view;

import Model.Accident;
import Presenter.Presenter;
import Model.VMInterface;
import Model.Vehicle;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.WEST;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
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
    
    private JPanel display;
    private JPanel Vehicle;
    private JPanel Accident;
    private JPanel Buttons;
    
    private JButton newVehicle;
    private JButton newAccident;
    private JButton update;
    private JButton Search;
    
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
    
    private JTextArea Display;
    
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
    
    private Point Vp;
    private Point Ap;
    public View()
    {
        super();
        
        display = new JPanel();
        Vehicle = new JPanel();
        Accident = new JPanel();
        Buttons = new JPanel();
        
        newVehicle = new JButton("New Vehicle");
        newAccident = new JButton("New Accident");
        update = new JButton("Update all");
        Search = new JButton("Search");
        
        Display = new JTextArea("", 20, 40);
        
        numPlateLabel = new JLabel("Vehicle ID: ");
        modelLabel = new JLabel("Car Model: ");
        yearLabel = new JLabel("Year Made: ");
        ownerLabel = new JLabel("Owner: ");
        addressLabel = new JLabel("Addeess: ");
        phoneLabel = new JLabel("Phone Number: ");
        
        AccLabel = new JLabel("Accident ID: ");
        locationLabel = new JLabel("Location: ");
        commentLabel = new JLabel("Comments: ");
        numVehicleLabel = new JLabel("Vehicles Involved: ");
        
        numPlateText = new JTextField(10);
        modelText = new JTextField(20);
        yearText = new JTextField(4);
        ownerText = new JTextField(30);
        addressText = new JTextField(30);
        phoneText = new JTextField(10);
        
        AccIDText = new JTextField(3);
        locationText = new JTextField(30);
        commentText = new JTextField(30);
        numVehicleText = new JTextField(3);
        
        this.setLayout(new BorderLayout());
        setBounds(300, 150, 1300, 800);
        setResizable(false);
        
        
        Buttons.setSize(350, 30);
        Buttons.add(update);
        Buttons.add(Search);
        
        // Event handlers
        newVehicle.addActionListener(//insert vehicle
                new ActionListener()
                {
                    
                    public void actionPerformed(ActionEvent e) 
                    {
                        newVehicleActionPerformed(e);
                    }

           
                }
            );
        newAccident.addActionListener(//insert Accident
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        newAccidentActionPerformed(e);
                    }

            
                }
            );
        
        update.addActionListener( //update
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        updateActionPerformed(e);
                    }
                }
            );
        
        Search.addActionListener(//search
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        searchActionPerformed(e);
                    }
                });
        
        add(Buttons, BorderLayout.SOUTH);
        add(Vehicle, BorderLayout.NORTH);
        
        
        Vehicle.add(getVehicles());
        Vehicle.setBounds(5, 155, 350, 150);
        Vehicle.setLocation(0, 0);
        
        Accident.add(getAccident());
        Accident.setBounds(400, 400, 350, 400);
        Accident.setLocation(400, 0);
        add(Accident, BorderLayout.CENTER);
        
        setVisible(true); 
    }
   
    private JComponent getVehicles()
    {
        JPanel vInfo = new JPanel();
        vInfo.setLayout(new GridLayout(7,6)); 
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
        vInfo.add(newVehicle);
        
        return vInfo;
    }
    
    private JComponent getAccident()
    {
        JPanel aInfo = new JPanel();
        aInfo.setLayout(new GridLayout(5,4));
        aInfo.add(AccLabel);
        aInfo.add(AccIDText);
        aInfo.add(locationLabel);
        aInfo.add(locationText);
        aInfo.add(commentLabel);
        aInfo.add(commentText);
        aInfo.add(numVehicleLabel);
        aInfo.add(numVehicleText);
        aInfo.add(newAccident);
        
        return aInfo;
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
    
    private void searchActionPerformed(ActionEvent e)
    {
        if(numPlateText.getText()== null)
        {
            int Acc_ID = Integer.parseInt(AccIDText.getText());
            VP.accidentSearch(Acc_ID);
        }
        else if(AccIDText.getText() == null)
        {
            String numPlate = numPlateText.getText();
            VP.vehicleSearch(numPlate);
        }
        else
        {
            Display.setText("Error: Please enter a value to search");
        }
    }
    
    public void vDisplay(Vehicle v)
    {
        
        String numPlate = numPlateText.getText();
        String Model = modelText.getText();
        int year = Integer.parseInt(yearText.getText());
        String owner = ownerText.getText();
        String address = addressText.getText();
        long phone = Long.parseLong(phoneText.getText());
        Display.append(String.format("\n  %-15s%-15s%-15s%-15s%-15s%-15s%-15s%-1s", 
                numPlate, Model, year, owner, address, phone));
    }
    public void aDisplay(Accident a)
    {
        AccIDText.setText("" + a.getAccID());
        locationText.setText("" + a.getLocation());
        commentText.setText("" + a.getComments());
    }
    
    public void Display(String Message)
    {
        Display.setText(String.format(Message));

        AppendLine();
    }
    public void AppendLine()
    {
        Display.append("\n----------------------------------"
                        + "------------");
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
