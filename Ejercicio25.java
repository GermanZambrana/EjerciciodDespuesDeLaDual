
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio25 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
   System.out.println("Un numero y lo pong al reves: ");{
   
   int n = Integer.parseInt(s.nextLine());
   int numero = n;
   int reves = 0;
    
   while (numero > 0) {
     reves = (reves * 10) + (numero % 10);
     numero /= 10;
   }
    System.out.println("La vuelta de: " + n + " es: " + reves);
 }
 }
 }
}