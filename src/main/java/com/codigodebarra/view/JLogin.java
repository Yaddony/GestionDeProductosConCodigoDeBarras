/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.codigodebarra.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Yoshua
 */
public class JLogin extends javax.swing.JFrame {

    /**
     * Creates new form JLogin
     */
    public JLogin() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlAll = new javax.swing.JPanel();
        pnlBarraOpciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlMinusLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlFSLogin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlXLogin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlFormularioLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JPanel();
        lblIngresar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlAll.setLayout(new java.awt.BorderLayout());

        pnlBarraOpciones.setBackground(new java.awt.Color(51, 51, 51));
        pnlBarraOpciones.setForeground(new java.awt.Color(51, 51, 51));
        pnlBarraOpciones.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout());

        pnlMinusLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlMinusLogin.setForeground(new java.awt.Color(51, 51, 51));
        pnlMinusLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minus.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMinusLoginLayout = new javax.swing.GroupLayout(pnlMinusLogin);
        pnlMinusLogin.setLayout(pnlMinusLoginLayout);
        pnlMinusLoginLayout.setHorizontalGroup(
            pnlMinusLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlMinusLoginLayout.setVerticalGroup(
            pnlMinusLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMinusLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnlMinusLogin);

        pnlFSLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlFSLogin.setForeground(new java.awt.Color(51, 51, 51));
        pnlFSLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFSLogin.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_screen.png"))); // NOI18N

        javax.swing.GroupLayout pnlFSLoginLayout = new javax.swing.GroupLayout(pnlFSLogin);
        pnlFSLogin.setLayout(pnlFSLoginLayout);
        pnlFSLoginLayout.setHorizontalGroup(
            pnlFSLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlFSLoginLayout.setVerticalGroup(
            pnlFSLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFSLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel2.add(pnlFSLogin);

        pnlXLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlXLogin.setForeground(new java.awt.Color(51, 51, 51));
        pnlXLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N

        javax.swing.GroupLayout pnlXLoginLayout = new javax.swing.GroupLayout(pnlXLogin);
        pnlXLogin.setLayout(pnlXLoginLayout);
        pnlXLoginLayout.setHorizontalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlXLoginLayout.setVerticalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlXLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnlXLogin);

        pnlBarraOpciones.add(jPanel2, java.awt.BorderLayout.LINE_END);

        pnlAll.add(pnlBarraOpciones, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(245, 240, 220));
        jPanel1.setForeground(new java.awt.Color(245, 240, 220));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlFormularioLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormularioLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        pnlFormularioLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 180, 50));

        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlFormularioLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 300, 30));

        txtPassword.setBorder(null);
        pnlFormularioLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 300, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de usuario");
        pnlFormularioLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña");
        pnlFormularioLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        pnlIngresar.setBackground(new java.awt.Color(255, 204, 102));
        pnlIngresar.setForeground(new java.awt.Color(240, 240, 240));
        pnlIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresar.setBackground(new java.awt.Color(255, 204, 102));
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.setText("Ingresar");
        lblIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIngresar.add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        pnlFormularioLogin.add(pnlIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 100, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlFormularioLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 301, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlFormularioLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 301, 10));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 119;
        gridBagConstraints.ipady = 240;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(pnlFormularioLogin, gridBagConstraints);

        pnlAll.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlAll);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getPnlAll() {
        return pnlAll;
    }

    public void setPnlAll(JPanel pnlAll) {
        this.pnlAll = pnlAll;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JLabel getLblIngresar() {
        return lblIngresar;
    }

    public void setLblIngresar(JLabel lblIngresar) {
        this.lblIngresar = lblIngresar;
    }

    public JPanel getPnlBarraOpciones() {
        return pnlBarraOpciones;
    }

    public void setPnlBarraOpciones(JPanel pnlBarraOpciones) {
        this.pnlBarraOpciones = pnlBarraOpciones;
    }

    public JPanel getPnlFSLogin() {
        return pnlFSLogin;
    }

    public void setPnlFSLogin(JPanel pnlFSLogin) {
        this.pnlFSLogin = pnlFSLogin;
    }

    public JPanel getPnlFormularioLogin() {
        return pnlFormularioLogin;
    }

    public void setPnlFormularioLogin(JPanel pnlFormularioLogin) {
        this.pnlFormularioLogin = pnlFormularioLogin;
    }

    public JPanel getPnlIngresar() {
        return pnlIngresar;
    }

    public void setPnlIngresar(JPanel pnlIngresar) {
        this.pnlIngresar = pnlIngresar;
    }

    public JPanel getPnlMinusLogin() {
        return pnlMinusLogin;
    }

    public void setPnlMinusLogin(JPanel pnlMinusLogin) {
        this.pnlMinusLogin = pnlMinusLogin;
    }

    public JPanel getPnlXLogin() {
        return pnlXLogin;
    }

    public void setPnlXLogin(JPanel pnlXLogin) {
        this.pnlXLogin = pnlXLogin;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JPanel pnlBarraOpciones;
    private javax.swing.JPanel pnlFSLogin;
    private javax.swing.JPanel pnlFormularioLogin;
    private javax.swing.JPanel pnlIngresar;
    private javax.swing.JPanel pnlMinusLogin;
    private javax.swing.JPanel pnlXLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
