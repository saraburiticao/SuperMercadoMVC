package controlador;

import modelo.Empleado;
import modelo.EmpleadoDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoController() {
        // Configurar la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/supermercado_db";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            this.empleadoDAO = new EmpleadoDAO(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Empleado> obtenerEmpleados() {
        return empleadoDAO.obtenerEmpleados();
    }

    public List<Empleado> obtenerEmpleadosPorCargo(String cargo) {
        return empleadoDAO.getEmpleadosPorCargo(cargo);
    }
}

