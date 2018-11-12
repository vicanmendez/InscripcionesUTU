
package control;

import connectionBD.connectionBD;
import form.UserManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class User {

    private String nombre;
    private String estado;

    private static Connection con;
    private static Statement st;
    private static ResultSet rs;
    private static PreparedStatement ps;

    private static final String[] header = {"Usuario", "Cargo", "Estado"};
    private static Object datos[];
    private DefaultTableModel dtm;

    public User(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public User() {}

    public void setNombre(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public User(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void estado(String estado) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }

    public DefaultTableModel llenarTablaUsuario() {
        con = connectionBD.getConnection();

        try {
            dtm = new DefaultTableModel(null, header) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            st = con.createStatement();
            rs = st.executeQuery("SELECT usuario, cargo, estado FROM utu.registro ORDER BY usuario");

            datos = new Object[3];

            while (rs.next()) {

                for (int i = 0; i < datos.length; i++) {

                    datos[i] = rs.getObject(i + 1);
                }
                dtm.addRow(datos);
            }

            con.close();

        } catch (SQLException e) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, e);
        }
        return dtm;
    }
    
    public int modificarDatos() {
        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("UPDATE utu.registro SET estado = ? WHERE usuario = '" + nombre + "'");

            if (!estado.equals("Selecciona...")) {
               
                ps.setString(1, estado);

                int rest = ps.executeUpdate();

                if (rest > 0) {

                    return 0;    
                }
            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  1;
    }
}
