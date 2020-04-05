/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author uziel
 */
public class Herencia_Uziel {

    public static void main(String[] args) {
        Dog[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    
        
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
       
       Scanner Leer= new Scanner (System.in);
        Dog2[] dogs = new Dog2[4];
        String[] names = {"", "", "", ""};
        String[] colours = {"", "", "", ""};
        double[] weight={0,0,0,0};
        double[] portion={0,0,0,0};
        
        
          for (int i = 0; i < dogs.length; i++) {
           System.out.println("Ingresa el nombre:  ["+i+"]:  ");
           names[i]=Leer.nextLine();
        }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Ingresa el color:  ["+i+"]:  ");
           colours[i]=Leer.nextLine();
           }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Ingresa el peso:  ["+i+"]:  ");
           weight[i]=Leer.nextDouble();
           }
           for (int i = 0; i < dogs.length; i++) {
           System.out.println("Ingresa la porcion:  ["+i+"]:  ");
           portion[i]=Leer.nextDouble();
           }
       
           
            
            for (int i = 0; i < dogs.length; i++) {
                Dog2  dog = new Dog2();
            dog.setName(names[i]);
            System.out.println("LOS NOMBRES SON: "+dog.getName());    
            dog.setColour(colours[i]);
            System.out.println("LOS COLORES SON: "+dog.getColour());
            dog.setWeight(weight[i]);
            System.out.println("LOS PESOS SON: "+dog.getWeight());
            dogs[i] = dog;
            dog.setPortion(portion[i]);
            System.out.println("LAS PORCIONES SON: "+dog.getPortion());
            
             dogs[i] = dog;
             
            }
            return dogs;
    }
    }
    
            


    
             
    
