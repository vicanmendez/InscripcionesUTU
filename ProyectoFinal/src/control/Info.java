package control;

import connectionBD.connectionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Info {

    private static final String[] headerAlumno = {"Nombres", "Apellidos","Localidad", "Dirección", "F.de Nacimiento", "Edad", "Telefono", "Celular", "C.I", "Nivel"};
    private static final String[] headerCurso = {"Nombre", "Nivel", "Descripción", "Estado"};
    private static final String[] headerAlumno_curso = {"Nombre Curso", "Nivel", "Nombre Alumno", "Apellido Alumno"};
    private static DefaultTableModel model, model1, model2;

    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public void loadTableStudent(JTable alumno) {

        con = connectionBD.getConnection();

        try {

            model = new DefaultTableModel(null, headerAlumno) {
                @Override
                public boolean isCellEditable(int data, int colum) {
                    return false;
                }
            };

            ps = con.prepareStatement("SELECT nombre, apellido, localidad, direccion, fnacimiento,edad, telefono,"
                    + "celular,ci,nivel FROM utu.alumno Order BY nombre,apellido");
            rs = ps.executeQuery();

            Object[] datos = new Object[10];

            while (rs.next()) {

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getObject(i + 1);
                }

                model.addRow(datos);
            }

            alumno.setModel(model);
            con.close();

        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public void loadTableCourse(JTable curso) {
        con = connectionBD.getConnection();

        try {

            model1 = new DefaultTableModel(null, headerCurso) {

                @Override
                public boolean isCellEditable(int data, int column) {
                    return false;
                }
            };

            ps = con.prepareStatement("SELECT nombre,nivel,descripcion,estado FROM utu.curso ORDER BY nombre,nivel");
            rs = ps.executeQuery();

            Object[] datos = new Object[4];

            while (rs.next()) {
                for (int i = 0; i < datos.length; i++) {

                    datos[i] = rs.getObject(i + 1);

                }
                model1.addRow(datos);
            }

            curso.setModel(model1);
            con.close();

        } catch (SQLException e) {
            System.out.print(e);
        }
    }
    
    public void loadTableStudentCourse (JTable general) {
         con = connectionBD.getConnection();

        try {

            model2 = new DefaultTableModel(null, headerAlumno_curso) {
                @Override
                public boolean isCellEditable(int data, int colum) {
                    return false;
                }
            };

            ps = con.prepareStatement("SELECT curso.nombre, curso.nivel, alumno.nombre, alumno.apellido FROM utu.curso INNER JOIN (utu.alumno INNER JOIN\n" +
                         "utu.alumno_curso ON alumno.idAlumno = alumno_curso.fk_Alumno) ON curso.idCurso = alumno_curso.fk_Curso\n" +
                         " ORDER BY curso.nombre, curso.nivel, alumno.nombre;");
            rs = ps.executeQuery();

            Object[] datos = new Object[4];

            while (rs.next()) {

                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getObject(i + 1);
                }

                model2.addRow(datos);
            }

            general.setModel(model2);
            con.close();

        } catch (SQLException e) {
            System.out.print(e);
        }
    }
}
