package GUI;

/**
 *
 * @author brayan
 */
import javax.swing.DefaultListModel;
import promedianainterfaz.Materia; 
import promedianainterfaz.Semestre; 

public class VentanaMateria extends javax.swing.JFrame {
    //modelos de las notas
    private DefaultListModel<String> nombre = new DefaultListModel<>(); 
    private DefaultListModel<String> porcentaje = new DefaultListModel<>(); 
    private DefaultListModel<String> calificacion = new DefaultListModel<>();
    
    //coneccion con la ventana de nueva nota
    private int indexMateria; 
    private Semestre semestre = new Semestre(); // semestre vacio; 

    // constructor 
    public VentanaMateria(Semestre semestre, int indexMateria) {
        initComponents();
        
        //se cambia el semestre vacio por el pasado como parametro
        this.semestre = semestre; 
        
        this.indexMateria = indexMateria; 
        
        //se obtiene la materia en el indice seleccionado 
        Materia selectMateria = semestre.getMaterias().getElementAt(indexMateria);
        
        // se configura la etiqueta con el nombre de la materia 
        lblNombreMateria.setText(selectMateria.getNombre());
        
        // se llenan los modelos
        llenarModelos(selectMateria);
        
        // se relacionan las listas con los modelos
        jListNombreNota.setModel(nombre);
        jListPorcentaje.setModel(porcentaje);
        jListCalificacion.setModel(calificacion);
        
        // se saca el promedio de la materia para mostralo en la etiqueta
        String promedioMateria = String.valueOf(selectMateria.getPromedio()); 
        lblPromedio.setText(promedioMateria);
    }
    
    public void llenarModelos (Materia materia) {
        if (materia.getNotas().getSize() != 0) {
            
            for (int i = 0; i < materia.getNotas().getSize(); i++){
                
                // nombre
                String nombre = materia.getNotas().getElementAt(i).getNombre(); 
                this.nombre.addElement(nombre);
                
                // porcentaje
                String porcentaje = String.valueOf((materia.getNotas().getElementAt(i).getPorcentaje()) * 100); 
                this.porcentaje.addElement(porcentaje);
                
                // calificacion 
                String calificacion = String.valueOf(materia.getNotas().getElementAt(i).getCalificacion()); 
                this.calificacion.addElement(calificacion); 
            } 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNombreMateria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNombreNota = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCalificacion = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListPorcentaje = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblAnalisis = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 68, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(148, 112, 112));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        lblNombreMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblNombreMateria.setForeground(new java.awt.Color(51, 51, 51));
        lblNombreMateria.setText("Nombre de la Materia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreMateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreMateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 250, 40));

        jPanel3.setBackground(new java.awt.Color(68, 68, 68));

        jScrollPane1.setBackground(new java.awt.Color(68, 68, 68));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

        jListNombreNota.setBackground(new java.awt.Color(68, 68, 68));
        jListNombreNota.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jListNombreNota.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jListNombreNota);

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Calificacion");

        jScrollPane2.setBackground(new java.awt.Color(68, 68, 68));
        jScrollPane2.setForeground(new java.awt.Color(204, 204, 204));

        jListCalificacion.setBackground(new java.awt.Color(68, 68, 68));
        jListCalificacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jListCalificacion.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jListCalificacion);

        jScrollPane3.setBackground(new java.awt.Color(68, 68, 68));
        jScrollPane3.setForeground(new java.awt.Color(204, 204, 204));

        jListPorcentaje.setBackground(new java.awt.Color(68, 68, 68));
        jListPorcentaje.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jListPorcentaje.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(jListPorcentaje);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Porcentaje");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nota");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 380, 350));

        jPanel4.setBackground(new java.awt.Color(148, 112, 112));

        lblAnalisis.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblAnalisis.setForeground(new java.awt.Color(51, 51, 51));
        lblAnalisis.setText("Analisis");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAnalisis, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 250, 280));

        btnNuevo.setBackground(new java.awt.Color(148, 112, 112));
        btnNuevo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(51, 51, 51));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Promedio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, -1, -1));

        lblPromedio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblPromedio.setForeground(new java.awt.Color(204, 204, 204));
        lblPromedio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(lblPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 80, 30));

        btnAtras.setBackground(new java.awt.Color(148, 112, 112));
        btnAtras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(51, 51, 51));
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        VentanaNuevaNota ventanaNuevaNota = new VentanaNuevaNota(semestre, indexMateria); 
        ventanaNuevaNota.setVisible(true);
        ventanaNuevaNota.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       VentanaSemestre ventanaSemestre = new VentanaSemestre(semestre); 
       ventanaSemestre.setVisible(true); 
       ventanaSemestre.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListCalificacion;
    private javax.swing.JList<String> jListNombreNota;
    private javax.swing.JList<String> jListPorcentaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAnalisis;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JLabel lblPromedio;
    // End of variables declaration//GEN-END:variables
}
