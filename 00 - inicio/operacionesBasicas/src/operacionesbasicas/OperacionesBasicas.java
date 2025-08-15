package operacionesbasicas;
import java.util.Scanner;
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    
/*
5. Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,suma,resta,multi,divi;
        
        System.out.println("Ingresar el primer numero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresar el segundo numero:");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        divi = num1 / num2;
        multi = num1 * num2;
        
        System.out.println("suma = " + suma + " resta = " + resta + " division= " + divi + " multiplicacion = " + multi);
        
    }

}
