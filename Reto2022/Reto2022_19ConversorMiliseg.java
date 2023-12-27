package Reto2022;
/*
 * Reto #19
 * CONVERSOR TIEMPO
 * Fecha publicación enunciado: 09/05/22
 * Fecha publicación resolución: 16/05/22
 * Dificultad: FACIL
 *
 * Enunciado: Crea una función que reciba días, horas, minutos y segundos (como enteros) y retorne su resultado en milisegundos.
 */

import javax.swing.*;
import java.util.Scanner;
public class Reto2022_19ConversorMiliseg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de tiempo a milisegundos, indique los días" );
        String dialogo= JOptionPane.showInputDialog("Bienvenido al conversor de tiempo a milisegundos, indique los días");
        int dias=Integer.parseInt(dialogo);
        dialogo= JOptionPane.showInputDialog("Indique las horas");
        int horas=Integer.parseInt(dialogo);
        dialogo= JOptionPane.showInputDialog("Indique los minutos");
        int minutos=Integer.parseInt(dialogo);
        dialogo= JOptionPane.showInputDialog("Y por último, los segundos");
        int segundos=Integer.parseInt(dialogo);

        long milisegundos= (segundos*1000)+(minutos*60000)+(horas*3600000)+(dias*86400000L);

        JOptionPane.showMessageDialog(null, "El resultado en milisegundos es de " + milisegundos, "Conversor de milisegundos", JOptionPane.INFORMATION_MESSAGE);
        System.out.printf("Los milisegundos que hay en %d días, %d horas, %d minutos y %d segundos son %d. Gracias por confiar en nosotros", dias, horas, minutos, segundos, milisegundos);



    }
}
