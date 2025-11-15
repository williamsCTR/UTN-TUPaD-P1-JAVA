package pkg04_animalesycomportamiento;

public class Animal {

    public void hacerSonido() {
        System.out.println("Sonido generico de animal.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal y hago: ");
        hacerSonido();
    }
}
