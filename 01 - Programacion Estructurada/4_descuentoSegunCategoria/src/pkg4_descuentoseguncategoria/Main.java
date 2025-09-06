package pkg4_descuentoseguncategoria;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
/*
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
                        Luego, aplique los siguientes descuentos:
                        Categoría A: 10% de descuento
                        Categoría B: 15% de descuento
                        Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el precio final
        Ejemplo de entrada/salida:
                Ingrese el precio del producto: 1000
                Ingrese la categoría del producto (A, B o C): B
                Descuento aplicado: 15%
                Precio final: 850.0
*/
        Scanner scan = new Scanner(System.in);
        int precio;
        char categoria;
     
        System.out.print("Ingresar precio del producto:");
        precio = scan.nextInt();
        System.out.println("Ingresar categoria: A , B o C");
        categoria = scan.next().charAt(0);
        System.out.println(descuento(precio, categoria));
    }
public static String descuento(int x,char y){
    if (y == 'a' || y == 'A') {
        return "Aplicando descuento del 10% \n Precio final: " + (x-(x*0.1)); 
    }else if(y == 'b' || y == 'B'){
        return "Aplicando descuento del 15% \n Precio final: " + (x-(x*0.15));
    }
    return "Aplicando descuento del 20% \n Precio final: " + (x-(x*0.2));
}
}
