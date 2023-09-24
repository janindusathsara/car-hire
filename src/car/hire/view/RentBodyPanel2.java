/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package car.hire.view;

import car.hire.controller.RentController;
import car.hire.dto.RentReturnDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL i5
 */
public class RentBodyPanel2 extends javax.swing.JPanel {

    Integer rentId;
    Integer userID;
    RentController rentController;
    CustomerEntity ce;
    CarEntity ce1;

    /**
     * Creates new form RentBodyPanel
     *
     * @param rentId
     * @param userID
     */
    public RentBodyPanel2(Integer rentId, Integer userID) {
        initComponents();
        this.rentId = rentId;
        this.userID = userID;
        rentController = new RentController();
        loadRentData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnRentalLabel = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        custIDText = new javax.swing.JTextField();
        custDataLabel = new javax.swing.JLabel();
        vehicleIDLabel = new javax.swing.JLabel();
        vehicleIDText = new javax.swing.JTextField();
        vehicleDataLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        rentFromDateLabel = new javax.swing.JLabel();
        rentToDateLabel = new javax.swing.JLabel();
        perDayRentLabel = new javax.swing.JLabel();
        perDayRentText = new javax.swing.JTextField();
        advanceLabel = new javax.swing.JLabel();
        advanceText = new javax.swing.JTextField();
        keyMoneyLabel = new javax.swing.JLabel();
        keyMoneyText = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        finalBalanceLabel = new javax.swing.JLabel();
        finalBalanceText = new javax.swing.JTextField();
        rentIDLabel = new javax.swing.JLabel();
        rentIDText = new javax.swing.JTextField();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        toDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(644, 380));

        returnRentalLabel.setBackground(new java.awt.Color(204, 255, 204));
        returnRentalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnRentalLabel.setText("Vehicle Return");

        custIDLabel.setText("Customer ID");
        custIDLabel.setPreferredSize(new java.awt.Dimension(66, 22));

        custIDText.setEditable(false);

        vehicleIDLabel.setText("Vehicle ID");
        vehicleIDLabel.setPreferredSize(new java.awt.Dimension(52, 22));

        vehicleIDText.setEditable(false);

        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        rentFromDateLabel.setText("Rent From Date");
        rentFromDateLabel.setPreferredSize(new java.awt.Dimension(82, 22));

        rentToDateLabel.setText("Rent To Date");
        rentToDateLabel.setPreferredSize(new java.awt.Dimension(82, 22));

        perDayRentLabel.setText("Per Day Rent");
        perDayRentLabel.setPreferredSize(new java.awt.Dimension(67, 22));

        perDayRentText.setEditable(false);

        advanceLabel.setText("Advance Payment");
        advanceLabel.setPreferredSize(new java.awt.Dimension(92, 22));

        advanceText.setEditable(false);

        keyMoneyLabel.setText("Key Money");
        keyMoneyLabel.setPreferredSize(new java.awt.Dimension(59, 22));

        keyMoneyText.setEditable(false);

        totalLabel.setText("Total");
        totalLabel.setPreferredSize(new java.awt.Dimension(26, 22));

        totalText.setEditable(false);

        finalBalanceLabel.setText("Final Balance");
        finalBalanceLabel.setPreferredSize(new java.awt.Dimension(26, 22));

        finalBalanceText.setEditable(false);

        rentIDLabel.setText("Rent ID");
        rentIDLabel.setPreferredSize(new java.awt.Dimension(66, 22));

        rentIDText.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(returnButton)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnRentalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rentFromDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rentToDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(perDayRentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(advanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(custIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vehicleIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(keyMoneyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(finalBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(perDayRentText, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(custIDText, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(vehicleIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(rentIDText)
                                            .addComponent(advanceText)
                                            .addComponent(keyMoneyText)
                                            .addComponent(totalText)
                                            .addComponent(finalBalanceText, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vehicleDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(returnRentalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(custDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(custIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vehicleIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vehicleIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vehicleDataLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentFromDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rentToDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perDayRentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perDayRentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(advanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyMoneyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keyMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnButton)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        returnCar();
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advanceLabel;
    private javax.swing.JTextField advanceText;
    private javax.swing.JLabel custDataLabel;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JTextField custIDText;
    private javax.swing.JLabel finalBalanceLabel;
    private javax.swing.JTextField finalBalanceText;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JLabel keyMoneyLabel;
    private javax.swing.JTextField keyMoneyText;
    private javax.swing.JLabel perDayRentLabel;
    private javax.swing.JTextField perDayRentText;
    private javax.swing.JLabel rentFromDateLabel;
    private javax.swing.JLabel rentIDLabel;
    private javax.swing.JTextField rentIDText;
    private javax.swing.JLabel rentToDateLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel returnRentalLabel;
    private com.toedter.calendar.JDateChooser toDateChooser;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalText;
    private javax.swing.JLabel vehicleDataLabel;
    private javax.swing.JLabel vehicleIDLabel;
    private javax.swing.JTextField vehicleIDText;
    // End of variables declaration//GEN-END:variables

    private void returnCar() {
        try {

            RentReturnDto dto = new RentReturnDto(
                    rentId,
                    ce,
                    ce1,
                    fromDateChooser.getDate(),
                    toDateChooser.getDate(),
                    Double.valueOf(perDayRentText.getText()),
                    Double.valueOf(advanceText.getText()),
                    Double.valueOf(keyMoneyText.getText()),
                    Double.valueOf(totalText.getText()),
                    Double.valueOf(finalBalanceText.getText()),
                    userID);

            String result = rentController.returnCar(dto);
            JOptionPane.showMessageDialog(rentIDText, result);
        } catch (Exception ex) {
            Logger.getLogger(RentBodyPanel2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadRentData() {
        try {
            RentReturnDto dto = rentController.getRentData(rentId);
            this.ce = dto.getCustomerEntity();
            this.ce1 = dto.getCar();
            
            if (dto != null) {
                rentIDText.setText(dto.getRentId().toString());
                custIDText.setText(dto.getCustomerEntity().getCustId().toString());
                custDataLabel.setText(dto.getCustomerEntity().getCustName() + ", " + dto.getCustomerEntity().getNic());
                vehicleIDText.setText(dto.getCar().getVehicleId().toString());
                vehicleDataLabel.setText(dto.getCar().getVehicleNumber() + ", " + dto.getCar().getBrand() + ", " + dto.getCar().getModel());
                fromDateChooser.setDate(dto.getFromDate());
                toDateChooser.setDate(dto.getToDate());
                perDayRentText.setText(dto.getPerDayRent().toString());
                advanceText.setText(dto.getAdvance().toString());
                keyMoneyText.setText(dto.getKeyMoney().toString());
                totalText.setText(dto.getTotal().toString());
                finalBalanceText.setText(dto.getFinalBalance().toString());

            } else {
                JOptionPane.showMessageDialog(this, "Rental not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(RentBodyPanel2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
