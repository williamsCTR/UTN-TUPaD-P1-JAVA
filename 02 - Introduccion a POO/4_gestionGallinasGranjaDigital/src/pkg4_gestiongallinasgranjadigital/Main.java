
package pkg4_gestiongallinasgranjadigital;


public class Main {


    public static void main(String[] args) {
/*
4. Gestión de Gallinas en Granja Digital 
a. Crear una clase Gallina con los atributos: idGallina, edad, 
huevosPuestos. 
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado(). 
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y 
mostrar su estado. 
*/
        Gallina gallina1 = new Gallina();
        gallina1.setId(1);
        gallina1.envejecer();
        gallina1.ponerHuevo();
        
        Gallina gallina2 = new Gallina();
        gallina2.setId(2);
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
    }

}
