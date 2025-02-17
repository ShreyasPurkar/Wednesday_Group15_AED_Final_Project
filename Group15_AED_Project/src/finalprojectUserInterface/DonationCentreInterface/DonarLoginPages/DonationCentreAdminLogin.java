/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.DonationCentreInterface.DonarLoginPages;



import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonationCentre.BankDonor;
import finalprojectUserInterface.DonationCentreInterface.DonarLoginPages.DonarAdminBankLoginPages.DonationCentreAdminItemDonate;
import finalprojectUserInterface.DonationCentreInterface.DonarLoginPages.DonarAdminBankLoginPages.DonationCentreAdminDonation;
import finalprojectUserInterface.MainJFrameForm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author shreyas purkar
 */
public class DonationCentreAdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form DonationCentreAdminLogin
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    BankDonor donationCentre;
    
    public DonationCentreAdminLogin(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, BankDonor donbank) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.donationCentre = donbank;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        item_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        donation_btn = new javax.swing.JButton();

        jSplitPane1.setDividerLocation(190);

        jPanel2.setBackground(new java.awt.Color(169, 146, 125));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(94, 80, 63));

        item_btn.setBackground(new java.awt.Color(102, 102, 102));
        item_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        item_btn.setText(" Item Donar");
        item_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_btnActionPerformed(evt);
            }
        });

        logout_btn.setBackground(new java.awt.Color(102, 102, 102));
        logout_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_btn.setText("Logout");
        logout_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        donation_btn.setBackground(new java.awt.Color(102, 102, 102));
        donation_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        donation_btn.setText("Donations");
        donation_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        donation_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donation_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
            .addComponent(donation_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(item_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(donation_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void item_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_btnActionPerformed
        // TODO add your handling code here:
        DonationCentreAdminItemDonate dado = new DonationCentreAdminItemDonate(MainLoginPage, dB4OUtility, operatingSystem, donationCentre);
        jSplitPane1.setRightComponent(dado);
    }//GEN-LAST:event_item_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_logout_btnActionPerformed

    private void donation_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donation_btnActionPerformed
        // TODO add your handling code here:
        DonationCentreAdminDonation dat = new DonationCentreAdminDonation(MainLoginPage, dB4OUtility, operatingSystem, donationCentre);
        jSplitPane1.setRightComponent(dat);
    }//GEN-LAST:event_donation_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donation_btn;
    private javax.swing.JButton item_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logout_btn;
    // End of variables declaration//GEN-END:variables
}
