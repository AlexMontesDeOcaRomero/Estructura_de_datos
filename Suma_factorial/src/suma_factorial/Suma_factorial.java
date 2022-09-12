/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 1.- se calcula el factorial
 2.- se suma el factorial(es)
 3.- se calcula factorial de n numero ingresado
 4.- (completar codigo)
*/

package suma_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Suma_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double factorial,suma =0;
        Scanner sc = new Scanner(System.in);
        
        //leer numero entero >=0
        
        do{
            System.out.println("Introduzca un numero >=0:");
            N=sc.nextInt();
        }while(N<0);
        for(int i=0;i<=N;i++){
            //para cada numero desde 1 hasta N
            factorial=1;
            for(int j=1;j<=i;j++){
               factorial=factorial*j; 
            }
             //se muestra el factorial
            System.out.println(String.format("%n%2d!=%.0f%n",i,factorial));
            //se suma factorial
            suma=suma+factorial;
        }
       System.out.printf("Suma de los factoriales desde cero hasta %d:%0f%n",N,suma);
    }
    
}
