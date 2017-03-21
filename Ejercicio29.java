
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio29 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
   
     System.out.println("Dame un numero y te digo la posicion: ");{
     System.out.print("Dime un numero: ");
    
     int numeroGrande = Integer.parseInt(System.console().readLine());

     System.out.print("Introduce un numero: ");
    
     int numeroPequeno = Integer.parseInt(System.console().readLine());

     System.out.print("Los numeros enteros positivos menores que " + numeroGrande );
     System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes:");

     int cuenta = 0;
     int suma = 0;

     for (int i = 1; i < numeroGrande; i++) {
      if ((i % numeroPequeno) != 0) {
        System.out.print(i + " ");
}
}
}
}
}
}

