package interfacesenunsistema;

public class TestPersona {

    public static void main(String[] args) {
        try {
            Persona p = new Persona("Luis", -5);
        } catch (EdadInvalidaException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
