
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio7 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    int numeroInt=0;
    int cont=1234;
    
    
    System.out.println("Introduce la contraseña para la caja:");
    
   int numero = Integer.parseInt(s.nextLine());
    
    while((numeroInt < 3) && (numero != cont)) {
      System.out.println("Lo siento, intentalo de nuevo");
    numero = Integer.parseInt(s.nextLine());
    numeroInt++;  
    }
    if (numero == cont) {
      System.out.println("Caja desbloqueada");
      
    }else{
      System.out.println("Lo siento, te has quedado sin intentos");
    }
  }
}
