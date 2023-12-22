package Reto2022;
/*
 * Reto #15
 * ¿CUÁNTOS DÍAS?
 * Fecha publicación enunciado: 11/04/22
 * Fecha publicación resolución: 18/04/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea una función que calcule y retorne cuántos días hay entre dos cadenas de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se lanzará una excepción.
 */

import java.util.Scanner;


public class Reto2022_015Dias {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca una fecha (dd/MM/yyyy) :");
        String fechaUno = scanner.next();
        System.out.println("Introduzca una segunda fecha (dd/MM/yyyy)");
        String fechaDos = scanner.next();



        String[] a = fechaUno.split("/");
        String[] b = fechaDos.split("/");

        int diaUno= Integer.parseInt(a[0]);
        int mesUno = Integer.parseInt(a[1]);
        int anioUno = Integer.parseInt(a[2]);
        mesUno = mes(mesUno, anioUno);
        anioUno = anio(anioUno);


        int diaDos = Integer.parseInt(b[0]);
        int mesDos = Integer.parseInt(b[1]);
        int anioDos = Integer.parseInt(b[2]);
        mesDos = mes(mesDos, anioDos);
        anioDos = anio(anioDos);


        int dias = Math.abs((anioDos - anioUno) + (mesDos - mesUno) + (diaDos - diaUno));

        System.out.printf("Entre %s y %s existe una diferencia de %d días.", fechaUno, fechaDos, dias);

    }

    public static int anio(int anio) {
        if (anio%4 == 0 && anio%100!= 0 || anio%400==0 ){
            anio*=366;
            return anio;
        }else {
            anio*=365;
            return anio;
        }
    }

    public static int mes (int mes, int anio){
        if (mes==2){
            if(anio%4 == 0 && anio%100!= 0 || anio%400==0 ){
                mes*=29;
                return mes;
            }
            mes*=28;
            return mes;
        }
        else if (mes==4 || mes==6 || mes==9 || mes==11 ){
            mes*=30;
            return mes;
        }else{
            mes*=31;
            return mes;
        }
    }
}
