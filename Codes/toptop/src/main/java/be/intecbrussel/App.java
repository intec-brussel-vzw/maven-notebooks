package be.intecbrussel;

/**
 * Hello world!
 */
public class App {
    public static void main ( String[] args ) {

        Student junior = new Student ( );
        junior.setId ( 1L );
        junior.setFirstName ( "John" );
        junior.setLastName ( "Slow" );
        junior.setEmail ( "doNotSend@email.com" );
        junior.setPhone ( "911" );
        junior.setPassword ( "pwd" );

        System.out.println ( junior );
        LazyStudent lazy = new LazyStudent ( )
                .withId ( 2L )
                .withFirstName ( "Mary" )
                .withLastName ( "Smart" )
                .withEmail ( "mary@smart.be" )
                .withPhone ( "112" )
                .withPassword ( "smart" );


        System.out.println ( lazy );

    }
}
