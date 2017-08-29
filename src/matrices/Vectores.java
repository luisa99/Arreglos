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
public class Vectores implements OrientacionInterface{
    public int tamano,i,j;
    public int [] vector;
    
    Scanner sc = new Scanner(System.in);
    public void setTamano(int tamano){
        this.tamano=tamano;
        vector=new int[tamano];
        for(i=0;i<tamano;i++){
                System.out.println("Digite el dato de la casilla"+i);
                int dato=sc.nextInt();
                vector[i]=dato;
                
        }
        for(int i=0;i<tamano;i++){
                System.out.print(vector[i]+"\t");
            }
                 
        
    }
    
    public void descendente(){
        for(i=0;i<tamano;i++){
         for(int x=i+1;x<tamano;x++){
    	    if(vector[i]<vector[x]){
        	             int aux=vector[i];
                              vector[i]=vector[x];
            	              vector[x]=aux;
        	     }
         }
    }
        for(int i=0;i<tamano;i++){
          
                System.out.print(vector[i]+"\t");
            
                 
        }
    }
    @Override
    public void ascendente(){
        for(i=0;i<tamano;i++){
            for(int x=i+1;x<tamano;x++){
                if(vector[i]>vector[x]){
                                 int aux=vector[i];
                                       vector[i]=vector[x];
                                  vector[x]=aux;
                         }
             }
        }
        for(int i=0;i<tamano;i++){
                System.out.print(vector[i]+"\t");
        }
    }
}
