/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ESTO ES UN COMENTARIO...                     

package projuqc001;

import java.util.Scanner;

public class ProJUQC001 {
    private static Object Leer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer= new Scanner (System.in);
        
       int i,V;
     
        System.out.println("Ingresa el tamaño de tu vector:  ");
        V=Leer.nextInt();
        
         int[ ] va =new int [V];
         
        for(i=0; i<V; i++)
        {
           System.out.println("Ingresa el valor:  ["+i+"]:  ");
           va[i]=Leer.nextInt();
        }
        
        for( i=0; i<V;  i++)
       {
           System.out.println("La posicion "+i+" tiene el valor "+va[i]);
       }  
       
 
       /*for(int i=0; i<10; i++)
       {
           System.out.println("Ingresa el valor:  ["+i+"]:  ");
           Nu[i]=Leer.nextInt();
       }
       
       for(int i=0; i<10;  i++)
       {
           System.out.println("La posicion "+i+" tiene el valor "+Nu[i]);
       }  
       
       
        
       for(int i=0; i<10;  i++)
       {
            System.out.println("\n\n");
           System.out.print("["+Nu[i]+"]");
       }  */
    }

    private static void nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}