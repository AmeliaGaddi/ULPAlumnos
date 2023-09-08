
package ULPAlumnos;

import ULPAlumnos.Modelos.LogicaDB;
import ULPAlumnos.Vistas.busquedaPorNota;
import ULPAlumnos.Vistas.agregarInscripcion;
import ULPAlumnos.Modelos.AlumnoObjeto;
import java.sql.*;
import javax.swing.JOptionPane;

public class ULPAlumnos {
    private static Miconexion co;
    public static Connection con;
    
   
    public static void main(String[] args) {
        co = new Miconexion("universidadULP");
        con = co.conectar();
        System.out.println("OK");
        
        boolean dbok = false;
        ResultSet respuesta = null;
        try{
            respuesta = LogicaDB.ejecutarConsulta("SELECT * FROM alumno");
            dbok = respuesta!=null? true : false;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        if(dbok){
            AlumnoObjeto alumnoNuevo = new AlumnoObjeto();
           try{
               while(respuesta.next()){
                   alumnoNuevo = new AlumnoObjeto(
                               respuesta.getInt("idAlumno"),
                               respuesta.getString("dni"),
                               respuesta.getString("apellido"),
                               respuesta.getString("nombre"),
                               respuesta.getString("fechanacimiento"),
                               String.valueOf(respuesta.getInt("Estado"))
                           );
               AlumnoObjeto.listaAlumnos.add(alumnoNuevo);}
//               modelo.addRow(new Object[]{
//                   resultado.getInt("dni"),
//                   resultado.getString("apellido"),
//                   resultado.getString("nombre"),
//                   resultado.getString("materia.nombre"),
//                   resultado.getInt("nota")
//               });
           }catch(Exception e){
               System.out.println("Error: "+e.getMessage());
           }
        }
            System.out.println("ID DNI Apellido Nombre   Fecha Nac Estado");
        for(AlumnoObjeto a : AlumnoObjeto.listaAlumnos){
            System.out.println("["+a.getIdAlumno()+"] "+a.getDni()+"  "+a.getApellido()+"  "+a.getNombre()+"  "+a.getFechaNac()+"  "+a.getEstado());
        }
        busquedaPorNota busqueda = new busquedaPorNota();
        busqueda.setVisible(true);
        agregarInscripcion ventana = new agregarInscripcion();
        ventana.setVisible(true);
        
    }
    
    
}
