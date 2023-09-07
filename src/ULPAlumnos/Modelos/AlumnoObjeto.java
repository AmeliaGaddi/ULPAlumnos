package ULPAlumnos.Modelos;

import java.util.ArrayList;

public class AlumnoObjeto implements Comparable<AlumnoObjeto> {
    public static ArrayList<AlumnoObjeto> listaAlumnos = new ArrayList<>();
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
      public int compareTo(AlumnoObjeto a){
        if(idAlumno == a.idAlumno){
          return 0;
        }else if(idAlumno > a.idAlumno){
          return 1;
        }else{
          return -1;
        }
      }
    
    
}
