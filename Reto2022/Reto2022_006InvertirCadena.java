package Reto2022;

import java.util.Scanner;

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
import java.util.Scanner;

public class Reto2022_006InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = scanner.nextLine();
        String inverso = "";

        for (int i = frase.length()-1; i >= 0; i--) {
            inverso += frase.charAt(i);
        }
        System.out.println("Tu frase a la inversa es : \n" + inverso);
    }
}
