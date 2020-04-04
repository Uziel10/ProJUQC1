/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//ESTO ES UN COMENTARIO...                     

package projuqc001;

import java.util.Scanner;

/**
 *
 * @author Tesoem
 */
public class ProJUQC002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         char [][] MAT=new char [5][5];
         char [][] MAT2=new char [5][5];
         char [][] MAT3=new char [5][5];
         System.out.println("\n  \t \t MATRIZ DE 5x5");
        System.out.println("\n------------------------------------------------------------");
       System.out.println("\n  \t \t MATRIZ 1");
       
       
     for(int x=0; x<5; x++)           //ciclo for para las columnas en X
        {
            for(int y=0; y<5; y++)         //ciclo for andado para las columnas en Y
        {
                 if(x==y)
               {
                   MAT [x][y]='1';
               }
                else if(5-x==y+1)
               {
                   MAT [x][y]='1';
               }
               
                else
               {
                   MAT [x][y]='0';
               }
               
               System.out.print("["+MAT[x][y]+"]");
           }
        
           System.out.print("\n");
        }
     System.out.println("\n------------------------------------------------------------");
       System.out.println(" \n  \t \t MATRIZ 2");
     for(int j=0; j<5; j++)           //ciclo for para las columnas en X
        {
            for(int u=0; u<5; u++)         //ciclo for andado para las columnas en Y
        {
                    if(j==0 || j==4 || u==0 || u==4)
               {
                   MAT2 [j][u]='1';
               }
                else
               {
                   MAT2 [j][u]='0';
               }
               
               System.out.print("["+MAT2[j][u]+"]");
           }
            System.out.print("\n");
     }
     
    
     System.out.println("\n------------------------------------------------------------");
       System.out.println("\n  \t \t MATRIZ 3");
     for(int A=0; A<5; A++)           //ciclo for para las columnas en X
        {
            for(int B=0; B<5; B++)         //ciclo for andado para las columnas en Y
        {
                  if(A+1*B<5-1)
                   
               {
                   MAT3 [A][B]='1';  
               }
               else if(A+1*B>5-1)
               {
                   MAT3 [A][B]='0';  
               }
               
                else
               {
                   MAT3 [A][B]=' ';
               }
                  System.out.print("["+MAT3[A][B]+"]");
                          }     
        
            System.out.print("\n");
     }
        

     
  
    }
    private static void nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}