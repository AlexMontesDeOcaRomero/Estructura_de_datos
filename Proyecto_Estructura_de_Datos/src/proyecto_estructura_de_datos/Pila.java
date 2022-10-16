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
public class Pila {
   private Nodo UltimoValorIng;
   int tamano = 0;
   String Lista = "";
   
   public Pila(){
       UltimoValorIng = null;
       tamano = 0;
   }
   
   //Metodo para saber si esta vacia
   public boolean PilaVacia(){
       return UltimoValorIng == null;
   }
   
   //Metodo para insertar nodos
   public void InsertarNodo(int nodo){
       Nodo nuevo_nodo = new Nodo(nodo);
       nuevo_nodo.siguiente = UltimoValorIng;
       UltimoValorIng = nuevo_nodo;
       tamano++;
   }
   
   //Metodo para eliminar una pila
   public int EliminarNodo(){
     int auxiliar = UltimoValorIng.information;
     UltimoValorIng = UltimoValorIng.siguiente;
     tamano--;
     return auxiliar;
   }
   
   //Metodo para vaciar la pila
   public void VaciarPila(){
       while(!PilaVacia()){
           EliminarNodo();
       }
   }
   
   //Metodo para mostrar el contenido
   public void MostrarValores(){
       Nodo recorrido = UltimoValorIng;
       
       while(recorrido != null){
           Lista += recorrido.information + "\n";
           recorrido = recorrido.siguiente;
       }
       JOptionPane.showMessageDialog(null, Lista);
       Lista = "";
   }
}
