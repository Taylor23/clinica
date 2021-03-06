/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Doctor;
import BaseDatos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author landr
 */
public class Registro_Doctor extends javax.swing.JFrame {

    public int ID, ESPECIALIDAD_ID,privilegio,DNI;
    Statement statement = null;
    DefaultTableModel modelo = new DefaultTableModel();
    public Registro_Doctor(){
    }

    public Registro_Doctor(int privilegio,int DNI) {
        initComponents();
        this.setExtendedState(NORMAL);
        EspecialidadBox.addItem("ODONTOLOGO GENERAL");
        EspecialidadBox.addItem("ODONTOPEDIATRA");
        EspecialidadBox.addItem("ORTODONCISTA");
        EspecialidadBox.addItem("PERIODONCISTA");
        EspecialidadBox.addItem("ENDODONCISTA");
        EspecialidadBox.addItem("CIRUJANO ORAL");
        EspecialidadBox.addItem("PROSTODONCISTA");
        modelo.addColumn("DOCTOR_ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO PATERNO");
        modelo.addColumn("APELLIDO MATERNO");
        modelo.addColumn("DNI");
        modelo.addColumn("CMP");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("CONTRASEÑA");
        modelo.addColumn("ESPECIALIDAD");
        modelo.setRowCount(0);
        tabla.setModel(modelo);
        this.privilegio=privilegio;
        this.DNI=DNI;
        mostrarInformacion();
        
    }

    public void mostrarInformacion() {
        System.out.println("Mostrando Datos");
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Conexion objConexion = new Conexion();
        try {
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM DOCTOR INNER JOIN ESPECIALIDAD ON ESPECIALIDAD.ESPECIALIDAD_ID = DOCTOR.ESPECIALIDAD_ID");
            while (resultado.next()) {
                Object[] usuario = {
                    resultado.getString("DOCTOR_ID"),
                    resultado.getString("NOMBRE"),
                    resultado.getString("APELLIDO_PA"),
                    resultado.getString("APELLIDO_MA"),
                    resultado.getString("DNI"),
                    resultado.getString("CMP"),
                    resultado.getString("TELEFONO"),
                    resultado.getString("CORREO"),
                    resultado.getString("DIRECCION"),
                    resultado.getString("CONTRASEÑA"),
                    resultado.getString("ESPECIALIDAD")};
                modelo.addRow(usuario);
            }
        } catch (Exception e) {

        }

    }

    public Doctor recuperarDoctor() {
        String NOMBRE = txtNombre.getText();
        String APELLIDO_PA = txtApellidoPa.getText();
        String APELLIDO_MA = txtApellidoMa.getText();
        
        int DNI, TELEFONO, CMP;
        try {
            DNI = (txtDNI.getText().isEmpty()) ? 0 : Integer.parseInt(txtDNI.getText());
            TELEFONO = (txtTelefono.getText().isEmpty()) ? 0 : Integer.parseInt(txtTelefono.getText());
            CMP = (txtTelefono.getText().isEmpty()) ? 0 : Integer.parseInt(txtTelefono.getText());
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Asegurese de poner número en los campos DNI, TELEFONO Y CMP");
           return null;
        }
        String CORREO = txtCorreo.getText();
        String DIRECCION = txtDireccion.getText();
        String CONTRASEÑA = txtPassword.getText();
        int PRIVILEGIO = 2;
        Doctor doctor = new Doctor(NOMBRE, APELLIDO_PA, APELLIDO_MA, DNI, CMP, TELEFONO, CORREO, DIRECCION, CONTRASEÑA, PRIVILEGIO);
        return doctor;
    }

    public int recuperarEspecialidad_ID(){
        Conexion objConexion = new Conexion();
        System.out.println("ESPECIALIDAD");
        String strSentenciaInsert = String.format("SELECT ESPECIALIDAD_ID AS ID FROM ESPECIALIDAD WHERE ESPECIALIDAD = '%s'",EspecialidadBox.getSelectedItem().toString() );       
        try {
            ResultSet resultado = objConexion.consultarRegistros(strSentenciaInsert);
            while (resultado.next()) {
                System.out.println(resultado.getString("ID"));
                ESPECIALIDAD_ID = Integer.parseInt(resultado.getString("ID"));
            }
        } catch (Exception e) {
        }
        return ESPECIALIDAD_ID;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNom = new javax.swing.JLabel();
        lblApePa = new javax.swing.JLabel();
        lblApeMa = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        lblCMP = new javax.swing.JLabel();
        lblTelef = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblDirec = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblEspecialidad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPa = new javax.swing.JTextField();
        txtApellidoMa = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtCMP = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        EspecialidadBox = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Registro");

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Doctor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 120));

        jPanel5.setOpaque(false);

        lblNom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNom.setText("Nombre");

        lblApePa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblApePa.setText("Apellido Paterno");

        lblApeMa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblApeMa.setText("Apellido Materno");

        lblDNI.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDNI.setText("DNI");

        lblCMP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCMP.setText("CMP");

        lblTelef.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTelef.setText("Telefono");

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCorreo.setText("e-mail");

        lblDirec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDirec.setText("Direccion");

        lblPass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPass.setText("Constraseña");

        lblEspecialidad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEspecialidad.setText("Especialidad");

        txtCMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCMPActionPerformed(evt);
            }
        });

        EspecialidadBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblNom)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblApePa)
                            .addGap(18, 18, 18)
                            .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblDirec)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblCorreo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblTelef)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblCMP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCMP, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblDNI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblApeMa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(lblPass)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(lblEspecialidad)
                                    .addGap(51, 51, 51)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EspecialidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApePa)
                    .addComponent(txtApellidoPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApeMa)
                    .addComponent(txtApellidoMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCMP)
                    .addComponent(txtCMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelef)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDirec)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecialidad)
                    .addComponent(EspecialidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        lblCorreo.getAccessibleContext().setAccessibleName("E-mail");

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 470, 400));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 102));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        btnEditar.setBackground(new java.awt.Color(0, 0, 102));
        btnEditar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 102));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(0, 0, 102));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        btnRetornar.setBackground(new java.awt.Color(0, 0, 102));
        btnRetornar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRetornar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scrollTabla.setViewportView(tabla);

        jPanel1.add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 560, 124));

        fondo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 710, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Doctor doctor = recuperarDoctor();
        doctor.Eliminar_doctor(ID, doctor);
        this.mostrarInformacion();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Doctor doctor = recuperarDoctor();
        ESPECIALIDAD_ID = recuperarEspecialidad_ID();
        doctor.Agregar_doctor(doctor, ESPECIALIDAD_ID);
        this.mostrarInformacion();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        if (evt.getClickCount() == 1) {
            JTable receptor = (JTable) evt.getSource();
            ID = Integer.parseInt(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtApellidoPa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtApellidoMa.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtDNI.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            txtCMP.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 5).toString());
            txtTelefono.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString());
            txtCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 7).toString());
            txtDireccion.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 8).toString());
            txtPassword.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Doctor doctor = recuperarDoctor();
        ESPECIALIDAD_ID = recuperarEspecialidad_ID();
        doctor.Modificar_doctor(ID, doctor, ESPECIALIDAD_ID);
        this.mostrarInformacion();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        MenuAdmin abrir = new MenuAdmin(this.privilegio,this.DNI);
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void EspecialidadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspecialidadBoxActionPerformed

    private void txtCMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCMPActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Doctor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EspecialidadBox;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblApeMa;
    private javax.swing.JLabel lblApePa;
    private javax.swing.JLabel lblCMP;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDirec;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTelef;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidoMa;
    private javax.swing.JTextField txtApellidoPa;
    private javax.swing.JTextField txtCMP;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
