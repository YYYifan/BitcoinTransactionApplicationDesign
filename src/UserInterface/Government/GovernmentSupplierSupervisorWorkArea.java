/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government;

import Bitcoin.Bitcoin;
import Business.Business;
import Supplier.SaleRecord;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owner
 */
public class GovernmentSupplierSupervisorWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form GovMarketSupervisorWorkAreaJPanel
     */
//    public GovernmentSupplierSupervisorWorkArea() {
//        initComponents();
//    }
    private JPanel userProcessContainer;
    private Business business;
    
    public GovernmentSupplierSupervisorWorkArea(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateSupplierBitcoinListTable();
        populateSupplierBitcoinSellingTable();
    }
    
    private void populateSupplierBitcoinListTable() {
        DefaultTableModel model = (DefaultTableModel)supplierBitcoinListjTable1.getModel();
        model.setRowCount(0);
        for(Bitcoin bitcoin : business.getSupplierAdmin().getBitcoinList()){
            Object[] row = new Object[2];
            row[0] = bitcoin.getId();
            row[1] = 1200;   
            model.addRow(row);
        }
    }
    
    private void populateSupplierBitcoinSellingTable() {
        DefaultTableModel model = (DefaultTableModel)supplierBitcoinSellingjTable.getModel();
        model.setRowCount(0);
        for (SaleRecord sr : business.getSupplierAccount().getSaleRecordList()){
            Object[] row = new Object[5];
           
            row[1] = sr.getInvestor().getName();
            row[2] = sr.getQuantity()*1200;
            row[0] = sr.getDate();
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
        supplierBitcoinListjTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierBitcoinSellingjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Supplier Supervision");

        supplierBitcoinListjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bitcoin ID", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierBitcoinListjTable1);
        if (supplierBitcoinListjTable1.getColumnModel().getColumnCount() > 0) {
            supplierBitcoinListjTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        supplierBitcoinSellingjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction Date", "Investor", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(supplierBitcoinSellingjTable);

        jLabel3.setText("-Bitcoin Creation Supervision---------------------------------------------------------------------------------------------------------------------------------");

        jLabel4.setText("-Bitcoin Selling Supervision-------------------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable supplierBitcoinListjTable1;
    private javax.swing.JTable supplierBitcoinSellingjTable;
    // End of variables declaration//GEN-END:variables

    
}