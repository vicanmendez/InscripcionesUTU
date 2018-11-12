package control;

import connectionBD.connectionBD;
import form.PanelStudent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Student {

    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Statement st;

    private static DefaultComboBoxModel dcmb;
    private static DefaultComboBoxModel dcmb2;

    private static final String[] headerAlumno = {"Nombres", "Apellidos", "C.I"};
    private static DefaultTableModel dtm;
    private static Object[] datos;

    private String nombre, apellido, localidad, direccion, fechadenacimiento, telefono, celular, ci, nivel, curso;
    private int edad;

    public Student(String nombre, String apellido, String localidad, String direccion, String fechadenacimiento, int edad, String telefono,
            String celular, String ci, String nivel) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.direccion = direccion;
        this.fechadenacimiento = fechadenacimiento;
        this.edad = edad;
        this.telefono = telefono;
        this.celular = celular;
        this.ci = ci;
        this.nivel = nivel;
    }

    public Student(String curso) {
        this.curso = curso;
    }

    public Student() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int save() {

        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("INSERT INTO utu.alumno (nombre, apellido,localidad,direccion,"
                    + " fnacimiento,edad, telefono,celular,ci, nivel) VALUES (?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, localidad);
            ps.setString(4, direccion);
            ps.setString(5, fechadenacimiento);
            ps.setInt(6, edad);
            ps.setString(7, telefono);
            ps.setString(8, celular);
            ps.setString(9, ci);
            ps.setString(10, nivel);

            int rest = ps.executeUpdate();

            if (rest > 0) {

                return 0;

            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }

    public int edit(String ID, String nombre, String apellido, String localidad, String direccion, String fechadenacimiento, int edad, String telefono, String celular, String ci, String nivel) {

        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("UPDATE utu.alumno SET nombre = ?, apellido = ?, localidad = ?, direccion = ?, fnacimiento = ?, edad = ?,"
                    + " telefono = ?, celular = ?, ci = ?, nivel = ? WHERE idAlumno = '" + ID + "'");

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, localidad);
            ps.setString(4, direccion);
            ps.setString(5, fechadenacimiento);
            ps.setInt(6, edad);
            ps.setString(7, telefono);
            ps.setString(8, celular);
            ps.setString(9, ci);
            ps.setString(10, nivel);

            int rest = ps.executeUpdate();

            if (rest > 0) {

                return 0;

            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }

    public DefaultTableModel loadTable() {
        con = connectionBD.getConnection();

        try {

            dtm = new DefaultTableModel(null, headerAlumno) {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };

            datos = new Object[3];
            st = con.createStatement();
            rs = st.executeQuery("SELECT nombre, apellido, ci FROM utu.Alumno ORDER BY nombre");

            while (rs.next()) {

                for (int i = 0; i < datos.length; i++) {

                    datos[i] = rs.getObject(i + 1);
                }
                dtm.addRow(datos);
            }

            con.close();

        } catch (SQLException e) {

            System.out.println(e);

        }
        return dtm;
    }

    public DefaultComboBoxModel loadCmb() {

        con = connectionBD.getConnection();

        try {
            dcmb = new DefaultComboBoxModel();

            st = con.createStatement();
            rs = st.executeQuery("SELECT DISTINCT nombre, estado FROM curso");

            dcmb.addElement("Selecciona...");

            while (rs.next()) {
                if (!rs.getObject("estado").equals("No disponible")) {
                    dcmb.addElement(rs.getObject("nombre"));
                }

            }
            con.close();

        } catch (SQLException e) {
            System.out.print(e);
        }
        return dcmb;

    }

    public DefaultComboBoxModel loadCmb2() {
        con = connectionBD.getConnection();
        dcmb2 = new DefaultComboBoxModel();
        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT DISTINCT nivel, estado FROM curso where nombre= '" + curso + "'");

            dcmb2.removeAllElements();
            dcmb2.addElement("Selecciona...");
            while (rs.next()) {
                if (!rs.getObject("estado").equals("No disponible")) {
                    dcmb2.addElement(rs.getObject("nivel"));
                }
            }

            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(PanelStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dcmb2;
    }

    public boolean getData(String dato) {

        con = connectionBD.getConnection();

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM utu.alumno where idAlumno = '" + dato + "'");

            if (rs.next()) {
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                localidad = rs.getString("localidad");
                direccion = rs.getString("direccion");
                fechadenacimiento = rs.getString("fnacimiento");
                edad = rs.getInt("edad");
                telefono = rs.getString("telefono");
                celular = rs.getString("celular");
                ci = rs.getString("ci");
                nivel = rs.getString("nivel");
                return true;
            }

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return false;
    }

    public String getID(String nombre) {
        String dato = null;

        con = connectionBD.getConnection();

        try {

            st = con.createStatement();
            rs = st.executeQuery("SELECT idAlumno FROM utu.alumno WHERE nombre = '" + nombre + "'");

            if (rs.next()) {
                dato = rs.getString("idAlumno");
            }

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return dato;
    }

    public boolean repeatStudent() {

        con = connectionBD.getConnection();

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT ci FROM utu.alumno WHERE ci = '" + this.ci + "'");

            while (rs.next()) {
                if (ci.equals(rs.getString("ci"))) {
                    return true;
                }
            }
        } catch (SQLException e) {
        }

        return false;
    }
}
