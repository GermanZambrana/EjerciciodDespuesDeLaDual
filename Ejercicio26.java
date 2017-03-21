
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio26 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
   System.out.println("Dame un numero y te digo la posicion: ");{
     
    int n = Integer.parseInt(s.nextLine());

    System.out.print("Digito: ");
    
    int digito = Integer.parseInt(s.nextLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + n + " en las siguientes posiciones: ");

    int numero = n;
    int reves = 0;
    int longi = 0;
    int pos = 1;
    
    if (numero == 0) {
      longi = 1;
    }
    
    while (numero > 0) {
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
      longi++;
    } 
        
    while (reves > 0) {
      if ((reves % 10) == digito) {
        System.out.print(pos + " ");
      }
      reves /= 10;
      pos++;
    }

    System.out.println();
  }
}
}
}

