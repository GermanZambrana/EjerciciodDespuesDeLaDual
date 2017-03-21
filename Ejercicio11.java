package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println("Dame un numero entero");
    
    int n = Integer.parseInt(s.nextLine());
    
    for(int i = n; i<n + 5; i++) {
      System.out.println("Numero: " + i + " Cuadrado: " + i*i + " Cubo: " + i*i*i);
      
    }
  
    }
}

