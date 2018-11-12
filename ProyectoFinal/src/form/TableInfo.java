package form;

import control.Info;
import java.awt.Color;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableInfo extends javax.swing.JPanel {

    private static Info ifo;

    public TableInfo() {

        initComponents();
        load();
    }

    public void load() {

        ifo = new Info();
        ifo.loadTableCourse(tbCourse);
        ifo.loadTableStudent(tbStudent);
        ifo.loadTableStudentCourse(tbGeneral);

        jpPestanas.setSelectedIndex(0);
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

        InformeCurso = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtEstado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        InformeAlumno = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNameStudent = new javax.swing.JTextField();
        txtBirthdate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JTextField();
        txtNivelStudent = new javax.swing.JTextField();
        jpPestanas = new javax.swing.JTabbedPane();
        jpTbCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCourse = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtSearchCourse = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jpTbAlumnos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSearchStudent = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jpGeneral = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbGeneral = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtSearchCourseStudent = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        InformeCurso.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        InformeCurso.setTitle("Informe Curso");
        InformeCurso.setAlwaysOnTop(true);
        InformeCurso.setResizable(false);
        InformeCurso.setType(java.awt.Window.Type.UTILITY);
        InformeCurso.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                InformeCursoWindowLostFocus(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 350));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, 30));

        txtAño.setEditable(false);
        txtAño.setBackground(new java.awt.Color(255, 255, 255));
        txtAño.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAño.setForeground(new java.awt.Color(0, 0, 0));
        txtAño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAño.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, 30));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(10);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 270, 100));

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 180, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Estado:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Año:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripción:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jPanel2.add(jPanel3);

        InformeCurso.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(641, 55));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout2.setAlignOnBaseline(true);
        jPanel5.setLayout(flowLayout2);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 165, 169));
        jLabel1.setText("Informe Curso");
        jPanel5.add(jLabel1);

        jSeparator1.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator1.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator1.setPreferredSize(new java.awt.Dimension(641, 2));
        jPanel5.add(jSeparator1);

        InformeCurso.getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        InformeAlumno.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        InformeAlumno.setTitle("Informe Alumno");
        InformeAlumno.setAlwaysOnTop(true);
        InformeAlumno.setResizable(false);
        InformeAlumno.setType(java.awt.Window.Type.UTILITY);
        InformeAlumno.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                InformeAlumnoWindowLostFocus(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 55));
        java.awt.FlowLayout flowLayout3 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout3.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout3);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(134, 165, 169));
        jLabel6.setText("Informe Alumno");
        jPanel7.add(jLabel6);

        jSeparator2.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator2.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator2.setPreferredSize(new java.awt.Dimension(801, 2));
        jPanel7.add(jSeparator2);

        InformeAlumno.getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel8.setPreferredSize(new java.awt.Dimension(800, 550));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(134, 165, 169));
        jLabel9.setText("Nombre: ");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setColumns(20);
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(0, 0, 0));
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLastName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 190, 30));

        jLabel7.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(134, 165, 169));
        jLabel7.setText("F. de Nacimiento:");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(134, 165, 169));
        jLabel8.setText("Edad:");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(134, 165, 169));
        jLabel10.setText("Dirección:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        txtAdress.setEditable(false);
        txtAdress.setBackground(new java.awt.Color(255, 255, 255));
        txtAdress.setColumns(20);
        txtAdress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(0, 0, 0));
        txtAdress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAdress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 190, 30));

        jLabel11.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(134, 165, 169));
        jLabel11.setText("Telefono:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(134, 165, 169));
        jLabel12.setText("Celular:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        txtPhone.setEditable(false);
        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setColumns(15);
        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPhone.setMinimumSize(new java.awt.Dimension(4, 25));
        jPanel8.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setColumns(15);
        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 190, 30));

        jLabel13.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(134, 165, 169));
        jLabel13.setText("Cedula:");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(134, 165, 169));
        jLabel14.setText("Apellidos:");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        txtNameStudent.setEditable(false);
        txtNameStudent.setBackground(new java.awt.Color(255, 255, 255));
        txtNameStudent.setColumns(20);
        txtNameStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNameStudent.setForeground(new java.awt.Color(0, 0, 0));
        txtNameStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNameStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameStudent.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtNameStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        txtBirthdate.setEditable(false);
        txtBirthdate.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthdate.setColumns(20);
        txtBirthdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBirthdate.setForeground(new java.awt.Color(0, 0, 0));
        txtBirthdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBirthdate.setToolTipText("");
        txtBirthdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBirthdate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 30));

        jLabel15.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(134, 165, 169));
        jLabel15.setText("Nivel:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        txtCI.setEditable(false);
        txtCI.setBackground(new java.awt.Color(255, 255, 255));
        txtCI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCI.setForeground(new java.awt.Color(0, 0, 0));
        txtCI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCI.setToolTipText("");
        txtCI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCI.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCI.setPreferredSize(new java.awt.Dimension(125, 25));
        jPanel8.add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 30));

        jLabel17.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(134, 165, 169));
        jLabel17.setText("Localidad:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtLocalidad.setEditable(false);
        txtLocalidad.setBackground(new java.awt.Color(255, 255, 255));
        txtLocalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLocalidad.setForeground(new java.awt.Color(0, 0, 0));
        txtLocalidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLocalidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLocalidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        txtCellPhone.setEditable(false);
        txtCellPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtCellPhone.setColumns(15);
        txtCellPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCellPhone.setForeground(new java.awt.Color(0, 0, 0));
        txtCellPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCellPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCellPhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtCellPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 190, 30));

        txtNivelStudent.setEditable(false);
        txtNivelStudent.setBackground(new java.awt.Color(255, 255, 255));
        txtNivelStudent.setColumns(15);
        txtNivelStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNivelStudent.setForeground(new java.awt.Color(0, 0, 0));
        txtNivelStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNivelStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNivelStudent.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel8.add(txtNivelStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 190, 30));

        jPanel6.add(jPanel8);

        InformeAlumno.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        setLayout(new java.awt.BorderLayout());

        jpPestanas.setBackground(new java.awt.Color(255, 255, 255));
        jpPestanas.setForeground(new java.awt.Color(0, 0, 0));
        jpPestanas.setFocusable(false);
        jpPestanas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jpTbCursos.setBackground(new java.awt.Color(255, 255, 255));
        jpTbCursos.setLayout(new java.awt.BorderLayout());

        tbCourse.setAutoCreateRowSorter(true);
        tbCourse.setBackground(new java.awt.Color(255, 255, 255));
        tbCourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbCourse.setForeground(new java.awt.Color(0, 0, 0));
        tbCourse.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCourse.setToolTipText("");
        tbCourse.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbCourse.setFillsViewportHeight(true);
        tbCourse.setFocusable(false);
        tbCourse.setGridColor(new java.awt.Color(0, 0, 0));
        tbCourse.setRowHeight(20);
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
        jScrollPane1.setViewportView(tbCourse);

        jpTbCursos.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchCourse.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchCourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchCourse.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchCourse.setText("Buscar");
        txtSearchCourse.setToolTipText("");
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
        jPanel4.add(txtSearchCourse);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_25px.png"))); // NOI18N
        jPanel4.add(jLabel18);

        jpTbCursos.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jpPestanas.addTab("Cursos", jpTbCursos);

        jpTbAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        jpTbAlumnos.setLayout(new java.awt.BorderLayout());

        tbStudent.setAutoCreateRowSorter(true);
        tbStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        tbStudent.setRowHeight(20);
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
        jScrollPane2.setViewportView(tbStudent);
        tbStudent.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jpTbAlumnos.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        jPanel1.add(txtSearchStudent);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_25px.png"))); // NOI18N
        jPanel1.add(jLabel16);

        jpTbAlumnos.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jpPestanas.addTab("Alumnos", jpTbAlumnos);

        jpGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jpGeneral.setForeground(new java.awt.Color(0, 0, 0));
        jpGeneral.setToolTipText("");
        jpGeneral.setAlignmentX(0.1F);
        jpGeneral.setLayout(new java.awt.BorderLayout());

        tbGeneral.setAutoCreateRowSorter(true);
        tbGeneral.setModel(new javax.swing.table.DefaultTableModel(
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
        tbGeneral.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbGeneral.setFillsViewportHeight(true);
        tbGeneral.setFocusable(false);
        tbGeneral.setSelectionBackground(new java.awt.Color(134, 165, 169));
        tbGeneral.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbGeneral.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbGeneral.getTableHeader().setResizingAllowed(false);
        tbGeneral.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbGeneral);

        jpGeneral.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchCourseStudent.setBackground(new java.awt.Color(255, 255, 255));
        txtSearchCourseStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchCourseStudent.setForeground(new java.awt.Color(153, 153, 153));
        txtSearchCourseStudent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchCourseStudent.setText("Buscar");
        txtSearchCourseStudent.setFocusable(false);
        txtSearchCourseStudent.setPreferredSize(new java.awt.Dimension(200, 25));
        txtSearchCourseStudent.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchCourseStudentFocusLost(evt);
            }
        });
        txtSearchCourseStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchCourseStudentMouseClicked(evt);
            }
        });
        txtSearchCourseStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCourseStudentKeyReleased(evt);
            }
        });
        jPanel9.add(txtSearchCourseStudent);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_25px.png"))); // NOI18N
        jPanel9.add(jLabel19);

        jpGeneral.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jpPestanas.addTab("Tabla General", jpGeneral);

        add(jpPestanas, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tbCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCourseMouseClicked

        if (tbCourse.getSelectedRow() != -1 && evt.getClickCount() == 2) {

            InformeCurso.setSize(418, 382);
            InformeCurso.setLocationRelativeTo(null);
            InformeCurso.setVisible(true);

            txtNombre.setText((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 0));
            txtAño.setText((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 1));
            txtDescripcion.setText((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 2));
            txtEstado.setText((String) tbCourse.getValueAt(tbCourse.getSelectedRow(), 3));
        }

    }//GEN-LAST:event_tbCourseMouseClicked

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked

        if (tbStudent.getSelectedRow() != -1 && evt.getClickCount() == 2) {
            InformeAlumno.setSize(801, 379);
            InformeAlumno.setLocationRelativeTo(null);
            InformeAlumno.setVisible(true);

            txtNameStudent.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 0));
            txtLastName.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 1));
            txtLocalidad.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 2));
            txtAdress.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 3));
            txtBirthdate.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 4));
            txtEdad.setText(String.valueOf(tbStudent.getValueAt(tbStudent.getSelectedRow(), 5)));
            txtPhone.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 6));
            txtCellPhone.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 7));
            txtCI.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 8));
            txtNivelStudent.setText((String) tbStudent.getValueAt(tbStudent.getSelectedRow(), 9));

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tbStudentMouseClicked

    private void txtSearchCourseStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCourseStudentKeyReleased
        DefaultTableModel dm = (DefaultTableModel) tbGeneral.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);

        tbGeneral.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(getSearch(txtSearchCourseStudent.getText()), 0));
    }//GEN-LAST:event_txtSearchCourseStudentKeyReleased

    private void txtSearchCourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCourseKeyReleased
        DefaultTableModel dm1 = (DefaultTableModel) tbCourse.getModel();
        TableRowSorter<DefaultTableModel> tr1 = new TableRowSorter<>(dm1);

        tbCourse.setRowSorter(tr1);
        tr1.setRowFilter(RowFilter.regexFilter(getSearch(txtSearchCourse.getText()), 0));
    }//GEN-LAST:event_txtSearchCourseKeyReleased

    private void txtSearchStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchStudentKeyReleased
        DefaultTableModel dm2 = (DefaultTableModel) tbStudent.getModel();
        TableRowSorter<DefaultTableModel> tr2 = new TableRowSorter<>(dm2);

        tbStudent.setRowSorter(tr2);
        tr2.setRowFilter(RowFilter.regexFilter(getSearch(txtSearchStudent.getText()), 0));
    }//GEN-LAST:event_txtSearchStudentKeyReleased

    private void txtSearchCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchCourseMouseClicked
        txtSearchCourse.setFocusable(true);
        txtSearchCourse.requestFocus();

        txtSearchCourse.setText("");
        txtSearchCourse.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchCourseMouseClicked

    private void txtSearchCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchCourseFocusLost
        txtSearchCourse.setText("Buscar");
        txtSearchCourse.setFocusable(false);
        txtSearchCourse.setForeground(Color.LIGHT_GRAY);
        ifo.loadTableCourse(tbCourse);
    }//GEN-LAST:event_txtSearchCourseFocusLost

    private void txtSearchStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchStudentMouseClicked
        txtSearchStudent.setFocusable(true);
        txtSearchStudent.requestFocus();

        txtSearchStudent.setText("");
        txtSearchStudent.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchStudentMouseClicked

    private void txtSearchStudentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchStudentFocusLost
        txtSearchStudent.setText("Buscar");
        txtSearchStudent.setFocusable(false);
        txtSearchStudent.setForeground(Color.LIGHT_GRAY);
        ifo.loadTableStudent(tbStudent);
    }//GEN-LAST:event_txtSearchStudentFocusLost

    private void txtSearchCourseStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchCourseStudentMouseClicked
        txtSearchCourseStudent.setFocusable(true);
        txtSearchCourseStudent.requestFocus();

        txtSearchCourseStudent.setText("");
        txtSearchCourseStudent.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSearchCourseStudentMouseClicked

    private void txtSearchCourseStudentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchCourseStudentFocusLost
        txtSearchCourseStudent.setText("Buscar");
        txtSearchCourseStudent.setFocusable(false);
        txtSearchCourseStudent.setForeground(Color.LIGHT_GRAY);
        ifo.loadTableStudentCourse(tbGeneral);
    }//GEN-LAST:event_txtSearchCourseStudentFocusLost

    private void InformeCursoWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_InformeCursoWindowLostFocus
        InformeCurso.dispose();
    }//GEN-LAST:event_InformeCursoWindowLostFocus

    private void InformeAlumnoWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_InformeAlumnoWindowLostFocus
        InformeAlumno.dispose();
    }//GEN-LAST:event_InformeAlumnoWindowLostFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame InformeAlumno;
    private javax.swing.JFrame InformeCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpGeneral;
    private javax.swing.JTabbedPane jpPestanas;
    private javax.swing.JPanel jpTbAlumnos;
    private javax.swing.JPanel jpTbCursos;
    private javax.swing.JTable tbCourse;
    private javax.swing.JTable tbGeneral;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNameStudent;
    private javax.swing.JTextField txtNivelStudent;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearchCourse;
    private javax.swing.JTextField txtSearchCourseStudent;
    private javax.swing.JTextField txtSearchStudent;
    // End of variables declaration//GEN-END:variables

}
