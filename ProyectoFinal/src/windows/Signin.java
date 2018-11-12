package windows;

import control.Registro;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Signin extends javax.swing.JFrame {

    //Control
    private Registro rg;

    public Signin() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void showUser() {

        if (txtUser.getText().isEmpty()) {

            txtUser.setForeground(Color.LIGHT_GRAY);
            txtUser.setText("Usuario");

        } else if (txtUser.getText().equals("Usuario")) {

            txtUser.setText("");

        } else {
            txtUser.setText(txtUser.getText());
        }
    }

    public void showPass() {
        if (txtPass.getText().isEmpty()) {

            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("Password");

        } else if (txtPass.getText().equals("Password")) {

            txtPass.setText("");

        } else {
            txtPass.setText(txtPass.getText());
        }
    }

    public void showConPass() {
        if (txtPassConfirm.getText().isEmpty()) {

            txtPassConfirm.setForeground(Color.LIGHT_GRAY);
            txtPassConfirm.setText("Password");

        } else if (txtPassConfirm.getText().equals("Password")) {

            txtPassConfirm.setText("");

        } else {
            txtPassConfirm.setText(txtPassConfirm.getText());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jpRegistro = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jlbPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtPassConfirm = new javax.swing.JPasswordField();
        jlbCargo = new javax.swing.JLabel();
        cmbRank = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbQuestion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrarse ");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jpBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpBackground.setLayout(new java.awt.CardLayout());

        jpRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistro.setOpaque(false);
        jpRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("Usuario");
        txtUser.setFocusable(false);
        txtUser.setPreferredSize(new java.awt.Dimension(220, 25));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        jPanel10.add(txtUser);

        jlbPass.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jlbPass.setForeground(new java.awt.Color(134, 165, 169));
        jlbPass.setText("Contraseña: ");
        jPanel10.add(jlbPass);

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("Password");
        txtPass.setFocusable(false);
        txtPass.setPreferredSize(new java.awt.Dimension(220, 25));
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
        jPanel10.add(txtPass);

        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 165, 169));
        jLabel3.setText("Confirmar Contraseña");
        jPanel10.add(jLabel3);

        txtPassConfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtPassConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassConfirm.setForeground(new java.awt.Color(153, 153, 153));
        txtPassConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassConfirm.setText("Password");
        txtPassConfirm.setFocusable(false);
        txtPassConfirm.setPreferredSize(new java.awt.Dimension(220, 25));
        txtPassConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassConfirmFocusLost(evt);
            }
        });
        txtPassConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassConfirmKeyTyped(evt);
            }
        });
        jPanel10.add(txtPassConfirm);

        jlbCargo.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jlbCargo.setForeground(new java.awt.Color(134, 165, 169));
        jlbCargo.setText("Cargo: ");
        jPanel10.add(jlbCargo);

        cmbRank.setBackground(new java.awt.Color(255, 255, 255));
        cmbRank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbRank.setForeground(new java.awt.Color(0, 0, 0));
        cmbRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Adscripto", "Dirección" }));
        cmbRank.setFocusable(false);
        jPanel10.add(cmbRank);

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 165, 169));
        jLabel1.setText("Pregunta Secreta:");
        jPanel10.add(jLabel1);

        cmbQuestion.setBackground(new java.awt.Color(255, 255, 255));
        cmbQuestion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbQuestion.setForeground(new java.awt.Color(0, 0, 0));
        cmbQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "¿Un lugar ciudad o país favorito?", "¿Una comida Favorita?", "¿Una serie o pelicula Favorita?", "¿Número favorito?" }));
        cmbQuestion.setFocusable(false);
        jPanel10.add(cmbQuestion);

        jLabel2.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 165, 169));
        jLabel2.setText("Respuesta");
        jPanel10.add(jLabel2);

        txtAnswer.setBackground(new java.awt.Color(255, 255, 255));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAnswer.setForeground(new java.awt.Color(0, 0, 0));
        txtAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnswer.setFocusable(false);
        txtAnswer.setPreferredSize(new java.awt.Dimension(225, 25));
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnswerKeyTyped(evt);
            }
        });
        jPanel10.add(txtAnswer);

        jpRegistro.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 360));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setFocusPainted(false);
        btnSave.setFocusable(false);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jpRegistro.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, 50));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setFocusPainted(false);
        btnCancel.setFocusable(false);
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jpRegistro.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 110, -1));

        jpBackground.add(jpRegistro, "card2");

        getContentPane().add(jpBackground, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 319, 509);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        rg = new Registro(txtUser.getText(), txtPass.getText(), txtPassConfirm.getText(), cmbRank.getSelectedItem().toString(), cmbQuestion.getSelectedItem().toString(), txtAnswer.getText());
        boolean estado = rg.repeatUser();
        
        if(cmbQuestion.getSelectedItem().equals("Selecciona...") || txtAnswer.getText().isEmpty()){
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Algunos campos importantes estan vacios.");
            this.setAlwaysOnTop(true);
        }else if (estado) {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "El nombre de usuario esta ocupado.", "Usuario repetido", JOptionPane.INFORMATION_MESSAGE);
            this.setAlwaysOnTop(true);
        } else {
            int retorno = rg.saveRegistro();
    
            switch (retorno) {
                case 0:
                    setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null, "Se ha registrado correctamente", "Registro Correcto", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    break;
                case 1:
                    this.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.ERROR_MESSAGE);
                    this.setAlwaysOnTop(true);
                    break;
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped

        txtUser.setForeground(Color.BLACK);
        if (txtUser.getText().length() >= 12) {
            evt.consume();
        }

        txtUser.setText(txtUser.getText().trim());
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

        txtPass.setForeground(Color.BLACK);
        if (txtPass.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtPassConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassConfirmKeyTyped

        txtPassConfirm.setForeground(Color.BLACK);
        if (txtPassConfirm.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPassConfirmKeyTyped

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        showUser();
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        showUser();
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        showPass();
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        showPass();
    }//GEN-LAST:event_txtPassFocusLost

    private void txtPassConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassConfirmFocusGained
        showConPass();
    }//GEN-LAST:event_txtPassConfirmFocusGained

    private void txtPassConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassConfirmFocusLost
        showConPass();
    }//GEN-LAST:event_txtPassConfirmFocusLost

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        txtUser.setFocusable(true);
        txtUser.requestFocus();

        txtPass.setFocusable(true);
        txtPassConfirm.setFocusable(true);
        cmbRank.setFocusable(true);
        cmbQuestion.setFocusable(true);
        txtAnswer.setFocusable(true);
        btnSave.setFocusable(true);
        btnCancel.setFocusable(true);
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyTyped
        if (txtAnswer.getText().length() >= 40) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAnswerKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Signin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbQuestion;
    private javax.swing.JComboBox<String> cmbRank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel jlbCargo;
    private javax.swing.JLabel jlbPass;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassConfirm;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
