import java.util.*;
/**
 * Write a description of class Cartelera here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cartelera
{
    // crear lista con peliculas hay en la cartelera
     private ArrayList<Pelicula> listaPeliculas;
     //constructor de objecto de tipo cartelera
     public Cartelera(){
         listaPeliculas= new ArrayList<Pelicula>();
    }
    //constructor de objecto de tipo cartelera
     public Cartelera(List<Pelicula> plist){
         listaPeliculas= new ArrayList<Pelicula>(plist);
    }
   // añadir pelicula a la cartelera
    public boolean nuevaPelicula(Pelicula p){
        if (this.estaPelicula(p.getTitulo()))return false;
        listaPeliculas.add(p);
        return true;
    
    }
    
     public boolean nuevaPelicula(List<Pelicula> plist){
         for(Pelicula p: plist){
        if (this.estaPelicula(p.getTitulo()))return false;
        listaPeliculas.add(p);
    }
        return true;
    
    }
    
    //eliminar pelicula de la cartelerappublic void removePelicula(String titulo){
       public boolean eliminarPelicula(String titulo){
           int index = -1;
           for(Pelicula p: listaPeliculas){
               if (p.getTitulo().equals(titulo)){
                  index = listaPeliculas.indexOf(p);
                } 
            }   
            if (index == -1){
            return false;
        } 
           listaPeliculas.remove(index);
           return true;
        }
        
        public boolean estaPelicula(String titulo){
           
           for(Pelicula p: listaPeliculas){
               if (p.getTitulo().equals(titulo)){
                  return true;
                } 
            }  
            return false;
           
           
        }
        
        public boolean estaPelicula(Pelicula p){
           return listaPeliculas.contains(p);
        }
        
        public String mostrarCartelera(){
            String c = "";
        for(Pelicula p: listaPeliculas){
        c+= p.mostrarPelicula();
    }
    return c;
        }
}
           
        
    
