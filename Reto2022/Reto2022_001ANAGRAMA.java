/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import java.util.Scanner;


public class Reto2022_001ANAGRAMA {
    public static String primeraPalabra, segundaPalabra;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa Anagrama. Escriba la primera palabra");
        primeraPalabra = scanner.next().toLowerCase();
        System.out.println("Escriba la segunda palabra");
        segundaPalabra = scanner.next().toLowerCase();

        if (Anagrama(primeraPalabra, segundaPalabra)) {
            System.out.println("Enhorabuena, " + segundaPalabra + " es un Anagrama de " + primeraPalabra);
        } else {
            System.out.println("No son anagramas");
        }
    }

    public static boolean Anagrama(String uno, String dos) {
        if (uno.length() == dos.length()) {

            char[] array = uno.toCharArray();
            char[] arrayDos = dos.toCharArray();
            Arrays.sort(array);
            Arrays.sort(arrayDos);
            if (Arrays.equals(array, arrayDos)) return true;
        }
       return false;
    }
}
