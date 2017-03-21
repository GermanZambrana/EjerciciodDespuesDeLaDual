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

public class Ejercicio8 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Dame un numero y te dare la tabla de multiplicar");
    
    int numeroInt = Integer.parseInt(s.nextLine());
    for (int i = 0; i <=10; i++) {
      System.out.println(numeroInt + "*" + i + "=" + (numeroInt * i));
    }
    
  }
  
}
