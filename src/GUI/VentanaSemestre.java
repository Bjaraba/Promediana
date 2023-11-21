package GUI;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import promedianainterfaz.Semestre;
import promedianainterfaz.Materia;
import java.awt.event.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author brayan
 */
public class VentanaSemestre extends javax.swing.JFrame {

    private DefaultListModel<String> nombreMaterias = new DefaultListModel<>();
    private DefaultListModel<String> promedios = new DefaultListModel<>();
    private DefaultListModel<String> creditos = new DefaultListModel<>();
    private VentanaNuevaMateria ventanaNuevaMateria;
    private VentanaMateria ventanaMateria;
    private Semestre semestre = new Semestre();

    public VentanaSemestre(Semestre semestre) {
        initComponents();
        this.semestre = semestre;

        txtMeta.setText(String.valueOf(semestre.getMeta()));
        txtLimiteInferior.setText(String.valueOf(semestre.getLimiteInferior())); //se toman los limites superiores y los limites inferiores
        txtLimiteSuperior.setText(String.valueOf(semestre.getLimiteSuperior()));

        ventanaNuevaMateria = new VentanaNuevaMateria(semestre);

        llenarModelos(semestre.getMaterias());

        jListCreditos.setModel(creditos);
        jListMateria.setModel(nombreMaterias);
        jListPromedios.setModel(promedios);

        // la siguiente linea llama al metod de la clase Semestre para conseguir
        // el promedio credito de un semestre lo convierte en un String y lo manda al 
        // label al que coresponde el promedio semestral
        lblPromedioSemestral.setText(String.valueOf(semestre.getPromedioCredito()));
    }

    //servira para que tomar todos los elementos del array de materias e ingresarlos en los modelos
    public void llenarModelos(DefaultListModel<Materia> materias) {
        String nombre, creditos, promedio;
        if (materias.getSize() != 0) {

            for (int i = 0; i < materias.getSize(); i++) {

                //nombre 
                nombre = materias.getElementAt(i).getNombre();
                this.nombreMaterias.addElement(nombre);

                //creditos
                creditos = String.valueOf(materias.getElementAt(i).getCreditos());
                this.creditos.addElement(creditos);

                //promedios
                promedio = String.valueOf(materias.getElementAt(i).getPromedio());
                this.promedios.addElement(promedio);
            }
        }
    }

    //obtener el semestre por fuera de la clase
    public Semestre getSemestre() {
        return semestre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMateria = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPromedios = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCreditos = new javax.swing.JList<>();
        btnNuevaMateria = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblPromedioSemestral = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtMeta = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtLimiteInferior = new java.awt.TextField();
        txtLimiteSuperior = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 68, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(112, 129, 148));

        jLabel1.setBackground(new java.awt.Color(112, 129, 148));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Semestre");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 320, 60));

        jPanel2.setBackground(new java.awt.Color(68, 68, 68));

        jListMateria.setBackground(new java.awt.Color(68, 68, 68));
        jListMateria.setBorder(null);
        jListMateria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jListMateria.setForeground(new java.awt.Color(204, 204, 204));
        jListMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListMateria);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Materia");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Promedio");

        jListPromedios.setBackground(new java.awt.Color(68, 68, 68));
        jListPromedios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jListPromedios.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jListPromedios);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("creditos");

        jListCreditos.setBackground(new java.awt.Color(68, 68, 68));
        jListCreditos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jListCreditos.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(jListCreditos);

        btnNuevaMateria.setBackground(new java.awt.Color(112, 129, 148));
        btnNuevaMateria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnNuevaMateria.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevaMateria.setText("Nuevo");
        btnNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMateriaActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(179, 73, 68));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(204, 204, 204));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnNuevaMateria)
                .addGap(45, 45, 45)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaMateria)
                    .addComponent(btnEliminar))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 490, 530));

        jLabel7.setBackground(new java.awt.Color(68, 68, 68));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Promedio Semestral");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        lblPromedioSemestral.setBackground(new java.awt.Color(68, 68, 68));
        lblPromedioSemestral.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPromedioSemestral.setForeground(new java.awt.Color(204, 204, 204));
        lblPromedioSemestral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(lblPromedioSemestral, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 140, 40));

        jPanel6.setBackground(new java.awt.Color(112, 129, 148));
        jPanel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Promediana");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel8)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel8)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 280, 260));

        jPanel7.setBackground(java.awt.Color.darkGray);
        jPanel7.setForeground(java.awt.Color.gray);

        txtMeta.setBackground(new java.awt.Color(112, 129, 148));
        txtMeta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMeta.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setBackground(new java.awt.Color(68, 68, 68));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Se califica desde hasta");

        jPanel5.setBackground(java.awt.Color.darkGray);

        txtLimiteInferior.setBackground(new java.awt.Color(112, 129, 148));
        txtLimiteInferior.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLimiteInferior.setForeground(new java.awt.Color(204, 204, 204));

        txtLimiteSuperior.setBackground(new java.awt.Color(112, 129, 148));
        txtLimiteSuperior.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtLimiteSuperior.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLimiteInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLimiteInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Meta");

        btnCambiar.setBackground(new java.awt.Color(68, 68, 68));
        btnCambiar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCambiar.setForeground(new java.awt.Color(204, 204, 204));
        btnCambiar.setText("Establecer");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiar)
                                .addGap(10, 10, 10)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCambiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 330, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMateriaActionPerformed
        if (txtLimiteInferior.getText().equalsIgnoreCase("") || txtLimiteSuperior.getText().equalsIgnoreCase("") || txtMeta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Promediana no funcionara sin los limites de calificacion ni con la meta");

        } else if (txtLimiteSuperior.getText().equalsIgnoreCase("0") || txtMeta.getText().equals("0") || txtLimiteSuperior.getText().equalsIgnoreCase("0.0") || txtMeta.getText().equals("0.0") ) {
            JOptionPane.showMessageDialog(rootPane, "Promediana no funcionara con limite superior de calificacion ni con meta iguales a 0");

        } else {
            ventanaNuevaMateria = new VentanaNuevaMateria(semestre);
            ventanaNuevaMateria.setVisible(true);
            ventanaNuevaMateria.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnNuevaMateriaActionPerformed

    private void jListMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMateriaMouseClicked
        int indiceMateria = jListMateria.getSelectedIndex();

        // verificar el doble clik
        // la materia solo se abrirá si ha dado doble clik ecima del nombre de la materia
        if (evt.getClickCount() == 2) {
            //contructor y hacer visible
            ventanaMateria = new VentanaMateria(semestre, indiceMateria);
            ventanaMateria.setVisible(true);
            ventanaMateria.setLocationRelativeTo(null);

            //hacer invicible la ventana principal
            this.dispose();

            // si se selecciona una materia y se da doble clik  
        } else if (SwingUtilities.isRightMouseButton(evt) && indiceMateria != -1) {
            //se eedita la materia en cuestion
            ventanaNuevaMateria = new VentanaNuevaMateria(semestre, indiceMateria);
            ventanaNuevaMateria.setVisible(true);
            ventanaNuevaMateria.setLocationRelativeTo(null);

            this.dispose();
        }
    }//GEN-LAST:event_jListMateriaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice = jListMateria.getSelectedIndex();
        if (indice != -1) {
            // se elimina la materia del indice seleccionado  
            semestre.getMaterias().remove(indice);

            // ahora se elimina de los modelos
            nombreMaterias.remove(indice);
            promedios.remove(indice);
            creditos.remove(indice);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (txtLimiteInferior.getText().equals("") || txtLimiteSuperior.getText().equals("") || txtMeta.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ups! se te olvido llenar algo");
        } else if (txtLimiteSuperior.getText().equals("0") || txtMeta.getText().equals("0") || txtLimiteSuperior.getText().equals("0.0") || txtMeta.getText().equals("0.0")) {
            JOptionPane.showMessageDialog(rootPane, "promediana no puede trabajar con limite superior o metas iguales a 0");
        } else {
            semestre.setLimiteInferior(Double.parseDouble(txtLimiteInferior.getText()));
            semestre.setLimiteSuperior(Double.parseDouble(txtLimiteSuperior.getText()));
            semestre.setMeta(Double.parseDouble(txtMeta.getText()));
        }
    }//GEN-LAST:event_btnCambiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListCreditos;
    private javax.swing.JList<String> jListMateria;
    private javax.swing.JList<String> jListPromedios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblPromedioSemestral;
    private java.awt.TextField txtLimiteInferior;
    private java.awt.TextField txtLimiteSuperior;
    private java.awt.TextField txtMeta;
    // End of variables declaration//GEN-END:variables
}
