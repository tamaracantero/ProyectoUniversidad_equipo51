/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Materia;

public class ControladorMateria {
        /*
    C
    R
    U
    D
     */
    static Connection con = Conexion.conectarse();
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
    
    /**HECHO POR ARIEL LAZARTE*/
    
    public static void obtenerMateriaPorId(int idMateria) {
        String sql = "SELECT * FROM materia WHERE id = ? ";
        Materia m = new Materia();
        try {
            ps=con.prepareStatement(sql);
               ps.setInt(1, idMateria);
               rs=ps.executeQuery();
               
            if (rs.next()) {
                m.setidMateria(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setAnio(rs.getInt(3));
                m.setEstado(rs.getInt(4));
                
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al buscar materia ");
               System.out.println("Error en Obtener idMateria,por favor intente de nuevo");
        }
    }
}
