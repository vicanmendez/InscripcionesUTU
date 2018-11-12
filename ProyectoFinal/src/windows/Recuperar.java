package windows;

import control.Registro;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Recuperar extends javax.swing.JFrame {

    private static Registro r;

    public Recuperar() {
        initComponents();

        this.setLocationRelativeTo(null);

        labelTrue.setVisible(false);
        labelOK.setVisible(false);
        labelError.setVisible(false);
    }

    public void defaultConf() {

        labelTrue.setVisible(true);
        labelOK.setVisible(true);
        labelError.setVisible(false);
        txtPass.setEditable(true);
        txtConPass.setEditable(true);
        txtPass.setFocusable(true);
        txtConPass.setFocusable(true);
        cmbQuestion.setFocusable(true);
        txtAnswer.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        labelTrue = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        txtConPass = new javax.swing.JPasswordField();
        labelOK = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbQuestion = new javax.swing.JComboBox<>();
        txtAnswer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperar Contraseña");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(343, 471));
        setResizable(false);
        setSize(new java.awt.Dimension(343, 471));
        setType(java.awt.Window.Type.UTILITY);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);
        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsuario.setFocusable(false);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));

        labelTrue.setForeground(new java.awt.Color(0, 0, 0));
        labelTrue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Checkmark_36px.png"))); // NOI18N
        jPanel1.add(labelTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        txtPass.setEditable(false);
        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("Password");
        txtPass.setAutoscrolls(false);
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPass.setFocusable(false);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 30));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, 40));

        txtConPass.setEditable(false);
        txtConPass.setBackground(new java.awt.Color(255, 255, 255));
        txtConPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConPass.setForeground(new java.awt.Color(153, 153, 153));
        txtConPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConPass.setText("Password");
        txtConPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConPass.setFocusable(false);
        txtConPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConPassFocusLost(evt);
            }
        });
        txtConPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConPassKeyTyped(evt);
            }
        });
        jPanel1.add(txtConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 210, 30));

        labelOK.setBackground(new java.awt.Color(255, 255, 255));
        labelOK.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelOK.setForeground(new java.awt.Color(0, 204, 0));
        labelOK.setText("*El usuario coicide correctamente.");
        jPanel1.add(labelOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        labelError.setBackground(new java.awt.Color(255, 255, 255));
        labelError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setText("*El usuario no coincide.");
        labelError.setToolTipText("");
        jPanel1.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 165, 169));
        jLabel1.setText("Pregunta Secreta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        cmbQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "¿Un lugar ciudad o país favorito?", "¿Una comida Favorita?", "¿Una serie o pelicula Favorita?", "¿Número favorito?" }));
        cmbQuestion.setFocusable(false);
        jPanel1.add(cmbQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 190, 30));

        txtAnswer.setBackground(new java.awt.Color(255, 255, 255));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAnswer.setForeground(new java.awt.Color(0, 0, 0));
        txtAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswer.setFocusable(false);
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 210, 30));

        jLabel2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 165, 169));
        jLabel2.setText("Nueva contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 165, 169));
        jLabel3.setText("Confirmar nueva contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConPassKeyTyped
        txtConPass.setForeground(Color.BLACK);
        if (txtConPass.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConPassKeyTyped

    private void txtConPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConPassFocusLost
        if (txtConPass.getText().isEmpty()) {

            txtConPass.setForeground(Color.LIGHT_GRAY);
            txtConPass.setText("Password");

        } else if (txtConPass.getText().equals("Password")) {

            txtConPass.setText("");

        } else {
            txtConPass.setText(txtConPass.getText());
        }
    }//GEN-LAST:event_txtConPassFocusLost

    private void txtConPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConPassFocusGained
        if (txtConPass.getText().isEmpty()) {

            txtConPass.setForeground(Color.LIGHT_GRAY);
            txtConPass.setText("");

        } else if (txtConPass.getText().equals("Password")) {

            txtConPass.setText("");

        } else {
            txtConPass.setText(txtConPass.getText());
        }
    }//GEN-LAST:event_txtConPassFocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String pass = txtPass.getText();
        String conPass = txtConPass.getText();

        if (pass.equals(conPass) && !txtPass.getText().equals("Password") && !txtConPass.getText().equals("Password")) {

            int estado = r.changePass(txtUsuario.getText(), txtPass.getText(), cmbQuestion.getSelectedItem().toString(), txtAnswer.getText());

            switch (estado) {
                case 0:
                    this.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null, "Se modifico correctamente", "Contraseña modificada", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    break;
                case 1:
                    this.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null, "Error al modificar", "Error", JOptionPane.ERROR_MESSAGE);
                    this.setAlwaysOnTop(true);
                    break;
            }

        } else {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Contraseñas no coinciden", JOptionPane.WARNING_MESSAGE);
            this.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

        txtPass.setForeground(Color.BLACK);
        if (txtPass.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().isEmpty()) {

            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("Password");

        } else if (txtPass.getText().equals("Password")) {

            txtPass.setText("");

        } else {
            txtPass.setText(txtPass.getText());
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained

        if (txtPass.getText().isEmpty()) {

            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("");

        } else if (txtPass.getText().equals("Password")) {

            txtPass.setText("");

        } else {
            txtPass.setText(txtPass.getText());
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        txtUsuario.setForeground(Color.BLACK);
        if (txtUsuario.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        r = new Registro(txtUsuario.getText());

        if (r.repeatUser()) {

            defaultConf();
        } else if (!r.repeatUser()) {

            txtUsuario.setEditable(true);
            labelTrue.setVisible(false);
            labelOK.setVisible(false);
            labelError.setVisible(true);

            if (txtUsuario.getText().isEmpty()) {
                txtUsuario.setEditable(true);
                labelTrue.setVisible(false);
                labelOK.setVisible(false);
                labelError.setVisible(false);

                txtPass.setFocusable(false);
                txtPass.setEditable(false);
                txtConPass.setFocusable(false);
                txtConPass.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setFocusable(true);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {

            txtUsuario.setForeground(Color.LIGHT_GRAY);
            txtUsuario.setText("Usuario");

        } else if (txtUsuario.getText().equals("Usuario")) {

            txtUsuario.setText("");

        } else {
            txtUsuario.setText(txtUsuario.getText());
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained

        if (txtUsuario.getText().isEmpty()) {

            txtUsuario.setForeground(Color.LIGHT_GRAY);
            txtUsuario.setText("");

        } else if (txtUsuario.getText().equals("Usuario")) {

            txtUsuario.setText("");

        } else {
            txtUsuario.setText(txtUsuario.getText());
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Recuperar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelOK;
    private javax.swing.JLabel labelTrue;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
