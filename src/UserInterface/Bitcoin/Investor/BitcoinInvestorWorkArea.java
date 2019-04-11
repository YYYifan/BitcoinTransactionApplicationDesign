/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bitcoin.Investor;

import Bank.BankAccount;
import UserInterface.Bank.Customer.*;
import Bank.Customer;
import Bitcoin.Bitcoin;
import Bitcoin.Ownership;
import Business.Business;
import static Business.Business.business;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owner
 */
public class BitcoinInvestorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form BankCustomerWorkArea
     */
    private JPanel userProcessContainer;
    private Business business;
    private Customer customer;
    public BitcoinInvestorWorkArea(JPanel userProcessContainer, Business business, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.customer = customer;
        jTextField1.setText(customer.getName());
        jTextFieldBitcoinCapacity.setText(String.valueOf(customer.getWallet().getBitcoinCatalog().size()));
        jTextFieldBalance.setText(String.valueOf(customer.getBitcoinSystemBalance()));
        populateBankAccountTable();
        populateBitcoinTable();
    }
    
    private void populateBankAccountTable() {
        DefaultTableModel model = (DefaultTableModel) bankAccountJTable2.getModel();
        model.setRowCount(0);
        for(BankAccount bankAccount : customer.getBankAccountList()){
            Object[] row = new Object[4];
            row[0] = bankAccount.getAccountNumber();
            row[1] = bankAccount.getBankName();
            row[2] = bankAccount.getDate();
            row[3] = bankAccount.getBalance();
            model.addRow(row);
        }
    }
    
    private void populateBitcoinTable() {
        DefaultTableModel model = (DefaultTableModel) bitcoinJTable1.getModel();
        model.setRowCount(0);
        for(Bitcoin bitcoin : customer.getWallet().getBitcoinCatalog()){
            Object[] row = new Object[1];
            row[0] = bitcoin; 
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
        buyBitcoinfromSupplierJButton = new javax.swing.JButton();
        investorCheckDailyTransactionJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        startATransactionJButton1 = new javax.swing.JButton();
        requestConfirmationjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextFieldBitcoinCapacity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonRecharge = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bitcoinTransactionHistoryJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldrechargeAmmont = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bitcoinJTable1 = new javax.swing.JTable();
        jButtonCheckBitHistory = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bankAccountJTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Investor Work Area");

        buyBitcoinfromSupplierJButton.setText("Buy Bitcoin from Supplier");
        buyBitcoinfromSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBitcoinfromSupplierJButtonActionPerformed(evt);
            }
        });

        investorCheckDailyTransactionJButton.setText("Check DailyTransaction");
        investorCheckDailyTransactionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investorCheckDailyTransactionJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("-Please Select Your Work Responsibility First-----------------------------------------------------------------------------------------------------");

        startATransactionJButton1.setText("Start A Transaction");
        startATransactionJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startATransactionJButton1ActionPerformed(evt);
            }
        });

        requestConfirmationjButton.setText("Request Confirmation");
        requestConfirmationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestConfirmationjButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Welcome Back:");

        jLabel4.setText("Bitcoin Capacity:");

        jLabel5.setText("Balance:");

        jButtonRecharge.setText("Recharge to Balance");
        jButtonRecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechargeActionPerformed(evt);
            }
        });

        bitcoinTransactionHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "From", "To", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bitcoinTransactionHistoryJTable);
        if (bitcoinTransactionHistoryJTable.getColumnModel().getColumnCount() > 0) {
            bitcoinTransactionHistoryJTable.getColumnModel().getColumn(0).setResizable(false);
            bitcoinTransactionHistoryJTable.getColumnModel().getColumn(1).setResizable(false);
            bitcoinTransactionHistoryJTable.getColumnModel().getColumn(2).setResizable(false);
            bitcoinTransactionHistoryJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setText("-View Your Ownership--------------------------------------------------------------------------------------------------------------------------------");

        jLabel7.setText("Select one bank account and insert recharge amont:");

        bitcoinJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BitCoin ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bitcoinJTable1);
        if (bitcoinJTable1.getColumnModel().getColumnCount() > 0) {
            bitcoinJTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jButtonCheckBitHistory.setText("Check Bicoin Transaction History");
        jButtonCheckBitHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckBitHistoryActionPerformed(evt);
            }
        });

        bankAccountJTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AccountNumber", "BankName", "Created Date", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(bankAccountJTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBitcoinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldrechargeAmmont, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRecharge))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buyBitcoinfromSupplierJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestConfirmationjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(investorCheckDailyTransactionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startATransactionJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCheckBitHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldBitcoinCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRecharge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldrechargeAmmont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCheckBitHistory)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(investorCheckDailyTransactionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startATransactionJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyBitcoinfromSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestConfirmationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyBitcoinfromSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBitcoinfromSupplierJButtonActionPerformed

        BuyBitcoinFromSupplierJPanel bbfsjp = new BuyBitcoinFromSupplierJPanel(userProcessContainer, business, customer);
        userProcessContainer.add("BuyBitcoinFromSupplierJPanel", bbfsjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_buyBitcoinfromSupplierJButtonActionPerformed

    private void investorCheckDailyTransactionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investorCheckDailyTransactionJButtonActionPerformed

        ViewTransaction dtjp = new ViewTransaction(userProcessContainer, business, customer);
        userProcessContainer.add("DailyTransaction", dtjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_investorCheckDailyTransactionJButtonActionPerformed

    private void startATransactionJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startATransactionJButton1ActionPerformed
        // TODO add your handling code here:
        StartATransaction satjp = new StartATransaction(userProcessContainer, business, customer);
        userProcessContainer.add("StartATransaction", satjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_startATransactionJButton1ActionPerformed

    private void requestConfirmationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestConfirmationjButtonActionPerformed
        // TODO add your handling code here:
        RequestConfirmationJPanel manageOrganizationJPanel = new RequestConfirmationJPanel(userProcessContainer, business, customer);
        userProcessContainer.add("RequestConfirmationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestConfirmationjButtonActionPerformed

    private void jButtonRechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechargeActionPerformed
        // TODO add your handling code here:
        int row = bankAccountJTable2.getSelectedRow();
        int accountBalance = (int) bankAccountJTable2.getValueAt(row, 3);
        int bankAccountNumber = (int) bankAccountJTable2.getValueAt(row, 0);
        double rechargeBalance = Double.parseDouble(jTextFieldBalance.getText());
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(jTextFieldBalance.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please insert number you want to recharge!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else if(Integer.parseInt(jTextFieldBalance.getText())>accountBalance){
            JOptionPane.showMessageDialog(null, "Account Balance Not Enough, Please Select Another Bank Account or Decrese Your Rechage Balance!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        customer.setBitcoinSystemBalance(customer.getBitcoinSystemBalance()+rechargeBalance);
        for(BankAccount bankAccount : customer.getBankAccountList()){
            if(bankAccount.getAccountNumber() == bankAccountNumber){
                bankAccount.setBalance(bankAccount.getBalance()-rechargeBalance);
            }
        }
        populateBankAccountTable();
        
    }//GEN-LAST:event_jButtonRechargeActionPerformed

    private void jButtonCheckBitHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckBitHistoryActionPerformed
        // TODO add your handling code here:
        int row1 = bitcoinJTable1.getSelectedRow();
        if(row1<0){
            JOptionPane.showMessageDialog(null, "Please select a Bitcoin ID!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int bitcoinID = (int) bitcoinJTable1.getValueAt(row1, 0);
        
        DefaultTableModel model = (DefaultTableModel) bitcoinTransactionHistoryJTable.getModel();
        model.setRowCount(0);
        for(Bitcoin bitcoin : customer.getWallet().getBitcoinCatalog()){
            if(bitcoin.getId() == bitcoinID){
                for(Ownership ownership : bitcoin.getMovements()){
                    Object[] row = new Object[4];
                    row[0] = ownership.getOid();
                    row[1] = ownership.getFrom();
                    row[2] = ownership.getTo();
                    row[3] = ownership.getDate();
                    model.addRow(row); 
                }
            }
             
        }
        
    }//GEN-LAST:event_jButtonCheckBitHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bankAccountJTable2;
    private javax.swing.JTable bitcoinJTable1;
    private javax.swing.JTable bitcoinTransactionHistoryJTable;
    private javax.swing.JButton buyBitcoinfromSupplierJButton;
    private javax.swing.JButton investorCheckDailyTransactionJButton;
    private javax.swing.JButton jButtonCheckBitHistory;
    private javax.swing.JButton jButtonRecharge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBalance;
    private javax.swing.JTextField jTextFieldBitcoinCapacity;
    private javax.swing.JTextField jTextFieldrechargeAmmont;
    private javax.swing.JButton requestConfirmationjButton;
    private javax.swing.JButton startATransactionJButton1;
    // End of variables declaration//GEN-END:variables

    

    
}