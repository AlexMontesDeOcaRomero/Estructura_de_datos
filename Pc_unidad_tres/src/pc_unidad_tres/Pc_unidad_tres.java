/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  Mostrar menu y resultados en JOption
 */

package pc_unidad_tres;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Pc_unidad_tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instaciar un objeto
        Pila_Sin_Stack mets = new Pila_Sin_Stack();
        Scanner opcion = new Scanner(System.in);
        int seleccion;
        
        do{
          System.out.println("Menu de la pila");
          System.out.println("1.-PUSH");//se llama al metodo para insertar elemento
          System.out.println("2.-POP");//se llama al metodo POP
          System.out.println("3.-Mostrar Pila");//ver la pila
          System.out.println("4.-Salir");//
          
          System.out.println("Teclee la opcion:");
          seleccion=opcion.nextInt();
          
          switch(seleccion){
              case 1: 
                  mets.push();
                  break;
              case 2: 
                  mets.pop();
                  break;
              case 3:
                  mets.ver();
                  break;
              default:
                  System.err.println("ERROR");
          }
        }while(seleccion!=4);
    }
    
}
