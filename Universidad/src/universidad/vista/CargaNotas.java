package universidad.vista;

import modelo.Alumno;
import modelo.Incripcion;
import controladores.ControladorAlumno;
import controladores.ControladorInscripcion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Incripcion;

public class CargaNotas extends javax.swing.JInternalFrame {

    //atributos
    private boolean centinela = false;

    DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (centinela) {
                if (fila == tabla.getSelectedRow() && 2 == tabla.getSelectedColumn()) {
                    return true;
                }

            }
            return false;

        }

    };

    public CargaNotas() {
        initComponents();
        tabla.setModel(model);
        cabeceraTabla();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBox_listaAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione el Alumno");

        comboBox_listaAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_listaAlumnosItemStateChanged(evt);
            }
        });

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBox_listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btn_guardar)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBox_listaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_salir))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_listaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_listaAlumnosActionPerformed
        Alumno alumno = (Alumno) comboBox_listaAlumnos.getSelectedItem();
        int idAlumno = alumno.getIdAlumno();
        ArrayList<Incripcion> lista = ControladorInscripcion.obtenerIncripciones(idAlumno);

        for (Incripcion incripcion : lista) {
            agregarFilaTabla(incripcion.getIdInscripto(), incripcion.getMateria().getNombre(), incripcion.getNota());
        }


    }//GEN-LAST:event_comboBox_listaAlumnosActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        centinela = true;
    }//GEN-LAST:event_tablaMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void comboBox_listaAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_listaAlumnosItemStateChanged
          //limpiar tabla   
      model.setRowCount(0);
        
        Alumno alumnoSeleccionado = (Alumno) comboBox_listaAlumnos.getSelectedItem();
        ArrayList<Incripcion> lista = ControladorInscripcion.obtenerIncripciones(alumnoSeleccionado.getIdAlumno());

        for (Incripcion incripcion : lista) {
            agregarFilaTabla(incripcion.getIdInscripto(), incripcion.getMateria().getNombre(), incripcion.getNota());
        }


    }//GEN-LAST:event_comboBox_listaAlumnosItemStateChanged

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
    int filaSeleccionada = tabla.getSelectedRow(); //trae la fila seleccionada
      if(filaSeleccionada != -1){  //si hay fila entra
          
         ArrayList<Incripcion> listaInscripciones; //crea una lista
         double nota=0.0; //crea e inicializa nota
         boolean flag=false; //?
         int idIncripcion = (int) model.getValueAt(filaSeleccionada, 0);
         
         
         try{
             nota =Double.parseDouble(model.getValueAt(filaSeleccionada, 2).toString());
         }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(this, "ingrese solo numeros, si es decimal separe decimales con un punto");
         }
         
          if(nota>= 0 && nota<=10){
              flag=true;
             }else{
             flag=false;
             JOptionPane.showMessageDialog(rootPane, "El rango de notas posibles en la institución es de 0 a 10");
             }
         
         
         int alumno = ((Alumno) comboBox_listaAlumnos.getSelectedItem()).getIdAlumno();
         
         listaInscripciones = ControladorInscripcion.obtenerIncripciones(alumno);
         
          int m1=0;
          for (Incripcion inscripcion : listaInscripciones) {
              if(inscripcion.getIdInscripto() == idIncripcion){
              m1 = inscripcion.getMateria().getIdMateria();
              break;
              }
          }
         if(flag){
             ControladorInscripcion.actualizarInscripcion(idIncripcion, nota,alumno, m1);
             JOptionPane.showMessageDialog(this, "Nota modificada con exito");
         }
         
         
      }else{
          JOptionPane.showMessageDialog(this, "Debe seleccionar la fila de la materia que desea modificar");
      }
        
        
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Alumno> comboBox_listaAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Nota");
    }

    private void agregarFilaTabla(int codigo, String nombre, double nota) {
        model.addRow(new Object[]{codigo, nombre, nota});
    }

    private void cargarCombo() {
        ArrayList<Alumno> lista = ControladorAlumno.listaDeAlumnosActivos();
        for (Alumno alumno : lista) {
            comboBox_listaAlumnos.addItem(alumno);
        }

    }

}
