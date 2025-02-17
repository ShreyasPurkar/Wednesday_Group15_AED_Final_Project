/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectBackend.Enterprise.UpcyclingCenter.UpcyclingCenterClass;
import finalprojectBackend.Enterprise.UpcyclingCenter.UpcyclingCenterManager;
import finalprojectUserInterface.MainJFrameForm;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyas purkar
 */
public class ManageNGO extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGO
     */
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageNGO(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateNGOTable();
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
        lbl_Admintitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNGO = new javax.swing.JTable();
        jScrollPaneDoctor = new javax.swing.JScrollPane();
        tblManagerDetails = new javax.swing.JTable();
        btn_getdetails = new javax.swing.JButton();
        lbl_ManDetails = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(169, 146, 125));

        lbl_Admintitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_Admintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Admintitle.setText("Administration");

        tblNGO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donation Centre Name", "User ID", "Registered No.", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNGO);

        tblManagerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager Name", "User ID", "Donation Centre Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneDoctor.setViewportView(tblManagerDetails);

        btn_getdetails.setBackground(new java.awt.Color(102, 102, 102));
        btn_getdetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_getdetails.setText("Get Details");
        btn_getdetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_getdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getdetailsActionPerformed(evt);
            }
        });

        lbl_ManDetails.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_ManDetails.setText("Manager Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_getdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ManDetails)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(lbl_Admintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_Admintitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_getdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(lbl_ManDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1182, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_getdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getdetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNGO.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblNGO.getModel();
        String NGOName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" NGOSeach: " + NGOName);
        NGOClass h = operatingSystem.getNGODirectory().findNGO(NGOName);
        if (h==null) {
            UpcyclingCenterClass uc = operatingSystem.getUpcyclingDirectory().findNGO(NGOName);
            populateUpcyclingManagerTable(operatingSystem.getUpcyclingCenterManagerDirectory(), NGOName);
        } else {
        populateManagerTable(operatingSystem.getManagerDirectory(), NGOName);
        }
    }//GEN-LAST:event_btn_getdetailsActionPerformed

    private void populateNGOTable() {
        DefaultTableModel model = (DefaultTableModel) tblNGO.getModel();
        model.setRowCount(0);

        for (NGOClass h : operatingSystem.getNGODirectory().getListOfNGO()) {

            Object[] row = new Object[5];
            row[0] = h.getNameEnterprise();
            row[1] = h.getpName();
            row[2] = h.getRegisteredNumber();
            row[3] = h.getAddr();
            model.addRow(row);
        }
        
        for (UpcyclingCenterClass uc : operatingSystem.getUpcyclingDirectory().getListOfNGO()) {

            Object[] row = new Object[5];
            row[0] = uc.getNameEnterprise();
            row[1] = uc.getpName();
            row[2] = uc.getRegisteredNumber();
            row[3] = uc.getAddr();
            model.addRow(row);
        }
    }

    private void populateManagerTable(ArrayList<Manager> managers, String ngo) {
        DefaultTableModel model = (DefaultTableModel) tblManagerDetails.getModel();
        model.setRowCount(0);

        for (Manager d : managers) {
            
            Object[] row = new Object[5];
            if (d.getNGOName().equals(ngo)) {

                row[0] = d.getNamePerson();
                row[1] = d.getpName();
                row[2] = d.getNGOName();
                row[3] = d.getAddr();
                model.addRow(row);
            }
        }
    }
    
    private void populateUpcyclingManagerTable(ArrayList<UpcyclingCenterManager> managers, String ngo) {
        DefaultTableModel model = (DefaultTableModel) tblManagerDetails.getModel();
        model.setRowCount(0);

        for (UpcyclingCenterManager d : managers) {
            
            Object[] row = new Object[5];
            if (d.getNGOName().equals(ngo)) {

                row[0] = d.getNamePerson();
                row[1] = d.getpName();
                row[2] = d.getNGOName();
                row[3] = d.getAddr();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getdetails;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneDoctor;
    private javax.swing.JLabel lbl_Admintitle;
    private javax.swing.JLabel lbl_ManDetails;
    private javax.swing.JTable tblManagerDetails;
    private javax.swing.JTable tblNGO;
    // End of variables declaration//GEN-END:variables
}
