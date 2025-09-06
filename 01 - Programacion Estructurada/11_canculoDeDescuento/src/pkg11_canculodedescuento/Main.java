
package pkg11_canculodedescuento;
import java.util.Scanner;
public class Main {
final static Double DESCUENTO = 0.10;
    public static void main(String[] args) {
/*
11. Cálculo de descuento especial usando variable global.
    Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
    método calcularDescuentoEspecial(double precio) que use la variable global para
    calcular el descuento especial del 10%.
        
    Dentro del método, declara una variable local descuentoAplicado, almacena
    el valor del descuento y muestra el precio final con descuento.
        Ejemplo de entrada/salida:
                                    Ingrese el precio del producto: 200
                                    El descuento especial aplicado es: 20.0
                                    El precio final con descuento es: 180.0

*/      
        Double precioProducto;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: $");
        precioProducto = scan.nextDouble();
        calcularDescuentoEspecial(precioProducto);
    }

    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
