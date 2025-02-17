/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import javax.swing.table.DefaultTableModel;
import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Organization.AssignmentDonation;

import finalprojectUserInterface.MainJFrameForm;
import javax.swing.JOptionPane;


/**
 *
 * @author shreyas purkar
 */
public class ManageDonations extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonations
     */
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageDonations(MainJFrameForm MainLoginPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = MainLoginPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateDonationTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonations = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(169, 146, 125));

        tblDonations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Category", "Weight (LB)", "Donar Name", "Donation Enterprise", "Recycling Manager", "Upcycling Manager", "Delivery Agent", "Status", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDonations);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1078, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void populateDonationTable() {
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        model.setRowCount(0);
        System.out.println("populateDonationtable");
        for (AssignmentDonation d : operatingSystem.getAssignmentDonationList()) {

            Object[] row = new Object[10];
            row[0] = d.getEntityName();
            row[1] = d.getCategory();
            row[2] = d.getUnits();
            try {
                row[3] = d.getDonRecepient().getNamePerson();
            } catch (Exception e) {

            }
            try {
                row[4] = d.getDonEnterpriseClass().getNameEnterprise();
            } catch (Exception e) {

            }
           
            try {
            row[5] = d.getRecManager().getNamePerson();
            }catch (Exception e) {

            }
            try {
                row[6] = d.getUpManager().getNamePerson();
            } catch (Exception e) {

            }
            try{
            row[7] = d.getDeliveryAgent().getNamePerson();
            }catch (Exception e) {

            }
            row[8] = d.getStatusDonation();
            try {
            row[9] = d.getUserId();
            }catch (Exception e) {

            }          
            model.addRow(row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDonations;
    // End of variables declaration//GEN-END:variables
}
