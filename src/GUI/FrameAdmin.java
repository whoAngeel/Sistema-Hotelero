/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author angel
 */
public class FrameAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdmin
     */
    public FrameAdmin() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_usuarios = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usr_nombre1 = new javax.swing.JTextField();
        txt_usr_apellido = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        usr_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_usr_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usr_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        admin_combobox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        panel_habitaciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_hab_numero = new javax.swing.JTextField();
        txt_username1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 42, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 42, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(40, 42, 54));
        jTabbedPane1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N

        panel_usuarios.setBackground(new java.awt.Color(98, 114, 164));
        panel_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(98, 114, 164));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 250, 123)), "Datos del Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(248, 248, 242))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(248, 248, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 242));
        jLabel2.setText("Contraseña:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 33));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 242));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 68, 33));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 242));
        jLabel4.setText("Apellido:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 107, 68, 33));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 242));
        jLabel5.setText("Username:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 33));

        txt_usr_nombre1.setBackground(new java.awt.Color(248, 248, 242));
        txt_usr_nombre1.setForeground(new java.awt.Color(68, 71, 90));
        txt_usr_nombre1.setText("jTextField1");
        jPanel3.add(txt_usr_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        txt_usr_apellido.setBackground(new java.awt.Color(248, 248, 242));
        txt_usr_apellido.setForeground(new java.awt.Color(68, 71, 90));
        txt_usr_apellido.setText("jTextField1");
        jPanel3.add(txt_usr_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, -1));

        txt_username.setBackground(new java.awt.Color(248, 248, 242));
        txt_username.setForeground(new java.awt.Color(68, 71, 90));
        txt_username.setText("jTextField1");
        jPanel3.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        usr_password.setBackground(new java.awt.Color(248, 248, 242));
        usr_password.setForeground(new java.awt.Color(68, 71, 90));
        usr_password.setText("jPasswordField1");
        jPanel3.add(usr_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 248, 242));
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 33));

        txt_usr_telefono.setBackground(new java.awt.Color(248, 248, 242));
        txt_usr_telefono.setForeground(new java.awt.Color(68, 71, 90));
        txt_usr_telefono.setText("jTextField1");
        jPanel3.add(txt_usr_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 248, 242));
        jLabel7.setText("Rol:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 33));

        txt_usr_email.setBackground(new java.awt.Color(248, 248, 242));
        txt_usr_email.setForeground(new java.awt.Color(68, 71, 90));
        txt_usr_email.setText("jTextField1");
        jPanel3.add(txt_usr_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 248, 242));
        jLabel8.setText("E-mail:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 33));

        admin_combobox.setBackground(new java.awt.Color(248, 248, 242));
        admin_combobox.setForeground(new java.awt.Color(68, 71, 90));
        admin_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Limpieza" }));
        admin_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_comboboxActionPerformed(evt);
            }
        });
        jPanel3.add(admin_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 150, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 444, 240, 10));

        panel_usuarios.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 37, 290, 430));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        panel_usuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 63, 560, 400));

        jButton3.setBackground(new java.awt.Color(80, 250, 123));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(98, 114, 164));
        jButton3.setText("Ingresar Habitación");
        panel_usuarios.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 200, 40));

        jTabbedPane1.addTab("Usuarios", panel_usuarios);

        panel_habitaciones.setBackground(new java.awt.Color(98, 114, 164));
        panel_habitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(98, 114, 164));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 250, 123)), "Datos de la Habitación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Roboto", 1, 18), new java.awt.Color(248, 248, 242))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(248, 248, 242));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(248, 248, 242));
        jLabel10.setText("Tipo de Habitación");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 160, 33));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(248, 248, 242));
        jLabel11.setText("Num.De Habitación");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 33));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 248, 242));
        jLabel12.setText("Caracteristicas:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 33));

        txt_hab_numero.setBackground(new java.awt.Color(248, 248, 242));
        txt_hab_numero.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txt_hab_numero.setForeground(new java.awt.Color(68, 71, 90));
        txt_hab_numero.setText("jTextField1");
        jPanel4.add(txt_hab_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, -1));

        txt_username1.setBackground(new java.awt.Color(248, 248, 242));
        txt_username1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txt_username1.setForeground(new java.awt.Color(68, 71, 90));
        txt_username1.setText("jTextField1");
        jPanel4.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 140, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 444, 240, 10));

        jComboBox1.setBackground(new java.awt.Color(248, 248, 242));
        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(68, 71, 90));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 140, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(248, 248, 242));
        jLabel16.setText("Precio: ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 33));

        jTextArea1.setBackground(new java.awt.Color(248, 248, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(68, 71, 90));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 300, -1));

        panel_habitaciones.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 37, 340, 430));

        jTable2.setBackground(new java.awt.Color(248, 248, 242));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        panel_habitaciones.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 42, 516, -1));

        jButton2.setBackground(new java.awt.Color(80, 250, 123));
        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(98, 114, 164));
        jButton2.setText("Ingresar Habitación");
        panel_habitaciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 40));

        jTabbedPane1.addTab("Habitaciones", panel_habitaciones);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 940, 590));

        jButton1.setBackground(new java.awt.Color(80, 250, 123));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(98, 114, 164));
        jButton1.setText("Salir");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 680));

        jLabel1.setBackground(new java.awt.Color(68, 71, 90));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 242));
        jLabel1.setText("ADMINISTRADOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_comboboxActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> admin_combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel_habitaciones;
    private javax.swing.JPanel panel_usuarios;
    private javax.swing.JTextField txt_hab_numero;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_username1;
    private javax.swing.JTextField txt_usr_apellido;
    private javax.swing.JTextField txt_usr_email;
    private javax.swing.JTextField txt_usr_nombre1;
    private javax.swing.JTextField txt_usr_telefono;
    private javax.swing.JPasswordField usr_password;
    // End of variables declaration//GEN-END:variables
}
