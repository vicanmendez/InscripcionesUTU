package control;

import connectionBD.connectionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

    private String user = null, password = null;
    

    private static Statement st;
    private static Connection con;
    private static ResultSet rs;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
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

    public int loginIN() {
        String encriptar = Encriptar.Encriptar(password);
        
        con = connectionBD.getConnection();

        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT cargo, estado FROM utu.registro WHERE usuario = '" + user + "' and contrasenia = '" + password +"'");

            while (rs.next()) {

                if (rs.getObject("cargo").equals("Dirección") && rs.getObject("estado").equals("No bloqueado")) {

                    return 0;

                } else if (rs.getObject("cargo").equals("Adscripto") && rs.getObject("estado").equals("No bloqueado")) {

                    return 2;

                } else if (rs.getObject("cargo").equals("Dirección")  || rs.getObject("cargo").equals("Adscripto") && rs.getObject("estado").equals("Bloqueado")) {

                    return 3;
                }
            }

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }
}
