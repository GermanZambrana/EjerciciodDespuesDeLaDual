
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio19 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
     
     System.out.println("Dame el numero de altura:");
     int n = Integer.parseInt(s.nextLine());
     
     System.out.println("Dame el caracter:");
     int c = Integer.parseInt(s.nextLine());
     
     int alt = 1;
     int i = 0;
     int espacios = n-1;
    
    while (alt<= n) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < alt * 2; i++) {
        System.out.print(c);
      }
      
      System.out.println();

      alt++;
      espacios--;
}
}
}
}

