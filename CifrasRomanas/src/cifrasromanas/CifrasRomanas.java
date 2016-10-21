/*
 * Author: Jose Giménez , Cristian Gutiérrez
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasromanas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CifrasRomanas {
    
    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
       int numero;
       int opcion,stop=1;
       
       while(stop!=0)
        { 
    try{
            Scanner scan = new Scanner(System.in);
            System.out.println("1-calcular romano");
            System.out.println("2-salir");
            opcion=scan.nextInt();
            switch(opcion)
            {
                case 1: 
                System.out.println("Escribe un numero para convertir: ");
                numero = scan.nextInt();
                RomanosMetodos romano = new RomanosMetodos(numero);
        
                if(romano.validacion()== true){
                    romano.setNumero(numero);
                    System.out.println("Resultado: "+romano.converRom());
                }
                else{
                    System.out.println("Numero no valido, rango(1-5000)");
                }break;
                
                case 2:
                    stop=0;
                    System.out.println("Fin del programa");
                break;
            }//switch
          
    }//try
    catch(InputMismatchException e){
        System.out.println("hola catch");
            System.out.println("Number not valid ,rank(1-5000)");
    }
    }//while 
  }//main
}//class