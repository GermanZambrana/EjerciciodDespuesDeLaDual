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

public class Ejercicio16 {
     public static void main (String[] args) {
     Scanner s = new Scanner (System.in); {
       
       System.out.println("Dame un numero:"); 
       int n = Integer.parseInt(s.nextLine());{
       
       boolean primo = true;
       
       for (int i =2; i<n; i++){
       if ((n/i)==0){
       primo = false;
       }  
       
       if (primo){
         System.out.println("El numero es primo");
       }else{
         System.out.println("El numero no es primo");
       }
       
      
     }
     }
     }
     }
}


