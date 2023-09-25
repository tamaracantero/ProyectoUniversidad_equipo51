/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidad.vista;

import controladores.ControladorMateria;
import javax.swing.JOptionPane;

/**
 *
 * @author valkiria
 */
public class Materia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Materia
     */
    public Materia() {
        initComponents();
        botonGuardar.setEnabled(false);
        botonEliminar.setEnabled(false);
        botonBuscar.setToolTipText("Buscar una materia a partir de su codigo");
        botonEliminar.setToolTipText("Eliminar una materia buscada");
        botonGuardar.setToolTipText("ACtualizar/Editar los datos de una materia buscada");
        botonNuevaMateria.setToolTipText("Registrar una nueva materia, no se le debe colocar codigo");
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigoJTextField = new javax.swing.JTextField();
        nombreJTextField = new javax.swing.JTextField();
        anioJTextField = new javax.swing.JTextField();
        estadoJRadioButton = new javax.swing.JRadioButton();
        botonBuscar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonNuevaMateria = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setText("Materias");

        jLabel2.setText("CODIGO:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("AÑO:");

        jLabel5.setText("ESTADO:");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonNuevaMateria.setText("Nuevo");
        botonNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaMateriaActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(anioJTextField)
                                        .addGap(121, 121, 121))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevaMateria)
                                .addGap(18, 18, 18)
                                .addComponent(botonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(estadoJRadioButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar)
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codigoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(anioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(estadoJRadioButton))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonEliminar)
                    .addComponent(botonNuevaMateria)
                    .addComponent(botonSalir))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if(codigoJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Primero debe ingresar un Codigo, intentelo de nuevo");
            codigoJTextField.setText("");
        }else{
            try{
                int id=Integer.parseInt(codigoJTextField.getText());
                modelo.Materia m =ControladorMateria.obtenerMateriaPorId(id);
                if(m.getNombre()==null){
                    botonNuevaMateria.setEnabled(true);
                }else{
                    nombreJTextField.setText(m.getNombre());
                    anioJTextField.setText(m.getAnio()+"");
                    if(m.getEstado()>0){
                        estadoJRadioButton.setSelected(true);
                    }else{
                        estadoJRadioButton.setSelected(false);
                    }
                    botonGuardar.setEnabled(true);
                    botonEliminar.setEnabled(true);
                    
                }
                
            }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "El codigo ingresado no es completamente un numero, asegurese de ingresasr solo numeros, intentelo de nuevo");        
            }
        
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int estado;
        if (estadoJRadioButton.isSelected()) {
            estado=1;
        }else{estado=0;}
        
        modelo.Materia m=new modelo.Materia(Integer.parseInt(codigoJTextField.getText()),nombreJTextField.getText().toLowerCase(),Integer.parseInt(anioJTextField.getText()),estado);
        ControladorMateria.ActualizarMateria(m);
        codigoJTextField.setText("");
        nombreJTextField.setText("");
        anioJTextField.setText("");
        estadoJRadioButton.setSelected(false);
        codigoJTextField.setText("");
        nombreJTextField.setText("");
        anioJTextField.setText("");
        estadoJRadioButton.setSelected(false);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (codigoJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Primero debe buscar la materia a eliminar");
        }else{
            ControladorMateria.eliminarMateria(Integer.parseInt(codigoJTextField.getText()));
        }
        codigoJTextField.setText("");
        nombreJTextField.setText("");
        anioJTextField.setText("");
        estadoJRadioButton.setSelected(false);
        botonEliminar.setEnabled(false);
        botonGuardar.setEnabled(false);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaMateriaActionPerformed
        codigoJTextField.setText("");
        int estado=0;
        if (estadoJRadioButton.isSelected()){
            estado=1;
        }
        
        modelo.Materia m=new modelo.Materia();
        if (nombreJTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Le ha faltado agregar el nombre a la materia, intentelo de nuevo");
            if(anioJTextField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Le ha faltado agregar el año a la materia, intentelo de nuevo");
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Se subira la materia sin codigo, este sera generado automaticamente");
            m.setNombre(nombreJTextField.getText().toLowerCase());
            m.setAnio(Integer.parseInt(anioJTextField.getText()));
            m.setEstado(estado);
            ControladorMateria.subirMateria(m);
        }
        codigoJTextField.setText("");
        nombreJTextField.setText("");
        anioJTextField.setText("");
        estadoJRadioButton.setSelected(false);
        botonEliminar.setEnabled(false);
        botonGuardar.setEnabled(false);
    }//GEN-LAST:event_botonNuevaMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioJTextField;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevaMateria;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField codigoJTextField;
    private javax.swing.JRadioButton estadoJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreJTextField;
    // End of variables declaration//GEN-END:variables
}
