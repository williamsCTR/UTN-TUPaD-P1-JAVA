
package pkg5_simulacionnaveespacial;

public class NaveEspacial {
    public static final double TANQUE = 10000;//el limite sera de 10.000
    private String nombre;
    private double combustible; 
    
    public void despegar(){
        if (combustible>0 && combustible<=TANQUE) {
            System.out.println("La nave despego!");
        }else{
            System.out.println("La nave no tiene suficiente combutible! \nRECARGAR!");
        }
         
    }
    
    public void avanzar(double distancia) {
        if (distancia<=combustible) {
            combustible -= distancia;
            System.out.println("La Nave avanzo " + distancia + "Kilometros luz");
        }else{
            System.out.println("La nave no puede avanzar por falta de conbustible. \nRECARGAR");
        }
            
        
    }
    
    public void recargarCombustible(double cantidad){
        if (cantidad<=(TANQUE-combustible)) {
        System.out.println("Combustible actual: " +combustible+"\nCARGANDO COMBUSTIBLE");
        combustible += cantidad;
        System.out.println("CARGA COMPLETA \nCombustible actual:" + combustible);
        }else{
        System.out.println("La carga ingresada supera el limite del tanque. Limite:" +TANQUE+" COMBUSTIBLE ACTUAL: " + combustible + ". Cargar: " +(TANQUE-combustible) +" o menos.");
        }
        
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre +"\ncombustible actual de la nave: " + combustible);
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
}
