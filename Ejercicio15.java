
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio15 {
     public static void main (String[] args) {
     Scanner s = new Scanner (System.in); {
       System.out.println("Dame una base:"); 
       int base = Integer.parseInt(s.nextLine());
       
       System.out.println("Dame un exponente:");
       int ex = Integer.parseInt(s.nextLine());
     
    double potencia;
    int exp;
        
    for (int i = 1; i <= ex; i++) {
        
      potencia = 1;
      exp = i;
      
    for (int j = 0; j < exp; j++) {
      potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);  
     
     }
     
     }
     }
}

