package Reto2022;
/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.*;

public class Reto2022_009Morse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto a traducir en morse: ");
        String frase = scanner.nextLine().toLowerCase();
        String morse = frase.replaceAll("a", ".- ").replaceAll("b", "-... ").replaceAll("c", "-.-. ").replaceAll("d", "-.. ").replaceAll("e", ". ").replaceAll("f", "..-. ").replaceAll("g", "--. ").replaceAll("h", ".... ").replaceAll("i", ".. ").replaceAll("j", ".--- ").replaceAll("k", "-.- ").replaceAll("l", ".-.. ").replaceAll("m", "-- ").replaceAll("n", "-. ").replaceAll("o", "--- ").replaceAll("p", ".--. ").replaceAll("q", "--.- ").replaceAll("r", ".-. ").replaceAll("s", "... ").replaceAll("t", "- ").replaceAll("u", "..-").replaceAll("v", "...-").replaceAll("w", ".-- ").replaceAll("x", "-..- ").replaceAll("y", "-.-- ").replaceAll("z", "--.. ").replaceAll("1", ".---- ").replaceAll("2", "..--- ").replaceAll("3", "...-- ").replaceAll("4", "....-").replaceAll("5", "..... ").replaceAll("6", "-.... ").replaceAll("7", "--... ").replaceAll("8", "---.. ").replaceAll("9", "----. ").replaceAll("0", "-----");
        System.out.println(frase + "\n" + morse);
    }
}
