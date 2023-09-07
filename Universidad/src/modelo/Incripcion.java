package modelo;

public class Incripcion {
//atributos
 private int idInscripto;   
 private int nota;
 private Alumno alumno;
 private Materia materia;
 
 //constructor

    public Incripcion() {
    }

    public Incripcion(int nota, Alumno alumno, Materia materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Incripcion(int idInscripto, int nota, Alumno alumno, Materia materia) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }
 
    
    //getters y setters

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Id de Inscripcion: " + idInscripto + ", Nota: " + nota + ", Alumno " + alumno + ", Materia=" + materia;
    }
    
    
 
 
}
