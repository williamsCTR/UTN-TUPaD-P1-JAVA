package pkg10_actulizarstock;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
/*
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción de productos:
    NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
        Ejemplo de entrada/salida:
                                    Ingrese el stock actual del producto: 50
                                    Ingrese la cantidad vendida: 20
                                    Ingrese la cantidad recibida: 30
                                    El nuevo stock del producto es: 60
        
*/      int stockActual,cantidadVendida,cantidadRecibida;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = scan.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = scan.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = scan.nextInt();
        System.out.print(actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
        
    }
    public static String actualizarStock(int StockActual, int CantidadVendida,
int CantidadRecibida){
        int NuevoStock;
        NuevoStock = StockActual - CantidadVendida + CantidadRecibida;
        return "El nuevo stock del producto es: " + NuevoStock;
    }
}
