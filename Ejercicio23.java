
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio23 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
System.out.println("Suma que no supere el valor de 10000:");{

int n;
int suma = 0;
int cont = 0;
    
 do {
  n = Integer.parseInt(s.nextLine());
  suma += n;
  cont++;
  } while (suma <= 10000);
    
  System.out.println("Hay :" + cont + " numeros");
  System.out.println("El total es: " + suma);
  System.out.println("La media es " + suma / cont);
   }
   }
   }
}

