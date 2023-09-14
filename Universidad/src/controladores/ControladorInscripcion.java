
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
import modelo.Alumno;
import modelo.Incripcion;
import modelo.Materia;

public class ControladorInscripcion {
        /*
    C
    R
    U
    D
     */
    static Connection con = Conexion.conectarse();
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    
    
    
    
    /**HECHO POR JUAN LASPIUR*/
    public static void eliminarInscripcion(int idAlumno,int idMateria){
       String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
           int num = ps.executeUpdate();
           if(num == 1){
            JOptionPane.showMessageDialog(null, "Inscripcion eliminada exitosamente de la Base de Datos");
           }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al eliminar Inscripcion por idAlumno y idMateria" + ex.getMessage());
            System.out.println("ERROR METODO eliminarInscripcion() CLASE ControladorInscripcion");
        }
    }

/**Hecho Por Brian,Pereira( algo salió ):) */
    public static void actualizarInscripcion(int idInscripto, int nota,String Alumno, String materia) {
        String sql = "UPDATE Inscripciones SET Nota = ?,alumno = ?, Materia = ? WHERE IDInscripto = ?";
        
        try   (Connection con = Conexion.conectarse();
             PreparedStatement ps=con.prepareStatement(sql)){
            ps.setInt(1, nota);
            ps.setString(1, Alumno);
            ps.setString(2, materia);
            ps.setInt(3, idInscripto);

            int filasActualizadas = ps.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Inscripción actualizada con éxito.");
            } else {
                System.out.println("No se encontró la inscripción con IDInscripcion " + idInscripto);
            }
        
        } catch (SQLException e) {
            e.printStackTrace();
        }}
    
     
    /**HECHO POR ARIEL LAZARTE*/
    public static void subirInscripcion(Incripcion insc) {
        double nota = insc.getNota();
        int idAlumno = insc.getAlumno().getIdAlumno();
        int idMateria = insc.getMateria().getIdMateria();
        
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?) ";
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                insc.setIdInscripto(rs.getInt(1));
                
            }
            
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error al subir la Inscripcion por nota, idAlumno, idMateria" + ex.getMessage());
            System.out.println("ERROR METODO subirInscripcion()");
    }
    
}
    //	idInscripto	nota	idAlumno	idMateria
    /**HECHO POR JUAN LASPIUR*/
 public ArrayList obtenerInscripciones(){
          ArrayList<Incripcion> listaInscripciones =  new ArrayList<>();
        try {
            String sql = "SELECT * FROM inscripcion";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            int idInscripto = rs.getInt(1);
            double nota =rs.getDouble(2);
            Alumno alum = ControladorAlumno.obtenerAlumnoporid(rs.getInt(3));
            Materia mate = ControladorMateria.obtenerMateriaPorId(rs.getInt(4));
            
            Incripcion in = new Incripcion(idInscripto, idInscripto, alum, mate);
            
            listaInscripciones.add(in);
            }
            
         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener lista de incripciones "+ex.getMessage());
            System.out.println("Error metodo obtenerInscripciones() Clase ControladorIncripcion");
        }
           return listaInscripciones;
 }   
    
    
    
    
}
        

       


    
    

