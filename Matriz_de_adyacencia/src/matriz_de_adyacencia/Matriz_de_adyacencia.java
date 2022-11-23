/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz_de_adyacencia;

/**
 *
 * @author invitado
 */
public class Matriz_de_adyacencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private int n;
        private int [][]matriz;

    //se crea constructor
    public Matriz_de_adyacencia(int n) {
        this.n = n;
        matriz=new int[this.n][this.n];
        //se inicializa la matriz en cero
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j]=0;
            }
        }
        
    }
    //se crea metodo agregar
    public void agregar(int i, int j){
        matriz[i][j]+=1;
        
    }
    //se agrega metodo para remover elemento
    public void remover(int i, int j){
        if(matriz[i][j]>0)
           matriz[i][j]-=1; 
    }
    public void imprimir(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(matriz[i][j]+"");
            }
            System.out.println();
        } 
}
}
