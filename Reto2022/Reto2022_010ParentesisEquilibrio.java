package Reto2022;
/*
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Fecha publicación enunciado: 07/03/22
 * Fecha publicación resolución: 14/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
import java.util.Scanner;
public class Reto2022_010ParentesisEquilibrio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca cadena con paréntesis, llaves y corchetes");
        String balanceo=scanner.nextLine();
        if(balanceado(balanceo)){
            System.out.println("La expresión está balanceada");
        }else System.out.println("La expresión no está balanceada");


    }
    public static boolean balanceado(String string) {
        int contadorParentesis = 0;
        int contadorCorchetes = 0;
        int contadorLlaves = 0;

        for (char c : string.toCharArray()) {
            if (c == '(') {
                contadorParentesis++;
            } else if (c == ')') {
                contadorParentesis--;
            } else if (c == '[') {
                contadorCorchetes++;
            } else if (c == ']') {
                contadorCorchetes--;
            } else if (c == '{') {
                contadorLlaves++;
            } else if (c == '}') {
                contadorLlaves--;
            }

            if (contadorParentesis < 0 || contadorCorchetes < 0 || contadorLlaves < 0) {
                return false; // Hay más delimitadores cerrados que abiertos
            }
        }

        return contadorParentesis == 0 && contadorCorchetes == 0 && contadorLlaves==0;

}

}
