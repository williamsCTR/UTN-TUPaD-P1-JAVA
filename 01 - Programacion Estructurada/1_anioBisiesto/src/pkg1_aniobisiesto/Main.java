package pkg1_aniobisiesto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*1. Verificación de Año Bisiesto.
    Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
        Ejemplo de entrada/salida:
        Ingrese un año: 2024
        El año 2024 es bisiesto.
        Ingrese un año: 1900
        El año 1900 no es bisiesto.
*/
    int anio;
    Scanner scan = new Scanner(System.in);
    System.out.print("Ingresar año:");
    anio = scan.nextInt();
    
    if (anio >=0) {
        System.out.println(esBisiesto(anio));
    }else{
        System.out.println("Ingresar año valido!"); }
    }

    public static String esBisiesto(int x){
    if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
        return "El año: " + x + " es bisiesto!!";
    } else {
        return "El año: " + x + " NO es bisiesto!!";
    }
    }
}
