/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bitcoin;


import Bank.Customer;
import Bitcoin.Custodian;
import Business.Business;
import WorkRequest.InvestorWorkRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liugo
 */
public class BitcoinCustodianWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form Custodian
     */
//    public BTPCustodianWorkAreaJPanel() {
//        initComponents();
//    }
    private JPanel userProcessContainer;
    private Business business;
    private Custodian custodian;
    public BitcoinCustodianWorkArea(JPanel userProcessContainer, Business business, Custodian custodian) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.custodian = custodian;
        populateTable();
        jTextFieldSuperName.setText(custodian.getName());
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTableCustodianWorkQ.getModel();
        model.setRowCount(0);
        for(InvestorWorkRequest iwr : business.getCustodianWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = iwr.getSender();
            row[1] = iwr.getMessage();
            row[2] = iwr.getQuantity();
            row[3] = iwr.getQuantity()*1200;
            row[4] = iwr.getStatus();
            row[5] = iwr.getRequestDate();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustodianWorkQ = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldInvestorName = new javax.swing.JTextField();
        jButtonCheckDetailInfor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jTextFieldSellingQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBitcoinCapacity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonLegallyCheck = new javax.swing.JButton();
        jTextFieldSuperName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldBalance = new javax.swing.JTextField();
        jTextFieldTotalPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDirection = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Investor Supervision");

        jTableCustodianWorkQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Investor", "Direction", "Quantity", "Total", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCustodianWorkQ);
        if (jTableCustodianWorkQ.getColumnModel().getColumnCount() > 0) {
            jTableCustodianWorkQ.getColumnModel().getColumn(0).setResizable(false);
            jTableCustodianWorkQ.getColumnModel().getColumn(1).setResizable(false);
            jTableCustodianWorkQ.getColumnModel().getColumn(2).setResizable(false);
            jTableCustodianWorkQ.getColumnModel().getColumn(3).setResizable(false);
            jTableCustodianWorkQ.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setText("Investor Name:");

        jTextFieldInvestorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInvestorNameActionPerformed(evt);
            }
        });

        jButtonCheckDetailInfor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCheckDetailInfor.setForeground(new java.awt.Color(255, 153, 153));
        jButtonCheckDetailInfor.setText("Check Detail Information");
        jButtonCheckDetailInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckDetailInforActionPerformed(evt);
            }
        });

        jLabel3.setText("Transaction Date:");

        jTextFieldDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateActionPerformed(evt);
            }
        });

        jTextFieldSellingQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSellingQuantityActionPerformed(evt);
            }
        });

        jLabel4.setText("Selling Bitcoin Quantity:");

        jTextFieldBitcoinCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBitcoinCapacityActionPerformed(evt);
            }
        });

        jLabel6.setText("Bitcoin Capacity:");

        jButtonLegallyCheck.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLegallyCheck.setForeground(new java.awt.Color(255, 153, 153));
        jButtonLegallyCheck.setText("Select Next");
        jButtonLegallyCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLegallyCheckActionPerformed(evt);
            }
        });

        jTextFieldSuperName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSuperNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Supervisor Name:");

        jLabel7.setText("-Check Detail information---------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel8.setText("Balance:");

        jTextFieldBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBalanceActionPerformed(evt);
            }
        });

        jTextFieldTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalPriceActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Price:");

        jLabel10.setText("Direction:");

        jTextFieldDirection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDirectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSuperName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonCheckDetailInfor)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldInvestorName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBalance)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSellingQuantity))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBitcoinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonLegallyCheck)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDirection))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldSuperName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCheckDetailInfor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldInvestorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldBitcoinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSellingQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLegallyCheck)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInvestorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInvestorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInvestorNameActionPerformed

    private void jTextFieldDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateActionPerformed

    private void jTextFieldSellingQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSellingQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSellingQuantityActionPerformed

    private void jTextFieldBitcoinCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBitcoinCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBitcoinCapacityActionPerformed

    private void jButtonLegallyCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLegallyCheckActionPerformed
        // TODO add your handling code here:
        jTextFieldInvestorName.setText("");
        jTextFieldBitcoinCapacity.setText("");
        jTextFieldDate.setText("");
        jTextFieldSellingQuantity.setText("");
        jTextFieldTotalPrice.setText("");
        jTextFieldBalance.setText("");
        jTextFieldDirection.setText("");
        jButtonCheckDetailInfor.setEnabled(true);        
    }//GEN-LAST:event_jButtonLegallyCheckActionPerformed

    private void jTextFieldSuperNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSuperNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSuperNameActionPerformed

    private void jTextFieldBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBalanceActionPerformed

    private void jTextFieldTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalPriceActionPerformed

    private void jButtonCheckDetailInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckDetailInforActionPerformed
        // TODO add your handling code here:
        jButtonCheckDetailInfor.setEnabled(false);
        int row = jTableCustodianWorkQ.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            jButtonCheckDetailInfor.setEnabled(true);
            return;
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String direction = (String) jTableCustodianWorkQ.getValueAt(row, 1);
        Customer investor = (Customer) jTableCustodianWorkQ.getValueAt(row, 0);
        Date date =  (Date) jTableCustodianWorkQ.getValueAt(row, 5);
        String date1 = df.format(date);
        int quatity = (int) jTableCustodianWorkQ.getValueAt(row, 2);
        jTextFieldInvestorName.setText(investor.getName());
        jTextFieldBitcoinCapacity.setText(String.valueOf(investor.getWallet().getBitcoinCatalog().size()));
        jTextFieldDate.setText(date1);
        jTextFieldSellingQuantity.setText(String.valueOf(quatity));
        jTextFieldTotalPrice.setText(String.valueOf(quatity*1200));
        jTextFieldBalance.setText(String.valueOf(investor.getBitcoinSystemBalance()));
        jTextFieldDirection.setText(direction);
        
        if(direction.equals("Selling.")){
            if(quatity<=investor.getWallet().getBitcoinCatalog().size()){
                for(InvestorWorkRequest iwr : business.getCustodianWorkQueue().getWorkRequestList()){
                    if(iwr.getSender().equals(investor) && iwr.getRequestDate().equals(date)){
                        iwr.setStatus("Confirmed by Custodian.");
                        business.getExchangerWorkQueue().getWorkRequestList().add(iwr);
                    }
                }
                JOptionPane.showMessageDialog(null, "Request has been transfered to Exchanger.", "Congratulations", JOptionPane.WARNING_MESSAGE);
            }else{
                for(InvestorWorkRequest iwr : business.getCustodianWorkQueue().getWorkRequestList()){
                    if(iwr.getSender().equals(investor) && iwr.getRequestDate().equals(date)){
                        iwr.setStatus("Denied.");
                    }
                }
                JOptionPane.showMessageDialog(null, "Bitcoin not enough!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if(direction.equals("Buying.")){
            if(quatity*1200<=investor.getBitcoinSystemBalance()){
                for(InvestorWorkRequest iwr1 : business.getCustodianWorkQueue().getWorkRequestList()){
                    if(iwr1.getSender().equals(investor) && iwr1.getRequestDate().equals(date)){
                        iwr1.setStatus("Confirmed by Custodian.");
                        business.getExchangerWorkQueue().getWorkRequestList().add(iwr1);
                    }
                }
                JOptionPane.showMessageDialog(null, "Request has been transfered to Exchanger.", "Congratulations", JOptionPane.WARNING_MESSAGE);
            }else{
                for(InvestorWorkRequest iwr : business.getCustodianWorkQueue().getWorkRequestList()){
                    if(iwr.getSender().equals(investor) && iwr.getRequestDate().equals(date)){
                        iwr.setStatus("Denied.");
                    }
                }
                JOptionPane.showMessageDialog(null, "Balance not enough!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButtonCheckDetailInforActionPerformed

    private void jTextFieldDirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDirectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDirectionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckDetailInfor;
    private javax.swing.JButton jButtonLegallyCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustodianWorkQ;
    private javax.swing.JTextField jTextFieldBalance;
    private javax.swing.JTextField jTextFieldBitcoinCapacity;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldDirection;
    private javax.swing.JTextField jTextFieldInvestorName;
    private javax.swing.JTextField jTextFieldSellingQuantity;
    private javax.swing.JTextField jTextFieldSuperName;
    private javax.swing.JTextField jTextFieldTotalPrice;
    // End of variables declaration//GEN-END:variables

    
}
