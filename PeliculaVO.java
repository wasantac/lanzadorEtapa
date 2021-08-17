
/**
 * Write a description of class PeliculaVO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PeliculaVO extends Pelicula
{
    //Titulo de la pelicula
    private TIdioma idioma;
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
    
    /**
     * Constructor for objects of class PeliculaVO
     */
    public PeliculaVO (String titulo)
    {
        super (titulo);
    }
        public PeliculaVO ()
    {
        super ();
    }
    
    public void setIdioma(TIdioma idioma)
    {
        this.idioma= idioma;
    }
    
    public TIdioma getIdioma()
    {
        return this.idioma;
    }
    

    
}
