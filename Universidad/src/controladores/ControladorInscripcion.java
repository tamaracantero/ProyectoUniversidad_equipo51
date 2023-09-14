
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
    
    //	idInscripto	nota	idAlumno	idMateria
    
    
    
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

//Hecho Por Brian,Pereira( algo salió ):)
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
        }
        

       


    
    
