/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expresiones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Expresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea objeto para informacion de la expresion
        System.out.println("Escriba una expresion algebraica:");
        Scanner leer = new Scanner(System.in);
        //Depurar la expresion algebraica
        
        String expr = depurar(leer.nextLine());
        String[]arrayInfix = expr.split("");
        //Declaracion de las filas
        Stack<String>PE= new Stack<String>();//pila entrada 
        Stack<String>PT= new Stack<String>();//pila temporal para los operadores de la expresion
        Stack<String>PS= new Stack<String>();//pila salida
    }
    
}
