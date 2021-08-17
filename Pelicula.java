
/**
 * Esta clase implementa el concepto de pelicula.
 *
 * @author (MARIE ESTELE PAMEN)
 * @version (04/2021)
 */
public class Pelicula
{
    //Titulo de la pelicula
    private String titulo;
    //Año de la pelicula 
    private int anyo;
    //Director de la pelicula 
    private String director;
    //Actores en la pelicula 
    private String actores;
    //Resumen de la pelicula
    private String sinopsis;
    //Genero de la pelicula 
    private TGenero genero;

    
    public Pelicula(String titulo){
       this.titulo= titulo;
    }
    
    public Pelicula(){
       
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo= titulo;
    }
    
    public void setAnyo(int anyo)
    {
        this.anyo= anyo;
    }
    
    public void setDirector(String director)
    {
       this.director= director; 
    }
    
    public void setActores(String actores)
    {
       this.actores= actores;
    }
    
    public void setGenero(TGenero genero)
    {
        this.genero= genero;
    }
        
    public void setSinopsis(String sinopsis)
    {
        this.sinopsis= sinopsis;
    }
    
    public int getAnyo()
    {
        return this.anyo;
    }
    
     public String getTitulo()
    {
        return this.titulo;
    
    }
    
     public String getDirector()
    {
        return this.director;
    
    }
    
     public String getActores()
    {
        return this.actores;
    
    }
    
     public String getSinopsis()
    {
        return this.sinopsis;
    
    }
    
    public TGenero getGenero(){
        return this.genero;
    }

    
    
    public String mostrarPelicula(){
        String i =("''"+ titulo +"''\n");
        System.out.println("\t Pelicula:"+ titulo +"\n");
        System.out.println("\t Año:"+ anyo +"\n");
        System.out.println("\t Genero:"+ genero +"\n");
        System.out.println("\t Actores:"+ actores +"\n");
        System.out.println("\t Sinopsis:"+ sinopsis +"\n");
        
        return i;
    }
   
}





