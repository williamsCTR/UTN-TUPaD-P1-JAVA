package pkg03_empleadosypolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Empleados> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 80000));
        empleados.add(new EmpleadoTemporal("Juan", 120, 800));
        empleados.add(new EmpleadoPlanta("María", 60000));

        for (Empleados e : empleados) {
            System.out.printf("Empleado: %s - Sueldo: %.2f - Tipo: ",
                    e.getNombre(), e.calcularSueldo());
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Temporal");
            } else {
                System.out.println("Desconocido");
            }
        }

    }
}
