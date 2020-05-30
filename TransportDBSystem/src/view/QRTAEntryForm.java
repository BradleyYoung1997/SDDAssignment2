package view;


import Model.Accident;
import Model.Vehicle;
import Presenter.Presenter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import view.viewInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradey
 */
public class QRTAEntryForm extends javax.swing.JFrame implements viewInterface
{

    /**
     * Creates new form QRTAEntryForm
     */
    private Presenter VP;
    public QRTAEntryForm() 
    {
        
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehicleEntry = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        Vehicles = new javax.swing.JLabel();
        numPlateLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        ownLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        newVehicleButton = new javax.swing.JButton();
        searchVehicleButton = new javax.swing.JButton();
        updateVehicle = new javax.swing.JButton();
        numPlateText = new javax.swing.JTextField();
        modelText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        ownerText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        accidentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        newAccidentButton = new javax.swing.JButton();
        NumPlateLabel1 = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        commentText = new javax.swing.JTextField();
        numVehicleText = new javax.swing.JTextField();
        AccIDLabel = new javax.swing.JLabel();
        AccIDText = new javax.swing.JTextField();
        UpdateAccident = new javax.swing.JButton();
        SearchAccident = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        VehicleDisplay = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        AccidentDisplay = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("QRTA Accident Entry Form ");
        Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        vehicleEntry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null));

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addressLabel.setText("Address");

        Vehicles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Vehicles.setText("Vehicles");

        numPlateLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numPlateLabel.setText("Number Plate");

        modelLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        modelLabel.setText("Model");

        yearLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        yearLabel.setText("Year");

        ownLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ownLabel.setText("Registered Owner");

        phoneLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        phoneLabel.setText("Phone Number");

        newVehicleButton.setText("Add Vehicle");
        newVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVehicleButtonActionPerformed(evt);
            }
        });

        searchVehicleButton.setText("Search");
        searchVehicleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehicleButtonActionPerformed(evt);
            }
        });

        updateVehicle.setText("Update");
        updateVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vehicleEntryLayout = new javax.swing.GroupLayout(vehicleEntry);
        vehicleEntry.setLayout(vehicleEntryLayout);
        vehicleEntryLayout.setHorizontalGroup(
            vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vehicleEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newVehicleButton)
                    .addComponent(updateVehicle)
                    .addComponent(searchVehicleButton)
                    .addGroup(vehicleEntryLayout.createSequentialGroup()
                        .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Vehicles)
                            .addComponent(ownLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numPlateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelText)
                            .addComponent(yearText)
                            .addComponent(ownerText)
                            .addComponent(numPlateText)
                            .addComponent(addressText)
                            .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addContainerGap())
        );
        vehicleEntryLayout.setVerticalGroup(
            vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehicleEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(vehicleEntryLayout.createSequentialGroup()
                        .addComponent(Vehicles)
                        .addGap(10, 10, 10)
                        .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numPlateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numPlateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ownLabel)
                            .addComponent(ownerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(vehicleEntryLayout.createSequentialGroup()
                        .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGap(18, 18, 18)
                .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehicleEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newVehicleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchVehicleButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        accidentPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, null, null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Accidents");

        LocationLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LocationLabel.setText("Location");

        commentLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        commentLabel.setText("Comments");

        newAccidentButton.setText("Add Accident");
        newAccidentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccidentButtonActionPerformed(evt);
            }
        });

        NumPlateLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        NumPlateLabel1.setText("Number of Vehicles");

        AccIDLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        AccIDLabel.setText("Accident ID");

        UpdateAccident.setText("Update");
        UpdateAccident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAccidentActionPerformed(evt);
            }
        });

        SearchAccident.setText("Search");
        SearchAccident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchAccidentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accidentPanelLayout = new javax.swing.GroupLayout(accidentPanel);
        accidentPanel.setLayout(accidentPanelLayout);
        accidentPanelLayout.setHorizontalGroup(
            accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accidentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accidentPanelLayout.createSequentialGroup()
                        .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AccIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAccidentButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentText, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(AccIDText)))
                    .addGroup(accidentPanelLayout.createSequentialGroup()
                        .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(locationText))
                    .addGroup(accidentPanelLayout.createSequentialGroup()
                        .addComponent(NumPlateLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(numVehicleText))
                    .addGroup(accidentPanelLayout.createSequentialGroup()
                        .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateAccident)
                            .addComponent(SearchAccident))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        accidentPanelLayout.setVerticalGroup(
            accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accidentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccIDLabel)
                    .addComponent(AccIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accidentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumPlateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numVehicleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(newAccidentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateAccident)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchAccident)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ExitButton.setBackground(java.awt.Color.red);
        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        VehicleDisplay.setEditable(false);
        VehicleDisplay.setColumns(20);
        VehicleDisplay.setRows(5);
        jScrollPane13.setViewportView(VehicleDisplay);
        VehicleDisplay.getAccessibleContext().setAccessibleParent(null);

        AccidentDisplay.setColumns(20);
        AccidentDisplay.setRows(5);
        jScrollPane14.setViewportView(AccidentDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicleEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accidentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accidentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicleEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //event handlers
    private void newVehicleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newVehicleButtonActionPerformed
       String numPlate = numPlateText.getText();
        String Model = modelText.getText();
        int year = Integer.parseInt(yearText.getText());
        String owner = ownerText.getText();
        String address = addressText.getText();
        long phone = Long.parseLong(phoneText.getText());
        VP.vehicleInsert(numPlate, Model, year, owner, address, phone);
        VP.damagedVehicles(numPlate);
    }//GEN-LAST:event_newVehicleButtonActionPerformed

    private void searchVehicleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_searchVehicleButtonActionPerformed
            String numPlate = numPlateText.getText();
            VP.vehicleSearch(numPlate);
            vClear();
    }//GEN-LAST:event_searchVehicleButtonActionPerformed

    private void ExitButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void updateVehicleActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateVehicleActionPerformed
        String numPlate = numPlateText.getText();
        String Model = modelText.getText();
        int year = Integer.parseInt(yearText.getText());
        String owner = ownerText.getText();
        String address = addressText.getText();
        long phone = Long.parseLong(phoneText.getText());
        VP.addressUpdate(numPlate, address);
        VP.modelUpdate(numPlate, Model);
        VP.ownerUpdate(numPlate, owner);
        VP.phoneUpdate(numPlate, phone);
        VP.yearUpdate(numPlate, year);
        vClear();
    }//GEN-LAST:event_updateVehicleActionPerformed

    private void newAccidentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newAccidentButtonActionPerformed
        String location = locationText.getText();
        String comments = commentText.getText();
        int numVehicles = Integer.parseInt(numVehicleText.getText());
        VP.AccidentInsert(location, comments, numVehicles);
    }//GEN-LAST:event_newAccidentButtonActionPerformed

    private void UpdateAccidentActionPerformed(ActionEvent evt) {//GEN-FIRST:event_UpdateAccidentActionPerformed
        int AccID = Integer.parseInt(AccIDText.getText());
        String location = locationText.getText();
        String comments = commentText.getText();
        VP.commentsUpdate(AccID, comments);
        VP.locaitionUpdate(AccID, location);
        aClear();
    }//GEN-LAST:event_UpdateAccidentActionPerformed

    private void SearchAccidentActionPerformed(ActionEvent evt) {//GEN-FIRST:event_SearchAccidentActionPerformed
        int AccID = Integer.parseInt(AccIDText.getText());
        if(AccID == 0)
        {
            VP.getAccident(AccID);
        }
        else
        VP.accidentSearch(AccID);
        
        aClear();
    }//GEN-LAST:event_SearchAccidentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccIDLabel;
    private javax.swing.JTextField AccIDText;
    private javax.swing.JTextArea AccidentDisplay;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JLabel NumPlateLabel1;
    private javax.swing.JButton SearchAccident;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UpdateAccident;
    private javax.swing.JTextArea VehicleDisplay;
    private javax.swing.JLabel Vehicles;
    private javax.swing.JPanel accidentPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JTextField commentText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField locationText;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelText;
    private javax.swing.JButton newAccidentButton;
    private javax.swing.JButton newVehicleButton;
    private javax.swing.JLabel numPlateLabel;
    private javax.swing.JTextField numPlateText;
    private javax.swing.JTextField numVehicleText;
    private javax.swing.JLabel ownLabel;
    private javax.swing.JTextField ownerText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton searchVehicleButton;
    private javax.swing.JButton updateVehicle;
    private javax.swing.JPanel vehicleEntry;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables

    
    public void show(Presenter pp) 
    {
        VP = pp;
    }

    
    public void vDisplay(Vehicle v) 
    {
        String numPlate = v.getNumPlate();
        String Model = v.getModel();
        int year = v.getYear();
        String owner = v.getOwner();
        String address = v.getAddress();
        long phone = v.getPhone();
        VehicleDisplay.append(String.format("%1$-10s %2$-10s %3$-10s %4$-10 %5$-10 %6$-10s \n", 
                numPlate, Model, year, owner, address, phone));
    }
    
    public void aDisplay(Accident a) 
    {
        
        int AccID = a.getAccID();
        String location = a.getLocation();
        String comments = a.getComments();
        int numVehicles = a.getNumVehicles();
        AccidentDisplay.append(String.format("%1$-10s %2$-10s %3$-10s %4$-10s \n", AccID, location, comments, numVehicles));
    }
    
    public void VehicleDisplay(String vMessage) 
    {
       VehicleDisplay.setText(String.format(vMessage));
       

        AppendLine();
        vClear();
    }
    public void AccidentDisplay(String aMessage)
    {
        AccidentDisplay.setText(String.format(aMessage));
        AppendLine();
        aClear();
    }
    public void vClear()
    {
        numPlateText.setText("");
        modelText.setText("");
        yearText.setText("");
        ownerText.setText("");
        addressText.setText("");
        phoneText.setText("");
        numPlateText.requestFocus();

    }
    public void aClear()
    {
        locationText.setText("");
        commentText.setText("");
        numVehicleText.setText("");
    }
    public void AppendLine()
    {
        AccidentDisplay.append("\n----------------------------------"
                        + "--------------------------------------------------");
        VehicleDisplay.append("\n------------------------------------------------"
                + "-----------------------------------------");
    }
}
