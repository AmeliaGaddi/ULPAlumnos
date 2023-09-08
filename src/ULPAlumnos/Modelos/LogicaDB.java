/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ULPAlumnos.Modelos;

import static ULPAlumnos.ULPAlumnos.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ramrromer
 */
public class LogicaDB {
    
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
        int resultado=-1618;
        try{
            PreparedStatement ps=con.prepareStatement(query);
            resultado=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("ocurrio un error: "+ e.getMessage());
        }
      return resultado;
    }
}
