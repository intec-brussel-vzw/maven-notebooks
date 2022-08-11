package be.intecbrussel;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main ( String[] args ) {

        List < String > emails = new ArrayList <> ( );

        emails.add ( "john@doe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "chef@woe.be" );
        emails.add ( "darel@woe.be" );
        emails.add ( "jupyter@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "ali@woe.be" );
        emails.add ( "mehmet@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        emails.add ( "mary@woe.be" );
        // 98+ emails hier..

        for ( int i = 0; i < 100; i++ ) {

            // System.out.println ( "student" + emails.get ( i ) + "@intecbrusse.be" );

        }

        Faker faker = new Faker ( Locale.forLanguageTag ( "be-NL" ) );

        for ( int i = 0; i < 100; i++ ) {
            String SEPERATOR = "##################################";
            System.out.println ( SEPERATOR );
            System.out.println ( faker.name ( ).firstName ( ) + " " + faker.name ( ).lastName ( ) );
            System.out.println ( faker.internet ( ).emailAddress ( ) );
            System.out.println ( faker.phoneNumber ( ).cellPhone ( ) );
            // System.out.println ( faker.lorem ( ).paragraph ( 10 ) );
            System.out.println ( SEPERATOR );
        }

        /*
        for ( int i = 0; i < 100_000; i++ ) {
            System.out.println ( faker.address ( ).city ( )
                    + ", " + faker.address ( ).streetAddress ( )
                    + ", " + faker.address ( ).buildingNumber ( )

            );
        }
         */

    }
}
