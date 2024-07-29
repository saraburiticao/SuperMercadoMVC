import controlador.EmpleadoController;
import modelo.Empleado;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        List<Empleado> empleados = controller.obtenerEmpleados(); // Actualizado a obtenerEmpleados
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}

