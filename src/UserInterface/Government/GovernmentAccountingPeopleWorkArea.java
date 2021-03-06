/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government;

import Business.Business;
import Government.TaxTransaction;
import java.awt.CardLayout;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owner
 */
public class GovernmentAccountingPeopleWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form GovAccountingPeopleWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Business business;


    public GovernmentAccountingPeopleWorkArea(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        populateTaxTransactionTable();
        showTotalTax();
        
    }
    private void showTotalTax() {
       double tTax = 0.00;
       for(TaxTransaction taxTransaction : business.getTaxTransactionDirectory().getTaxTransactionDirectory()){
           double eachTax = taxTransaction.getFee();
           tTax = tTax + eachTax;
       }
       totalTaxjTextField1.setText(String.valueOf(tTax));
    }
    private void populateTaxTransactionTable() {
        DefaultTableModel model = (DefaultTableModel)taxTransactionjTable.getModel();
        model.setRowCount(0);
        for(TaxTransaction taxTransaction : business.getTaxTransactionDirectory().getTaxTransactionDirectory()){
            Object[] row = new Object[4];
            row[0] = taxTransaction.getDate();
            row[1] = 1200;
            row[2] = taxTransaction.getTransaction().getQuantity();
            row[3] = taxTransaction.getTransaction().getQuantity()*1200;
            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tranDatejTextField = new javax.swing.JTextField();
        totalPricejTextField = new javax.swing.JTextField();
        taxjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taxTransactionjTable = new javax.swing.JTable();
        selectTranjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totalTaxjTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 153));

        tranDatejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranDatejTextFieldActionPerformed(evt);
            }
        });

        totalPricejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPricejTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Transaction Date:");

        jLabel3.setText("Total Price:");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Tax Collection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tax:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Accounting People Tax Collection");

        taxTransactionjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Date", "Selling Price", "Selling Quantity", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(taxTransactionjTable);
        if (taxTransactionjTable.getColumnModel().getColumnCount() > 0) {
            taxTransactionjTable.getColumnModel().getColumn(0).setResizable(false);
            taxTransactionjTable.getColumnModel().getColumn(1).setResizable(false);
            taxTransactionjTable.getColumnModel().getColumn(2).setResizable(false);
            taxTransactionjTable.getColumnModel().getColumn(3).setResizable(false);
        }

        selectTranjButton.setBackground(new java.awt.Color(255, 204, 204));
        selectTranjButton.setText("Select Transaction");
        selectTranjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTranjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Tax:");

        totalTaxjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTaxjTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPricejTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tranDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectTranjButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTaxjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTaxjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectTranjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tranDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(taxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tranDatejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranDatejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tranDatejTextFieldActionPerformed

    private void totalPricejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPricejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPricejTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectTranjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTranjButtonActionPerformed
        // TODO add your handling code here:
        int taxTransaction = taxTransactionjTable.getSelectedRow();
        if (taxTransaction < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Transaction first!");
            return;
        }
        Date tranDate = (Date) taxTransactionjTable.getValueAt(taxTransaction, 0);
        int totalPrice = (int) taxTransactionjTable.getValueAt(taxTransaction, 3);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tranDatejTextField.setText(formatter.format(tranDate));
        totalPricejTextField.setText(String.valueOf(totalPrice));
    }//GEN-LAST:event_selectTranjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(TaxTransaction taxTransaction : business.getTaxTransactionDirectory().getTaxTransactionDirectory()){
            String reqDate = tranDatejTextField.getText();
                Date date1 = null;
                try {
                    date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(reqDate);
                } catch (ParseException ex) {

                }
            if(taxTransaction.getDate().equals(date1)){
                taxjTextField.setText(String.valueOf(Integer.parseInt(totalPricejTextField.getText())*0.06));
                taxTransaction.setFee(Double.parseDouble(taxjTextField.getText()));
            }
        }
        showTotalTax();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalTaxjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTaxjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTaxjTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectTranjButton;
    private javax.swing.JTable taxTransactionjTable;
    private javax.swing.JTextField taxjTextField;
    private javax.swing.JTextField totalPricejTextField;
    private javax.swing.JTextField totalTaxjTextField1;
    private javax.swing.JTextField tranDatejTextField;
    // End of variables declaration//GEN-END:variables

    

   
}
