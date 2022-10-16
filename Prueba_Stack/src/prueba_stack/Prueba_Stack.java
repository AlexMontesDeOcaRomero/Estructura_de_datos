/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_stack;

import java.util.Stack;

/**
 *
 * @author Alex Montes
 */
public class Prueba_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Stack<Number> pila = new Stack<Number>();
    
    long numeroLong=12;
    interger numeros = 34567;
    float numeroFloat=1.0F;
    Double numeroDouble=1234.5678;
    
    //se hace uso de los metodos propios de la pila
    pila.push(numeroLong);
    imprimirPila(pila);
    pila.push(numeros);
    imprimirpila(pila);
    pila.push(numeroFloat);
    imprimirpila(pila);
    pila.push(numeroDouble);
    imprimerpila(pila);
    
    //se integra excepcion
    }
    
}
