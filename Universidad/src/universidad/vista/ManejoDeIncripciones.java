/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vista;

import controladores.*;
import modelo.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ManejoDeIncripciones extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
        
    };
    
    public ManejoDeIncripciones() {
        initComponents();
        cargarCombo();
        tabla.setModel(model);
        agregarCabeceraTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        comboBox = new javax.swing.JComboBox<>();
        btn_inscribir = new javax.swing.JButton();
        btn_anular = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btnRadio1 = new javax.swing.JRadioButton();
        btnRadio2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("Formulario de Incripcion");

        jLabel3.setText("Seleccione un alumno:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        btn_inscribir.setText("Inscribir");
        btn_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribirActionPerformed(evt);
            }
        });

        btn_anular.setText("Anular Inscripción");

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btnRadio1.setText("Materias Inscriptas");
        btnRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio1ActionPerformed(evt);
            }
        });

        btnRadio2.setText("Materias no inscriptas");
        btnRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Listado de Materias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(btn_inscribir)
                            .addGap(43, 43, 43)
                            .addComponent(btn_anular)
                            .addGap(27, 27, 27)
                            .addComponent(btn_salir))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRadio1)
                                        .addGap(93, 93, 93)
                                        .addComponent(btnRadio2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel4)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRadio1)
                    .addComponent(btnRadio2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inscribir)
                    .addComponent(btn_anular)
                    .addComponent(btn_salir))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inscribirActionPerformed

    private void btnRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio1ActionPerformed
        //limpiar tabla   
        int cantidadFilas = model.getRowCount();
        for (int i = 0; i < cantidadFilas; i++) {
           model.removeRow(i);
        }
        
        modelo.Alumno alumnoSeleccionado = (modelo.Alumno) comboBox.getSelectedItem();        
        ArrayList<modelo.Materia> lista = ControladorInscripcion.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
        for (modelo.Materia materia : lista) {
            agregarFila(materia.getIdMateria(), materia.getNombre(), materia.getAnio());
        }
    }//GEN-LAST:event_btnRadio1ActionPerformed

    private void btnRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio2ActionPerformed
         //limpiar tabla   
        int cantidadFilas = model.getRowCount();
        for (int i = 0; i < cantidadFilas; i++) {
           model.removeRow(i);
        }
        
        
        
        modelo.Alumno alumnoSeleccionado = (modelo.Alumno) comboBox.getSelectedItem();        
        ArrayList<modelo.Materia> lista = ControladorInscripcion.obtenermateriasNocursadas(alumnoSeleccionado.getIdAlumno());
        for (modelo.Materia materia : lista) {
            agregarFila(materia.getIdMateria(), materia.getNombre(), materia.getAnio());
        }
    }//GEN-LAST:event_btnRadio2ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnRadio1;
    private javax.swing.JRadioButton btnRadio2;
    private javax.swing.JButton btn_anular;
    private javax.swing.JButton btn_inscribir;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<modelo.Alumno> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void agregarCabeceraTabla() {
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Año");
    }
    
    private void agregarFila(int ID, String nombre, int anio) {
        model.addRow(new Object[]{ID, nombre, anio});
    }
    
    private void cargarCombo() {
        ArrayList<modelo.Alumno> lista = ControladorAlumno.listaDeAlumnosActivos();
        for (modelo.Alumno alumno : lista) {
            comboBox.addItem(alumno);
        }
        
    }
    
}
