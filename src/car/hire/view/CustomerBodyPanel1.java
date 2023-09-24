/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package car.hire.view;

import car.hire.controller.CustomerController;
import car.hire.dto.CustomerDto;
import static car.hire.view.UserBodyPanel1.validateDob;
import static car.hire.view.UserBodyPanel1.validateMobile;
import static car.hire.view.UserBodyPanel1.validateNic;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL i5
 */
public class CustomerBodyPanel1 extends javax.swing.JPanel {

    CustomerController customerController;

    /**
     * Creates new form CustomerBodyPanel
     */
    public CustomerBodyPanel1() {
        initComponents();
        customerController = new CustomerController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomerLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custAddressLabel = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custNicLabel = new javax.swing.JLabel();
        custNicText = new javax.swing.JTextField();
        custMobileLabel = new javax.swing.JLabel();
        custMobileText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        custDobLabel = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        addCustomerLabel.setBackground(new java.awt.Color(204, 255, 204));
        addCustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addCustomerLabel.setText("Register New Customer");

        custNameLabel.setText("Customer Name");

        custAddressLabel.setText("Address");

        custNicLabel.setText("NIC No");

        custMobileLabel.setText("Mobile No");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setText("Register");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss." }));

        custDobLabel.setText("Date of Birth");

        jDateChooser.setDateFormatString("yyyy-MM-dd");

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCustomerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(custDobLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custMobileLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custNicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custNicText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custMobileText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(custNameText)))
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addCustomerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custNameLabel)
                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custAddressLabel)
                    .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custNicLabel)
                    .addComponent(custNicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custMobileLabel)
                    .addComponent(custMobileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(custDobLabel)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(backButton))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        addNewCustomer();
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        loadCustomerPanel();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addCustomerLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel custAddressLabel;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JLabel custDobLabel;
    private javax.swing.JLabel custMobileLabel;
    private javax.swing.JTextField custMobileText;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField custNameText;
    private javax.swing.JLabel custNicLabel;
    private javax.swing.JTextField custNicText;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser;
    // End of variables declaration//GEN-END:variables

    private void addNewCustomer() {

        Date dob;
        dob = jDateChooser.getDate();

        if (custNameText.getText().equals("") || custAddressText.getText().equals("") || custMobileText.getText().equals("") || custNicText.getText().equals("") || dob.equals(null)) {
            JOptionPane.showMessageDialog(this, "Please Fullyfill form");
        } else if (validateNic(custNicText.getText())) {

            if (validateMobile(custMobileText.getText())) {

                if (validateDob(jDateChooser.getDate())) {

                    try {
                        CustomerDto customerDto = new CustomerDto(
                                null,
                                (String) jComboBox.getSelectedItem(),
                                custNameText.getText(),
                                custAddressText.getText(),
                                custNicText.getText(),
                                jDateChooser.getDate(),
                                custMobileText.getText());

                        String result = customerController.addNewCustomer(customerDto);
                        JOptionPane.showMessageDialog(this, result);
                        clearPanel();
                    } catch (Exception ex) {
                        Logger.getLogger(CustomerBodyPanel1.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(this, ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Oops! You are minor");
                    jDateChooser.setDate(null);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid Mobile Number");
                custMobileText.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid NIC Number");
            custNicText.setText("");
        }

    }

    private void clearPanel() {
        custNameText.setText("");
        custAddressText.setText("");
        custNicText.setText("");
        custMobileText.setText("");
        jComboBox.setSelectedItem("Mr.");
        jDateChooser.setDate(new Date());
    }

    private void loadCustomerPanel() {
        //to be continued        
    }
}
