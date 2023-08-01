
package datos;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conversacion2 implements conversacion {

    conexion instanciaMySQL = conexion.getInstance();

    @Override
    public void registrarConversacionA(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(cliente) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public void registrarConversacionB(String mensaje) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(servidor) values(?)");

            consulta.setString(1, mensaje);
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

}
