/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bitcoin.Admin;

import Business.Business;
import static Business.Business.business;
import UserInterface.Bitcoin.BitcoinDepositoryWorkArea;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author owner
 */
public class BitcoinAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    public BitcoinAdminWorkArea(JPanel userProcessContainer, Business business) {
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

        jLabel1 = new javax.swing.JLabel();
        manageExchangerJButton = new javax.swing.JButton();
        manageCustodianJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        manageAccountingpeopleJButton1 = new javax.swing.JButton();
        manageInvestorJButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Adminstrative Work Area");

        manageExchangerJButton.setText("Manage Exchanger");
        manageExchangerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageExchangerJButtonActionPerformed(evt);
            }
        });

        manageCustodianJButton.setText("Manage Custodian");
        manageCustodianJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustodianJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("-Please Select Your Work Responsibility First----------------------------------------------------------------------------------------");

        manageAccountingpeopleJButton1.setText("Manage Accounting People");
        manageAccountingpeopleJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountingpeopleJButton1ActionPerformed(evt);
            }
        });

        manageInvestorJButton1.setText("Manage Investor");
        manageInvestorJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInvestorJButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Check Bitcoin Depository");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manageInvestorJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(manageAccountingpeopleJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manageCustodianJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(manageExchangerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageInvestorJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageAccountingpeopleJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageCustodianJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageExchangerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageExchangerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageExchangerJButtonActionPerformed

        BitcoinExchangerManagementJPanel bemjp = new BitcoinExchangerManagementJPanel(userProcessContainer, business);
        userProcessContainer.add("BitcoinExchangerManagementJPanel", bemjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageExchangerJButtonActionPerformed

    private void manageCustodianJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustodianJButtonActionPerformed

        BitcoinCustodianManagementJPanel bcmjp = new BitcoinCustodianManagementJPanel(userProcessContainer, business);
        userProcessContainer.add("BitcoinCustodianManagementJPanel", bcmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCustodianJButtonActionPerformed

    private void manageAccountingpeopleJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountingpeopleJButton1ActionPerformed
        // TODO add your handling code here:
        BitcoinAccountingPeopleManagementJPanel bapmjp = new BitcoinAccountingPeopleManagementJPanel(userProcessContainer, business);
        userProcessContainer.add("BitcoinAccountingPeopleManagementJPanel", bapmjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageAccountingpeopleJButton1ActionPerformed

    private void manageInvestorJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInvestorJButton1ActionPerformed
        // TODO add your handling code here:
        InvestorManagementJPanel imjp = new InvestorManagementJPanel(userProcessContainer, business);
        userProcessContainer.add("InvestorManagementJPanel", imjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInvestorJButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BitcoinDepositoryWorkArea bdwa = new BitcoinDepositoryWorkArea(userProcessContainer, business);
        userProcessContainer.add("BitcoinDepositoryWorkArea", bdwa);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageAccountingpeopleJButton1;
    private javax.swing.JButton manageCustodianJButton;
    private javax.swing.JButton manageExchangerJButton;
    private javax.swing.JButton manageInvestorJButton1;
    // End of variables declaration//GEN-END:variables
}
