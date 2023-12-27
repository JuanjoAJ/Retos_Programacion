package Reto2022;
/*
 * Reto #22
 * CONJUNTOS
 * Fecha publicación enunciado: 01/06/22
 * Fecha publicación resolución: 07/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que lo resuelvan directamente.
 */
import java.util.Scanner;
public class Reto2022_22Conjuntos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arrayUno=new int[6];
        int[] arrayDos=new int[6];
        for (int i = 0; i <arrayUno.length ; i++) {
            System.out.println("Valor " + (i+1) + " del primer arrays: ");
            arrayUno[i]= scanner.nextInt();
        }
        for (int i = 0; i <arrayDos.length ; i++) {
            System.out.println("Valor " + (i+1) + " del segundo arrays: ");
            arrayDos[i]= scanner.nextInt();
        }
        System.out.println("Indique true si quiere buscar los elementos comunes, en caso contrario buscará los elementos no comunes");
        boolean decision= scanner.hasNextBoolean();


        System.out.println(decision);

    }


}
