
package ULPAlumnos;

import ULPAlumnos.Vistas.busquedaPorNota;
import ULPAlumnos.Vistas.agregarInscripcion;
import java.sql.*;
import javax.swing.JOptionPane;

public class ULPAlumnos {
    public static Miconexion co;
    public static Connection con;
   
    public static void main(String[] args) {
        co = new Miconexion("universidadULP");
        con = co.conectar();
        System.out.println("OK");
        
        busquedaPorNota busqueda = new busquedaPorNota();
        busqueda.setVisible(true);
//        agregarInscripcion ventana = new agregarInscripcion();
//        ventana.setVisible(true);
        
    }
    
    
    public static ResultSet ejecutarConsulta(String query){
        ResultSet resultado = null;
        try{
            PreparedStatement ps=con.prepareStatement(query);
            resultado=ps.executeQuery();
        }catch(Exception e){
            System.out.println("ocurrio un error "+ e.getMessage());
        }
      return resultado;
    }
    public static int ejecutarUpdate(String query){
        int resultado=-999;
        try{
            PreparedStatement ps=con.prepareStatement(query);
            resultado=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("ocurrio un error: "+ e.getMessage());
        }
      return resultado;
    }
    
}
