 import java . time . LocalDate ;
 import java . time . LocalTime ;
/**
 * Write a description of class LanzadorEtapa22 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LanzadorEtapa22
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        // Creamos pelicula P1
        Pelicula p1 = new Pelicula();
        p1.setTitulo("El lobo de Wall Street");
        p1.setAnyo(2020);
        p1.setGenero(TGenero.DRAMA);
        p1.setDirector("Martin Scorsese");
        p1.setActores("Leonardo DiCaprio, Jonah Hill, Margot Robbie");
        p1.setSinopsis("Basado en la historia real de Jordan Belfort, desde su ascenso" +
                " a un adinerado corredor de bolsa que vive la gran vida hasta su caída " +
                "que involucra el crimen, la corrupción y el gobierno federal.");
        
        // Creamos pelicula P2
        Pelicula p2 = new Pelicula("Django desencadenado");
        // Modificamos los valores de sus atributos
        p2.setAnyo(2012);
        p2.setGenero(TGenero.ACCION);
        p2.setDirector("Quentin Tarantino");
        p2.setActores("Jamie Foxx, Christoph Waltz, Leonardo DiCaprio");
        p2.setSinopsis("Con la ayuda de un cazarrecompensas alemán, un esclavo liberado" +
                " se propone rescatar a su esposa de un brutal dueño de una " +
                "plantación de Mississippi.");
                
        //Creamos una cartelera y añadimos las peliculas
        Cartelera c1 = new Cartelera();
        c1.nuevaPelicula(p1);
        c1.nuevaPelicula(p2);
        
        //Creamos distintas sesiones y las visualizamos
        Sesion s1 = new Sesion(50);
        s1.setFecha(LocalDate.of(2020,3,18));
        s1.setHora(LocalTime.of(16, 00));
        s1.setPelicula(p1);
        System.out.println(s1.mostrarSesion());
        
        Sesion s2 = new Sesion(LocalDate.of(2020,3,19), LocalTime.of(18, 00), p2);
        s2.setCapacidad(45);
        System.out.println(s2.mostrarSesion());
        
        //Simulamos la venta de 10 entradas de la sesion s1
        int butacasVendidas = 10;
        s1.reducirDisponibilidad(butacasVendidas);
        System.out.println(s1.mostrarSesion());
        
        //Simulamos la venta de 5 entradas de la sesion s2
        butacasVendidas = 5;
        s2.reducirDisponibilidad(butacasVendidas);
        System.out.println(s2.mostrarSesion());
        
        //Intentamos vender más butacas que las disponibles
        butacasVendidas = s2.getButacasDisponibles() +1;
        if (butacasVendidas > s2.getButacasDisponibles()) {
            System.out.println(">>>>> No se pueden vender " + butacasVendidas + " butacas de la sesion " + s2.mostrarSesion());
        }
        else {
            System.out.println(">>>>> Error: Se han vendido " + butacasVendidas + " butacas de la sesion " + s2.mostrarSesion());
        }

    }

}


    

