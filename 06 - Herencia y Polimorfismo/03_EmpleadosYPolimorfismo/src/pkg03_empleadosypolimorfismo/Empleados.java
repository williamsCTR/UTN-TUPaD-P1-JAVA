package pkg03_empleadosypolimorfismo;

public abstract class Empleados {

    private String nombre;

    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}
