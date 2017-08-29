/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */

public class Matrices1 implements OrientacionInterface{
    public int tamano,i,j;
    public int [][] matriz;
    
    Scanner sc = new Scanner(System.in);
    public void setTamano(int tamano){
        this.tamano=tamano;
        matriz=new int[tamano][tamano];
        for(i=0;i<tamano;i++){
            for(j=0;j<tamano;j++){
                System.out.println("Digite el dato de la casilla"+i+" "+j);
                int dato=sc.nextInt();
                matriz[i][j]=dato;
            }    
        }
        for(int i=0;i<tamano;i++){
            for(int j=0;j<tamano;j++){
                System.out.print(matriz[i][j]+"\t");
            }
                 
        }
    }
    
    public void descendente(){
        for( i=0; i < tamano; i++){
         for( j=0;j< tamano; j++){
           for(int k=0; k < tamano; k++){
                 for(int l=0; l <tamano; l++){
                       if(matriz[i][j] > matriz[k][l]){
                              int aux = matriz[i][j];
                              matriz[i][j] = matriz[k][l];
                              matriz[k][l] = aux;
                         }
                  }
            }
       }     
    }
        for(int i=0;i<tamano;i++){
            for(int j=0;j<tamano;j++){
                System.out.print(matriz[i][j]+"\t");
            }
                 
        }
    }
    @Override
    public void ascendente(){
        for( i=0; i < tamano; i++){
         for( j=0;j< tamano; j++){
           for(int k=0; k < tamano; k++){
                 for(int l=0; l <tamano; l++){
                       if(matriz[i][j] < matriz[k][l]){
                              int aux = matriz[i][j];
                              matriz[i][j] = matriz[k][l];
                              matriz[k][l] = aux;
                         }
                  }
            }
           }     
        }
        for(int i=0;i<tamano;i++){
            for(int j=0;j<tamano;j++){
                System.out.print(matriz[i][j]+"\t");
            }
                 
        }
    }
}
