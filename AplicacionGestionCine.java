
/**
 * Write a description of class AplicacionGestionCine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class AplicacionGestionCine
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String direccion;
    private Cartelera cartelera;
    private ArrayList<Sesion> sesiones;
    private int capacidad;

    /**
     * Constructor for objects of class AplicacionGestionCine
     */
    public AplicacionGestionCine(String nombre,String direccion,int capacidad)
    {
        this.sesiones = new ArrayList<>();
        this.cartelera = new Cartelera();
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }
    
    public void nuevaPelicula(Pelicula p){
        this.cartelera.nuevaPelicula(p);
    }
    public void nuevaPelicula(List<Pelicula> plist){
        this.cartelera.nuevaPelicula(plist);
    }
    public void visualizarCartelera(){
        this.cartelera.mostrarCartelera();
    }
    public boolean nuevaSesion(Sesion sesion){
        for(Sesion s: sesiones){
            if(s.getPelicula().getTitulo() == sesion.getPelicula().getTitulo()){
                if(s.getFecha() == sesion.getFecha()){
                    if(s.getHora() == sesion.getHora()){
                        System.out.println("Error, ya existe la pelicula");
                        return false;
                    }
                }
            }
        }
        sesiones.add(sesion);
        return true;
    }
    
    public void mostrarSesiones(String titulo){
        for(Sesion s:sesiones){
            if(s.getPelicula().getTitulo() == titulo){
                s.mostrarSesion();
            }
        }
    }
    


}
