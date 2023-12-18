package Reto2022;
/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
import java.util.Scanner;
public class Reto2022_008Binario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Por favor, introduzca un número:");
        int decimal= scanner.nextInt();
        String binario="";
        while (decimal>0){
        binario=(decimal%2)+binario;
        decimal/=2;}
        System.out.println(binario);
    }
}
