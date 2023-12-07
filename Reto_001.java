//*
// * Escribe un programa que reciba un texto y transforme lenguaje natural a
// * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
// *  se caracteriza por sustituir caracteres alfanuméricos.
// * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
// *   con el alfabeto y los números en "leet".
// *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
// */
import java.util.Scanner;
public class Reto_001 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Bienvenido al traductor leet/1337. Introduzca el mensaje:");
        String texto=s.next();
        texto= texto.replaceAll("b", "8");

        System.out.println(texto);


    }


}
