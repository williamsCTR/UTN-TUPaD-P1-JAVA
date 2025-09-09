package pkg1_registrodeestudiantes;


public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
        
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("------------------------------");
    }
    
    public void subirCalificacion(double puntos){
        if(puntos >=0)calificacion +=puntos;
    }
    
    public void bajarCalificacion(double puntos){
        if(puntos >=0)calificacion -=puntos;
    }
}
