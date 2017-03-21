
package bucles;

/**
 *
 * @author Germán Zambrana
 */
  import java.util.Scanner;

public class Ejercicio21 {
   public static void main (String[] args) {
   Scanner s = new Scanner (System.in); {
System.out.println("Introduzca numeros:");
    System.out.println("Para parar, un nº negativo:");

    int numInt = Integer.parseInt(s.nextLine());
    int Cont = 0;
    int SumImp = 0;
    int NumImp = 0;
    int Par = 0;
    
    do {
      numInt = Integer.parseInt(s.nextLine());
      
      if (numInt >= 0) {
        Cont++;
        if ((numInt % 2) == 1) { 
          SumImp += numInt;
          Cont++;
        } else {
          if (numInt > Par)
            Par = numInt;
        }
      }
    } while (numInt >= 0);

    System.out.println("Hay" + Cont + " numeros");
    System.out.println("La media es " + SumImp/NumImp);
    System.out.println("El maximo es " + Par);
  }
}
}
     
