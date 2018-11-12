package control;

import connectionBD.connectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import windows.Signin;

public class Registro {

    private static PreparedStatement ps;
    private static Statement st;
    private static ResultSet rt;
    private static Connection con;

    private String user, password, conPass, cargo, pregunta, respuesta;
    private static DefaultComboBoxModel cmb;
    

    public Registro(String user, String password, String conPass, String cargo, String pregunta, String respuesta) {
        this.user = user;
        this.password = password;
        this.conPass = conPass;
        this.cargo = cargo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    
    public Registro(String user){
        this.user = user;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConPass() {
        return conPass;
    }

    public void setConPass(String conPass) {
        this.conPass = conPass;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    
    public int saveRegistro() {

        String encriptar = Encriptar.Encriptar(password);
        
        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("INSERT INTO utu.registro (usuario,contrasenia,cargo, pregunta, respuesta, estado) values (?,?,?,?,?,?)");

            if (password.equals(conPass) && !user.equals("Usuario") && !password.equals("Password") && !conPass.equals("Password")) {
                ps.setString(1, user);
                ps.setString(2, password);
                ps.setString(3, cargo);
                ps.setString(4, pregunta);
                ps.setString(5, respuesta);
                ps.setString(6, "No bloqueado");

                int rest = ps.executeUpdate();

                if (rest > 0 && !cargo.equals("Selecciona...")) {
                    return 0;
                } else {
                    return 1;
                }
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
    
    public boolean repeatUser() {
        
        con = connectionBD.getConnection();
        
        try {
            
            st = con.createStatement();
            rt = st.executeQuery("SELECT usuario FROM utu.registro WHERE usuario ='" + this.user + "'");
            
           while(rt.next()) {
               
               if(user.equalsIgnoreCase(rt.getString("usuario"))) {
                
                return true;
            }
           }
            
            con.close();
            
        } catch (SQLException e) {
        }   
        return false;
    }  
    
    public int changePass(String user, String password, String pregunta, String respuesta) {
        
        String newPass = Encriptar.Encriptar(password);
        
        con = connectionBD.getConnection();
        
        try {
            ps = con.prepareStatement("UPDATE utu.registro SET contrasenia = ? WHERE usuario = '" + user + "' and pregunta ='" + pregunta + "' and respuesta = '" + respuesta + "'");
            
            ps.setString(1, newPass);
            
            int resultado = ps.executeUpdate();
            
            if(resultado > 0){
                return 0;
            }
        } catch (SQLException e) {
            
        }
        return 1;
    }
}
