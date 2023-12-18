/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Reto2022_003Primo {

 public static void main(String[] args) {
  for (int i = 0; i <= 100; i++) {
   if (Primo(i)) System.out.println(i);
  }
 }

 public static boolean Primo(int numero) {
  if (numero == 2 || numero == 3 || numero == 5 || numero == 7) return true;
  if (numero == 1 || numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) return false;
  return true;
 }

 /*Otra manera de hacerlo sería:
  public static boolean Primo (int numero){
   if (numero<=1){
   return false;}
   for (int i=2; i<numero; i++){
   if (numero%i==0){
   return false;}
   }
   return true;
   }*/

}
