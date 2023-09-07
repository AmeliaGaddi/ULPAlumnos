package ULPAlumnos.Modelos;

import java.util.Objects;
import java.util.TreeSet;

public class MateriaObjeto implements Comparable<MateriaObjeto>{
    public static TreeSet<MateriaObjeto> listaMaterias = new TreeSet<>();
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
      public int compareTo(MateriaObjeto m){
        if(idMateria == m.idMateria){
          return 0;
        }else if(idMateria > m.idMateria){
          return 1;
        }else{
          return -1;
        }
      }    
    
}
