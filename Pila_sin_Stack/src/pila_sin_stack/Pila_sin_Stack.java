/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila_sin_stack;

import java.util.Scanner;

/**
 *
 * @author Alex Montes
 */
public class Pila_sin_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
    int pila1[]=new int [4];
    int tope=-1;
    
    
        //se crean os metodos similares a as usados
       public int push(){
        int tope;
           if (tope>=pila1.length-1){
               
           }else {
            tope+=1;
            System.out.println("LA PILA ESTA LLENA");
            pila1[tope]= teclado.nextInt();
            
    }
           return tope;
    
}
        public int pop(){
        int tope;
            if(tope==-1){
                System.out.println("La pila esta vacia");
            }else{
                System.out.println("Se elimino un elemento de la pila");
            int[] pila1;
                pila1[tope]=0;
                tope =-1;
            }
            return tope;
        }
        public void ver(){
            for(int tope=3;tope>=0;tope--){
                System.out.println("Datos de la pila: " + pila1[tope]);
            }
    }
    
}
