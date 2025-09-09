
package pkg5_simulacionnaveespacial;


public class Main {

    public static void main(String[] args) {
/*
5. Simulación de Nave Espacial 
Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), 
recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
*/
    NaveEspacial nave = new NaveEspacial();
    /*    
        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(500);
        nave.recargarCombustible(999999);
        System.out.println("________________________________");
    */
        nave.setNombre("NAVIO UTN");
        System.out.println("___________________");
        nave.mostrarEstado();
        System.out.println("___________________");
        nave.recargarCombustible(10000);
        System.out.println("___________________");
        nave.despegar();
        System.out.println("___________________");
        nave.avanzar(5000);
        System.out.println("___________________");
        nave.mostrarEstado();
    }

}
