/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasromanas;

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
       
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Dime un numero de 0 a 5000: ");
        numero = scan.nextInt();
        RomanosMetodos romano = new RomanosMetodos(numero);
       
        if( romano.validacion()== true){
             romano.setNumero(numero);
             System.out.println("el numero es: "+romano.converRom());
        }
        else{
           System.out.println("Numero introducido no valido");  
        }
        
    }
}