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
import modelo.Alumno;

public class ControladorAlumno {
    /*
    C
    R
    U
    D
    */
    static Connection con= null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
        
    public static void crearAlumno(Alumno alumno){
        con = Conexion.conectarse();
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?,?,?,?,?) ";
        try {
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getEstado());
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            if (rs.next()){
            alumno.setIdAlumno(rs.getInt(1));
             JOptionPane.showMessageDialog(null, "Alumno agregado con exito.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar un alumno a la Base de Datos "+ex.getMessage());
            System.out.println("Error en en el Metodo crearAlumno, Clase ControladorAlumno.");
        }
    
    }
    
    
}
