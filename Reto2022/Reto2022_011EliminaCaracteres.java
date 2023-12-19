package Reto2022;
/*
 * Reto #11
 * ELIMINANDO CARACTERES
 * Fecha publicación enunciado: 14/03/22
 * Fecha publicación resolución: 21/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos cadenas como parámetro (str1, str2) e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO estén presentes en str1.
 */

import java.util.Scanner;

public class Reto2022_011EliminaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.println("Introduce otra cadena de texto");
        String str2 = scanner.nextLine().toLowerCase();

        System.out.println("De la primera cadena los caracteres presentes que no están en la segunda es " + out1(str1, str2));
        System.out.println("De la segunda cadena los caracteres presentes que no están en la primera es " + out2(str1, str2));


    }

    public static String out1(String str1, String str2) {
        String out1 = "";

        for (int i = 0; i < str1.length(); i++) {
            char corte = str1.charAt(i);
            if (!str2.contains(Character.toString(corte))) {
                out1 += corte;
            }

        }
        return out1;
    }

    public static String out2(String str1, String str2) {
        String out2 = "";

        for (int i = 0; i < str2.length(); i++) {
            char corte = str2.charAt(i);
            if (!str1.contains(Character.toString(corte))) {
                out2 += corte;
            }

        }
        return out2;


    }


}
