/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasromanas;

/**
 *
 * @author alumne
 */
public class CifrasRomanas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RomanosMetodos romano = new RomanosMetodos(4999);
        System.out.println("el numero es: "+romano.converRom());
    
}
}