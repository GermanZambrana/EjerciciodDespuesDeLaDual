
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio17 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
       
   System.out.println("Dame un numero:"); 
   
   int n = Integer.parseInt(s.nextLine());
   
   if (n < 0) {
     System.out.println("El numero es negativo"); 
   }
   int suma = 0;
   
   for(int i = n; i < n + 100; i++ ){
     suma+=1;
     System.out.println("La suma es: " + suma);
   }
   
  
}
}
}

