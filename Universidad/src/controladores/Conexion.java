
package controladores;


import javax.swing.JOptionPane;
import java.sql.*;

public class Conexion {
    
 private static final String URL="jdbc:mariadb://localhost/proyectouniversidad51";
    private static final String USER="root";
    private static final String PASS="";
    
    private static Conexion conn=null;
    
    private Conexion(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error al importar driver");
        }
    }
    
    public static Connection conectarse(){
        Connection c =null;
        if(conn==null){
            conn= new Conexion();
        }
        try {
            c =  DriverManager.getConnection(URL,USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion");
        }
        return c;
    }}

