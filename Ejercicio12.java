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

public class Ejercicio12 {
    public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println("Dame un numero: ");
    
    int n = Integer.parseInt(s.nextLine());
    int n1 = 0;
    int n2 = 1;
    
    for (int i = 0; i<n; i++) {
      System.out.println("Fibonacci: " + n1);
            int aux = n1;
      n1 = n1 + n2;
      n2 = aux;
    }
    }
}

