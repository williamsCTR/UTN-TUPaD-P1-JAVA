package clasificaciondeedad;
import java.util.Scanner;
public class ClasificacionDeEdad {
    public static void main(String[] args) {
/*
3. Clasificación de Edad.
    Escribe un programa en Java que solicite al usuario su edad y clasifique su
    etapa de vida según la siguiente tabla:
            Menor de 12 años: "Niño"
            Entre 12 y 17 años: "Adolescente"
            Entre 18 y 59 años: "Adulto"
            60 años o más: "Adulto mayor"
    Ejemplo de entrada/salida:
                                Ingrese su edad: 25
                                Eres un Adulto.
                                Ingrese su edad: 10
                                Eres un Niño.
        */
        int edad;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar edad:");
        edad = scan.nextInt();
        System.out.println(clasificarEdad(edad));
    }
public static String clasificarEdad(int x) {
        if (x < 0) {
            return "Edad no válida.";
        } else if (x < 12) {
            return "Eres un Niño.";
        } else if (x <= 17) {
            return "Eres un Adolescente.";
        } else if (x <= 59) {
            return "Eres un Adulto.";
        } else {
            return "Eres un Adulto mayor.";
        }
}
}
