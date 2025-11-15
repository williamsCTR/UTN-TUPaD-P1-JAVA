package interfacesenunsistema;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}
