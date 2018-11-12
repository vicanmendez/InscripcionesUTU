
package connectionBD;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connectionBD {
    
    
    private static  String URL = "jdbc:mysql://localhost:3306/utu?useSSL=false";
    private static  String USER = "root";
    private static String PASS = "";
     
    public static Connection getConnection() {
        /* LEVANTAR DATOS DE FICHERO PROPERTIES */ 
        Properties prop = new Properties();
		InputStream is = null;
		
		try {
                        System.out.println("Directorio del proyecto: ");
                        System.out.println(System.getProperty("user.dir"));
			is = new FileInputStream(System.getProperty("user.dir")+"/BDInscripciones.config");
			prop.load(is);
		} catch(IOException e) {
			System.out.println(e.toString());
                        JOptionPane.showMessageDialog(null, "Error al abrir el archivo de configuración ");
		}
 
		// Acceder a las propiedades por su nombre
		System.out.println("Propiedades por nombre:");
		System.out.println("-----------------------");
		System.out.println(prop.getProperty("servidor.direccion"));
                System.out.println(prop.getProperty("servidor.BD"));
                //Si obtenemos configuración desde Properties, cambiamos la configuración
                URL = "jdbc:mysql://"+prop.getProperty("servidor.direccion")+":3306/"+prop.getProperty("servidor.BD")+"?useSSL=false";
		System.out.println(prop.getProperty("servidor.password"));
                PASS = ""+prop.getProperty("servidor.password");
		System.out.println(prop.getProperty("servidor.usuario"));
                USER = prop.getProperty("servidor.usuario");
		
		// Recorrer todas sin conocer los nombres de las propiedades
		System.out.println("Recorrer todas las propiedades:");
		System.out.println("-------------------------------");
 
		for (Enumeration e = prop.keys(); e.hasMoreElements() ; ) {
			// Obtenemos el objeto
			Object obj = e.nextElement();
			System.out.println(obj + ": " + prop.getProperty(obj.toString()));
		}
	
        //Fin de properties
        
        //Iniciamos la conexion
        Connection con = null;
          try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(connectionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en la conexión con la Base de Datos: "+URL+" \n Usuario: "+USER+" \n Clave:"+PASS);
        }
          return con;
    }
}
