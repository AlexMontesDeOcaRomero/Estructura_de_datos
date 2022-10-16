/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_estructura_de_datos;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Montes
 */
public class Proyecto_Estructura_de_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, nodo = 0, nodo_information = 0, opcion1 = 0, opcion2 = 0;
        Pila pila = new Pila();
        Cola cola = new Cola();
        
        do{
            try{
                
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones(SE MANEJA POR NUMERO DE CONTROL)\n\n"
                        + "1. Pilas\n"
                        + "2. Colas\n"
                        + "3. Listas\n"
                        + "4. Salir.\n\n"));
                switch(opcion){
                    case 1:
                     do{
                        try{
                        opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                 "Menu de opciones(SE MANEJA POR NUMERO DE CONTROL)\n\n"
                                + "1. Insertar un nodo\n"
                                + "2. Eliminar un nodo\n"
                                + "3. La pila esta vacia?\n"
                                + "4. Vaciar pila\n"
                                + "5. Mostrar contenido de la pila\n"
                                + "6. Salir\n\n"));
                        switch(opcion1){
                            case 1:
                                nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingrese el valor a guardar en el nodo"));
                                pila.InsertarNodo(nodo);
                                break;
                            case 2:
                                if(!pila.PilaVacia()){
                                    JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                    + pila.EliminarNodo());
                                }else{
                                    JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                }
                                break;
                            case 3:
                                if(pila.PilaVacia()){
                                    JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                }else{
                                    JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                                }
                                break;
                            case 4:
                                if(!pila.PilaVacia()){
                                    pila.VaciarPila();
                                    JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                                }else{
                                    JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                }
                                break;
                            case 5:
                                if(!pila.PilaVacia()){
                                   pila.MostrarValores();
                                }else{
                                    JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                }   
                                break;
                            case 6:
                                opcion1 = 6;
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null,"Opcion incorrecta, vuelva a intentar nuevamente");
                                break;
                        }
                      }catch(NumberFormatException e){
                          
                      }  
                    }while(opcion1 !=6);
                        break;
                    case 2:
                        do{
                        try{
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                 "Menu de opciones(SE MANEJA POR NUMERO DE CONTROL)\n\n"
                                + "1. Insertar un nodo\n"
                                + "2. Extraer un nodo\n"                                                              
                                + "3. Mostrar contenido de la cola\n"
                                + "4. Salir\n\n"));
                        switch(opcion2){
                            case 1:
                                nodo_information = Integer.parseInt(JOptionPane.showInputDialog(null,
                                       "Porfavor ingresa el valor a guardar en el nodo" ));
                                cola.Insertar(nodo_information);
                                break;
                            case 2:
                                if(!cola.ColaVacia()){
                                    JOptionPane.showMessageDialog(null,"Se extrajo un nodo con el valor: "
                                            + cola.Extraer());
                                }else{
                                    JOptionPane.showMessageDialog(null,"La cola esta vacia");
                                }
                                break;
                            case 3:
                                cola.MostrarCont();
                                break;
                            case 4:
                                opcion2 = 4;
                                break;
                                
                            default:
                                JOptionPane.showMessageDialog(null,"Opcion incorrecta, vuelva a intentar nuevamente");
                                break;
                        }
                      }catch(NumberFormatException e){
                          
                      }  
                    }while(opcion2 !=4);
                        break;
                    case 3:
                        pila.MostrarValores();
                        cola.MostrarCont();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta, vuelva a intentar nuevamente");
                        break;
                }
                        
                
            }catch(NumberFormatException e){
                
            }
            
        }while(opcion !=4);
    }
    
}
