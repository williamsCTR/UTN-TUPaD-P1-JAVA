
package nombreyedad;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;
public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
/*
4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad; 
        
        System.out.println("Ingresar nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresar edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("nombre: " + nombre + "\n edad: " + edad);
    }

}
