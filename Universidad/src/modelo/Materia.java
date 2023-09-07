package modelo;

public class Materia {
    //atributos
    private int idMateria;
    private String nombre;
    private  int anio;
    private int estado;
    
    //constructor

    public Materia() {
    }

    public Materia(String nombre, int anio, int estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int anio, int estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    //getters y setters

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Id de Materia: " + idMateria + ", Nombre: " + nombre + ", Año: " + anio + ", Estado: " + estado;
    }
    
    
    
    
}
