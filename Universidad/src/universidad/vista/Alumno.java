/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vista;

import controladores.ControladorAlumno;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Cosquin
 */
public class Alumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alumno
     */
    public Alumno() {
        initComponents();
        btn_eliminar.setEnabled(false);
        btn_guardar.setEnabled(false);
        btn_buscar.setToolTipText("Busca un Alumno a partir de su dni");
        btn_eliminar.setToolTipText("Elimina un Alumno, debe ingresasr el documento de 8 digitos");
        btn_guardar.setToolTipText("Luego de buscar un Alumno, puede guardar cambios realizados en sus datos");
        btn_nuevo.setToolTipText("Registra un Nuevo Alumno, el id se genera automaticamente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        field_documento = new javax.swing.JTextField();
        field_apellido = new javax.swing.JTextField();
        field_nombre = new javax.swing.JTextField();
        estadoJRadioButton = new javax.swing.JRadioButton();
        fNacimientoJDateChooser = new com.toedter.calendar.JDateChooser();
        btn_guardar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevoMouseClicked(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(80, 80, 80)
                                .addComponent(field_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(field_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(80, 80, 80)
                                .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadoJRadioButton)
                                    .addComponent(fNacimientoJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(field_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22))
                    .addComponent(estadoJRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fNacimientoJDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_salir))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (field_documento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Primero debe ingresar un documento antes de buscar");
        } else if(field_documento.getText().length()!=8){
            JOptionPane.showMessageDialog(this, "El documento debe poseer 8 digitos, evite los espacios en blanco y otros simbolos");
        } else {
            try {

                int dni = Integer.parseInt(field_documento.getText());
                modelo.Alumno a = ControladorAlumno.buscarAlumnoPorDni(dni);
                if (a.getDni() != 0) {
                    field_nombre.setText(a.getNombre());
                    field_apellido.setText(a.getApellido());
                    estadoJRadioButton.setSelected(a.getEstado() != 0);
                    btn_eliminar.setEnabled(true);
                    btn_guardar.setEnabled(true);
                    LocalDate fNA = a.getFechaNacimiento();
                    fNacimientoJDateChooser.setDate(Date.valueOf(fNA));
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontardo el alumno con ese DNI");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El documento debe ser ingresado sin puntos,espacios,simbolos o letras, intente de nuevo");
            }
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevoMouseClicked
        modelo.Alumno a2 = new modelo.Alumno();
        
        //SI NO FALTA NINGUN DATO, TOMARAN VALOR 1 PARA DAR LUZ VERDE
        int r1 = 0,r2=0,r3=0,r4=0;
        try {

            if (field_apellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ha olivdado ingresar el apellido del alumno");
            }else {
                a2.setApellido(field_apellido.getText());
                r1=1;
            }
            

            if (field_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ha olivdado ingresar el nombre del alumno");
            }else {
                a2.setNombre(field_nombre.getText());
                r2=1;
            }
            
            
            
            if (field_documento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar el n° de documento del Alumno antes de registrar sus datos");
            } else if(field_documento.getText().length()!=8){
                JOptionPane.showMessageDialog(this, "El documento debe poseer 8 digitos, evite los espacios en blanco y otros simbolos");
            }else{
                a2.setDni(Integer.parseInt(field_documento.getText()));
                r3=1;
            }
            
            
            a2.setEstado((estadoJRadioButton.isSelected()) ? 1 : 0);
            
            
            if (fNacimientoJDateChooser.isShowing()) {
                
                
                LocalDate jdc = fNacimientoJDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                int ya = jdc.getYear();
                int yn = LocalDate.now().getYear() - 18;
                if (ya > yn) {
                    JOptionPane.showMessageDialog(this, "Lo sentimos, no podemos registrar alumnos menores de 18 años");
                    field_apellido.setText("");
                    field_documento.setText("");
                    field_nombre.setText("");
                    estadoJRadioButton.setSelected(false);
                    fNacimientoJDateChooser.setCalendar(null);
                    btn_eliminar.setEnabled(false);
                    btn_guardar.setEnabled(false);
                }else {
                    a2.setFechaNacimiento(fNacimientoJDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    r4=1;
                } 
            }
        
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El documento debe ser ingresado sin puntos,espacios,simbolos o letras, intente de nuevo");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Le ha faltado seleccionar una fecha");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "algo salio mal con el boton nueva materia");
        }
        
        //VERIFICA SI HAY LUZ VERDE PARA SUBIR EL ALUMNO
        if (r1 == 1 && r2==1 && r3==1 && r4==1) {
            ControladorAlumno.subirAlumno(a2);
            field_apellido.setText("");
            field_documento.setText("");
            field_nombre.setText("");
            estadoJRadioButton.setSelected(false);
            fNacimientoJDateChooser.setCalendar(null);
            btn_eliminar.setEnabled(false);
            btn_guardar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "Le ha faltado ingresar algun dato, o algun dato es invalido, no se pudo registrar al alumno");
        }
        
    }//GEN-LAST:event_btn_nuevoMouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        modelo.Alumno a = null, a2 = new modelo.Alumno();
        if (field_documento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el n° de documento del Alumno antes de intentar actualizar sus datos");
        } else if(field_documento.getText().length()!=8){
            JOptionPane.showMessageDialog(this, "El documento debe poseer 8 digitos, evite los espacios en blanco y otros simbolos");
        }else{
            try {
                a = ControladorAlumno.buscarAlumnoPorDni(Integer.parseInt(field_documento.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El documento debe ser ingresado sin puntos,espacios,simbolos o letras, intente de nuevo");

            }
            //SI NO FALTA NINGUN DATO, TOMARAN VALOR 1 PARA DAR LUZ VERDE
            int r1 = 0,r2=0;
            
            if (field_apellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ha olivdado ingresar el apellido del alumno");
            }else {
                a2.setApellido(field_apellido.getText());
                r1=1;
            }
            
            if (field_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ha olivdado ingresar el nombre del alumno");
            }else {
                a2.setNombre(field_nombre.getText());
                r2=1;
            }
            
            a2.setDni(a.getDni());
            a2.setEstado((estadoJRadioButton.isSelected()) ? 1 : 0);
            a2.setIdAlumno(a.getIdAlumno());
            a2.setFechaNacimiento(fNacimientoJDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            
            if(r1==1 && r2==1){
                ControladorAlumno.actualizarAlumno(a2);
                field_apellido.setText("");
                field_documento.setText("");
                field_nombre.setText("");
                estadoJRadioButton.setSelected(false);
                fNacimientoJDateChooser.setCalendar(null);
                btn_eliminar.setEnabled(false);
                btn_guardar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(this, "Le ha faltado ingresar algun dato, no se pudo actualizar al alumno");
            }
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (field_documento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el n° de documento del Alumno antes de intentar darle de baja");
        }  else if(field_documento.getText().length()!=8){
            JOptionPane.showMessageDialog(this, "El documento debe poseer 8 digitos, evite los espacios en blanco y otros simbolos no numericos");
        }else {
            ControladorAlumno.eliminarAlumno(ControladorAlumno.buscarAlumnoPorDni2(Integer.parseInt(field_documento.getText())).getIdAlumno());
            field_apellido.setText("");
            field_documento.setText("");
            field_nombre.setText("");
            estadoJRadioButton.setSelected(false);
            fNacimientoJDateChooser.setCalendar(null);
            btn_eliminar.setEnabled(false);
            btn_guardar.setEnabled(false);

        }
    }//GEN-LAST:event_btn_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JRadioButton estadoJRadioButton;
    private com.toedter.calendar.JDateChooser fNacimientoJDateChooser;
    private javax.swing.JTextField field_apellido;
    private javax.swing.JTextField field_documento;
    private javax.swing.JTextField field_nombre;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
