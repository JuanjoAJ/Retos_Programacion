package Reto2022;
/*
 * Reto #12
 * ¿ES UN PALÍNDROMO?
 * Fecha publicación enunciado: 21/03/22
 * Fecha publicación resolución: 28/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba un texto y retorne verdadero o falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

import java.util.Scanner;
public class Reto2022_012Palíndromo {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca una palabra");
       String palabra= scanner.nextLine().toLowerCase().replaceAll(" ","").replaceAll("¿","").replaceAll("\\?","").replaceAll("\\.","").replaceAll("!","");
        System.out.println(palindromo(palabra));
    }
    public static String palindromo(String palabra){
        String reverso="";

        for (int i=palabra.length()-1; i>=0;i--){
            reverso+=palabra.charAt(i);
        }
        if (palabra.equalsIgnoreCase(reverso)) return "La palabra es un palíndromo";
        else return "La palabra no es un palíndromo";
    }
}
