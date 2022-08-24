/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package est.datos.b;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EstDatosB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se solicita al usuario ingresar 10 varoles, de los cuales se debera:
        //sumar el total de numeros
        Scanner entrada = new Scanner(System.in);
        
        float promedio = 0;
        float suma = 0;
        float mayor = 0;
        float menor = 0;
        
        int[]nums = new int[10];
        for(int i=0 ; i<10; i++){
        System.out.println("Ingrese el numero de la posicion" +(i)+":" );
        nums[i]=entrada.nextInt();
        }
        //operaciones
        for(int i=0;i<nums.length;i++){
            suma+=nums[i];
            if(mayor<nums[i]){
                mayor=nums[i];
            }
            System.out.println(String.format("Posicion[%d]Elemento:%d",i,nums[i]));
        }
            
            
            
    }
}