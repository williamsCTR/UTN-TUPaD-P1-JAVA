
package pkg2_registrodemascotas;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2. Registro de Mascotas
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
        verificar los cambios.
        */
        
        Mascota mascota = new Mascota();
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
    }

}
