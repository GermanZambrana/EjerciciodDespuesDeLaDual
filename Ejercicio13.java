/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author Germán Zambrana
 */
import java.util.Scanner;

public class Ejercicio13 {
     public static void main (String[] args) {
     Scanner s = new Scanner (System.in);
     
     int positivos = 0;
     int neg = 0;
    
    System.out.println("Dame 10 numeros enteros:");

    for (int i=0; i<10; i++) { 
      int n = Integer.parseInt(s.nextLine());
      if (n<0){
        neg++;
      }else{
        positivos++;
      }
    }
    System.out.println("Hay: " + positivos + " positivos " + neg + " negativos");
}
}
