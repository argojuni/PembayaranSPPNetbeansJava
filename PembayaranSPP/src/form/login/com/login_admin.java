/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form.login.com;
import java.sql.*;
import javax.swing.*;
import pembayaranspp.KoneksiDB;
import pembayaranspp.UserSession;
import home.dashboard.com.Dashboard;
/**
 *
 * @author JUNIARGO
 */
public class login_admin extends javax.swing.JFrame {

    Connection con = KoneksiDB.getConnection();;
    ResultSet rs;
    /**
     * Creates new form login_admin
     */
    public login_admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInterface = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        In_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        submit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        In_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_siswa = new javax.swing.JButton();
        btn_petugas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlInterface.setBackground(new java.awt.Color(153, 51, 255));
        pnlInterface.setPreferredSize(new java.awt.Dimension(430, 474));
        pnlInterface.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(153, 51, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(441, 110));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Card Payment.png"))); // NOI18N
        jPanel4.add(jLabel1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Euro Money.png"))); // NOI18N
        jPanel4.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Historical.png"))); // NOI18N
        jPanel4.add(jLabel4);

        pnlInterface.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(153, 51, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(380, 80));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APLIKASI PEMBAYARAN SPP");
        jLabel2.setPreferredSize(new java.awt.Dimension(330, 80));
        jPanel3.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        pnlInterface.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adminitrasi.png"))); // NOI18N
        jPanel1.add(jLabel7, java.awt.BorderLayout.CENTER);

        pnlInterface.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlInterface);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(441, 100));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Login Admin");
        jLabel6.setPreferredSize(new java.awt.Dimension(134, 30));
        jPanel6.add(jLabel6, java.awt.BorderLayout.CENTER);

        pnlLogin.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 20));

        In_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        In_password.setText("jPasswordField1");
        In_password.setBorder(null);
        In_password.setMinimumSize(new java.awt.Dimension(64, 30));
        In_password.setPreferredSize(new java.awt.Dimension(106, 30));
        In_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                In_passwordMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/password.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator3.setForeground(new java.awt.Color(153, 51, 255));

        submit.setBackground(new java.awt.Color(153, 51, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login.png"))); // NOI18N
        submit.setText("Log in");
        submit.setAlignmentX(0.5F);
        submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(153, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 51, 255));

        In_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        In_username.setText("Username");
        In_username.setBorder(null);
        In_username.setPreferredSize(new java.awt.Dimension(66, 30));
        In_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                In_usernameMouseClicked(evt);
            }
        });
        In_username.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                In_usernamePropertyChange(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(In_username, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(In_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(In_username, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(In_password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pnlLogin.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 100));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Login dengan.....");
        jPanel8.add(jLabel9);

        jPanel2.add(jPanel8);

        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        btn_siswa.setBackground(new java.awt.Color(255, 102, 255));
        btn_siswa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_siswa.setForeground(new java.awt.Color(255, 255, 255));
        btn_siswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Graduation Cap.png"))); // NOI18N
        btn_siswa.setText("Siswa");
        btn_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siswaActionPerformed(evt);
            }
        });
        jPanel7.add(btn_siswa);

        btn_petugas.setBackground(new java.awt.Color(255, 102, 204));
        btn_petugas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_petugas.setForeground(new java.awt.Color(255, 255, 255));
        btn_petugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customs Officer.png"))); // NOI18N
        btn_petugas.setText("Petugas");
        btn_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_petugasActionPerformed(evt);
            }
        });
        jPanel7.add(btn_petugas);

        jPanel2.add(jPanel7);

        pnlLogin.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(pnlLogin);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siswaActionPerformed
        // TODO add your handling code here:
        new login_siswa().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_siswaActionPerformed

    private void btn_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_petugasActionPerformed
        // TODO add your handling code here:
        new login_petugas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_petugasActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String user = In_username.getText();
        String pass = In_password.getText();

        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM  petugas where username='"+user+"' and password='"+pass+"'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                String id = rs.getString("id_petugas");
                String username = rs.getString("username");
                String nama = rs.getString("nama_petugas");
                String level = rs.getString("level");
                
                //set user data session
                UserSession.set_id(id);
                UserSession.set_username(username);
                UserSession.set_nama(nama);
                UserSession.set_level(level);
                
                switch (level) {
                    case "admin":
                    {
                        JOptionPane.showMessageDialog(null, "Selamat datang "+ nama +" !");
                        Dashboard dsb = new Dashboard();
                        dsb.dashAdmin();
                        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        dsb.setVisible(true);
                        dispose();
                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null, "Anda bukan admin");
                        break;
                    }
//                    default:
//                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username atau password salah");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void In_usernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_In_usernamePropertyChange
        // TODO add your handling code here:
        In_username.selectAll();
    }//GEN-LAST:event_In_usernamePropertyChange

    private void In_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_In_passwordMouseClicked
        // TODO add your handling code here:
        In_password.selectAll();
    }//GEN-LAST:event_In_passwordMouseClicked

    private void In_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_In_usernameMouseClicked
        // TODO add your handling code here:
        In_username.selectAll();
    }//GEN-LAST:event_In_usernameMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField In_password;
    private javax.swing.JTextField In_username;
    private javax.swing.JButton btn_petugas;
    private javax.swing.JButton btn_siswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlInterface;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

    private Object login_siswa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
