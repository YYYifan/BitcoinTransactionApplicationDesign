/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Bitcoin.Admin;


import Bitcoin.Exchanger;
import Business.Business;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owner
 */
public class BitcoinExchangerManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
//    public BitcoinExchangerManagementJPanel() {
//        initComponents();
//    }
    private JPanel userProcessContainer;
    private Business business;
    BitcoinExchangerManagementJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateExchangerTable();
    }
    private void populateExchangerTable() {
        DefaultTableModel model = (DefaultTableModel) exchangerJTable.getModel();
        model.setRowCount(0);
        for (Exchanger exchanger : business.getExchangerDirectory().getExchangerDirectory()){
            Object[] row = new Object[2];
            row[0] = exchanger.getId();
            row[1] = exchanger;
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

        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exchangerJTable = new javax.swing.JTable();
        deleteExchangerjButton = new javax.swing.JButton();
        createExchangergerjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exchangerRNamejTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        exchangerUNamejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        exchangerPasswordjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 153));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("Bitcoin Exchanger Management");

        jLabel3.setText("-Create Exchanger----------------------------------------------------------------------------------------------------------------------------------------------------");

        exchangerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Exchanger Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(exchangerJTable);

        deleteExchangerjButton.setText("Delete Exchanger");
        deleteExchangerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExchangerjButtonActionPerformed(evt);
            }
        });

        createExchangergerjButton.setText("Create New Exchanger");
        createExchangergerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createExchangergerjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("-View Custodian Information----------------------------------------------------------------------------------------------------------------------------------------");

        jLabel6.setText("Exchanger Name:");

        exchangerRNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangerRNamejTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("User Name:");

        exchangerUNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangerUNamejTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Password:");

        exchangerPasswordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangerPasswordjTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteExchangerjButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(backJButton)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exchangerRNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(250, 250, 250))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(createExchangergerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(exchangerPasswordjTextField))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(4, 4, 4)
                                                    .addComponent(exchangerUNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteExchangerjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exchangerRNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(exchangerUNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exchangerPasswordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(createExchangergerjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteExchangerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExchangerjButtonActionPerformed
        // TODO add your handling code here:
        int row = exchangerJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Exchanger bitExch = (Exchanger) exchangerJTable.getValueAt(row, 1);
        business.getExchangerDirectory().getExchangerDirectory().remove(bitExch);
    }//GEN-LAST:event_deleteExchangerjButtonActionPerformed

    private void createExchangergerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createExchangergerjButtonActionPerformed
        // TODO add your handling code here:
        String realName = exchangerRNamejTextField.getText();
        String username = exchangerUNamejTextField.getText();
        String password = exchangerPasswordjTextField.getText();
        Exchanger ex = new Exchanger();
        ex.setName(realName);
        ex.setUsername(username);
        ex.setPassword(password);
        business.getExchangerDirectory().getExchangerDirectory().add(ex);
        
        exchangerRNamejTextField.setText("");
        exchangerUNamejTextField.setText("");
        exchangerPasswordjTextField.setText("");
    }//GEN-LAST:event_createExchangergerjButtonActionPerformed

    private void exchangerRNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangerRNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangerRNamejTextFieldActionPerformed

    private void exchangerUNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangerUNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangerUNamejTextFieldActionPerformed

    private void exchangerPasswordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangerPasswordjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangerPasswordjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createExchangergerjButton;
    private javax.swing.JButton deleteExchangerjButton;
    private javax.swing.JTable exchangerJTable;
    private javax.swing.JTextField exchangerPasswordjTextField;
    private javax.swing.JTextField exchangerRNamejTextField;
    private javax.swing.JTextField exchangerUNamejTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}