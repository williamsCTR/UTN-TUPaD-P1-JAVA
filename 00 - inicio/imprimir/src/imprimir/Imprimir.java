
package imprimir;
import java.util.Scanner;
public class Imprimir {

    /**
     * @param args the command line arguments
     */
    
/*
6. Escribe un programa que muestre el siguiente mensaje en consola:
Nombre: Juan Pérez
Edad: 30 años
Dirección: "Calle Falsa 123"
Usa caracteres de escape (\n, \") en System.out.println().
*/
    
    public static void main(String[] args) {
        String nombre = "Juan Perez";
        int edad = 30;
        String direccion = "Calle Falsa 123";
        
        System.out.println("Nombre: " + nombre + "\n Edad: " + edad + " años \n Direccion: \"" + direccion + "\"");
    }

}
