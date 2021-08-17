
/**
 * Write a description of class Sesion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java . time . LocalDate ;
import java . time . LocalTime ;
public class Sesion
{
// instance variables - replace the example below with your own
    private Pelicula pelicula;
    private LocalTime hora;
    private LocalDate fecha;
    private int butacas;
    
     public Sesion(int butacas){
         this.butacas = butacas;
    }
    public Sesion(LocalDate fecha,LocalTime hora,Pelicula pelicula){
         this.butacas = 0;
         this.fecha = fecha;
         this.hora = hora;
         this.pelicula = pelicula;
    }
    
    public void setPelicula( Pelicula pelicula) {
        this.pelicula= pelicula;
    }
    
    public void setHora(LocalTime hora) {
        this.hora= hora;
    }
    
    public void setFecha(LocalDate fecha) {
        this.fecha= fecha;
    }

    public Pelicula getPelicula(){
       return this.pelicula;
    }
    
    public LocalDate getFecha(){
       return this.fecha;
    }
 
    public LocalTime getHora(){
       return this.hora;
    }
    public void setCapacidad(int butacas){
        this.butacas  = butacas;
    }
    public int getButacasDisponibles(){
        return this.butacas;
    }
    public void reducirDisponibilidad(int vendidas){
        this.butacas = this.butacas - vendidas;
    }

 
    
    // monstrar sesion
    public String mostrarSesion (){
    String sesion="";
    sesion= sesion + "sesion:" + fecha + ","+ hora + "," + pelicula.getTitulo () + "\n\t" 
    + "Actores" + pelicula.getActores () +
    "\n\t" + "Director" + pelicula.getDirector () +
    "\n\t" + "Genero" + pelicula.getGenero () +
    "\n\t" + "Numero butacas disponibles: " + String.valueOf(this.butacas) +"\n\t";
    return sesion;
}
    // monstrar capacidad de la sesion
}


