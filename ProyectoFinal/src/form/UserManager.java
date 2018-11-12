package form;

import control.User;
import javax.swing.JOptionPane;

public class UserManager extends javax.swing.JPanel {

    private static User us;

    public UserManager() {

        initComponents();
        load();
    }

    public void load() {

        us = new User();
        tbUser.setModel(us.llenarTablaUsuario());

        jPanel3.setVisible(false);
        btnShow.setSelected(false);
        clean();
    }

    public void clean() {

        txtUser.setText("");
        txtJob.setText("");
        cmbState.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnShow = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtJob = new javax.swing.JTextField();
        cmbState = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel3.setLayout(new java.awt.CardLayout());

        tbUser.setAutoCreateRowSorter(true);
        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tbUser.setFocusable(false);
        tbUser.setSelectionBackground(new java.awt.Color(134, 165, 169));
        tbUser.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbUser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbUser.getTableHeader().setResizingAllowed(false);
        tbUser.getTableHeader().setReorderingAllowed(false);
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUser);

        jPanel3.add(jScrollPane1, "card2");

        jPanel1.add(jPanel3, java.awt.BorderLayout.WEST);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(360, 20));

        btnShow.setBackground(new java.awt.Color(255, 255, 255));
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Forward_20px.png"))); // NOI18N
        btnShow.setBorder(null);
        btnShow.setBorderPainted(false);
        btnShow.setContentAreaFilled(false);
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnShow.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnShow.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Back_20px.png"))); // NOI18N
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnShow)
                .addGap(0, 499, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 177));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40);
        flowLayout1.setAlignOnBaseline(true);
        jPanel5.setLayout(flowLayout1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUser.setEnabled(false);
        txtUser.setPreferredSize(new java.awt.Dimension(250, 25));
        txtUser.setRequestFocusEnabled(false);

        txtJob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJob.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJob.setEnabled(false);
        txtJob.setPreferredSize(new java.awt.Dimension(250, 25));

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "No bloqueado", "Bloqueado" }));
        cmbState.setPreferredSize(new java.awt.Dimension(200, 24));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setPreferredSize(new java.awt.Dimension(200, 25));
        btnSave.setRolloverEnabled(true);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 165, 169));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 165, 169));
        jLabel3.setText("Cargo:");

        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(134, 165, 169));
        jLabel4.setText("Estado:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel7);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 165, 169));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador de Usuario");
        jLabel1.setAlignmentX(0.5F);
        jPanel2.add(jLabel1);

        jSeparator1.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator1.setForeground(new java.awt.Color(134, 165, 169));
        jPanel2.add(jSeparator1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked

        if (tbUser.getSelectedRow() != -1) {

            txtUser.setText((String) tbUser.getValueAt(tbUser.getSelectedRow(), 0));
            txtJob.setText((String) tbUser.getValueAt(tbUser.getSelectedRow(), 1));
            cmbState.setSelectedItem(tbUser.getValueAt(tbUser.getSelectedRow(), 2));

            tbUser.setToolTipText((String) tbUser.getValueAt(tbUser.getSelectedRow(), 2));

        }

    }//GEN-LAST:event_tbUserMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        us = new User(txtUser.getText(), cmbState.getSelectedItem().toString());
        int retorno = us.modificarDatos();
        
        switch(retorno) {
            case 0: 
                JOptionPane.showMessageDialog(null, "Se modifico correctamente.","Modificado correctamente", JOptionPane.INFORMATION_MESSAGE);
                tbUser.setModel(us.llenarTablaUsuario());
                clean();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Error al modificar, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        if (!btnShow.isSelected()) {
            jPanel3.setVisible(false);
        } else {
            jPanel3.setVisible(true);
        }
    }//GEN-LAST:event_btnShowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JToggleButton btnShow;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
