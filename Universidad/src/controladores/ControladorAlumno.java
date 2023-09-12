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
import modelo.Alumno;

public class ControladorAlumno {
    /*
    C
    R
    U
    D
    */
    static Connection con= Conexion.conectarse();
    static PreparedStatement ps = null;
    static ResultSet rs = null;
        
    public static void subirAlumno(Alumno alumno){
        
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
    
    
      
    public static int obtenerIdAlumnoPorDni(int dni) {
        
        String sql = "SELECT idAlumno FROM alumno WHERE dni = ?";
        int idAlumno = -1;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            rs = ps.executeQuery();

            if (rs.next()) {
                idAlumno = rs.getInt("idAlumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el ID del alumno: " + ex.getMessage());
            System.out.println("Error al encontrar alumno por DNI");
        } finally {
            
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
               
            }
        }

        return idAlumno;
    }
    
    public static void actualizarAlumno(Alumno a){
        
        String sql="UPDATE alumno SET dni=?,apellido=?,nombre=?,fechaDeNacimiento=?,estado=? WHERE idAlumno=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNacimiento()));
            ps.setInt(5, a.getEstado());
            ps.setInt(6, a.getIdAlumno());
            
            int f=ps.executeUpdate();
            
            
            
            if(f>0){
                JOptionPane.showMessageDialog(null, "Alumno Actualizado Correctamente");
                System.out.println("Filas Afectadas: "+f);
            }else{
                JOptionPane.showMessageDialog(null, "El Alumno no se ha Actualizado Correctamente");
                System.out.println("Filas Afectadas: "+f);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Agregar un alumno a la Base de Datos "+ex.getMessage());
            System.out.println("Error en en el Metodo crearAlumno, Clase ControladorAlumno.");
        }


    }
    
    
      public static void eliminarAlumno(int id) {
        
        try {
            String sql = "UPDATE alumno SET estado  = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if(fila==1) {
            JOptionPane.showMessageDialog(null, "Se ha eliminado el alumno con exito ");
        }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la eliminacion del alumno, intente de nuevo ");
        }
    }
      
    public static ArrayList listaDeAlumnosActivos(){
            ArrayList<Alumno> listaDeAlumnosActivos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            Alumno alumno = new Alumno();    
              alumno.setIdAlumno(    rs.getInt(1));
              alumno.setDni(rs.getInt(2));
              alumno.setApellido(rs.getString(3));
              alumno.setNombre(rs.getString(4));
              alumno.setFechaNacimiento(rs.getDate(5).toLocalDate());
              alumno.setEstado(rs.getInt(6));
                  
               listaDeAlumnosActivos.add(alumno);            
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar la Lista de Alumnos Activos "+ex.getMessage());
        }
          return listaDeAlumnosActivos;
    } 
    
    
}
