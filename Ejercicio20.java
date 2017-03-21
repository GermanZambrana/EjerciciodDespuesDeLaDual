
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio20 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
     
   System.out.println("Dame el numero de altura:");
    
   int n = Integer.parseInt(s.nextLine());{
   
     System.out.print("Introduzca el carÃ¡cter de relleno: ");
   int c = Integer.parseInt(s.nextLine());
    
    int alt = 1;
    int i = 0;
    int espacios = n - 1;
    int ev = 0;
    
    while (alt < n) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      System.out.print(c);
      for (i = 1; i < ev; i++) {
        System.out.print(" ");
      }
      
      if (alt>1) {
        System.out.print(c);
      }
      
      System.out.println();
      alt++;
      espacios--;
      ev += 2;
    }
    for (i = 1; i < alt*2; i++) {
      System.out.print(c);
    }
}
}
}
}
