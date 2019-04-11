/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.Business;
import Supplier.SaleRecord;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liugo
 */
public class BitcoinSupplierAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form BitcoinSupplierAdminWorkArea1
     */
    private JPanel userProcessContainer;
    private Business business;
    /** Creates new form AdminWorkAreaJPanel */
    
        
    
    public BitcoinSupplierAdminWorkArea(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bitcoinCreationJButton = new javax.swing.JButton();
        manageInvestorRequestJButton1 = new javax.swing.JButton();
        checkTotalIncomeJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel3.setText("-Select your work responsbility-----------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Supplier Admin Work Area");

        bitcoinCreationJButton.setText("Bitcoin Creation");
        bitcoinCreationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinCreationJButtonActionPerformed(evt);
            }
        });

        manageInvestorRequestJButton1.setText("Investor Bitcoin Request Mangement");
        manageInvestorRequestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInvestorRequestJButton1ActionPerformed(evt);
            }
        });

        checkTotalIncomeJButton2.setText("Check Total Income");
        checkTotalIncomeJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTotalIncomeJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageInvestorRequestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkTotalIncomeJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bitcoinCreationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(bitcoinCreationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(manageInvestorRequestJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(checkTotalIncomeJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bitcoinCreationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitcoinCreationJButtonActionPerformed

        SupplierBitcoinCreation sBitJPanel = new SupplierBitcoinCreation(userProcessContainer, business);
        userProcessContainer.add("SupplierBitcoinCreation", sBitJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bitcoinCreationJButtonActionPerformed

    private void manageInvestorRequestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInvestorRequestJButton1ActionPerformed
        // TODO add your handling code here:
        SupplierInvestorRequestManagment sirm = new SupplierInvestorRequestManagment(userProcessContainer, business);
        userProcessContainer.add("SupplierInvestorRequestManagment", sirm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInvestorRequestJButton1ActionPerformed

    private void checkTotalIncomeJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTotalIncomeJButton2ActionPerformed
        // TODO add your handling code here:
        SupplierAccountmanagementJPanel samjp = new SupplierAccountmanagementJPanel(userProcessContainer, business);
        userProcessContainer.add("SupplierAccountmanagementJPanel", samjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkTotalIncomeJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bitcoinCreationJButton;
    private javax.swing.JButton checkTotalIncomeJButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageInvestorRequestJButton1;
    // End of variables declaration//GEN-END:variables
}
