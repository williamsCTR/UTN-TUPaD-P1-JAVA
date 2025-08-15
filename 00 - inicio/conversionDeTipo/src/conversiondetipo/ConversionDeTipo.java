
package conversiondetipo;
import java.util.Scanner;
public class ConversionDeTipo {

    /**
     * @param args the command line arguments
     */
 /*
8. Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el
usuario.
b. Modifica el código para usar double en lugar de int y compara los
resultados.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        double div;
        
        System.out.print("Ingresar un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresar otro numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        div = num1 / (double)num2;
        
        System.out.println("El resultado de la division es: " + div);
    }

}
