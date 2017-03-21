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

public class Ejercicio10 {
  @SuppressWarnings("empty-statement")
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.println("Dame números y haré la media, introduce un numero negativo para terminar");
    
    int numero = Integer.parseInt(s.nextLine());
    int cont = 0;
    int opera = 0;
    
    while (numero > 0){ 
      if (numero >0){
      opera = opera + numero;
      cont++;
    }
    
    numero = Integer.parseInt(s.nextLine());
  }
  if ((opera != 0) || (0 <= numero)) {
  System.out.println("La media es " + (opera / cont));
  }else{
  System.out.println("El valor no es válido");
    }
  }
}

      
  
  
