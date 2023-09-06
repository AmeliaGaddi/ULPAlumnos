package ULPAlumnos;

import org.mariadb.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Miconexion {
    
    private String driver, url, user, pass, bd;
    private Connection con;
            
            
    public Miconexion(String bd){
        this.driver="org.mariadb.jdbc.Driver";
        this.url="jdbc:mariadb://127.0.0.1:3307/";
        this.user="root";
        this.pass="";
        this.bd=bd;
    }
            
    
    public Connection conectar(){
        try{    
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url+bd,user,pass);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!" + ex.getMessage());
        }
        System.out.println("Ok conectado");    
        return con;
    }
        
}
