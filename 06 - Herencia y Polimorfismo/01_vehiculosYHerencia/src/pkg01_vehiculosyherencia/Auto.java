package pkg01_vehiculosyherencia;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        // sobrescribimos para agregar la cantidad de puertas
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
    }
}
