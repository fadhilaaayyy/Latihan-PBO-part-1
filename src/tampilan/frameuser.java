/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tampilan;

import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import kelas.user;
/**
 *
 * @author FADHILA
 */
public class frameuser extends javax.swing.JFrame {

 
    public frameuser() {
        initComponents();
        loadTabel();
        Reset();
    }
    
    void loadTabel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Username");
        model.addColumn("Email");
        model.addColumn("Fullname");
        model.addColumn("Status");
        
        try {
            user us = new user();
            ResultSet data = us.tampilUser();
            
            while(data.next())
                model.addRow(new Object[]{
                   data.getString("user_name"),
                   data.getString("user_email"),
                   data.getString("user_fullname"),
                   data.getInt("user_status") ==1 ? "Aktif" : "Tidak Aktif"
                });
                
                
        } catch (SQLException sQLException) {
        }
        
        tUser.setModel(model);
    }
    
    void Reset(){
        tUsername.setText(null);
        tUsername.setEditable(true);
        tEmail.setText(null);
        tPassword.setText(null);
        tFullname.setText(null);
        cStatus.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tFullname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cStatus = new javax.swing.JComboBox<>();
        bTambah = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tUser = new javax.swing.JTable();
        bHapus = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Username");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jLabel4.setText("Fullname");

        jLabel5.setText("Status");

        cStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Tidak Aktif" }));

        bTambah.setBackground(new java.awt.Color(255, 204, 204));
        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        tUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tUser);

        bHapus.setBackground(new java.awt.Color(153, 153, 255));
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bUbah.setBackground(new java.awt.Color(93, 178, 238));
        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(30, 30, 30)
                        .addComponent(bHapus)
                        .addGap(27, 27, 27)
                        .addComponent(bUbah))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tUsername)
                            .addComponent(tEmail)
                            .addComponent(tFullname)
                            .addComponent(cStatus, 0, 209, Short.MAX_VALUE)
                            .addComponent(tPassword))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bHapus)
                    .addComponent(bUbah))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed

        try {
            user user = new user();
            
            user.setUser_name(tUsername.getText());
            user.setUser_email(tEmail.getText());
            user.setUser_password(tPassword.getText());
            user.setUser_fullname(tFullname.getText());
            if (cStatus.getSelectedItem().equals("Aktif")) {
                user.setUser_status(1);
            } else {
                user.setUser_status(0);
            }
            user.tambahUser();
        } catch (SQLException sQLException) {
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUserMouseClicked
      int baris = tUser.rowAtPoint(evt.getPoint());
        String userName = tUser.getValueAt(baris, 0).toString();
        String email = tUser.getValueAt(baris, 1).toString();
        String fullName = tUser.getValueAt(baris, 2).toString();
        String status = tUser.getValueAt(baris, 3).toString();

        tUsername.setText(userName);
        tUsername.setEditable(false);
        tEmail.setText(email);
        tFullname.setText(fullName);
        cStatus.setSelectedItem(status);
    }//GEN-LAST:event_tUserMouseClicked

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            user usr = new user();
            usr.setUser_name(tUsername.getText());
            usr.HapusUser();
        } catch (SQLException sQLException) {
        }
        loadTabel();
        Reset();
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
           try {
            user usr = new user();
            usr.setUser_name(tUsername.getText());
            usr.setUser_email(tEmail.getText());
            usr.setUser_password(tPassword.getText());
            usr.setUser_fullname(tFullname.getText());
            if (cStatus.getSelectedItem().equals("Aktif")) {
                usr.setUser_status(1);
            } else {
                usr.setUser_status(0);
            }
            
            usr.ubahUser();
        } catch (SQLException sQLException) {
        }
        loadTabel();
        Reset();
    
        
    }//GEN-LAST:event_bUbahActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JComboBox<String> cStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tFullname;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTable tUser;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
