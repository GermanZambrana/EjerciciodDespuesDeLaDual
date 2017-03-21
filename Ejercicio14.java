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

public class Ejercicio14 {
     public static void main (String[] args) {
     Scanner s = new Scanner (System.in); {
       
       System.out.println("Dame una base:"); 
       int base = Integer.parseInt(s.nextLine());
       
       System.out.println("Dame un exponente:");
       int ex = Integer.parseInt(s.nextLine());
       
       double potencia = 1;
       
       if (ex==0){
         potencia=1;
       }
       
       if (ex >0){
         for (int i = 0; i<ex; i++){
           potencia *= base;
         }
         
       if (ex<0) {
         for (int i = 0; i<ex; i++){
           potencia *= base;
         }
       }  
       }
       System.out.println("La potencia es: " + potencia);
       
       
       
       
       
     }
     }
}

