package windows;

import control.Login;
import control.Singleton;
import form.PanelStudent;
import form.PanelCourse;
import form.UserManager;
import form.TableInfo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class WindowMain extends javax.swing.JFrame {

    //Paneles
    private static TableInfo tbInfo;
    private static PanelStudent addAlumno;
    private static PanelCourse addCurso;
    private static UserManager aUsuario;

    //Control
    private static Login lg;

    public WindowMain() {

        initComponents();
        //Configuracion default del programa
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/img/icons8_Books_64px.png")));
        this.setSize(1024, 900);
        this.setLocationRelativeTo(null);

        loadPanels();

        paintComponents(getGraphics());
    }

    public void loadPanels() {
        //Panel default del programa
        tbInfo = new TableInfo();
        jpBackground.add(tbInfo, BorderLayout.CENTER);

        addAlumno = new PanelStudent();

        addCurso = new PanelCourse();

        aUsuario = new UserManager();

        //Cracterísticas default del programa.
        btnAddAlumno.setToolTipText("Es necesario registrarse.");
        btnAddCurso.setToolTipText("Es necesario registrarse.");
        btnUsuario.setToolTipText("Es necesario registrarse.");

        btnInfo.setEnabled(false);
        btnAddAlumno.setEnabled(false);
        btnAddCurso.setEnabled(false);
        btnUsuario.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCerrarSesion = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jpMenu = new javax.swing.JPanel();
        jpNorth = new javax.swing.JPanel();
        jpTituloLogin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpLogIn = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRecuperar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JButton();
        jpCenter = new javax.swing.JPanel();
        jpButtons = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnAddAlumno = new javax.swing.JButton();
        btnAddCurso = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jpConfig = new javax.swing.JPanel();
        btnAcercade = new javax.swing.JButton();
        jpSouth = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpBackground = new javax.swing.JPanel();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Books_64px.png"))); // NOI18N
        jLabel1.setText("Incripciones");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel9.add(jLabel1, "card2");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(195, 40));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar sesion.png"))); // NOI18N
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setDefaultCapable(false);
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar sesion1.png"))); // NOI18N
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel10.add(btnCerrarSesion);

        javax.swing.GroupLayout jpCerrarSesionLayout = new javax.swing.GroupLayout(jpCerrarSesion);
        jpCerrarSesion.setLayout(jpCerrarSesionLayout);
        jpCerrarSesionLayout.setHorizontalGroup(
            jpCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpCerrarSesionLayout.setVerticalGroup(
            jpCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCerrarSesionLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incripciones v1.0");
        setBackground(new java.awt.Color(134, 165, 169));
        setFocusCycleRoot(false);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setPreferredSize(new java.awt.Dimension(200, 600));
        jpMenu.setLayout(new java.awt.BorderLayout());

        jpNorth.setBackground(new java.awt.Color(255, 255, 255));
        jpNorth.setPreferredSize(new java.awt.Dimension(200, 220));

        jpTituloLogin.setBackground(new java.awt.Color(255, 255, 255));
        jpTituloLogin.setLayout(new java.awt.CardLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 165, 169));
        jLabel3.setText("Iniciar Sesion");
        jpTituloLogin.add(jLabel3, "card2");

        jpNorth.add(jpTituloLogin);

        jpLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jpLogIn.setPreferredSize(new java.awt.Dimension(195, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel8.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel8.setLayout(new java.awt.CardLayout());

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(153, 153, 153));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("Usuario");
        txtUser.setFocusable(false);
        txtUser.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtUser.setSelectionColor(new java.awt.Color(134, 165, 169));
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
        jPanel8.add(txtUser, "card2");

        jPanel3.add(jPanel8);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(190, 10));

        jSeparator1.setBackground(new java.awt.Color(134, 165, 169));
        jSeparator1.setForeground(new java.awt.Color(134, 165, 169));
        jSeparator1.setPreferredSize(new java.awt.Dimension(180, 2));
        jPanel5.add(jSeparator1);

        jPanel3.add(jPanel5);

        jPanel4.setPreferredSize(new java.awt.Dimension(170, 20));
        jPanel4.setLayout(new java.awt.CardLayout());

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setText("Password");
        txtPass.setFocusable(false);
        txtPass.setPreferredSize(new java.awt.Dimension(4, 20));
        txtPass.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPass.setSelectionColor(new java.awt.Color(134, 165, 169));
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel4.add(txtPass, "card2");

        jPanel3.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse.png"))); // NOI18N
        btnRegistrarse.setAlignmentY(0.0F);
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnRegistrarse.setIconTextGap(0);
        btnRegistrarse.setPreferredSize(new java.awt.Dimension(120, 30));
        btnRegistrarse.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse1.png"))); // NOI18N
        btnRegistrarse.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse1.png"))); // NOI18N
        btnRegistrarse.setVerifyInputWhenFocusTarget(false);
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel6.add(btnRegistrarse);

        jPanel3.add(jPanel6);

        jPanel1.setPreferredSize(new java.awt.Dimension(110, 13));
        jPanel1.setLayout(new java.awt.CardLayout());

        btnRecuperar.setBackground(new java.awt.Color(255, 255, 255));
        btnRecuperar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecuperar.setText("¿Olvidaste tu contraseña?");
        btnRecuperar.setBorder(null);
        btnRecuperar.setBorderPainted(false);
        btnRecuperar.setContentAreaFilled(false);
        btnRecuperar.setFocusPainted(false);
        btnRecuperar.setFocusable(false);
        btnRecuperar.setOpaque(true);
        btnRecuperar.setPreferredSize(new java.awt.Dimension(110, 13));
        btnRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseExited(evt);
            }
        });
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecuperar, "card2");

        jPanel3.add(jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnLogIn.setBackground(new java.awt.Color(255, 255, 255));
        btnLogIn.setForeground(new java.awt.Color(0, 0, 0));
        btnLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar sesion.png"))); // NOI18N
        btnLogIn.setBorder(null);
        btnLogIn.setBorderPainted(false);
        btnLogIn.setContentAreaFilled(false);
        btnLogIn.setFocusPainted(false);
        btnLogIn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar sesion1.png"))); // NOI18N
        btnLogIn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar sesion1.png"))); // NOI18N
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel7.add(btnLogIn);

        jPanel3.add(jPanel7);

        javax.swing.GroupLayout jpLogInLayout = new javax.swing.GroupLayout(jpLogIn);
        jpLogIn.setLayout(jpLogInLayout);
        jpLogInLayout.setHorizontalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpLogInLayout.setVerticalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogInLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpNorth.add(jpLogIn);

        jpMenu.add(jpNorth, java.awt.BorderLayout.PAGE_START);

        jpCenter.setBackground(new java.awt.Color(255, 255, 255));
        jpCenter.setPreferredSize(new java.awt.Dimension(307, 385));

        jpButtons.setBackground(new java.awt.Color(255, 255, 255));
        jpButtons.setLayout(new java.awt.GridLayout(4, 1, 0, 15));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoTablas.png"))); // NOI18N
        btnInfo.setToolTipText("Información tablas Alumnos/Cursos");
        btnInfo.setBorder(null);
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setDisabledIcon(null);
        btnInfo.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoTablas1.png"))); // NOI18N
        btnInfo.setFocusPainted(false);
        btnInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoTablas1.png"))); // NOI18N
        btnInfo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoTablas1.png"))); // NOI18N
        btnInfo.setSelected(true);
        btnInfo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoTablas1.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jpButtons.add(btnInfo);

        btnAddAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAlumno.png"))); // NOI18N
        btnAddAlumno.setToolTipText("");
        btnAddAlumno.setBorder(null);
        btnAddAlumno.setContentAreaFilled(false);
        btnAddAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAlumno.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAlumno1.png"))); // NOI18N
        btnAddAlumno.setFocusPainted(false);
        btnAddAlumno.setMultiClickThreshhold(1L);
        btnAddAlumno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAlumno1.png"))); // NOI18N
        btnAddAlumno.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAlumno1.png"))); // NOI18N
        btnAddAlumno.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarAlumno1.png"))); // NOI18N
        btnAddAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlumnoActionPerformed(evt);
            }
        });
        jpButtons.add(btnAddAlumno);

        btnAddCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AgregarCurso.png"))); // NOI18N
        btnAddCurso.setBorder(null);
        btnAddCurso.setContentAreaFilled(false);
        btnAddCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCurso.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarCurso1.png"))); // NOI18N
        btnAddCurso.setFocusPainted(false);
        btnAddCurso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarCurso1.png"))); // NOI18N
        btnAddCurso.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarCurso1.png"))); // NOI18N
        btnAddCurso.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarCurso1.png"))); // NOI18N
        btnAddCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCursoActionPerformed(evt);
            }
        });
        jpButtons.add(btnAddCurso);

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aUsuario.png"))); // NOI18N
        btnUsuario.setToolTipText("Administrador de Usuario");
        btnUsuario.setBorder(null);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aUsuario1.png"))); // NOI18N
        btnUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aUsuario1.png"))); // NOI18N
        btnUsuario.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aUsuario1.png"))); // NOI18N
        btnUsuario.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aUsuario1.png"))); // NOI18N
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jpButtons.add(btnUsuario);

        jpConfig.setLayout(new java.awt.GridLayout(1, 0, 0, 15));

        btnAcercade.setBackground(new java.awt.Color(255, 255, 255));
        btnAcercade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAcercade.setForeground(new java.awt.Color(0, 0, 0));
        btnAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acercade1.png"))); // NOI18N
        btnAcercade.setBorder(null);
        btnAcercade.setFocusPainted(false);
        btnAcercade.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acercade.png"))); // NOI18N
        btnAcercade.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acercade.png"))); // NOI18N
        btnAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCenterLayout = new javax.swing.GroupLayout(jpCenter);
        jpCenter.setLayout(jpCenterLayout);
        jpCenterLayout.setHorizontalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCenterLayout.createSequentialGroup()
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcercade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jpCenterLayout.setVerticalGroup(
            jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCenterLayout.createSequentialGroup()
                .addGroup(jpCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCenterLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jpConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCenterLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnAcercade)
                .addContainerGap())
        );

        jpMenu.add(jpCenter, java.awt.BorderLayout.CENTER);

        jpSouth.setBackground(new java.awt.Color(255, 255, 255));
        jpSouth.setForeground(new java.awt.Color(0, 0, 0));
        jpSouth.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Versión 1.0");
        jpSouth.add(jLabel2);

        jpMenu.add(jpSouth, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jpMenu, java.awt.BorderLayout.EAST);

        jpBackground.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jpBackground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        //si el boton info esta activado y el boton curso no, se removera el panel del curso y se agregara el de info
        if (btnInfo.isEnabled() && !btnAddCurso.isEnabled() && btnAddCurso.isSelected()) {

            btnInfo.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (addCurso.isShowing()) {

                jpBackground.remove(addCurso);
                jpBackground.updateUI();

            }

            tbInfo.load();
            jpBackground.add(tbInfo, BorderLayout.CENTER);

            btnInfo.setEnabled(false);
            btnAddCurso.setEnabled(true);

        } else if (btnInfo.isEnabled() && !btnAddAlumno.isEnabled()) {

            btnInfo.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (addAlumno.isShowing()) {

                jpBackground.remove(addAlumno);
                jpBackground.updateUI();

            }

            tbInfo.load();
            jpBackground.add(tbInfo, BorderLayout.CENTER);

            btnInfo.setEnabled(false);
            btnAddAlumno.setEnabled(true);

        } else if (btnInfo.isEnabled() && !btnUsuario.isEnabled()) {

            btnInfo.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (aUsuario.isShowing()) {

                jpBackground.remove(aUsuario);
                jpBackground.updateUI();

            }

            tbInfo.load();
            jpBackground.add(tbInfo, BorderLayout.CENTER);

            btnInfo.setEnabled(false);
            btnUsuario.setEnabled(true);

        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAddAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlumnoActionPerformed

        if (btnAddAlumno.isEnabled() && !btnInfo.isEnabled()) {

            btnAddAlumno.setSelected(true);
            btnInfo.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (tbInfo.isShowing()) {

                jpBackground.remove(tbInfo);
                jpBackground.updateUI();

            }

            addAlumno.load();
            jpBackground.add(addAlumno, BorderLayout.CENTER);

            btnAddAlumno.setEnabled(false);
            btnInfo.setEnabled(true);

        } else if (btnAddAlumno.isEnabled() && !btnAddCurso.isEnabled()) {

            btnAddAlumno.setSelected(true);
            btnInfo.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (addCurso.isShowing()) {

                jpBackground.remove(addCurso);
                jpBackground.updateUI();

            }

            addAlumno.load();
            jpBackground.add(addAlumno, BorderLayout.CENTER);

            btnAddAlumno.setEnabled(false);
            btnAddCurso.setEnabled(true);

        } else if (btnAddAlumno.isEnabled() && !btnUsuario.isEnabled()) {

            btnAddAlumno.setSelected(true);
            btnInfo.setSelected(false);
            btnAddCurso.setSelected(false);
            btnUsuario.setSelected(false);

            if (aUsuario.isShowing()) {

                jpBackground.remove(aUsuario);
                jpBackground.updateUI();

            }

            addAlumno.load();
            jpBackground.add(addAlumno, BorderLayout.CENTER);

            btnAddAlumno.setEnabled(false);
            btnUsuario.setEnabled(true);

        }
    }//GEN-LAST:event_btnAddAlumnoActionPerformed

    private void btnAddCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCursoActionPerformed

        if (btnAddCurso.isEnabled() && !btnInfo.isEnabled()) {

            btnAddCurso.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(false);

            if (tbInfo.isShowing()) {

                jpBackground.remove(tbInfo);
                jpBackground.updateUI();

            }

            addCurso.load();
            jpBackground.add(addCurso, BorderLayout.CENTER);

            btnInfo.setEnabled(true);
            btnAddCurso.setEnabled(false);

        } else if (btnAddCurso.isEnabled() && !btnAddAlumno.isEnabled()) {

            btnAddCurso.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(false);

            if (addAlumno.isShowing()) {

                jpBackground.remove(addAlumno);
                jpBackground.updateUI();

            }

            addCurso.load();
            jpBackground.add(addCurso, BorderLayout.CENTER);

            btnAddAlumno.setEnabled(true);
            btnAddCurso.setEnabled(false);

        } else if (btnAddCurso.isEnabled() && !btnUsuario.isEnabled()) {

            btnAddCurso.setSelected(true);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(false);

            if (aUsuario.isShowing()) {

                jpBackground.remove(aUsuario);
                jpBackground.updateUI();

            }

            addCurso.load();
            jpBackground.add(addCurso, BorderLayout.CENTER);

            btnUsuario.setEnabled(true);
            btnAddCurso.setEnabled(false);

        }
    }//GEN-LAST:event_btnAddCursoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed

        if (btnUsuario.isEnabled() && !btnInfo.isEnabled()) {

            btnAddCurso.setSelected(false);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(true);

            if (tbInfo.isShowing()) {

                jpBackground.remove(tbInfo);
                jpBackground.updateUI();

            }

            aUsuario.load();
            jpBackground.add(aUsuario, BorderLayout.CENTER);

            btnInfo.setEnabled(true);
            btnUsuario.setEnabled(false);

        } else if (btnUsuario.isEnabled() && !btnAddAlumno.isEnabled()) {

            btnAddCurso.setSelected(false);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(true);

            if (addAlumno.isShowing()) {

                jpBackground.remove(addAlumno);
                jpBackground.updateUI();

            }

            aUsuario.load();
            jpBackground.add(aUsuario, BorderLayout.CENTER);

            btnAddAlumno.setEnabled(true);
            btnUsuario.setEnabled(false);

        } else if (btnUsuario.isEnabled() && !btnAddCurso.isEnabled()) {

            btnAddCurso.setSelected(false);
            btnAddAlumno.setSelected(false);
            btnInfo.setSelected(false);
            btnUsuario.setSelected(true);

            if (addCurso.isShowing()) {

                jpBackground.remove(addCurso);
                jpBackground.updateUI();

            }

            aUsuario.load();
            jpBackground.add(aUsuario, BorderLayout.CENTER);

            btnAddCurso.setEnabled(true);
            btnUsuario.setEnabled(false);

        }

    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercadeActionPerformed
        //Solo se abrira una vez la ventana acercade
        if (!Singleton.getInstanceAcd().isShowing()) {
            Singleton.setAcd(null);
            Singleton.getInstanceAcd();
        }

    }//GEN-LAST:event_btnAcercadeActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //No muestra mas el panel de Cerrar Sesion
        if (jpCerrarSesion.isShowing()) {
            jpNorth.removeAll();
            jpNorth.updateUI();
        }

        //Muestra nuevamente el panel de Log in
        jpNorth.add(jpTituloLogin);
        jpNorth.add(jpLogIn);

        int retorno = lg.loginIN();

        switch (retorno) {
            case 0:
                if (!btnAddAlumno.isEnabled() && btnInfo.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }

                } else if (!btnAddCurso.isEnabled() && btnInfo.isEnabled() && btnAddAlumno.isEnabled() && btnUsuario.isEnabled()) {

                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }
                } else if (!btnUsuario.isEnabled() && btnInfo.isEnabled() && btnAddAlumno.isEnabled() && btnAddCurso.isEnabled()) {
                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }
                } else {

                    btnAddAlumno.setEnabled(false);
                    btnAddCurso.setEnabled(false);
                    btnUsuario.setEnabled(false);

                    btnAddAlumno.setToolTipText("Es necesario registrarse.");
                    btnAddCurso.setToolTipText("Es necesario registrarse.");
                    btnUsuario.setToolTipText("Es necesario registrarse.");

                }
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "No se pudo salir.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                if (!btnAddAlumno.isEnabled() && btnInfo.isEnabled()) {

                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                    }
                } else {

                    btnAddAlumno.setEnabled(false);
                    btnAddAlumno.setToolTipText("Es necesario registrarse.");
                }
                break;
            case 3:
                if (!btnAddAlumno.isEnabled() && btnInfo.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }

                } else if (!btnAddCurso.isEnabled() && btnInfo.isEnabled() && btnAddAlumno.isEnabled() && btnUsuario.isEnabled()) {

                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }
                } else if (!btnUsuario.isEnabled() && btnInfo.isEnabled() && btnAddAlumno.isEnabled() && btnAddCurso.isEnabled()) {
                    btnInfo.doClick();

                    if (btnAddAlumno.isEnabled() && btnAddCurso.isEnabled() && btnUsuario.isEnabled()) {

                        btnAddAlumno.setEnabled(false);
                        btnAddCurso.setEnabled(false);
                        btnUsuario.setEnabled(false);

                        btnAddAlumno.setToolTipText("Es necesario registrarse.");
                        btnAddCurso.setToolTipText("Es necesario registrarse.");
                        btnUsuario.setToolTipText("Es necesario registrarse.");
                    }
                } else {

                    btnAddAlumno.setEnabled(false);
                    btnAddCurso.setEnabled(false);
                    btnUsuario.setEnabled(false);

                    btnAddAlumno.setToolTipText("Es necesario registrarse.");
                    btnAddCurso.setToolTipText("Es necesario registrarse.");
                    btnUsuario.setToolTipText("Es necesario registrarse.");

                }

                break;
        }

        txtPass.setText("");
        txtPass.requestFocus();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed

        //Se pasa usuario y contraseña y la clase login verificara si existe y que tipo de usuario es
        lg = new Login(txtUser.getText(), txtPass.getText());
        int retorno = lg.loginIN();

        switch (retorno) {
            // si el retorno es 0 el usuario tiene privilegios de director
            case 0:
                btnAddCurso.setEnabled(true);
                btnAddAlumno.setEnabled(true);
                btnUsuario.setEnabled(true);
                btnAddAlumno.setToolTipText("");
                btnAddCurso.setToolTipText("");
                btnUsuario.setToolTipText("Administrador de Usuarios");

                if (jpLogIn.isShowing()) {

                    jpNorth.removeAll();
                    jpNorth.updateUI();

                }
                jpNorth.add(jpCerrarSesion);
                break;
            case 1:
                //si el retorno es 1 el usuario y/o la contraseña que ingreso el usuario esta mal
                JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                txtPass.requestFocus();
                break;
            case 2:
                //si el retorno es 2 el usuario tiene privilegios de adscripto
                btnAddAlumno.setEnabled(true);
                btnAddCurso.setEnabled(false);
                btnAddAlumno.setToolTipText("");
                btnAddCurso.setToolTipText("No autorizado.");
                btnUsuario.setToolTipText("No autorizado.");

                if (jpLogIn.isShowing()) {
                    jpNorth.removeAll();
                    jpNorth.updateUI();

                }
                jpNorth.add(jpCerrarSesion);
                break;
            case 3:
                //en caso que la cuenta del usuario que desea ingresar esta bloqueada.
                JOptionPane.showMessageDialog(null, "Su cuenta ha sido bloqueada", "Bloqueo", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        //Solo se puede abrir la ventana de registro una sola vez.
        if (!Singleton.getIntance().isShowing()) {
            Singleton.setSg(null);
            Singleton.getIntance();
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        //El usuario podra presionar enter en el txtPass y podra logearse sin apretar el botón
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnLogIn.doClick();
        }

        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtPass.getText().equals("Password")) {
            txtPass.setText("");
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped

        if (txtUser.getText().equals("Usuario") || txtUser.getSelectedText() != null) {
            txtUser.setText("");
        }
        txtUser.setForeground(Color.BLACK);
        if (txtUser.getText().length() >= 12) {

            evt.consume();
        }

        txtUser.setText(txtUser.getText().trim());
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped

        if (txtPass.getText().equals("Password")) {
            txtPass.setText("");
        }

        txtPass.setForeground(Color.BLACK);
        if (txtPass.getText().length() >= 20) {

            evt.consume();
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().isEmpty()) {

            txtUser.setForeground(Color.LIGHT_GRAY);
            txtUser.setText("");

        } else if (txtUser.getText().equals("Usuario")) {

            txtUser.setText("");

        } else {
            txtUser.setText(txtUser.getText());
        }

    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().isEmpty()) {

            txtUser.setForeground(Color.LIGHT_GRAY);
            txtUser.setText("Usuario");

        } else if (txtUser.getText().equals("Usuario")) {

            txtUser.setText("Usuario");

        } else {
            txtUser.setText(txtUser.getText());
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked

        txtUser.setFocusable(true);
        txtUser.requestFocus();
        txtPass.setFocusable(true);
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if (txtPass.getText().isEmpty()) {

            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("");

        } else if (txtPass.getText().equals("Password")) {

            txtPass.setText("");

        } else {
            txtPass.setText(txtPass.getText());
            txtPass.select(0, txtPass.getText().length());
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().isEmpty()) {

            txtPass.setForeground(Color.LIGHT_GRAY);
            txtPass.setText("Password");

        } else if (txtPass.getText().equals("Password")) {

            txtPass.setText("");

        } else {
            txtPass.setText(txtPass.getText());
            txtPass.select(0, txtPass.getText().length());
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void btnRecuperarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseEntered
        btnRecuperar.setBackground(new Color(134, 165, 169));
        btnRecuperar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnRecuperarMouseEntered

    private void btnRecuperarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseExited
        btnRecuperar.setBackground(Color.WHITE);
        btnRecuperar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnRecuperarMouseExited

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        if (!Singleton.getInstanceRp().isShowing()) {
            Singleton.setRp(null);
            Singleton.getInstanceRp();
        }
    }//GEN-LAST:event_btnRecuperarActionPerformed

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
    private javax.swing.JButton btnAcercade;
    private javax.swing.JButton btnAddAlumno;
    private javax.swing.JButton btnAddCurso;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpCenter;
    private javax.swing.JPanel jpCerrarSesion;
    private javax.swing.JPanel jpConfig;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpNorth;
    private javax.swing.JPanel jpSouth;
    private javax.swing.JPanel jpTituloLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
