package control;

import connectionBD.connectionBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Course {

    private static Connection con;
    private static PreparedStatement ps;
    private static Statement st;
    private static ResultSet rs;

    private String nombre, nivel, descripcion, estado;
    private int ID;

    private String[] header = {"Nombre", "Nivel", "Estado"};
    private DefaultTableModel tbCourse;

    public Course(String nombre, String nivel, String descripcion) {

        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public Course() {

    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
     public int saveCourse() {
        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("INSERT INTO utu.curso (nombre,nivel,descripcion, estado) VALUES (?,?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, nivel);
            ps.setString(3, descripcion);
            ps.setString(4, "Disponible");

            int rest = ps.executeUpdate();

            if (rest > 0) {

                return 0;
            }

            con.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {

            System.out.println(e);
        }
        return 1;
    }

    public int edit(String ID, String nombre, String nivel, String descripcion, String estado) {
        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("UPDATE utu.curso SET nombre = ?, nivel = ?, descripcion = ?, estado = ? WHERE idCurso = '" + ID + "'");

            ps.setString(1, nombre);
            ps.setString(2, nivel);
            ps.setString(3, descripcion);
            ps.setString(4, estado);

            int rest = ps.executeUpdate();

            if (rest > 0) {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }

    public void loadTable(JTable tb) {
        con = connectionBD.getConnection();

        try {

            tbCourse = new DefaultTableModel(null, header) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            Object[] datos = new Object[3];
            st = con.createStatement();
            rs = st.executeQuery("SELECT DISTINCT nombre, nivel, estado FROM utu.curso");

            while (rs.next()) {

                for (int i = 0; i < datos.length; i++) {

                    datos[i] = rs.getObject(i + 1);
                }
                tbCourse.addRow(datos);
            }
            tb.setModel(tbCourse);
            con.close();

        } catch (SQLException e) {

            System.out.println(e);

        }
    }

    public void getData(String ID) {
        con = connectionBD.getConnection();

        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM utu.curso WHERE idCurso = '" + ID + "'");

            while (rs.next()) {
                this.nombre = rs.getString("nombre");
                this.nivel = rs.getString("nivel");
                this.descripcion = rs.getString("descripcion");
                estado = rs.getString("estado");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String getID(String nombre, String nivel) {
        con = connectionBD.getConnection();
        String dato = null;

        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT idCurso FROM utu.curso WHERE nombre = '" + nombre + "' and nivel = '" + nivel + "'");

            while (rs.next()) {
                dato = rs.getString("idCurso");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return dato;
    }
    
    public boolean repeatCourse() {
        con = connectionBD.getConnection();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre, nivel FROM utu.curso WHERE nombre = '" + this.nombre + "' and nivel = '" + this.nivel+ "'");
            
            while(rs.next()) {
                if(nombre.equalsIgnoreCase(rs.getString("nombre")) && nivel.equals(rs.getString("nivel"))) {
                    return true;
                }
            }
            con.close();
        } catch (SQLException e) {
        }
        return false;
    }
}
