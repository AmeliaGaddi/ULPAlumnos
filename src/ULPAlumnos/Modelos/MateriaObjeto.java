package ULPAlumnos.Modelos;

import java.util.Objects;

public class MateriaObjeto {
    private int idMateria;
    private String nombre, anio, estado;

    public MateriaObjeto(int idMateria, String nombre, String anio, String estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public MateriaObjeto(String nombre, String anio, String estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }
    
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idMateria;
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
        final MateriaObjeto other = (MateriaObjeto) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
