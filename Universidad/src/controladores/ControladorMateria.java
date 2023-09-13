/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Materia;

public class ControladorMateria {
    static Connection con= Conexion.conectarse();
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    /**HECHO POR TAMARA CANTERO*/
    public static void subirMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre,anio,estado) VALUES (?,?,?) ";
        try {
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getEstado());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            if (rs.next()){
            materia.setIdMateria(rs.getInt(1));
             JOptionPane.showMessageDialog(null, "Materia agregada con exito.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar una materia a la Base de Datos "+ex.getMessage());
            System.out.println("Error en en el Metodo subirMateria, Clase ControladorMateria.");
        }
    
    }
}
