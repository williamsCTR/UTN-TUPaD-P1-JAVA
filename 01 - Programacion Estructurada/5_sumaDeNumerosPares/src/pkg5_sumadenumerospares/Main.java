package pkg5_sumadenumerospares;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
/*
5. Suma de Números Pares (while).
        
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
    
        Ejemplo de entrada/salida:
                                Ingrese un número (0 para terminar): 4
                                Ingrese un número (0 para terminar): 7
                                Ingrese un número (0 para terminar): 2
                                Ingrese un número (0 para terminar): 0
                                La suma de los números pares es: 6
*/
        long num, acumulador = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextLong();

            if (num % 2 == 0) {
                acumulador += num;
            }
        } while (num != 0);

        System.out.println("La suma de los números pares es: " + acumulador);
    }
}
