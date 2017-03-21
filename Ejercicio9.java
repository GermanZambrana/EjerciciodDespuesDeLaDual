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

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Dame un número y te diré cuantos digitos tiene");
    int numero = Integer.parseInt(s.nextLine());
    int cont = 0;
    do {
      cont++;
      numero = numero/10;
    } while (numero != 0);
    System.out.println("El numero tiene " + cont + " dígitos");
    
  }
  
}
