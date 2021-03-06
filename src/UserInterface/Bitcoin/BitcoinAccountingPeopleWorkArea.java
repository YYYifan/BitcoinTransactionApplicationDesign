/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bitcoin;


import Bitcoin.BitcoinAccountingPeople;
import Bitcoin.Transaction;
import Business.Business;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liugo
 */
public class BitcoinAccountingPeopleWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AccountingPeople
     */
//    public BTPAccountingPeopleWorkAreaJPanel() {
//        initComponents();
//    }
    private BitcoinAccountingPeople bitcoinAccountingPeople;
    private JPanel userProcessContainer;
    private Business business;
    
    public BitcoinAccountingPeopleWorkArea(JPanel userProcessContainer, Business business, BitcoinAccountingPeople bitcoinAccountingPeople) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.bitcoinAccountingPeople = bitcoinAccountingPeople;
        jTextFieldAccountingPeopleName.setText(bitcoinAccountingPeople.getName());
        populateTable();
        
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTableFeeCollection.getModel();
        model.setRowCount(0);
        for(Transaction tran : business.getTransactionDirectory().getTransactionDirectory()){
            if(tran.getFeeStatus().equals("UnFee")){
                Object[] row = new Object[6];
                row[0] = tran.getTid();
                row[1] = tran.getSeller();
                row[2] = tran.getBuyer();
                row[3] = tran.getDate();
                row[4] = tran.getQuantity()*1200;
                row[5] = tran.getFeeStatus();
                model.addRow(row);
                
            }
            
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
        jTableFeeCollection = new javax.swing.JTable();
        jTextFieldSeller = new javax.swing.JTextField();
        jTextFieldBuyer = new javax.swing.JTextField();
        jTextFieldFee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonFeeColl = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldAccountingPeopleName = new javax.swing.JTextField();
        jTextFieldTotal1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Accounting People Fee Collection");

        jTableFeeCollection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Seller", "Buyer", "Date", "Total Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFeeCollection);
        if (jTableFeeCollection.getColumnModel().getColumnCount() > 0) {
            jTableFeeCollection.getColumnModel().getColumn(0).setResizable(false);
            jTableFeeCollection.getColumnModel().getColumn(1).setResizable(false);
            jTableFeeCollection.getColumnModel().getColumn(2).setResizable(false);
            jTableFeeCollection.getColumnModel().getColumn(3).setResizable(false);
            jTableFeeCollection.getColumnModel().getColumn(4).setResizable(false);
            jTableFeeCollection.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextFieldSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSellerActionPerformed(evt);
            }
        });

        jTextFieldBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuyerActionPerformed(evt);
            }
        });

        jLabel2.setText("Seller:");

        jLabel3.setText("Buyer:");

        jButtonFeeColl.setBackground(new java.awt.Color(255, 204, 204));
        jButtonFeeColl.setText("Fee Collection");
        jButtonFeeColl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFeeCollActionPerformed(evt);
            }
        });

        jButtonNext.setBackground(new java.awt.Color(255, 204, 204));
        jButtonNext.setText("Next Transaction");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabel4.setText("Fee:");

        jLabel18.setText("Accounting People Name:");

        jTextFieldAccountingPeopleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAccountingPeopleNameActionPerformed(evt);
            }
        });

        jTextFieldTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotal1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldAccountingPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldTotal1)
                                    .addComponent(jTextFieldSeller, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFee)
                                    .addComponent(jTextFieldBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonFeeColl)
                                    .addComponent(jButtonNext)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldAccountingPeopleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSeller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButtonFeeColl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSellerActionPerformed

    private void jTextFieldBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuyerActionPerformed

    private void jTextFieldAccountingPeopleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAccountingPeopleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAccountingPeopleNameActionPerformed

    private void jButtonFeeCollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFeeCollActionPerformed
        // TODO add your handling code here:
        jButtonFeeColl.setEnabled(false);
        int row = jTableFeeCollection.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            jButtonFeeColl.setEnabled(true);
            return;
        }
        int id = (int) jTableFeeCollection.getValueAt(row, 0);
        String seller = (String) jTableFeeCollection.getValueAt(row, 1);
        String buyer = (String) jTableFeeCollection.getValueAt(row, 2);
        Date date = (Date) jTableFeeCollection.getValueAt(row, 3);
        int total = (int) jTableFeeCollection.getValueAt(row, 4);
        jTextFieldSeller.setText(seller);
        jTextFieldBuyer.setText(buyer);
        jTextFieldTotal1.setText(String.valueOf(total));
        jTextFieldFee.setText(String.valueOf(total*0.01));
        business.getFeeTransactionDirectory().createFeeTransaction(seller, buyer, date, total*0.01);
        for(Transaction tran : business.getTransactionDirectory().getTransactionDirectory()){
            if(tran.getFeeStatus().equals("UnFee") && tran.getTid()==id){
                tran.setFeeStatus("Fee");
            }
        }
        
        
    }//GEN-LAST:event_jButtonFeeCollActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        jTextFieldSeller.setText("");
        jTextFieldBuyer.setText("");
        jTextFieldTotal1.setText("");
        jTextFieldFee.setText("");
        jButtonFeeColl.setEnabled(true);
        populateTable();
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jTextFieldTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFeeColl;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFeeCollection;
    private javax.swing.JTextField jTextFieldAccountingPeopleName;
    private javax.swing.JTextField jTextFieldBuyer;
    private javax.swing.JTextField jTextFieldFee;
    private javax.swing.JTextField jTextFieldSeller;
    private javax.swing.JTextField jTextFieldTotal1;
    // End of variables declaration//GEN-END:variables

    
}
