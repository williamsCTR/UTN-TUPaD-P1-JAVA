package pkg4_gestiongallinasgranjadigital;


public class Gallina {
private int idGallina, edad, huevosPuestos;

public void ponerHuevo(){
    huevosPuestos++;
    System.out.println("Ganillina: "+idGallina+" puso un huevo. Total de huevos: "+huevosPuestos);
}
public void envejecer(){
    edad++;
    System.out.println("Gallina: " + idGallina + " ahora tiene " + edad + "anio");
}
        
public void mostrarEstado(){
    System.out.println("Gallina: " +idGallina+"\nEdad: "+edad+"\nHuevos Puestos: "+huevosPuestos);
}

public void setId(int id){
    idGallina = id;
}

}
