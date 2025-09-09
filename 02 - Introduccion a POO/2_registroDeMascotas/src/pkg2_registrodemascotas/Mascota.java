
package pkg2_registrodemascotas;

public class Mascota {

private String nombre;
private String especie;
private int edad;

public void mostrarInfo(){
    System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nedad: " + edad + " Años");
}

public void cumplirAnios(){
        edad++;
        System.out.println(nombre + " ha cumplido un año más Ahora tiene " + edad + " años.");
}
}
