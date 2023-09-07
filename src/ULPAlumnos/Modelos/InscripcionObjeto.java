/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ULPAlumnos.Modelos;

/**
 *
 * @author ramrromer
 */
public class InscripcionObjeto {
    private int idInscrito, nota, idAlumno, idMateria;

    public InscripcionObjeto(int idInscrito, int nota, int idAlumno, int idMateria){
        this.idInscrito = idInscrito;
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }
    
    public InscripcionObjeto(int nota, int idAlumno, int idMateria){
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }
    
    public int getIdInscrito() {
        return idInscrito;
    }

    public void setIdInscrito(int idInscrito) {
        this.idInscrito = idInscrito;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idInscrito;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InscripcionObjeto other = (InscripcionObjeto) obj;
        return this.idInscrito == other.idInscrito;
    }
    
}
