/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vista;

import javax.swing.table.DefaultTableModel;
import controladores.ControladorInscripcion;
import controladores.ControladorMateria;
import modelo.Alumno;
import modelo.Materia;
import java.util.ArrayList;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author Ariel Lazarte
 */
public class ConsultadeAlumnoporMateria extends javax.swing.JInternalFrame {
private DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form ConsultadeAlumnoporMateria
     */
    public ConsultadeAlumnoporMateria() {
        initComponents();
     //   infoConsultarAlumnoporMateria();
        infoConsultarAlumnoporMateria();
        materiasParaElegir();
        jcbSelecciondeMateria.setToolTipText("Selecciona una materia");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSalirdeLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoporMateria = new javax.swing.JTable();
        jcbSelecciondeMateria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Alumno por Materia");

        jLabel2.setText("Seleccione una materia:");

        jbSalirdeLista.setText("Salir");
        jbSalirdeLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirdeListaActionPerformed(evt);
            }
        });

        jtAlumnoporMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "", "Apellido", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAlumnoporMateria);
        jtAlumnoporMateria.getAccessibleContext().setAccessibleName("");
        jtAlumnoporMateria.getAccessibleContext().setAccessibleDescription("");

        jcbSelecciondeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecciondeMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbSelecciondeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalirdeLista)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSelecciondeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jbSalirdeLista)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelecciondeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecciondeMateriaActionPerformed
        // TODO add your handling code here:
        infoConsultarAlumnoporMateria();
    }//GEN-LAST:event_jcbSelecciondeMateriaActionPerformed

    private void jbSalirdeListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirdeListaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirdeListaActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultadeAlumnoporMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultadeAlumnoporMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultadeAlumnoporMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultadeAlumnoporMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultadeAlumnoporMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalirdeLista;
    private javax.swing.JComboBox<Materia> jcbSelecciondeMateria;
    private javax.swing.JTable jtAlumnoporMateria;
    // End of variables declaration//GEN-END:variables

    
    private void materiasParaElegir() {
        ArrayList<Materia> eleccion = controladores.ControladorMateria.listarMateria();
        
        for (Materia materia : eleccion) { 
            jcbSelecciondeMateria.addItem(materia);
        }
        

    }
    
    private void infoConsultarAlumnoporMateria(java.awt.event.ActionEvent evt) {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        jtAlumnoporMateria.setModel(modeloTabla);
    private void infoConsultarAlumnoporMateria() {
        modelo.Materia materia = (modelo.Materia)jcbSelecciondeMateria.getSelectedItem();
        
        ArrayList<modelo.Alumno> listadeAlumnos = ControladorInscripcion.buscarAlumnoXMateria(materia.getIdMateria());
        
        //ArrayList <modelo.Alumno> listadeAlumnosporMateria=controladores.ControladorInscripcion.buscarAlumnoXMateria();
        for (modelo.Alumno listadeAlumno : listadeAlumnos) {
            modeloTabla.addRow(new Object [] {listadeAlumno.getIdAlumno(),listadeAlumno.getDni(),listadeAlumno.getApellido(),listadeAlumno.getNombre()});
            jtAlumnoporMateria.setModel(modeloTabla);
        }
        
        //for (modelo.Alumno XD:listadeAlumnosporMateria) {
        //    modeloTabla.addRow(new Object[] {XD.getIdAlumno(),XD.getDni(),XD.getApellido(),XD.getNombre()});
            
            
            
        //}
       
    }

}

//El Equipo 51 estuvo aqui
//Equipo.rename("Area 51");
