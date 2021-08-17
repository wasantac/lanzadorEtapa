
 public class LanzadorEtapa1 {

 public static void main ( String [] args ) {
 // Creamos una pelicula
 Pelicula p1 = new Pelicula () ;
 // Modificamos los valores de sus atributos
p1 . setTitulo ("El lobo de Wall Street");
p1 . setAnyo (2020) ;
p1 . setGenero (TGenero . DRAMA);
p1 . setDirector ("Martin Scorsese");
p1 . setActores ("Leonardo DiCaprio , Jonah Hill , Margot Robbie");
p1 . setSinopsis ("Basado en la historia real de Jordan Belfort , desde su ascenso"
+
" a un adinerado corredor de bolsa que vive la gran vida hasta su caìda"
 +
"que involucra el crimen , la corrupci´on y el gobierno federal.");

// Visualizamos su informaci´on por pantalla
 System . out . println ( p1 . mostrarPelicula () );
// Creamos otra pelicula
 Pelicula p2 = new Pelicula ();
// Modificamos los valores de sus atributos
p2 . setTitulo ("Django desencadenado ");
p2 . setAnyo (2012) ;
p2 . setGenero (TGenero . ACCION);
p2 . setDirector ("Quentin Tarantino");
p2 . setActores ("Jamie Foxx , Christoph Waltz , Leonardo DiCaprio");
p2 . setSinopsis ("Con la ayuda de un cazarrecompensas alem´an, un esclavo liberado"
+
 " se propone rescatar a su esposa de un brutal due˜no de una " +
"plantaci´on de Mississippi.");

 // Visualizamos su informaci´on por pantalla
 System . out . println ( p2 . mostrarPelicula () );

 // Modificamos el a˜no de la pelicula p1
 p1 . setAnyo ( p1 . getAnyo () - 7) ;

 // Volvemos a visualizar su informaci´on por pantalla
 System . out . println ( p1 . mostrarPelicula () );
 }

 }