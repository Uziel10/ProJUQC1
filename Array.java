package projuqc001;

import java.util.Scanner;

public class Array {
    
     public static void  ordenArray()
     {
        
         Scanner Numero= new Scanner (System.in);
        int D;
        
        System.out.print("¿CUANTOS DATOS VAS A INGRESAR?:  ");
        D=Numero.nextInt();
        int arreglo[]=new int[D];
        System.out.println("INGRESA EL VALOR  ");
        for(int i=0;i<D;i++)
        {
        arreglo[i]=Numero.nextInt();
        }
        int auxiliar=0;
    
         
      for(int j=0; j<D;j++)  
        for (int i=0;i<D-1; i++)
        {
            if(arreglo[i]>arreglo[i+1])
            {
                auxiliar=arreglo[i];
                arreglo[i]=arreglo[i+1];
                arreglo[i+1]=auxiliar;
            }
            }
       int u=0;
       System.out.print("EL ORDENAMIENTO ES: \n");
        while(u<D)
        {
       System.out.println(arreglo[u]);
       u++;
        }
     }
    
}
