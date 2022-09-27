/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expresiones;

import java.util.Scanner;
import java.util.Stack;

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
        //Se hace la asignacion al objeto de lo que traemos en el arreglo 
        String[]arrayInfix = expr.split("");
        //Declaracion de las filas
        Stack<String>E= new Stack<String>();//pila entrada 
        Stack<String>P= new Stack<String>();//pila temporal para los operadores de la expresion
        Stack<String>S= new Stack<String>();//pila salida
        //se agrega el arreglo a la pila de entrada (E)
        for(int i=arrayInfix.lenght-1;i>=0;i--){
        //apila los elementos de la pila
           E.push(arrayInflix);
            //se hace uso de la excepcion para definir el tipo de expresion
        }  
        //desarrollo de los algoritmos infijo a postfijo
        try{
            //empty nos deice si la fila esta vacia
            while(!E.isEmpty()){
                //apunta el ultimo elemento de la pila
                switch(pref(E.peek())){
                    case 1:
                        //se llama el metodo apilar (push) hacia la pila P (temporal) 
                        P.push(E.pop());
                        break;
                    case 3:
                    case 4:
                        while(pref(P.peek()))>=pref(E.peed())){
                            //se llama al metodo POP() desde la pila de salida S (salida)
                            S.push(P.pop());
                            
                        }
                        P.push(E.pop());
                        break;
                    case 2:
                        while(!P.peek().equals("("){
                            S.push(P.pop());
                        }
                        P.pop();
                        E.pop();
                        break;
                    default:         
                        S.push(E.pop());
                              
            }       
        }
        //Elimiacion de impuresas en las expresiones algebraicas
        String infix=expr.replace("","");
        String postfix=S.toString().replaceAll("[\\]\\[,]","");                      
    }
    
}
