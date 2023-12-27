package Reto2022;
/*
 * Reto #17
 * LA CARRERA DE OBSTÁCULOS
 * Fecha publicación enunciado: 25/04/22
 * Fecha publicación resolución: 02/05/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo) o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla) será correcto y no
 *        variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

import java.util.Random;
import java.util.Scanner;

public class Reto2022_017CarreraObstaculos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r = new Random();
        String pista = "";
        String resultado="";
        String[] atleta=new String[6];
        for (int i = 0; i < 6; i++) {
            int random = r.nextInt(1, 3);
            switch (random) {
                case 1:
                    pista += "\u001B[31m" +"_";
                    break;
                case 2:
                    pista += "\u001B[31m" +"|";
                    break;
            }
            System.out.println(pista + "\u001B[30m" + " \n ¿Que hará nuestro intrépido atleta ahora?\n Recuerda escribe run para que corra o jump para que salte la valla");
            atleta[i] = s.next();

            switch (random){
                case 1:
                    if (!atleta[i].equals("run")) {
                        resultado+="\u001B[34m" +"X" +"\u001B[30m" ;
                    }else {
                        resultado+="_";
                    }


                  break;
                case 2:
                    if (!atleta[i].equals("jump")) {
                        resultado+="\u001B[34m" +"/" +"\u001B[30m" ;
                    }else {
                        resultado+="|";
                    }

                  break;

            }


        }
        if (!finish(resultado)) System.out.println("Terminó la carrera y este fue el resultado de la pista "+ resultado);
        else System.out.println("Enhorabuena al ágil atleta que superó la carrera");



        //TODO
    }

    public static boolean finish(String resultado){
        if (resultado.contains("X")) return false;
        else if (resultado.contains("/")) return false;
        else return true;

    }


}