package interfacesenunsistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaTryWithResources {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {

            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
