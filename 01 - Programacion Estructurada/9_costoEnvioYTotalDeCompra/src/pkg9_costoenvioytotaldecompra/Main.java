package pkg9_costoenvioytotaldecompra;
import java.util.Scanner;
public class Main {
public static final long NACIONAL =5,INTERNACIONAL =10; //precio del envio en kg
    public static void main(String[] args) {
/*
9. Composición de funciones para calcular costo de envío y total de compra.
    a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
    envío basado en la zona de envío (Nacional o Internacional) y el peso del
    paquete.
                Nacional: $5 por kg
                Internacional: $10 por kg
        
    b. calcularTotalCompra(double precioProducto, double
    costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
    el costo de envío.
    Desde main(), solicita el peso del paquete, la zona de envío y el precio
    del producto. Luego, muestra el total a pagar.
        Ejemplo de entrada/salida:
                    Ingrese el precio del producto: 50
                    Ingrese el peso del paquete en kg: 2
                    Ingrese la zona de envío (Nacional/Internacional): Nacional
                    El costo de envío es: 10.0
                    El total a pagar es: 60.0

*/
        int pesoPaquete,precioProducto;
        String zonaEnvio;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = scan.nextInt();
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = scan.nextInt();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvio = scan.next();
        System.out.println(calcularTotalCompra(pesoPaquete, precioProducto, zonaEnvio));
    }
    public static String calcularTotalCompra(int PesoPaquete, int PrecioProducto, String ZonaEnvio){
        long costoEnvio,total;
        if (ZonaEnvio.equalsIgnoreCase("Nacional")) {
            costoEnvio = PesoPaquete * NACIONAL;
            total = costoEnvio + PrecioProducto;
        }else{
            costoEnvio = PesoPaquete * INTERNACIONAL;
            total = costoEnvio + PrecioProducto;
        }
        return "El costo de envío es: " + costoEnvio + " \n El total a pagar es: " + total;
    }
}
