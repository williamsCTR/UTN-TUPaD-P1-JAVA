package pkg8_preciofinal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
        PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
        PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
        Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
        Ejemplo de entrada/salida:
            Ingrese el precio base del producto: 100
            Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
            Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
            El precio final del producto es: 105.0
*/
        Scanner scan = new Scanner(System.in);
        Double precioBase,porImpuesto,porDescuento;
        System.out.print("Ingresar el precio base del producto: ");
        precioBase = scan.nextDouble(); 
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        porImpuesto = scan.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        porDescuento = scan.nextDouble();
        System.out.println(calcularPrecioFinal(precioBase,porImpuesto, porDescuento));

    }
public static String calcularPrecioFinal(double Preciodase, double impuesto, double
descuento){
    Double PrecioFinal = Preciodase + (Preciodase * impuesto / 100) - (Preciodase * descuento / 100);
    return "El precio final del producto es: " + PrecioFinal;
}
}
