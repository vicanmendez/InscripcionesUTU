package form;

import control.Course;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelCourse extends javax.swing.JPanel {

    private static Course cs;

    public PanelCourse() {

        initComponents();
        load();
    }

    //Metodo para cargar una configuración por default del panel.
    public void load() {

        jpTableEditCourse.setVisible(false);
        labelState.setVisible(false);
        cmbState.setVisible(false);
        btnCancel.setEnabled(false);
        
        btnEdit.setEnabled(true);
        
        clean("Guardar");
    }

    public void loadData() {
        //Se consula que datos estan guardados en la variables, nombre, cmblevel, descripcioon y cmbstate para cargar los datos.
        txtName.setText(cs.getNombre());
        cmbLevel.setSelectedItem(cs.getNivel());
        txtDescription.setText(cs.getDescripcion());
        cmbState.setSelectedItem(cs.getEstado());
    }

    //Metodo para limpiar después de que se haya guardado o modificado un curso.
    public void clean(String accion) {
        //Si la acción es guardar se pondran en default los campos.
        if (accion.equals("Guardar")) {
            txtName.setText("");
            cmbLevel.setSelectedIndex(0);
            txtDescription.setText("");
        } else {
            //Si la acción es modificar se podrá default todo el panel.
            clean("Guardar");
            cmbState.setSelectedIndex(0);
        }
    }
    
     public String getSearch(String nombre) {

        if (nombre.isEmpty() || nombre == null || nombre.equals("Buscar")) {
            return nombre;
        } else {
            String resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
            return resultado;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        cmbLevel = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnEdit = new javax.swing.JButton();
        cmbState = new javax.swing.JComboBox<>();
        labelState = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnCancel = new javax.swing.JButton();
        jpTableEditCourse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtSearchCourse = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(134, 165, 169));
        jLabel12.setText("Panel Curso");
        jLabel12.setAlignmentX(0.5F);
        jPanel5.add(jLabel12);

        jSeparator2.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator2.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator2.setAlignmentY(0.2F);
        jPanel5.add(jSeparator2);

        add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1215, 300));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 60);
        flowLayout2.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout2);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 370));

        jLabel13.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(134, 165, 169));
        jLabel13.setText("Nombre:");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setColumns(30);
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setPreferredSize(new java.awt.Dimension(244, 30));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(134, 165, 169));
        jLabel14.setText("Descripcion: ");

        txtDescription.setBackground(new java.awt.Color(255, 255, 255));
        txtDescription.setColumns(20);
        txtDescription.setForeground(new java.awt.Color(0, 0, 0));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        txtDescription.setMargin(new java.awt.Insets(2, 2, 0, 0));
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescription);

        jLabel2.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 165, 169));
        jLabel2.setText("Nivel:");

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbLevel.setBackground(new java.awt.Color(255, 255, 255));
        cmbLevel.setForeground(new java.awt.Color(0, 0, 0));
        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Primer año", "Segundo año", "Tercer año" }));

        jSeparator1.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator1.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Disponible", "No disponible" }));

        labelState.setBackground(new java.awt.Color(255, 255, 255));
        labelState.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        labelState.setForeground(new java.awt.Color(134, 165, 169));
        labelState.setText("Estado:");

        jSeparator4.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator4.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(labelState))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelState))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEdit))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, java.awt.BorderLayout.CENTER);

        jpTableEditCourse.setBackground(new java.awt.Color(255, 255, 255));
        jpTableEditCourse.setPreferredSize(new java.awt.Dimension(600, 300));
        jpTableEditCourse.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(400, 300));

        tbCourse.setAutoCreateRowSorter(true);
        tbCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbCourse.setFillsViewportHeight(true);
        tbCourse.setFocusable(false);
        tbCourse.setSelectionBackground(new java.awt.Color(134, 165, 169));
        tbCourse.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbCourse.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCourse.getTableHeader().setResizingAllowed(false);
        tbCourse.getTableHeader().setReorderingAllowed(false);
        tbCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCourseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCourse);

        jpTableEditCourse.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchCourse.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchCourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchCourse.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchCourse.setText("Buscar");
        txtSearchCourse.setFocusable(false);
        txtSearchCourse.setPreferredSize(new java.awt.Dimension(200, 25));
        txtSearchCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchCourseFocusLost(evt);
            }
        });
        txtSearchCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchCourseMouseClicked(evt);
            }
        });
        txtSearchCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCourseKeyReleased(evt);
            }
        });
        jPanel9.add(txtSearchCourse);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_25px.png"))); // NOI18N
        jPanel9.add(jLabel19);

        jpTableEditCourse.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jpTableEditCourse, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel2);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        //Si el botón de editar no esta selecciona y esta activado la acción sera guardar
        if (!btnEdit.isSelected() && btnEdit.isEnabled()) {

            if (txtName.getText().isEmpty() || cmbLevel.getSelectedItem().equals("Selecciona...")) {
                JOptionPane.showMessageDialog(null, "Hay campos importantes vacios.", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            } else {
                cs = new Course(txtName.getText(), cmbLevel.getSelectedItem().toString(), txtDescription.getText());
                boolean estado = cs.repeatCourse();

                if (estado) {
                    JOptionPane.showMessageDialog(null, "El curso que ingreso ya existe","Curso repetido", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int retorno = cs.saveCourse();

                    switch (retorno) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Se guardo correctamente", "Guardado correctamente", JOptionPane.INFORMATION_MESSAGE);
                            clean("Guardar");
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Error al guardar.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
            }
        } else {
            //Si el botón editar esta seleccionado y no esta activado la accion será modificar.
            if (txtName.getText().isEmpty() || cmbLevel.getSelectedItem().equals("Selecciona...") || cmbState.getSelectedItem().equals("Selecciona...")) {
                JOptionPane.showMessageDialog(null, "Hay campos importantes vacios.", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            } else {
                String ID = cs.getID((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 0), (String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 1));

                switch (cs.edit(ID, txtName.getText(), cmbLevel.getSelectedItem().toString(), txtDescription.getText(), cmbState.getSelectedItem().toString())) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Se modifico correctamente", "Modicado correctamente", JOptionPane.INFORMATION_MESSAGE);
                        clean("editar");
                        
                        btnEdit.setEnabled(true);
                        btnEdit.setSelected(false);
                        
                        btnCancel.doClick();
                        btnCancel.setEnabled(false);
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Error al modificar", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyTyped
        //El campo de descripcion tiene un limite de 250 caracteres.
        if (txtDescription.getText().length() >= 250) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescriptionKeyTyped

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        //Al clickear el botón el panel tomara otra configuración acorde.
        btnEdit.setSelected(true);

        jpTableEditCourse.setVisible(true);
        labelState.setVisible(true);
        cmbState.setVisible(true);
        btnCancel.setEnabled(true);

        cs = new Course();
        cs.loadTable(tbCourse);

        btnEdit.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void tbCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCourseMouseClicked
        //Para cargar los datos de un curso a los campos se pedirá al usuario dos click sobre la fila que contega los datos del curso.
        if (tbCourse.getSelectedRow() != -1 && evt.getClickCount() == 2) {

            cs.getData(cs.getID((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 0), (String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 1)));
            loadData();
        }
    }//GEN-LAST:event_tbCourseMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        
        Character c = evt.getKeyChar();

    //El campo de nombre tendra como limite 20 caracteres.
        if (txtName.getText().length() >= 20) {
            evt.consume();
        }
        
        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        jpTableEditCourse.setVisible(false);
        labelState.setVisible(false);
        cmbState.setVisible(false);
        
        btnEdit.setEnabled(true);
        btnEdit.setSelected(false);
        
        clean("total");
        
        btnCancel.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtSearchCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchCourseFocusLost

        txtSearchCourse.setText("Buscar");
        txtSearchCourse.setFocusable(false);
        txtSearchCourse.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtSearchCourseFocusLost

    private void txtSearchCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchCourseMouseClicked
       
        txtSearchCourse.setFocusable(true);
        txtSearchCourse.requestFocus();

        txtSearchCourse.setText("");
        txtSearchCourse.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchCourseMouseClicked

    private void txtSearchCourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCourseKeyReleased
        DefaultTableModel dm = (DefaultTableModel) tbCourse.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);

        tbCourse.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(getSearch(txtSearchCourse.getText()), 0));
    }//GEN-LAST:event_txtSearchCourseKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpTableEditCourse;
    private javax.swing.JLabel labelState;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchCourse;
    // End of variables declaration//GEN-END:variables
}
