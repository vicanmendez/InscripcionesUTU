package course_student;

import connectionBD.connectionBD;
import control.Course;
import control.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Course_Student {

    private static Course cs;
    private static Student ste;

    private static PreparedStatement ps;
    private static Statement st;
    private static Connection con;
    private static ResultSet rt;

    int idCurso, idAlumno;
    String nombreCurso, nivel, nombreAlumno, idCursoString, ID;

    public Course_Student(String ID) {

        this.ID = ID;
        cs = new Course();
        ste = new Student();
    }

    public Course_Student() {
        cs = new Course();
        ste = new Student();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void insertarCourseStudent(String nombreCurso, String nivel, String nombreAlumno) {
        idCurso = Integer.valueOf(cs.getID(nombreCurso, nivel));
        idAlumno = Integer.valueOf(ste.getID(nombreAlumno));

        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("INSERT INTO utu.alumno_curso (fk_Curso, fk_Alumno) VALUES (?,?)");

            ps.setInt(1, idCurso);
            ps.setInt(2, idAlumno);

            ps.executeUpdate();

            con.close();

        } catch (SQLException e) {
             System.out.println(e);
        }
    }

    public void updateCourseStudent(String nombreCurso, String nivel, String nombreAlumno) {
        idCurso = Integer.valueOf(cs.getID(nombreCurso, nivel));
        idAlumno = Integer.valueOf(ste.getID(nombreAlumno));

        con = connectionBD.getConnection();

        try {
            ps = con.prepareStatement("UPDATE utu.alumno_curso SET fk_Curso = ? WHERE fk_Alumno ='" + idAlumno + "'");

            ps.setInt(1, idCurso);
            ps.executeUpdate();

            con.close();

            } catch (SQLException e) {
                System.out.println(e);
        }
    }

    public String getID() {

        con = connectionBD.getConnection();

        try {
            st = con.createStatement();
            rt = st.executeQuery("SELECT fk_Curso FROM utu.alumno_curso WHERE fk_Alumno ='" + ID + "';");

            while (rt.next()) {

                idCurso = rt.getInt("fk_Curso");
            }

            idCursoString = String.valueOf(idCurso);

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return idCursoString;
    }

    public void cargarDatos() {

        cs.getData(getID());

        nombreCurso = cs.getNombre();
        nivel = cs.getNivel();
        
    }
}
