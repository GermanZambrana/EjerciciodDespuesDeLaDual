
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio27 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
   
   System.out.println("Dame un numero y te dire sus multiplos hasta 3: ");{
    
    int n = Integer.parseInt(s.nextLine());
    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < n; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("Desde 1 hasta " + n + " hay " + cuenta);
    System.out.println(" multiplos de 3 y suman " + suma);
  }
}
}
}