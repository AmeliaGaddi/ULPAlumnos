package ULPAlumnos.Modelos;

import java.util.Objects;

public class AlumnoObjeto {
    private int idAlumno;
    private String dni, apellido, nombre, fechaNac, estado;

    public AlumnoObjeto(String dni, String apellido, String nombre, String fechaNac, String estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public AlumnoObjeto(int idAlumno, String dni, String apellido, String nombre, String fechaNac, String estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idAlumno;
        hash = 17 * hash + Objects.hashCode(this.dni);
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
        final AlumnoObjeto other = (AlumnoObjeto) obj;
        if (this.idAlumno != other.idAlumno) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }
    
    
}
