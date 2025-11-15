package pkg04_animalesycomportamiento;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animales = new Animal[]{
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal a : animales) {
            a.describirAnimal();
        }
    }

}
