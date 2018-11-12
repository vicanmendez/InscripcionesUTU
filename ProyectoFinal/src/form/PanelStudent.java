package form;

import course_student.Course_Student;
import control.Student;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelStudent extends javax.swing.JPanel {

    public static Student st;
    public static Course_Student cst;

    public PanelStudent() {

        initComponents();
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtBirthdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbLevel = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtCI = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbCInterested = new javax.swing.JComboBox<>();
        cmbYearCourse = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        separator2 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lbYear = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpTableEdit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtSearchStudent = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setMinimumSize(new java.awt.Dimension(550, 600));
        setPreferredSize(new java.awt.Dimension(550, 550));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 165, 169));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Panel Alumno/a");
        jLabel2.setAlignmentX(0.5F);
        jPanel1.add(jLabel2);

        jSeparator1.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator1.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        jPanel1.add(jSeparator1);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30);
        flowLayout1.setAlignOnBaseline(true);
        jPanel6.setLayout(flowLayout1);

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 675));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(134, 165, 169));
        jLabel9.setText("Nombre: ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtLastName.setColumns(20);
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setNextFocusableComponent(txtLocalidad);
        txtLastName.setPreferredSize(new java.awt.Dimension(140, 19));
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });
        jPanel3.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 190, 30));

        jLabel3.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 165, 169));
        jLabel3.setText("F. de Nacimiento:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(134, 165, 169));
        jLabel4.setText("Edad:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnEdad.setNextFocusableComponent(txtPhone);
        jPanel3.add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 48, 27));

        jLabel6.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(134, 165, 169));
        jLabel6.setText("Dirección:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        txtAdress.setColumns(20);
        txtAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdress.setNextFocusableComponent(txtBirthdate);
        txtAdress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAdressKeyTyped(evt);
            }
        });
        jPanel3.add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 190, 30));

        jLabel7.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(134, 165, 169));
        jLabel7.setText("Telefono:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(134, 165, 169));
        jLabel8.setText("Celular:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        txtPhone.setColumns(15);
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setMinimumSize(new java.awt.Dimension(4, 25));
        txtPhone.setNextFocusableComponent(txtCellPhone);
        txtPhone.setPreferredSize(new java.awt.Dimension(125, 25));
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        jPanel3.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));

        txtCellPhone.setColumns(15);
        txtCellPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCellPhone.setNextFocusableComponent(txtCI);
        txtCellPhone.setPreferredSize(new java.awt.Dimension(125, 25));
        txtCellPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellPhoneKeyTyped(evt);
            }
        });
        jPanel3.add(txtCellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 190, 30));

        jLabel10.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(134, 165, 169));
        jLabel10.setText("Cedula:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(134, 165, 169));
        jLabel5.setText("Apellidos:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        txtName.setColumns(20);
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setNextFocusableComponent(txtLastName);
        txtName.setPreferredSize(new java.awt.Dimension(155, 19));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        txtBirthdate.setColumns(20);
        txtBirthdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBirthdate.setToolTipText("Formato xx / xx / xxxx");
        txtBirthdate.setNextFocusableComponent(spnEdad);
        txtBirthdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBirthdateKeyTyped(evt);
            }
        });
        jPanel3.add(txtBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 30));

        jLabel11.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(134, 165, 169));
        jLabel11.setText("Nivel:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Bachillerato", "Ciclo Básico" }));
        cmbLevel.setNextFocusableComponent(cmbCInterested);
        jPanel3.add(cmbLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 130, 26));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnSave.setToolTipText("");
        btnSave.setAlignmentX(0.5F);
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setFocusPainted(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar1.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 120, 38));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.setFocusPainted(false);
        btnEdit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar1.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 110, 38));

        txtCI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCI.setToolTipText("Sin [. , -  /]");
        txtCI.setNextFocusableComponent(cmbLevel);
        txtCI.setPreferredSize(new java.awt.Dimension(125, 25));
        txtCI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCIKeyTyped(evt);
            }
        });
        jPanel3.add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 30));

        jLabel12.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(134, 165, 169));
        jLabel12.setText("C. Interesado:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, 20));

        cmbCInterested.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona..." }));
        cmbCInterested.setNextFocusableComponent(cmbYearCourse);
        cmbCInterested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCInterestedActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCInterested, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 160, 25));

        cmbYearCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona..." }));
        jPanel3.add(cmbYearCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 120, -1));

        jLabel13.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(134, 165, 169));
        jLabel13.setText("Localidad:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtLocalidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLocalidad.setNextFocusableComponent(txtAdress);
        txtLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLocalidadKeyTyped(evt);
            }
        });
        jPanel3.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        separator2.setBackground(new java.awt.Color(134, 165, 169));
        separator2.setForeground(new java.awt.Color(134, 165, 169));
        separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 10, 40));

        txtID.setEnabled(false);
        jPanel3.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, -1));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setEnabled(false);
        btnCancel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar1.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 110, 40));

        jSeparator3.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator3.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 10, 40));

        lbYear.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        lbYear.setForeground(new java.awt.Color(134, 165, 169));
        lbYear.setText("Año:");
        jPanel3.add(lbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(134, 165, 169));
        jLabel14.setText("ID:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jpTableEdit.setAlignmentX(0.0F);
        jpTableEdit.setMinimumSize(new java.awt.Dimension(400, 300));
        jpTableEdit.setPreferredSize(new java.awt.Dimension(300, 300));
        jpTableEdit.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 403));

        tbStudent.setAutoCreateRowSorter(true);
        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbStudent.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbStudent.setFillsViewportHeight(true);
        tbStudent.setFocusable(false);
        tbStudent.setPreferredSize(new java.awt.Dimension(400, 64));
        tbStudent.setSelectionBackground(new java.awt.Color(134, 165, 169));
        tbStudent.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbStudent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbStudent.getTableHeader().setResizingAllowed(false);
        tbStudent.getTableHeader().setReorderingAllowed(false);
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbStudent);

        jpTableEdit.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchStudent.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchStudent.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchStudent.setText("Buscar");
        txtSearchStudent.setFocusable(false);
        txtSearchStudent.setPreferredSize(new java.awt.Dimension(200, 25));
        txtSearchStudent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchStudentFocusLost(evt);
            }
        });
        txtSearchStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchStudentMouseClicked(evt);
            }
        });
        txtSearchStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchStudentKeyReleased(evt);
            }
        });
        jPanel4.add(txtSearchStudent);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_25px.png"))); // NOI18N
        jPanel4.add(jLabel16);

        jpTableEdit.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jpTableEdit, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel2);

        add(jPanel6, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void clean(String estado) {

        if (estado.equalsIgnoreCase("guardar")) {
            txtID.setText("");
            txtName.setText("");
            txtLastName.setText("");
            txtBirthdate.setText("");
            txtLocalidad.setText("");
            txtAdress.setText("");
            spnEdad.setValue(0);
            txtPhone.setText("");
            txtCellPhone.setText("");
            txtCI.setText("");
            cmbLevel.setSelectedIndex(0);
           
            if(!cmbCInterested.getSelectedItem().equals("Selecciona...")){
                 cmbCInterested.setSelectedIndex(0);
            }
            
            if (cmbYearCourse.isShowing()) {
                cmbYearCourse.setSelectedIndex(0);
            }

        } else {

            clean("guardar");
            jpTableEdit.setVisible(false);
            
            lbYear.setVisible(false);
            cmbYearCourse.setVisible(false);

            btnEdit.setSelected(false);
            btnEdit.setEnabled(true);

            btnCancel.setEnabled(false);
        }
    }

    public void load() {

        st = new Student();
        cmbCInterested.setModel(st.loadCmb());

        jpTableEdit.setVisible(false);
        lbYear.setVisible(false);
        cmbYearCourse.setVisible(false);
        
        clean("guardar");
        btnCancel.setEnabled(false);

        btnEdit.setSelected(false);
        btnEdit.setEnabled(true);
    }

    public void showData() {

        txtID.setText(st.getID((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 0)));
        txtName.setText(st.getNombre());
        txtLastName.setText(st.getApellido());
        txtLocalidad.setText(st.getLocalidad());
        txtAdress.setText(st.getDireccion());
        txtBirthdate.setText(st.getFechadenacimiento());
        spnEdad.setValue(st.getEdad());
        txtPhone.setText(st.getTelefono());
        txtCellPhone.setText(st.getCelular());
        txtCI.setText(st.getCi());
        cmbLevel.setSelectedItem(st.getNivel());
        
        
        cst = new Course_Student(txtID.getText());
        cst.cargarDatos();
  
        cmbCInterested.setSelectedItem(cst.getNombreCurso());
        cmbYearCourse.setSelectedItem(cst.getNivel());
       
    }
    
      public String getSearch(String nombre) {

        if (nombre.isEmpty() || nombre == null || nombre.equals("Buscar")) {
            return nombre;
        } else {
            String resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
            return resultado;
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (!btnEdit.isSelected()) {

            if (txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtLocalidad.getText().isEmpty() || txtAdress.getText().isEmpty() || txtBirthdate.getText().isEmpty() || spnEdad.getValue().equals(0)
                     || txtCI.getText().isEmpty() || cmbLevel.getSelectedItem().equals("Selecciona...") || cmbCInterested.getSelectedItem().equals("Selecciona...") || cmbYearCourse.getSelectedItem().equals("Selecciona...")) {
                JOptionPane.showMessageDialog(null, "Hay campos sin completar" , "Campos vacios", JOptionPane.WARNING_MESSAGE);
            } else {
                //Metodo para guardar
                st = new Student(txtName.getText(), txtLastName.getText(), txtLocalidad.getText(), txtAdress.getText(), txtBirthdate.getText(), (int) spnEdad.getValue(), txtPhone.getText(),
                        txtCellPhone.getText(), txtCI.getText(), cmbLevel.getSelectedItem().toString());
                boolean estado = st.repeatStudent();
                if (estado) {
                    JOptionPane.showMessageDialog(null, "El usuario que ingreso ya existe.", "Usuario repetido", JOptionPane.WARNING_MESSAGE);
                } else {
                    int retorno = st.save();

                    switch (retorno) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Se guardo correctamente.", "Guardado correctamente", JOptionPane.INFORMATION_MESSAGE);
                            cst = new Course_Student();
                            cst.insertarCourseStudent(cmbCInterested.getSelectedItem().toString(), cmbYearCourse.getSelectedItem().toString(), txtName.getText());
                            clean("guardar");
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Error al guardar, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
            }
        } else {

            if (txtName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtLocalidad.getText().isEmpty() || txtAdress.getText().isEmpty() || txtBirthdate.getText().isEmpty() || spnEdad.getValue().equals(0)
                    || txtCI.getText().isEmpty() || cmbLevel.getSelectedItem().equals("Selecciona...") || cmbCInterested.getSelectedItem().equals("Selecciona...") || cmbYearCourse.getSelectedItem().equals("Selecciona...")) {

                JOptionPane.showMessageDialog(null, "Hay campos sin completar", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            } else {
                //Metodo para editar
                String ID = st.getID((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 0));

                switch (st.edit(ID, txtName.getText(), txtLastName.getText(), txtLocalidad.getText(), txtAdress.getText(), txtBirthdate.getText(), (int) spnEdad.getValue(), txtPhone.getText(),
                        txtCellPhone.getText(), txtCI.getText(), cmbLevel.getSelectedItem().toString())) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Se modfico correctamente", "Modificado correctamente", JOptionPane.INFORMATION_MESSAGE);
                        cst.updateCourseStudent(cmbCInterested.getSelectedItem().toString(), cmbYearCourse.getSelectedItem().toString(),txtName.getText());
                        clean("guardar");

                        btnEdit.setEnabled(true);
                        btnEdit.setSelected(false);

                        btnCancel.doClick();
                        btnCancel.setEnabled(false);

                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ah ocurrido un error al modificar, intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                        btnEdit.setEnabled(false);
                        btnEdit.setSelected(true);
                        break;
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbCInterestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCInterestedActionPerformed

        lbYear.setVisible(true);
        cmbYearCourse.setVisible(true);
        
        st = new Student(cmbCInterested.getSelectedItem().toString());
        cmbYearCourse.setModel(st.loadCmb2());

    }//GEN-LAST:event_cmbCInterestedActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        btnEdit.setSelected(true);
        jpTableEdit.setVisible(true);
        btnCancel.setEnabled(true);

        tbStudent.setModel(st.loadTable());
        btnEdit.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked

        if (tbStudent.getSelectedRow() != -1 && evt.getClickCount() == 2) {
          
            //datos
            boolean estado = st.getData(st.getID((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 0)));

            if (estado) {

                showData();
              
            
            } else {

                JOptionPane.showMessageDialog(null, "Error al cargar los datos del alumno.", "Error", JOptionPane.ERROR_MESSAGE);
            }  
        }
    }//GEN-LAST:event_tbStudentMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
        clean("total");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

        Character c = evt.getKeyChar();

        if (txtName.getText().length() >= 25) {
            evt.consume();
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {

            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        char c = evt.getKeyChar();
        if (txtLastName.getText().length() >= 25) {
            evt.consume();
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE) {

            evt.consume();
        }
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocalidadKeyTyped
        char c = evt.getKeyChar();

        if (txtLocalidad.getText().length() >= 30) {
            evt.consume();
        }

        if (!Character.isLetter(c) && c != KeyEvent.VK_SPACE && c !=KeyEvent.VK_COMMA ) {

            evt.consume();
        }
    }//GEN-LAST:event_txtLocalidadKeyTyped

    private void txtAdressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdressKeyTyped

        if (txtAdress.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAdressKeyTyped

    private void txtBirthdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthdateKeyTyped

        char c = evt.getKeyChar();

        if (txtBirthdate.getText().length() >= 10) {
            evt.consume();
        }

        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (evt.getKeyChar() == KeyEvent.VK_SLASH) {
            txtBirthdate.setText(txtBirthdate.getText() + "/");
        }

    }//GEN-LAST:event_txtBirthdateKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped

        char c = evt.getKeyChar();

        if (txtPhone.getText().length() >= 8) {
            evt.consume();
        }

        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtCellPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellPhoneKeyTyped

        char c = evt.getKeyChar();

        if (txtCellPhone.getText().length() >= 9) {
            evt.consume();
        }

        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCellPhoneKeyTyped

    private void txtCIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCIKeyTyped

        char c = evt.getKeyChar();

        if (txtCI.getText().length() >= 8) {
            evt.consume();
        }

        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCIKeyTyped

    private void txtSearchStudentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchStudentFocusLost
        
        txtSearchStudent.setText("Buscar");
        txtSearchStudent.setFocusable(false);
        txtSearchStudent.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtSearchStudentFocusLost

    private void txtSearchStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchStudentMouseClicked
        
        txtSearchStudent.setFocusable(true);
        txtSearchStudent.requestFocus();

        txtSearchStudent.setText("");
        txtSearchStudent.setForeground(Color.BLACK);    
    }//GEN-LAST:event_txtSearchStudentMouseClicked

    private void txtSearchStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchStudentKeyReleased
        DefaultTableModel dm = (DefaultTableModel) tbStudent.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);

        tbStudent.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(getSearch(txtSearchStudent.getText()), 0));
    }//GEN-LAST:event_txtSearchStudentKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbCInterested;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JComboBox<String> cmbYearCourse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpTableEdit;
    private javax.swing.JLabel lbYear;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearchStudent;
    // End of variables declaration//GEN-END:variables
}
