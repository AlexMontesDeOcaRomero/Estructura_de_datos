/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_clase_2;

import java.util.Scanner;

/**
 *
 * @author Alex Montes
 */
public class Practica_Clase_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanenr es una clase*/
        //Se instancia objeto
       
        Scanner entrada = new Scanner (System.in);
        /*se declaran variables para aplicar las operaciones solicitadas a los datos introducidos por el usuario*/
        float promedio=0;
        float suma=0;
        float mayor=0;
        float menor=0;
        //se declara el arreglo 
            int []nums = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Por favor ingresa el número de la posición: "+(i));
                /*valores,datos y tipo de dato*/
                nums[i]=entrada.nextInt();                        
                }
                /*Operaciones que se realizan */
            for (int i = 0; i < nums.length; i++) {
                suma+=nums[i];
            if (mayor<nums[i]) {
                mayor=nums[i];                
                }
                System.out.println(String.format("Posicion[%d]Elemento:%d",i,nums[i]));
        }
    }
    
}
