/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package car.hire.view;

import car.hire.controller.RentController;
import car.hire.dto.RentDto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL i5
 */
public class RentPanel extends javax.swing.JPanel {

    RentController rentController;

    /**
     * Creates new form RentPanel
     */
    public RentPanel(String[] args) {
        initComponents();
        rentController = new RentController();
        loadRentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentLabel = new javax.swing.JLabel();
        rBodyPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentTable = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        placeOrderButton = new javax.swing.JButton();
        carReturnButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        rentLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rentLabel.setText("  Rent");

        rBodyPanel.setBackground(new java.awt.Color(204, 255, 204));

        rentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentTable);

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Rentals", "Overdue Rentals", "Active Rentals", "Old Rentals" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrderButton.setText("Place New Rent");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        carReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        carReturnButton.setText("Car Return");
        carReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rBodyPanelLayout = new javax.swing.GroupLayout(rBodyPanel);
        rBodyPanel.setLayout(rBodyPanelLayout);
        rBodyPanelLayout.setHorizontalGroup(
            rBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rBodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rBodyPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rBodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeOrderButton)
                .addGap(21, 21, 21))
        );
        rBodyPanelLayout.setVerticalGroup(
            rBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rBodyPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(rBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrderButton)
                    .addComponent(carReturnButton))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        loadRentBodyPanel1();
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        loadRentTable();
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void carReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carReturnButtonActionPerformed
        Integer rentId = 0;
        try {
            rentId = getRentId();
            if (rentId != 0) {
                loadRentBodyPanel2(rentId);
            } else {
                JOptionPane.showMessageDialog(this, "Please select the Rental from table before enter to the Return Proccess");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select the Rental from table before enter to the Return Proccess");
        }
    }//GEN-LAST:event_carReturnButtonActionPerformed

    private void rentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rentTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carReturnButton;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JPanel rBodyPanel;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JTable rentTable;
    // End of variables declaration//GEN-END:variables

    private void loadRentBodyPanel1() {
        rBodyPanel.removeAll();
        RentBodyPanel1 rentBodyPanel = new RentBodyPanel1();
        rentBodyPanel.setSize(rBodyPanel.getWidth(), rBodyPanel.getHeight());
        rBodyPanel.add(rentBodyPanel);
        rBodyPanel.repaint();
        rBodyPanel.revalidate();
    }

    private void loadRentTable() {
        switch ((String) jComboBox.getSelectedItem()) {
            
            case "Overdue Rentals":
                String[] columns = {"ID", "Customer", "Vehicle", "From Date", "To Date"};
                DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                rentTable.setModel(dtm);

                ArrayList<RentDto> rentDtos;
                try {
                    rentDtos = rentController.getOverdueRentals();
                    for (RentDto rentDto : rentDtos) {
                        Object[] rowData = {
                            rentDto.getRentId(), 
                            rentDto.getCustomerEntity().getCustId() + ", " + rentDto.getCustomerEntity().getCustName() + ", " + rentDto.getCustomerEntity().getCustPhoneNo(), 
                            rentDto.getCar().getVehicleId() + " -- " +rentDto.getCar().getVehicleNumber(), 
                            rentDto.getFromDate(), 
                            rentDto.getToDate()
                        };
                        dtm.addRow(rowData);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rentLabel, ex.getMessage());
                }
                break;

            case "Active Rentals":
                String[] columns2 = {"ID", "Customer", "Vehicle", "From Date", "To Date"};
                DefaultTableModel dtm2 = new DefaultTableModel(columns2, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                rentTable.setModel(dtm2);

                ArrayList<RentDto> rentDtos2;
                try {
                    rentDtos2 = rentController.getActiveRentals();
                    for (RentDto rentDto : rentDtos2) {
                        Object[] rowData = {
                            rentDto.getRentId(), 
                            rentDto.getCustomerEntity().getCustId() + ", " + rentDto.getCustomerEntity().getCustName(), 
                            rentDto.getCar().getVehicleId() + " -- " +rentDto.getCar().getVehicleNumber(), 
                            rentDto.getFromDate(), 
                            rentDto.getToDate()
                        };
                        dtm2.addRow(rowData);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rentLabel, ex.getMessage());
                }
                break;
                
            case "Old Rentals":
                String[] columns3 = {"ID", "Customer", "Vehicle", "From Date", "To Date"};
                DefaultTableModel dtm3 = new DefaultTableModel(columns3, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                rentTable.setModel(dtm3);

                ArrayList<RentDto> rentDtos3;
                try {
                    rentDtos3 = rentController.getOldRentals();
                    for (RentDto rentDto : rentDtos3) {
                        Object[] rowData = {
                            rentDto.getRentId(), 
                            rentDto.getCustomerEntity().getCustId() + ", " + rentDto.getCustomerEntity().getCustName(), 
                            rentDto.getCar().getVehicleId() + " -- " +rentDto.getCar().getVehicleNumber(), 
                            rentDto.getFromDate(), 
                            rentDto.getToDate()
                        };
                        dtm3.addRow(rowData);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rentLabel, ex.getMessage());
                }
                break;
                
            default:
                String[] column = {"ID", "Customer", "Vehicle", "From Date", "To Date"};
                DefaultTableModel dtm1 = new DefaultTableModel(column, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                rentTable.setModel(dtm1);

                ArrayList<RentDto> rentDtos1;
                try {
                    rentDtos1 = rentController.getAllRentals();
                    for (RentDto rentDto : rentDtos1) {
                        Object[] rowData = {
                            rentDto.getRentId(), 
                            rentDto.getCustomerEntity().getCustId() + ", " + rentDto.getCustomerEntity().getCustName(), 
                            rentDto.getCar().getVehicleId() + " -- " +rentDto.getCar().getVehicleNumber(), 
                            rentDto.getFromDate(), 
                            rentDto.getToDate()
                        };
                        dtm1.addRow(rowData);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rentLabel, ex.getMessage());
                }
        }
    }

    private Integer getRentId() {
        Integer id = (Integer) rentTable.getValueAt(rentTable.getSelectedRow(), 0);
        return id;
    }

    private void loadRentBodyPanel2(Integer rentId) {
        rBodyPanel.removeAll();
        RentBodyPanel2 rentBodyPanel2 = new RentBodyPanel2(rentId);
        rentBodyPanel2.setSize(rBodyPanel.getWidth(), rBodyPanel.getHeight());
        rBodyPanel.add(rentBodyPanel2);
        rBodyPanel.repaint();
        rBodyPanel.revalidate();
    }
}
