
package gestiondeempleados;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        while (id<= 0 || id <= totalEmpleados) {            
            id++;
        }
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 10000;
        totalEmpleados++;
        id = totalEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
    
    public void actualizarSalario(int monto){
        salario +=monto;
    }
    
    public void actualizarSalario(double porcentaje){
        salario = salario + ((porcentaje*salario)/100);
    }
    
    
    @Override
    public String toString() {
        return "Empleado: " + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario ;
    }
    
    public static void getMostrarTotalEmpleados(){
        System.out.println(totalEmpleados);
    }
    
}
