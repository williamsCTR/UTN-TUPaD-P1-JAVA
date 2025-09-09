
package pkg3_encapsulamientoclaselibro;

public class Main {

    public static void main(String[] args) {
/*
3. Encapsulamiento con la Clase Libro 
a. Crear una clase Libro con atributos privados: titulo, autor, 
añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación 
para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
uno válido, mostrar la información final. 
*/

         Libro libro = new Libro();
         System.out.println(libro.getAñoPublicacion());
         libro.setAñoPublicacion(-5);
         System.out.println(libro.getAñoPublicacion());
         libro.setAñoPublicacion(2000);
         System.out.println(libro.getAñoPublicacion());

    }

}
