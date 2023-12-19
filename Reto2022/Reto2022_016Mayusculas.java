package Reto2022;
/*
 * Reto #16
 * EN MAYÚSCULA
 * Fecha publicación enunciado: 18/04/22
 * Fecha publicación resolución: 25/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 */

import java.util.Scanner;

public class Reto2022_016Mayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca una cadena de texto en minúsculas");
        String cadena = scanner.nextLine();
        System.out.println(Mayusculas(cadena));

    }

    public static String Mayusculas(String cadena) {
        String resultado = "";
        String[] palabras = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            String letra = palabras[i];
            char a = letra.charAt(0);
            String b = String.valueOf(a).toUpperCase();
            String c = letra.substring(1);
            resultado += b.concat(c);
            resultado += " ";
        }
        return resultado;
    }
}
