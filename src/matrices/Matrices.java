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
public class Matrices {
    public int opcion,tamano;
    public Matrices1 mama;
    public Vectores hola;
    public Matrices(){
        do{
        System.out.println("1.Matriz");
        System.out.println("2.Vector");
        System.out.println("3.salir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una opcion");
        opcion=sc.nextInt();
        mama=new Matrices1();
        hola=new Vectores();
        switch(opcion){
            case 1:
                System.out.println("Digite el tamaño");
                tamano=sc.nextInt();
                if(tamano<=1){
                    System.out.println("error dato no valido");
                }else{
                    mama.setTamano(tamano);
                }
                do{
                System.out.println("\n1.Ascendente");
                System.out.println("2.Descendente");
                System.out.println("Digite una opcion");
                opcion=sc.nextInt();
                switch(opcion){
                    case 1:
                        mama.ascendente();
                    break;
                    case 2:
                        mama.descendente();
                    break;
                    default:
                        System.out.println("Error datos no validos");
                    break;
                }
                }while(opcion<1||opcion>2);
            break;
            case 2:
                System.out.println("Digite el tamaño");
                tamano=sc.nextInt();
                if(tamano<=1){
                    System.out.println("error datos no validos");
                }else{
                    hola.setTamano(tamano);
                }
                do{
                System.out.println("\n1.Ascendente");
                System.out.println("2.Descendente");
                System.out.println("Digite una opcion");
                opcion=sc.nextInt();
                
                switch(opcion){
                    case 1:
                        hola.ascendente();
                    break;
                    case 2:
                        hola.descendente();
                    break;
                    default:
                        System.out.println("Error datos no validos");
                    break;
                }
                }while(opcion<1||opcion>2);
            break;
            default:
                System.out.println("Error datos no validos");
            break;
        }
    }while(opcion!=3);
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Matrices mave=new Matrices();
    
    }
    
}
