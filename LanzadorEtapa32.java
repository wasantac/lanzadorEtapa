
/**
 * Write a description of class LanzadorEtapa32 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java . time . LocalDate ;
import java . time . LocalTime ;
import java.util.ArrayList;
import java.util.List;
public class LanzadorEtapa32
{
    public static void main(String args []){
            // instance variables - replace the example below with your own
    // Creamos un par de pel´ıculas en versi´on original
           AplicacionGestionCine app = new AplicacionGestionCine("Cine Callao", "Plaza callao 3", 50);
                
        // Creamos una pelicula
        Pelicula p1 = new Pelicula();
        // Modificamos los valores de sus atributos
        p1.setTitulo("El lobo de Wall Street");
        p1.setAnyo(2020);
        p1.setGenero(TGenero.DRAMA);
        p1.setDirector("Martin Scorsese");
        p1.setActores("Leonardo DiCaprio, Jonah Hill, Margot Robbie");
        p1.setSinopsis("Basado en la historia real de Jordan Belfort, desde su ascenso" +
                        " a un adinerado corredor de bolsa que vive la gran vida hasta su caída " +
                        "que involucra el crimen, la corrupción y el gobierno federal.");
                
        // Creamos otra pelicula
        Pelicula p2 = new Pelicula("Django desencadenado");
        // Modificamos los valores de sus atributos
        p2.setAnyo(2012);
        p2.setGenero(TGenero.ACCION);
        p2.setDirector("Quentin Tarantino");
        p2.setActores("Jamie Foxx, Christoph Waltz, Leonardo DiCaprio");
        p2.setSinopsis("Con la ayuda de un cazarrecompensas alemán, un esclavo liberado" +
                        " se propone rescatar a su esposa de un brutal dueño de una " +
                        "plantación de Mississippi.");

        // Creamos otras 2 peliculas
        Pelicula p3 = new Pelicula("Malditos bastardos");
        p3.setAnyo(2009);
        p3.setGenero(TGenero.ACCION);
        p3.setDirector("Quentin Tarantino");
        p3.setActores("Brad Pitt, Diane Kruger, Eli Roth");
        p3.setSinopsis("En la Francia ocupada por los nazis durante la Segunda Guerra Mundial," +
                        " un plan para asesinar a los líderes nazis por parte de un grupo de soldados " +
                        "judíos estadounidenses coincide con los planes vengativos del dueño de un teatro al respecto.");
                
        Pelicula p4 = new Pelicula("Pulp Fiction");
        p4.setAnyo(1994);
        p4.setGenero(TGenero.ACCION);
        p4.setDirector("Quentin Tarantino");
        p4.setActores("John Travolta, Uma Thurman, Samuel L. Jackson");
        p4.setSinopsis("Las vidas de dos sicarios de la mafia, un boxeador, un gángster y su esposa, y un par de " +
                        "bandidos comensales se entrelazan en cuatro historias de violencia y redención.");
                
        // Añadimos las películas a la aplicación
        app.nuevaPelicula(p1);
        app.nuevaPelicula(p2);
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(p3);
        peliculas.add(p4);
        app.nuevaPelicula(peliculas);
                
        //Intentamos añadir nuevamente la película 1
        app.nuevaPelicula(p1);
                
        //Eliminamos la película 2
        //app.eliminarPelicula(p2.getTitulo());
        app.visualizarCartelera();
                
        //Cremos distintas sesiones y las añadimos
        Sesion s1 = new Sesion(LocalDate.of(2020,3,19), LocalTime.of(18, 00), p1);
        app.nuevaSesion(s1);
        Sesion s2 = new Sesion(LocalDate.of(2020,3,19), LocalTime.of(16, 00), p1);
        app.nuevaSesion(s2);
        Sesion s3 = new Sesion(LocalDate.of(2020,3,19), LocalTime.of(18, 00), p2);
        app.nuevaSesion(s3);
        Sesion s4 = new Sesion(LocalDate.of(2020,3,20), LocalTime.of(19, 00), p3);
        app.nuevaSesion(s4);
        Sesion s5 = new Sesion(LocalDate.of(2020,3,21), LocalTime.of(19, 00), p3);
        app.nuevaSesion(s5);
        Sesion s6 = new Sesion(LocalDate.of(2020,3,22), LocalTime.of(17, 00), p4);
        app.nuevaSesion(s6);
 PeliculaVO p5 = new PeliculaVO() ;
 p5.setIdioma(TIdioma.INGLES);
 p5.setTitulo("The fight club");
 p5.setAnyo(1999) ;
 p5.setGenero( TGenero . ACCION );
 p5.setDirector("David Fincher");
 p5 . setActores ("Brad Pitt , Edward Norton , Meat Loaf");
 p5 . setSinopsis ("An insomniac office worker and a devil -may -care soapmaker form an underground" +"fight club that evolves into something much , much more.");

 PeliculaVO p6 = new PeliculaVO () ;
 p6 . setTitulo("Le fabuleux destin d’Am´elie Poulain");
 p6 . setIdioma (TIdioma . FRANCES);
 p6 . setAnyo (2001);
 p6 . setGenero (TGenero . COMEDIA);
 p6 . setDirector ("Jean -Pierre Jeunet");
 p6 . setActores ("Audrey Tautou , Mathieu Kassovitz , Rufus");
 p6 . setSinopsis ("La d´ecouverte d’un tr´esor oubli´e met une serveuse parisienne en question" +
 "et change la vie de ceux qui l’entourent.");

 app . nuevaPelicula ( p5 );
 app . nuevaPelicula ( p6 );

 // Cremos distintas sesiones y las a˜nadimos
 Sesion s7 = new Sesion ( LocalDate . of (2020 ,3 ,22) , LocalTime . of (22 , 00) , p5 );
 app . nuevaSesion ( s7 );
 Sesion s8 = new Sesion ( LocalDate . of (2020 ,3 ,22) , LocalTime . of (21 , 00) , p6 );
 app . nuevaSesion ( s8 );

 // Invocamos operaciones
 app . mostrarSesiones ( p5 . getTitulo () );
 app . mostrarSesiones ( p6 . getTitulo () );
 // app. comprarEntradas (5 , p5.getTitulo (), LocalDate.of (2020 ,3 ,22) , LocalTime.of

 app . mostrarSesiones ( p5 . getTitulo () );
    }
}
