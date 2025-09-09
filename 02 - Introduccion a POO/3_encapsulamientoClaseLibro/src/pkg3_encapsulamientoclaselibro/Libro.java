
package pkg3_encapsulamientoclaselibro;

public class Libro {
private String titulo, autor;
private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setAñoPublicacion(int anio){
        if (anio>=0 && anio<=2025) {
            añoPublicacion = anio;
        }
    }

}
