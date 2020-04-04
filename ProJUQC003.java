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
public class ProJUQC003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Leer= new Scanner (System.in);
        int T;
        System.out.print("Ingrese el tamaño de la matriz:  ");
        T=Leer.nextInt();
        
       char [][] MAT=new char [T][T];
       char [][] MAT2=new char [T][T];
       char [][] MAT3=new char [T][T];
       
       System.out.print("\n---------------------MATRIZ 1---------------------------\n\n");
       
       for(int H=0;H<T; H++)
       {
           for(int V=0; V<T; V++)
           {
               if(H==0 || V==0 ||H==T-1 || V==T-1)
               {
                   MAT [H][V]='1';
               }
               else
               {
                   MAT [H][V]='0';
               }
               System.out.print(MAT[H][V]+" ");
           }
           System.out.print("\n");
       }
       
       
       System.out.print("\n");
       
       System.out.print("\n---------------------MATRIZ 2---------------------------\n\n");
       
       
       for(int H=0;H<T; H++)
       {
          
               
           for(int V=0; V<T; V++)
           {
               if(H==V)
               {
                   MAT2 [H][V]='1';
               }
                else if(T-H==V+1)
               {
                   MAT2 [H][V]='1';
               }
               
                else
               {
                   MAT2 [H][V]='*';
               }
               
               System.out.print(MAT2[H][V]+" ");
           }
           System.out.print("\n");
       }
      
    
      System.out.print("\n");
       
       System.out.print("\n---------------------MATRIZ 3---------------------------\n\n");
      
    
    for(int H=0;H<T; H++)
       {
           for(int V=0; V<T; V++)
           {
               if(V+1*H<T-1)
                   
               {
                   MAT3 [H][V]='1';  
               }
               else if(V+1*H>T-1)
               {
                   MAT3 [H][V]='0';  
               }
               
                else
               {
                   MAT3 [H][V]='*';
               }
               
               System.out.print(MAT3[H][V]+" ");
           }
           System.out.print("\n");
       }
      
    }
    

    private static void nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}