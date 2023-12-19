package Reto2022;
/*
 * Reto #14
 * ¿ES UN NÚMERO DE ARMSTRONG?
 * Fecha publicación enunciado: 04/04/22
 * Fecha publicación resolución: 11/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule si un número dado es un número de Amstrong (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información al respecto.
 * Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
 */

import java.util.Scanner;
public class Reto2022_014Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        do {
            System.out.println("Introduzca un número de tres cifras");
            n = scanner.nextInt();
        }while(n<100 && n<999);
        int cen, dec, uni;
        cen=n/100;
        dec=(n%100)/10;
        uni=(n%100)%10;
         if (Math.pow(cen,3)+Math.pow(dec,3)+Math.pow(uni,3)==n) System.out.println("Es un número Armstrong");
         else System.out.println("No es un número Armstrong");




    }


}
