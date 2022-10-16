/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_pila;

import java.util.Stack;

/**
 *
 * @author Alex Montes
 */
public class Stack_Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea el objeto para poder concatenar los metodos 
        Stack pila = new Stack();
        //metodo push para ingresar el valor a la "pila"
        System.out.println("se agrega el numero 23 a la pila" + pila.push(23));
        System.out.println("se agrega el numero 33 a la pila" + pila.push(33));
        //se hace uso del metodo search para buscar un elemento determinado
	System.out.println("se busca el elemento 23 en la pila" + pila.search(23));
        //se hace uso del metodo pop
	System.out.println("el primer elemento de la pila" + pila.pop());
        //Se jace consulta sobre el primer elemento de la pila
        System.out.println("consulta el primer elemento de la pila" + pila.peek());
        //se hace uso del metodo empty
	System.out.println("la pila esta vacia..?" + pila.empty());
	System.out.println("se busca la posicion del elemento 23 en la pila: " + pila.search(23));
        System.out.println("se retira el primer elemento de la pila: " + pila.pop());
        System.out.println("¡¿la pila esta vacia..?" + pila.empty());
    }
    
}
