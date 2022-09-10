/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_clase_3;

import java.util.Scanner;

/**
 *
 * @author Alex Montes
 */
public class Practica_Clase_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se declara la matriz 
        int matriz [][]= new int [3][3];
        //Se solicitan valores al usuario
            Scanner entrada= new Scanner (System.in);
        
        float sumaFila=0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                    System.out.println("Ingrese el número en la fila: " +(i)+" columna " +j+":");
                    matriz[i][j]= entrada.nextInt();
            }
        }
        for (int i = 0; i <matriz.length; i++) { 
                sumaFila=0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila+= matriz [i][j];
                System.out.print(String.format(" %d", matriz [i][j]));    
            }
            System.out.print(String.format(" Suma por fila: %f, 3"
                    + "3"
                    + "promedio fila: %f" , sumaFila,sumaFila/matriz.length));
            System.out.println();
        }
    }
    
}
