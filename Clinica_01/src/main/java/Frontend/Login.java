/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;
import BaseDatos.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Login extends javax.swing.JFrame {

    public int privilegio, opcion, DNI;
    Statement statement = null;
    
    public Login() {
        initComponents();
    }

    public int LoginDoctor() {
        System.out.println("Mostrando Datos");
        Conexion objConexion = new Conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT DNI,CONTRASEÑA,PRIVILEGIO FROM DOCTOR");
            do {
                resultado.next();
                System.out.println(txtUsuario.getText());
                System.out.println(txtPassword.getText());
                System.out.println(resultado.getString("DNI"));
                System.out.println(resultado.getString("CONTRASEÑA"));
                System.out.println(resultado.getString("PRIVILEGIO"));
                if ((txtUsuario.getText().equalsIgnoreCase(resultado.getString("DNI"))) && (txtPassword.getText().equalsIgnoreCase(resultado.getString("CONTRASEÑA")))) {
                    privilegio = Integer.parseInt(resultado.getString("PRIVILEGIO"));
                    DNI = Integer.parseInt(resultado.getString("DNI"));
                } else {
                    privilegio = 0;
                }
            } while (privilegio == 0);
        } catch (Exception e) {
        }

        return privilegio;
    }

    public int LoginPaciente() {
        System.out.println("Mostrando Datos");
        Conexion objConexion = new Conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT DNI,CONTRASEÑA,PRIVILEGIO FROM PACIENTE");
            do {
                resultado.next();
                System.out.println(txtUsuario.getText());
                System.out.println(txtPassword.getText());
                System.out.println(resultado.getString("DNI"));
                System.out.println(resultado.getString("CONTRASEÑA"));
                System.out.println(resultado.getString("PRIVILEGIO"));
                if ((txtUsuario.getText().equalsIgnoreCase(resultado.getString("DNI"))) && (txtPassword.getText().equalsIgnoreCase(resultado.getString("CONTRASEÑA")))) {
                    privilegio = Integer.parseInt(resultado.getString("PRIVILEGIO"));
                    DNI = Integer.parseInt(resultado.getString("DNI"));
                } else {
                    privilegio = 0;
                }
            } while (privilegio == 0);
        } catch (Exception e) {
        }

        return privilegio;
    }

    public int LoginSecretaria() {
        System.out.println("Mostrando Datos");
        Conexion objConexion = new Conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT DNI,CONTRASEÑA,PRIVILEGIO FROM SECRETARIA");
            do {
                resultado.next();
                System.out.println(txtUsuario.getText());
                System.out.println(txtPassword.getText());
                System.out.println(resultado.getString("DNI"));
                System.out.println(resultado.getString("CONTRASEÑA"));
                System.out.println(resultado.getString("PRIVILEGIO"));
                if ((txtUsuario.getText().equalsIgnoreCase(resultado.getString("DNI"))) && (txtPassword.getText().equalsIgnoreCase(resultado.getString("CONTRASEÑA")))) {
                    privilegio = Integer.parseInt(resultado.getString("PRIVILEGIO"));
                    DNI = Integer.parseInt(resultado.getString("DNI"));
                } else {
                    privilegio = 0;
                }
            } while (privilegio == 0);
        } catch (Exception e) {
        }

        return privilegio;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        pnlTitulo = new javax.swing.JPanel();
        lblClinica = new javax.swing.JLabel();
        lblOdonto = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        lbl_iconUser = new javax.swing.JLabel();
        lbl_iconPass = new javax.swing.JLabel();
        txtUsuario = new LIB.JTexfieldPH_FielTex();
        txtPassword = new LIB.JTexfieldPH_Password();
        btnLogin = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTitulo.setOpaque(false);
        pnlTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClinica.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        lblClinica.setForeground(new java.awt.Color(0, 0, 153));
        lblClinica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClinica.setText("CLINICA");
        pnlTitulo.add(lblClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lblOdonto.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        lblOdonto.setForeground(new java.awt.Color(0, 0, 102));
        lblOdonto.setText("ODONTOLOGICA");
        pnlTitulo.add(lblOdonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        panel1.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 170));

        panelPrincipal.setOpaque(false);

        lbl_iconUser.setBackground(new java.awt.Color(0, 0, 102));
        lbl_iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iconUser.setOpaque(true);

        lbl_iconPass.setBackground(new java.awt.Color(0, 0, 102));
        lbl_iconPass.setForeground(new java.awt.Color(0, 0, 102));
        lbl_iconPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_iconPass.setOpaque(true);

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUsuario.setPlaceholder("USUARIO");

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPassword.setPlaceholder("CONTRASEÑA");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iconPass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_iconPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        panel1.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 340, 180));

        btnLogin.setBackground(new java.awt.Color(0, 0, 102));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("INGRESAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 210, 60));

        btnRegistro.setBackground(new java.awt.Color(0, 0, 102));
        btnRegistro.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTRARSE");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 210, 60));
        panel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        
        //if ((txtUsuario.getText().equalsIgnoreCase("admin")) && (txtPassword.getText().equalsIgnoreCase("admin"))) {
        if(true){
            opcion = 3;
        } else if (LoginDoctor() != 0) {
            opcion = LoginDoctor();
        } else if (LoginPaciente() != 0) {
            opcion = LoginPaciente();
        } else {
            opcion = LoginSecretaria();
        }
        switch (opcion) {
            case 1: {
                MenuAdmin abrir = new MenuAdmin(1,DNI);
                abrir.setVisible(true);
                this.dispose();
                break;
            }
            case 2: {
                MenuAdmin abrir = new MenuAdmin(2,DNI);
                abrir.setVisible(true);
                this.dispose();
                break;
            }
            case 3: {
                MenuAdmin abrir = new MenuAdmin(3,DNI);
                abrir.setVisible(true);
                this.dispose();
                break;
            }
            case 0: {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro abrir = new Registro();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel lblClinica;
    private javax.swing.JLabel lblOdonto;
    private javax.swing.JLabel lbl_iconPass;
    private javax.swing.JLabel lbl_iconUser;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel pnlTitulo;
    private LIB.JTexfieldPH_Password txtPassword;
    private LIB.JTexfieldPH_FielTex txtUsuario;
    // End of variables declaration//GEN-END:variables
}