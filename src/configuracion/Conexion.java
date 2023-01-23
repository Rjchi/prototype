package configuracion;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    // para la conexion se utilizo el driver jdbc de mysql
    Connection connect;
    // ESTAS SON LAS CREDENCIALES:
    String usuario = "root", password = "root", url = "jdbc:mysql://localhost:3307/mydb";
    // METODO PARA CONECTAR LA BASE DE DATOS
    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, usuario, password);
            //nulo, texto, titulo de la ventana, tipo de mensaje (mensaje de informacion)
            //JOptionPane.showMessageDialog(null, "Conectado", "Conexion a Base de datos", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No conectado error: " + e);
        }
        return connect;
    }
}
