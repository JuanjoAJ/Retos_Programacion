package Reto2022;
/*
 * Reto #13
 * FACTORIAL RECURSIVO
 * Fecha publicación enunciado: 28/03/22
 * Fecha publicación resolución: 04/04/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe una función que calcule y retorne el factorial de un número dado de forma recursiva.
 *  El factorial de un número se define del siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1 siendo n>1.
 */
import java.util.Scanner;
public class Reto2022_013Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número que desea calcular");
        long num= scanner.nextInt();
        long factorial=num;

        for (int i = 1; i <num ; i++) {

            factorial*=i;
        }
        if(num==0) {
            System.out.println("El factorial de 0 es: 1");
        }else {
            System.out.printf("El factorial de %d es: %d",num, factorial);
        }




    }
}
