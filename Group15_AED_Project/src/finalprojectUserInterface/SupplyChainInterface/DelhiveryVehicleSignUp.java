/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryVehicle;

import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Neelabh
 */
public class DelhiveryVehicleSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DelhiveryVehicleSignUp
     */
    boolean ValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public DelhiveryVehicleSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dv_profile = new javax.swing.JLabel();
        delvehicle_lbl = new javax.swing.JLabel();
        vehicle_txt = new javax.swing.JTextField();
        veh_lbl = new javax.swing.JLabel();
        vehtype_txt = new javax.swing.JTextField();
        desc_lbl = new javax.swing.JLabel();
        vehnum_txt = new javax.swing.JTextField();
        veh_num_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        sign_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehdes_txt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(139, 177, 150));

        dv_profile.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        dv_profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dv_profile.setText("Add Delivery Vehicle");

        delvehicle_lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        delvehicle_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delvehicle_lbl.setText("Vehicle Name:");

        veh_lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        veh_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veh_lbl.setText("Vehicle Type:");

        desc_lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        desc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_lbl.setText("Description:");

        veh_num_lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        veh_num_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veh_num_lbl.setText("Vehicle Number:");

        back_btn.setBackground(new java.awt.Color(102, 102, 102));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        sign_btn.setBackground(new java.awt.Color(102, 102, 102));
        sign_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sign_btn.setText("Add");
        sign_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_btnActionPerformed(evt);
            }
        });

        vehdes_txt.setColumns(20);
        vehdes_txt.setRows(5);
        jScrollPane1.setViewportView(vehdes_txt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dv_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(382, 382, 382))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sign_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delvehicle_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(veh_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(veh_num_lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(desc_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vehtype_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehnum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delvehicle_lbl, desc_lbl, veh_lbl, veh_num_lbl});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, vehicle_txt, vehnum_txt, vehtype_txt});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(dv_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehtype_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veh_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delvehicle_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehnum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veh_num_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sign_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delvehicle_lbl, desc_lbl, veh_lbl, veh_num_lbl});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {vehicle_txt, vehnum_txt, vehtype_txt});

    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void sign_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_btnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation()) {
                    DeliveryVehicle vehicle = new DeliveryVehicle(vehicle_txt.getText(),vehnum_txt.getText(),vehtype_txt.getText(),vehdes_txt.getText());
                if(operatingSystem.isDeliveryVehiclePresent(vehnum_txt.getText())) {
                    JOptionPane.showMessageDialog(this,"Vehicle number is already registered!");
                    return;
                }
                operatingSystem.addDeliveryVehicle(vehicle);
                dB4OUtility.storeSystem(operatingSystem);

                MainJFrameForm suc = new MainJFrameForm();
                ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some rrror in entered data.Please check over the fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Empty Field not allowed ! Please check the red fields");
                ValidationStatus=true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Vehicle is not registered ! Please check");
            ValidationStatus=true;
        }
      
        
        
        
        
    }//GEN-LAST:event_sign_btnActionPerformed

    private boolean EmpytyFieldValidation() {
    if(vehicle_txt.getText().equals(null) || vehicle_txt.getText().trim().isEmpty() )
    {
        vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehicle_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehicle_txt.getText().equals(null) && !vehicle_txt.getText().trim().isEmpty() )
    {
        vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    if(vehnum_txt.getText().equals(null) || vehnum_txt.getText().trim().isEmpty() )
    {
        vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehnum_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehnum_txt.getText().equals(null) && !vehnum_txt.getText().trim().isEmpty() )
    {
        vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    if(vehtype_txt.getText().equals(null) || vehtype_txt.getText().trim().isEmpty() )
    {
        vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehtype_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehtype_txt.getText().equals(null) && !vehtype_txt.getText().trim().isEmpty() )
    {
        vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }
    


    if(vehdes_txt.getText().equals(null) || vehdes_txt.getText().trim().isEmpty() )
    {
        vehdes_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehdes_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehdes_txt.getText().equals(null) && !vehdes_txt.getText().trim().isEmpty() )
    {
        vehdes_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }
    return ValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel delvehicle_lbl;
    private javax.swing.JLabel desc_lbl;
    private javax.swing.JLabel dv_profile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sign_btn;
    private javax.swing.JLabel veh_lbl;
    private javax.swing.JLabel veh_num_lbl;
    private javax.swing.JTextArea vehdes_txt;
    private javax.swing.JTextField vehicle_txt;
    private javax.swing.JTextField vehnum_txt;
    private javax.swing.JTextField vehtype_txt;
    // End of variables declaration//GEN-END:variables

    private boolean RegexValidation() {
        if(!vehtype_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            vehtype_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        } else {
            vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            vehtype_txt.setToolTipText(null);
        }
        if(!vehicle_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            vehicle_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        } else {
            vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            vehicle_txt.setToolTipText(null);
        }
        if(!vehnum_txt.getText().matches("^[0-9]{5}$"))
        {
            vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            vehnum_txt.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        } else {
            vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            vehnum_txt.setToolTipText(null);
        }
        return validationCheck;
    }
}
