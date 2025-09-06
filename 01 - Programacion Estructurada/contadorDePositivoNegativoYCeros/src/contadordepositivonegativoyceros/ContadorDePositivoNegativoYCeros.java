package contadordepositivonegativoyceros;
import java.util.Scanner;
public class ContadorDePositivoNegativoYCeros {
    public static void main(String[] args) {
/*
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
    Ejemplo de entrada/salida:
                                Ingrese el número 1: -5
                                Ingrese el número 2: 3
                                Ingrese el número 3: 0
                                Ingrese el número 4: -1
                                Ingrese el número 5: 6
                                Ingrese el número 6: 0
                                Ingrese el número 7: 9
                                Ingrese el número 8: -3
                                Ingrese el número 9: 4
                                Ingrese el número 10: -8
                                Resultados:
                                Positivos: 4
                                Negativos: 4
                                Ceros: 2
        */
        int conPositivos = 0, conNegativos = 0, conCeros =0,aux;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 1; i < 11; i++) {
            System.out.println("Ingrese el número " + (i) +":");
            aux = scan.nextInt();
            if (aux > 0) {
                conPositivos += 1;
            }else if(aux < 0){
                conNegativos += 1;
            }else{
                conCeros += 1;
            }
        }
        System.out.println("Resultados: \n Positivos: " + conPositivos + "\n Negativos: " + conNegativos + "\n Ceros: " + conCeros);
    }

}
