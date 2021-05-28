/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_victorcruz;

import javax.swing.DefaultListModel;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Lab5P2_VictorCruz extends javax.swing.JFrame {

    /**
     * Creates new form Lab5P2_VictorCruz
     */
    public Lab5P2_VictorCruz() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_CrearJugugador = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JTF_NombreEstudiante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_ApellidoEst = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JB_AgregarEstudiante = new javax.swing.JButton();
        JB_AgregarEstudiantesArbol = new javax.swing.JButton();
        JSP_EdadEst = new javax.swing.JSpinner();
        CB_GeneroEst = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_estudiantes = new javax.swing.JList();
        CB_Carreras = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JTF_UsernameEst = new javax.swing.JTextField();
        JTF_PasswordEst = new javax.swing.JTextField();
        JD_CrearEntrenador = new javax.swing.JDialog();
        JD_CrearPreparador = new javax.swing.JDialog();
        JD_CrearPsicologo = new javax.swing.JDialog();
        JD_Arbol = new javax.swing.JDialog();
        JD_VerTablaJugadores = new javax.swing.JDialog();
        JD_VerTablaEntrenadores = new javax.swing.JDialog();
        JD_VerTablaPreparador = new javax.swing.JDialog();
        JD_VerTablaPsicologo = new javax.swing.JDialog();
        popup_menu_Arbol = new javax.swing.JPopupMenu();
        JMI_ModificarTree = new javax.swing.JMenuItem();
        JMI_EliminarTree = new javax.swing.JMenuItem();
        JMI_ListarTree = new javax.swing.JMenuItem();
        JD_Partido = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        JB_SalirSistema = new javax.swing.JButton();
        JMB_Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_CrearJugador = new javax.swing.JMenuItem();
        JMI_CrearEntrenador = new javax.swing.JMenuItem();
        JMI_CrearPreparador = new javax.swing.JMenuItem();
        JMI_CrearPsicologo = new javax.swing.JMenuItem();
        JMI_CrearPartido = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMI_Arbol = new javax.swing.JMenuItem();

        jLabel4.setText("Ingrese su nombre:");

        jLabel5.setText("Ingrese su apellido:");

        jLabel6.setText("Ingrese su edad:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Genero:");

        jLabel8.setText("Ingrese su carrera:");

        JB_AgregarEstudiante.setText("Agregar a la lista");
        JB_AgregarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AgregarEstudianteMouseClicked(evt);
            }
        });

        JB_AgregarEstudiantesArbol.setText("Agregar al arbol");
        JB_AgregarEstudiantesArbol.setEnabled(false);
        JB_AgregarEstudiantesArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_AgregarEstudiantesArbolMouseClicked(evt);
            }
        });
        JB_AgregarEstudiantesArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarEstudiantesArbolActionPerformed(evt);
            }
        });

        JSP_EdadEst.setValue(20);

        CB_GeneroEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        JL_estudiantes.setModel(new DefaultListModel());
        JL_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_estudiantesMouseClicked(evt);
            }
        });
        JL_estudiantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JL_estudiantesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(JL_estudiantes);

        CB_Carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finanzas", " Derecho", "Administración de Empresas", "Diseño Gráfico", "Mercadotecnia", "Sistemas Computacionales", "Industrial y de Sistemas", "Mecatrónica", "Biomédica", "Energía", "Medicina y Cirugía", "Odontología", "Nutrición y Terapia Física", "Ocupacional" }));

        jLabel16.setText("Ingrese su password:");

        jLabel17.setText("Ingrese su username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_GeneroEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Carreras, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JSP_EdadEst, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_ApellidoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_NombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_PasswordEst, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_UsernameEst, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(JB_AgregarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(JB_AgregarEstudiantesArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(JTF_UsernameEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(JTF_PasswordEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_NombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTF_ApellidoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JSP_EdadEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_GeneroEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 79, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_AgregarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_AgregarEstudiantesArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CB_Carreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout JD_CrearJugugadorLayout = new javax.swing.GroupLayout(JD_CrearJugugador.getContentPane());
        JD_CrearJugugador.getContentPane().setLayout(JD_CrearJugugadorLayout);
        JD_CrearJugugadorLayout.setHorizontalGroup(
            JD_CrearJugugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JD_CrearJugugadorLayout.setVerticalGroup(
            JD_CrearJugugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearJugugadorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_CrearEntrenadorLayout = new javax.swing.GroupLayout(JD_CrearEntrenador.getContentPane());
        JD_CrearEntrenador.getContentPane().setLayout(JD_CrearEntrenadorLayout);
        JD_CrearEntrenadorLayout.setHorizontalGroup(
            JD_CrearEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_CrearEntrenadorLayout.setVerticalGroup(
            JD_CrearEntrenadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_CrearPreparadorLayout = new javax.swing.GroupLayout(JD_CrearPreparador.getContentPane());
        JD_CrearPreparador.getContentPane().setLayout(JD_CrearPreparadorLayout);
        JD_CrearPreparadorLayout.setHorizontalGroup(
            JD_CrearPreparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_CrearPreparadorLayout.setVerticalGroup(
            JD_CrearPreparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_CrearPsicologoLayout = new javax.swing.GroupLayout(JD_CrearPsicologo.getContentPane());
        JD_CrearPsicologo.getContentPane().setLayout(JD_CrearPsicologoLayout);
        JD_CrearPsicologoLayout.setHorizontalGroup(
            JD_CrearPsicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_CrearPsicologoLayout.setVerticalGroup(
            JD_CrearPsicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_ArbolLayout = new javax.swing.GroupLayout(JD_Arbol.getContentPane());
        JD_Arbol.getContentPane().setLayout(JD_ArbolLayout);
        JD_ArbolLayout.setHorizontalGroup(
            JD_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_ArbolLayout.setVerticalGroup(
            JD_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_VerTablaJugadoresLayout = new javax.swing.GroupLayout(JD_VerTablaJugadores.getContentPane());
        JD_VerTablaJugadores.getContentPane().setLayout(JD_VerTablaJugadoresLayout);
        JD_VerTablaJugadoresLayout.setHorizontalGroup(
            JD_VerTablaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_VerTablaJugadoresLayout.setVerticalGroup(
            JD_VerTablaJugadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_VerTablaEntrenadoresLayout = new javax.swing.GroupLayout(JD_VerTablaEntrenadores.getContentPane());
        JD_VerTablaEntrenadores.getContentPane().setLayout(JD_VerTablaEntrenadoresLayout);
        JD_VerTablaEntrenadoresLayout.setHorizontalGroup(
            JD_VerTablaEntrenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_VerTablaEntrenadoresLayout.setVerticalGroup(
            JD_VerTablaEntrenadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_VerTablaPreparadorLayout = new javax.swing.GroupLayout(JD_VerTablaPreparador.getContentPane());
        JD_VerTablaPreparador.getContentPane().setLayout(JD_VerTablaPreparadorLayout);
        JD_VerTablaPreparadorLayout.setHorizontalGroup(
            JD_VerTablaPreparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_VerTablaPreparadorLayout.setVerticalGroup(
            JD_VerTablaPreparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JD_VerTablaPsicologoLayout = new javax.swing.GroupLayout(JD_VerTablaPsicologo.getContentPane());
        JD_VerTablaPsicologo.getContentPane().setLayout(JD_VerTablaPsicologoLayout);
        JD_VerTablaPsicologoLayout.setHorizontalGroup(
            JD_VerTablaPsicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_VerTablaPsicologoLayout.setVerticalGroup(
            JD_VerTablaPsicologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        JMI_ModificarTree.setText("Modificar");
        JMI_ModificarTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ModificarTreeActionPerformed(evt);
            }
        });
        popup_menu_Arbol.add(JMI_ModificarTree);

        JMI_EliminarTree.setText("Eliminar");
        JMI_EliminarTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_EliminarTreeActionPerformed(evt);
            }
        });
        popup_menu_Arbol.add(JMI_EliminarTree);

        JMI_ListarTree.setText("Listar");
        JMI_ListarTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ListarTreeActionPerformed(evt);
            }
        });
        popup_menu_Arbol.add(JMI_ListarTree);

        javax.swing.GroupLayout JD_PartidoLayout = new javax.swing.GroupLayout(JD_Partido.getContentPane());
        JD_Partido.getContentPane().setLayout(JD_PartidoLayout);
        JD_PartidoLayout.setHorizontalGroup(
            JD_PartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JD_PartidoLayout.setVerticalGroup(
            JD_PartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        JB_SalirSistema.setText("Salir del Sistema");
        JB_SalirSistema.setFocusable(false);
        JB_SalirSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JB_SalirSistema.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JB_SalirSistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_SalirSistemaMouseClicked(evt);
            }
        });
        jToolBar1.add(JB_SalirSistema);

        jMenu1.setText("Agregar Integrantes");

        JMI_CrearJugador.setText("Crear Jugador");
        JMI_CrearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearJugadorActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearJugador);

        JMI_CrearEntrenador.setText("Crear Entrenador");
        JMI_CrearEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearEntrenadorActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearEntrenador);

        JMI_CrearPreparador.setText("Crear Preparador");
        JMI_CrearPreparador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearPreparadorActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearPreparador);

        JMI_CrearPsicologo.setText("Crear Psicologo");
        JMI_CrearPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearPsicologoActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearPsicologo);

        JMI_CrearPartido.setText("Crear Partido");
        JMI_CrearPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_CrearPartidoActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_CrearPartido);

        JMB_Menu.add(jMenu1);

        jMenu2.setText("Ver Arbol");

        JMI_Arbol.setText("Arbol de Todo");
        JMI_Arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ArbolActionPerformed(evt);
            }
        });
        jMenu2.add(JMI_Arbol);

        JMB_Menu.add(jMenu2);

        setJMenuBar(JMB_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 639, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 509, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_CrearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearJugadorActionPerformed
        CrearJugador();
    }//GEN-LAST:event_JMI_CrearJugadorActionPerformed

    private void JMI_CrearEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearEntrenadorActionPerformed
        CrearEntrenador();
    }//GEN-LAST:event_JMI_CrearEntrenadorActionPerformed

    private void JMI_CrearPreparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearPreparadorActionPerformed
        CrearPreparadores();
    }//GEN-LAST:event_JMI_CrearPreparadorActionPerformed

    private void JMI_CrearPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearPsicologoActionPerformed
       CrearPsicologos();
    }//GEN-LAST:event_JMI_CrearPsicologoActionPerformed

    private void JMI_ArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ArbolActionPerformed
        Arbol();
    }//GEN-LAST:event_JMI_ArbolActionPerformed

    private void JB_SalirSistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_SalirSistemaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_JB_SalirSistemaMouseClicked

    private void JMI_ModificarTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ModificarTreeActionPerformed
        
    }//GEN-LAST:event_JMI_ModificarTreeActionPerformed

    private void JMI_EliminarTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_EliminarTreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMI_EliminarTreeActionPerformed

    private void JMI_ListarTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ListarTreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JMI_ListarTreeActionPerformed

    private void JMI_CrearPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_CrearPartidoActionPerformed
       Partido();
    }//GEN-LAST:event_JMI_CrearPartidoActionPerformed

    private void JB_AgregarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_AgregarEstudianteMouseClicked

        DefaultListModel modelo
        = (DefaultListModel) JL_estudiantes.getModel();
        modelo.addElement(new Estudiantes(NumCuenta,
            (String) CB_Carreras.getSelectedItem(),
            JTF_NombreEstudiante.getText(),
            JTF_ApellidoEst.getText(),
            (String) CB_GeneroEst.getSelectedItem(),
            (Integer) JSP_EdadEst.getValue()
        )
        );
        p.add(new Estudiantes(NumCuenta, (String) CB_Carreras.getSelectedItem(), JTF_UsernameEst.getText(), JTF_PasswordEst.getText(), JTF_NombreEstudiante.getText(), JTF_ApellidoEst.getText(), (String) CB_GeneroEst.getSelectedItem(), (Integer) JSP_EdadEst.getValue()));
        JTF_UsernameEst.setText("");
        JTF_PasswordEst.setText("");
        JL_estudiantes.setModel(modelo);
        JTF_NombreEstudiante.setText("");
        CB_Carreras.setSelectedIndex(0);
        JTF_ApellidoEst.setText("");
        JSP_EdadEst.setValue(0);
        CB_GeneroEst.setSelectedIndex(0);
    }//GEN-LAST:event_JB_AgregarEstudianteMouseClicked

    private void JB_AgregarEstudiantesArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_AgregarEstudiantesArbolMouseClicked
        try {
            if (JL_estudiantes.getSelectedIndex() >= 0) {
                DefaultTreeModel modeloARBOL = (DefaultTreeModel) JT_Universidad.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
                //obtener la persona a guardar
                DefaultListModel modeloLISTA = (DefaultListModel) JL_estudiantes.getModel();
                int Numero_Cuenta;
                String Carrera;
                String Nombre;
                String Apellido;
                int Edad;
                String Genero;
                Numero_Cuenta = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getNumero_Cuenta();
                Carrera = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getCarrera();
                Nombre = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getNombre();
                Apellido = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getApellido();
                Edad = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getEdad();
                Genero = ((Estudiantes) modeloLISTA.get(JL_estudiantes.getSelectedIndex())).getGenero();
                int centinela = -1;
                for (int i = 0; i < raiz.getChildCount(); i++) {
                    if (raiz.getChildAt(i).toString().
                        equals(Carrera)) {
                        //si ya existe le agrega la persona
                        DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(
                            new Estudiantes(Numero_Cuenta, Carrera, Nombre, Apellido, Genero, Edad));
                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                        centinela = 1;
                    }//fin del if
                }//fin del for
                if (centinela == -1) {
                    DefaultMutableTreeNode n
                    = new DefaultMutableTreeNode(Carrera);
                    DefaultMutableTreeNode p
                    = new DefaultMutableTreeNode(
                        new Estudiantes(Numero_Cuenta, Carrera, Nombre, Apellido, Genero, Edad));
                    n.add(p);
                    raiz.add(n);
                }//fin del if
                modeloARBOL.reload();
                JOptionPane.showMessageDialog(this, "Se ha agregado al arbol");
            } else {
                JOptionPane.showMessageDialog(this,
                    "No hay persona seleccionada");
            }//fin del else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Inesperado");
        }//fin del try n catch

    }//GEN-LAST:event_JB_AgregarEstudiantesArbolMouseClicked

    private void JB_AgregarEstudiantesArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarEstudiantesArbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JB_AgregarEstudiantesArbolActionPerformed

    private void JL_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_estudiantesMouseClicked
        String user = JTF_Username.getText();
        String Pass = JPF_Password.getText();
        if (user.equalsIgnoreCase("vjcm1821") && Pass.equalsIgnoreCase("1234")) {
            if (JL_estudiantes.getSelectedIndex() >= 0) {
                if (evt.isMetaDown()) {
                    popup_modificar.show(evt.getComponent(),
                        evt.getX(), evt.getY());

                }//fin de la condicion del click derecho
            }//fin de la condicion del popip_menu
        } else {
            JOptionPane.showMessageDialog(this, "Debe ser Admin para Modificar");
        }
    }//GEN-LAST:event_JL_estudiantesMouseClicked

    private void JL_estudiantesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JL_estudiantesKeyPressed
        if (evt.getKeyCode() == evt.VK_DELETE) {
            if (JL_estudiantes.getSelectedIndex() >= 0) {
                DefaultListModel modelo
                = (DefaultListModel) JL_estudiantes.getModel();
                modelo.remove(JL_estudiantes.getSelectedIndex());
                JL_estudiantes.setModel(modelo);
                JOptionPane.showMessageDialog(this,
                    "Eliminado exitosamente");

            }
        }
    }//GEN-LAST:event_JL_estudiantesKeyPressed

    public void CrearJugador() {
        JD_CrearJugugador.pack();
        JD_CrearJugugador.setModal(true);
        JD_CrearJugugador.setLocationRelativeTo(this);
        JD_CrearJugugador.setVisible(true);
    }//fin del JDialog
    
     public void CrearEntrenador() {
        JD_CrearEntrenador.pack();
        JD_CrearEntrenador.setModal(true);
        JD_CrearEntrenador.setLocationRelativeTo(this);
        JD_CrearEntrenador.setVisible(true);
    }//fin del JDialog
     
      public void CrearPreparadores() {
        JD_CrearPreparador.pack();
        JD_CrearPreparador.setModal(true);
        JD_CrearPreparador.setLocationRelativeTo(this);
        JD_CrearPreparador.setVisible(true);
    }//fin del JDialog
      
      public void CrearPsicologos() {
        JD_CrearPsicologo.pack();
        JD_CrearPsicologo.setModal(true);
        JD_CrearPsicologo.setLocationRelativeTo(this);
        JD_CrearPsicologo.setVisible(true);
    }//fin del JDialog
      
       public void Arbol() {
        JD_Arbol.pack();
        JD_Arbol.setModal(true);
        JD_Arbol.setLocationRelativeTo(this);
        JD_Arbol.setVisible(true);
    }//fin del JDialog
       
       public void TablaJugadores() {
        JD_VerTablaJugadores.pack();
        JD_VerTablaJugadores.setModal(true);
        JD_VerTablaJugadores.setLocationRelativeTo(this);
        JD_VerTablaJugadores.setVisible(true);
    }//fin del JDialog
       
       public void TablaEntrenadores() {
        JD_VerTablaEntrenadores.pack();
        JD_VerTablaEntrenadores.setModal(true);
        JD_VerTablaEntrenadores.setLocationRelativeTo(this);
        JD_VerTablaEntrenadores.setVisible(true);
    }//fin del JDialog
       
        public void TablaPreparador() {
        JD_VerTablaPreparador.pack();
        JD_VerTablaPreparador.setModal(true);
        JD_VerTablaPreparador.setLocationRelativeTo(this);
        JD_VerTablaPreparador.setVisible(true);
    }//fin del JDialog
        
         public void TablaPsicologo() {
        JD_VerTablaPsicologo.pack();
        JD_VerTablaPreparador.setModal(true);
        JD_VerTablaPreparador.setLocationRelativeTo(this);
        JD_VerTablaPreparador.setVisible(true);
    }//fin del JDialog
         
          public void Partido() {
        JD_Partido.pack();
        JD_Partido.setModal(true);
        JD_Partido.setLocationRelativeTo(this);
        JD_Partido.setVisible(true);
    }//fin del JDialog
         
    
    
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
            java.util.logging.Logger.getLogger(Lab5P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5P2_VictorCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5P2_VictorCruz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Carreras;
    private javax.swing.JComboBox<String> CB_GeneroEst;
    private javax.swing.JButton JB_AgregarEstudiante;
    private javax.swing.JButton JB_AgregarEstudiantesArbol;
    private javax.swing.JButton JB_SalirSistema;
    private javax.swing.JDialog JD_Arbol;
    private javax.swing.JDialog JD_CrearEntrenador;
    private javax.swing.JDialog JD_CrearJugugador;
    private javax.swing.JDialog JD_CrearPreparador;
    private javax.swing.JDialog JD_CrearPsicologo;
    private javax.swing.JDialog JD_Partido;
    private javax.swing.JDialog JD_VerTablaEntrenadores;
    private javax.swing.JDialog JD_VerTablaJugadores;
    private javax.swing.JDialog JD_VerTablaPreparador;
    private javax.swing.JDialog JD_VerTablaPsicologo;
    private javax.swing.JList JL_estudiantes;
    private javax.swing.JMenuBar JMB_Menu;
    private javax.swing.JMenuItem JMI_Arbol;
    private javax.swing.JMenuItem JMI_CrearEntrenador;
    private javax.swing.JMenuItem JMI_CrearJugador;
    private javax.swing.JMenuItem JMI_CrearPartido;
    private javax.swing.JMenuItem JMI_CrearPreparador;
    private javax.swing.JMenuItem JMI_CrearPsicologo;
    private javax.swing.JMenuItem JMI_EliminarTree;
    private javax.swing.JMenuItem JMI_ListarTree;
    private javax.swing.JMenuItem JMI_ModificarTree;
    private javax.swing.JSpinner JSP_EdadEst;
    private javax.swing.JTextField JTF_ApellidoEst;
    private javax.swing.JTextField JTF_NombreEstudiante;
    private javax.swing.JTextField JTF_PasswordEst;
    private javax.swing.JTextField JTF_UsernameEst;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPopupMenu popup_menu_Arbol;
    // End of variables declaration//GEN-END:variables
}
