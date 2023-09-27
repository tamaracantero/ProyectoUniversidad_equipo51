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
                    if(ex.getMessage().startsWith("(conn=")){
                JOptionPane.showMessageDialog(null, "Error, el nombre de esa materia ya esta registrado");
            }else{
            JOptionPane.showMessageDialog(null, "Error al Agregar una materia a la Base de Datos "+ex.getMessage());
            System.out.println("Error en en el Metodo subirMateria, Clase ControladorMateriaCopia.");
            }
        }
    
    }
    /**HECHO POR ARIEL LAZARTE*/
    
    public static Materia obtenerMateriaPorId(int idMateria) {
        String sql = "SELECT * FROM materia WHERE idMateria = ? AND estado = 1 ";
        Materia m = new Materia();
        try {
            ps=con.prepareStatement(sql);
               ps.setInt(1, idMateria);
               rs=ps.executeQuery();
               
            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setAnio(rs.getInt(3));
                m.setEstado(rs.getInt(4));
                
            }
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al buscar materia ");
               System.out.println("Error en Obtener idMateria,por favor intente de nuevo");
        }
        return m;
    }
    /**HECHO POR ARIEL LAZARTE copia de Tamara Cantero para materias inactivas incluidas*/
    
    public static Materia obtenerMateriaPorId2(int idMateria) {
        String sql = "SELECT * FROM materia WHERE idMateria = ?";
        Materia m = new Materia();
        try {
            ps=con.prepareStatement(sql);
               ps.setInt(1, idMateria);
               rs=ps.executeQuery();
               
            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setAnio(rs.getInt(3));
                m.setEstado(rs.getInt(4));
                
            }
            
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al buscar materia ");
               System.out.println("Error en Obtener idMateria,por favor intente de nuevo");
        }
        return m;
    }
     /**HECHO POR BRIAN PEREIRA*/
    public static void ActualizarMateria(Materia m) {
        String sql = "UPDATE materia SET Nombre=?,Anio=?,Estado=? WHERE idMateria=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setInt(3, m.getEstado());
            ps.setInt(4, m.getIdMateria());
            int f = ps.executeUpdate();
            if (f > 0) {
                JOptionPane.showMessageDialog(null, "Materia Actualizada Correctamente");
                System.out.println("Filas Afectadas: " + f);
            } else {
                JOptionPane.showMessageDialog(null, "La Materia no se ha Actualizado Correctamente");
                System.out.println("Filas Afectadas: " + f);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar una materia a la Base de Datos " + ex.getMessage());
            System.out.println("Error en en el Metodo crearMateria, Clase ControladorMateria.");
        }
    }
    
    /**HECHO POR JUAN LASPIUR*/
      public static void eliminarMateria(int id) {

        try {
            String sql = "UPDATE materia SET estado  = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de baja materia con exito ");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la baja de la materia, intente de nuevo "+ex.getMessage());
        }
    }
    
      /**HECHO POR TAMARA CANTERO*/
    
    public static ArrayList listarMateria(){
        ArrayList<Materia> materias=new ArrayList<>();
        String sql="SELECT * FROM materia WHERE estado=1";
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                materias.add(new Materia(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar materias, intente de nuevo "+ex.getMessage());
        }
        return materias;
    }
    /**HECHO POR TAMARA CANTERO */
    public static Materia buscarMateriaPorNombre(String nombre){
        Materia m=new Materia();
        String sql = "SELECT * FROM materia WHERE nombre=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1, nombre.toLowerCase());
            rs=ps.executeQuery();
            
            while (rs.next()) {
                m.setIdMateria(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setAnio(rs.getInt(3));
                m.setEstado(rs.getInt(4));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar materia por nombre, intente de nuevo "+e.getMessage());
        }
        return m;
    }
}