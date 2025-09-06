package pkg7_validaciondenota;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
/*
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
                Ejemplo de entrada/salida:
                Ingrese una nota (0-10): 15
                Error: Nota inválida. Ingrese una nota entre 0 y 10.
                Ingrese una nota (0-10): -2
                Error: Nota inválida. Ingrese una nota entre 0 y 10.
                Ingrese una nota (0-10): 8
                Nota guardada correctamente.

*/
        int nota;
        Scanner scan = new Scanner(System.in);
        
        do {            
            System.out.print("Ingrese una nota (0-10): ");
            nota = scan.nextInt();
            if (nota<0 || nota>10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota<0 || nota>10);
        System.out.println("Nota guardada correctamente.");
    }

}
