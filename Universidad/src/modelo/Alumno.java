package modelo;
import java.time.LocalDate;

public class Alumno {
    //atributo
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int estado;
    
    //constructor

    public Alumno() {
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, int estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNacimiento, int estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    
    //getters y setters

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id de Alumno: " + idAlumno + ", D.N.I: " + dni + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", Estado: " + estado;
    }
    
    
    
    
    
    
}
