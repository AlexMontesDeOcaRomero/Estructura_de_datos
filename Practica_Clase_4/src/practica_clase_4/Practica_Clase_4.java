/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica_clase_4;

/**
 *
 * @author invitado
 */
public class Practica_Clase_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=20, b=10;
        String x ="Programacion", y="Objetos";
        
        int ar[]={1,2,3};
        int br[]={1,2,3};
        
        boolean condicion=true;
        
        System.out.println("a==b: " +(a==b));
        System.out.println("a<b: " +(a<b));
        System.out.println("a<=b: " +(a<=b));
        System.out.println("a>b: " +(a>b));
        System.out.println("a>=b: " +(a>=b));
        System.out.println("a!=b: " +(a!=b));
        
        System.out.println("x==y: " +(ar==br));
        System.out.println("condicion==true: " +(condicion==true));
        
        //los arreglos se pueden comparar con operadores relacionales?
        //no se puede
        //si, no y porque?
        //por que los operadores relacionales solo compara la posicion mas no el 
        //valor neto del objeto/arreglo
        //
        //
        // 
    }
    
}
