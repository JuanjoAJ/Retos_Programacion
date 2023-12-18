/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */


import java.util.Scanner;
public class Reto2022_004Poligono {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bienvenido al programa de cálculo del area. Elija las siguientes opciones:" +
                "\n 1. Triángulo. \n 2. Cuadrado. \n 3. Rectángulo");
        int eleccion= scanner.nextInt();

        switch (eleccion){
            case 1:
                System.out.println("Introduzca la base");
                int base= scanner.nextInt();
                System.out.println("Introduzca la altura");
                int altura=scanner.nextInt();
                System.out.println("El area del triangulo es " +((base*altura)/2));
              break;

            case 2:
                System.out.println("Introduzca el lado del cuadrado");
                int lado= scanner.nextInt();
                System.out.println("El area del cuadrado es " + (int)Math.pow(lado,2));
                break;
            case 3:
                System.out.println("Introduzca el largo del rectángulo");
                lado=scanner.nextInt();
                System.out.println("Introduzca la altura del rectángulo");
                altura= scanner.nextInt();
                System.out.println("El area del rectángulo es " + lado*altura);
                break;

            default:
                System.out.println("Lo siento, aún no podemos calcular eso");
                break;
        }
    }
}
