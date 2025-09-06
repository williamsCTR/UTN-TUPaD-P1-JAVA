package mayordetresnumeros;
import java.util.Scanner;
public class MayorDeTresNumeros {
    public static void main(String[] args) {
        
/*
    2. Determinar el Mayor de Tres Números.
    Escribe un programa en Java que pida al usuario tres números enteros y
    determine cuál es el mayor.
        Ejemplo de entrada/salida:
                                    Ingrese el primer número: 8
                                    Ingrese el segundo número: 12
                                    Ingrese el tercer número: 5
                                    El mayor es: 12       
*/      
        Scanner scan = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Ingresar el primer numero:");
        num1 = scan.nextInt();
        System.out.print("Ingresar el segundo numero:");
        num2 = scan.nextInt();
        System.out.print("Ingresar el tercer numero:");
        num3 = scan.nextInt();
        
        System.out.println(esMayor(num1, num2, num3));
    }
public static String esMayor(int x,int y,int z){
    
    if (x >= y && x >= z) {
        return "El Mayor es: " + x;
    } if (y >= x && y>=z) {
        return "El Mayor es: " + y;
    }
   return "El Mayor es: " + z;
}
}
