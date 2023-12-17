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
        String texto=s.nextLine().toLowerCase();
        String leet= texto.replaceAll("a", "4").replaceAll("b", "8").replaceAll("c","[").replaceAll("d",")").replaceAll("e","€").replaceAll("f","ƒ").replaceAll("g","&").replaceAll("h", "#").replaceAll("i","!").replaceAll("j","_|").replaceAll("k","|<").replaceAll("l","£").replaceAll("m","|V|").replaceAll("n","И").replaceAll("o","Ø").replaceAll("p","|º").replaceAll("q","()_").replaceAll("r", "®").replaceAll("s","$").replaceAll("t","†").replaceAll("u","(_)").replaceAll("v","|/").replaceAll("w","VV").replaceAll("x","><").replaceAll("y","Ч").replaceAll("z","%");
        leet=leet.replaceAll("1","L").replaceAll("2","R").replaceAll("3","E").replaceAll("4","A").replaceAll("5","S").replaceAll("6","G").replaceAll("7","T").replaceAll("8","B").replaceAll("9","g").replaceAll("0", "()");

        System.out.println(leet);


    }


}
