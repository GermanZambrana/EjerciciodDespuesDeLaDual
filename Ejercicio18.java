
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio18 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
     System.out.println("Dame el 1º numero:");
     int n1 = Integer.parseInt(s.nextLine());
  
     System.out.println("Dame el 2º numero");
     int n2 = Integer.parseInt(s.nextLine());
     
     
     
     for (int i = n1; i < n2; i+=7){
       System.out.println(i +"");
     }   
}
   }
}

