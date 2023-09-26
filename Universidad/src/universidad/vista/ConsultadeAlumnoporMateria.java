
package universidad.vista;


import javax.swing.table.DefaultTableModel;
import controladores.ControladorInscripcion;
import controladores.ControladorMateria;
import modelo.Alumno;
import modelo.Materia;
import java.util.ArrayList;

public class ConsultadeAlumnoporMateria extends javax.swing.JInternalFrame {
private DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public ConsultadeAlumnoporMateria() {
        initComponents();
        jtAlumnosporMateria.setModel(modeloTabla); //seteando modelo a la tabla
        crearCabecera();
        materiasParaElegir(); //comboBox
        jcbSelecciondeMateria.setToolTipText("Selecciona una materia"); //cartel de ayuda
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSelecciondeMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnosporMateria = new javax.swing.JTable();
        jbSalirdeLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Listado de alumno por Materia");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione una Materia:");

        jcbSelecciondeMateria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbSelecciondeMateriaItemStateChanged(evt);
            }
        });
        jcbSelecciondeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecciondeMateriaActionPerformed(evt);
            }
        });

        jtAlumnosporMateria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtAlumnosporMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(jtAlumnosporMateria);

        jbSalirdeLista.setText("Salir");
        jbSalirdeLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirdeListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalirdeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jcbSelecciondeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSelecciondeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jbSalirdeLista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelecciondeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecciondeMateriaActionPerformed
        infoConsultarAlumnoporMateria();
    }//GEN-LAST:event_jcbSelecciondeMateriaActionPerformed

    private void jbSalirdeListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirdeListaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirdeListaActionPerformed

    private void jcbSelecciondeMateriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbSelecciondeMateriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSelecciondeMateriaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalirdeLista;
    private javax.swing.JComboBox<Materia> jcbSelecciondeMateria;
    private javax.swing.JTable jtAlumnosporMateria;
    // End of variables declaration//GEN-END:variables

    private void materiasParaElegir() {    //Metodo que carga el comboBox
    
        ArrayList<Materia> eleccion = controladores.ControladorMateria.listarMateria();
        
        for (Materia materia : eleccion) { 
            jcbSelecciondeMateria.addItem(materia);
        }
        

    }
    
    private void infoConsultarAlumnoporMateria() { //modifica la tabla
          //limpiar tabla   
        modeloTabla.setRowCount(0);
        modelo.Materia materia = (modelo.Materia)jcbSelecciondeMateria.getSelectedItem();
        
        ArrayList<modelo.Alumno> listadeAlumnos = ControladorInscripcion.buscarAlumnoXMateria(materia.getIdMateria());
        
        for (modelo.Alumno listadeAlumno : listadeAlumnos) {
            modeloTabla.addRow(new Object [] {listadeAlumno.getIdAlumno(),listadeAlumno.getDni(),listadeAlumno.getApellido(),listadeAlumno.getNombre()});
            jtAlumnosporMateria.setModel(modeloTabla);
        }
        
    }

    private void crearCabecera(){
        modeloTabla.addColumn("ID");      
        modeloTabla.addColumn("DNI");  
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
    
    }
    

}

//El Equipo 51 estuvo aqui
//Equipo.rename("Area 51");