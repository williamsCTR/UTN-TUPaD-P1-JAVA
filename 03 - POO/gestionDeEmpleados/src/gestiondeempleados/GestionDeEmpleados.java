
package gestiondeempleados;

public class GestionDeEmpleados {

    public static void main(String[] args) {
        Empleado empl1 = new Empleado("Williams Cantero", "Programador");
        Empleado empl2 = new Empleado(1, "Martin Palavecino", "QA", 100000);
        
        System.out.println(empl1.toString());
        System.out.println(empl2.toString());
        System.out.println("--------------");
        
        empl1.actualizarSalario(100.0);
        empl2.actualizarSalario(100);
        System.out.println(empl1.toString());
        System.out.println(empl2.toString());
        System.out.println("--------------");
        
        Empleado.getMostrarTotalEmpleados();
        
        
    }

}
