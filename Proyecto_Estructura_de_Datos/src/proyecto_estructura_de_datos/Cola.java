/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructura_de_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Montes
 */
public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    //Metodo para saber si esta vacia
    public boolean ColaVacia(){
        if(inicioCola == null){
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para insertar
    public void Insertar(int informacion){
        
        Nodo nuevo_noodo = new Nodo();
        nuevo_noodo.information = informacion;
        nuevo_noodo.siguiente = null;
        
        if(ColaVacia()){
            inicioCola = nuevo_noodo;
            finalCola = nuevo_noodo;
        } else {
            finalCola.siguiente = nuevo_noodo;
            finalCola = nuevo_noodo;
        }
    }
    
    //Metodo para extraer
    public int Extraer(){
        if (!ColaVacia()){
            int informacion =inicioCola.information;
            
            if(inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            }else{
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    //Metodo para mostrar el contenido
    public void MostrarCont(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.information + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] = Cola.split(" ");
        
        for(int i = cadena.length - 1; i>=0; i--){
            ColaInvertida += " " +cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = ""; 
    }
}
