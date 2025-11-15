package pkg02_figurasgeometricasymetodos;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
            new Circulo("Circulo 1", 2.5),
            new Rectangulo("Rectangulo 1", 3.0, 4.0),
            new Circulo("Circulo 2", 1.0)
        };

        for (Figura f : figuras) {
            System.out.printf("%s - Area: %.4f%n", f.getNombre(), f.calcularArea());
        }
    }

}
