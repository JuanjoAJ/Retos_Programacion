package Reto2022;
/*
 * Reto #24
 * ITERATION MASTER
 * Fecha publicación enunciado: 13/06/22
 * Fecha publicación resolución: 20/06/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Quiero contar del 1 al 100 de uno en uno (imprimiendo cada uno). ¿De cuántas maneras eres capaz de hacerlo? Crea el código para cada una de ellas.
 */
public class Reto2022_24IterationMaster {
    public static void main(String[] args) {
        for (int i = 1; i <101 ; i++) {
            System.out.print(i +" ");
        }
        System.out.println();
        int cuenta=1;
        for (int i = 0; i <100 ; i++) {
            System.out.print(cuenta++ + " ");
        }
        System.out.println();
        cuenta=1;
        int suma=0;
        for (int i = 0; i <100 ; i++) {
            suma+=cuenta;
            System.out.print(suma +" ");
        }
        System.out.println();
        for (int i = 1; i <101 ; System.out.print(i++ + " ")) {}
        System.out.println();
        for (int i = 100; i>0 ; i--) {
            System.out.print((101-i) + " ");
        }



    }
}
