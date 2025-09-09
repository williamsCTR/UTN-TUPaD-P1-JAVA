
package pkg1_registrodeestudiantes;

public class Main {

    public static void main(String[] args) {
     /*
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones
*/
       Estudiante estudiante1 = new Estudiante();
       estudiante1.mostrarInfo();
       estudiante1.subirCalificacion(10);
       estudiante1.mostrarInfo();
       estudiante1.bajarCalificacion(5);
       estudiante1.mostrarInfo();
    }

}
