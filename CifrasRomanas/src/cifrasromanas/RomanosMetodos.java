/*
 * Author: Jose Giménez , Cristian Gutiérrez.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasromanas;

import java.util.*;
public class RomanosMetodos {
    
    private int numero;
    private String numRomano="";
    
    public RomanosMetodos() {
    }

    public RomanosMetodos(int numero) {
        this.numero=numero;
    }
    
    public boolean validacion(){

        if (this.numero<5000 && this.numero>0) {
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getNumRomano() {
        return numRomano;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /*
    *Function ConverRom: Separate units, dozens, hundreds , thousand the
    *number to convert and we send the number to the corresponding method 
    *return the number in roman
    */
    public String converRom(){
        int uni=0, dec=0, cen=0, um=0;
         uni = numero % 10;
         um=(numero-uni) /1000;
         cen=(numero-uni-(um*1000))/100;
         dec=(numero-uni-(um*1000)-(cen*100))/10;
        
         unidades(uni);
         decenas(dec); 
         centenas(cen);
         millar(um);
        
        return numRomano;
    }
    
     /**
     * Method decenas: Add the letter to the units
     * @param unidad  : receive units of function ConverRom
     * @param uniRom[]: saves units of possible conversions
     * @param numRomano : adds the letter 
     */
    private void unidades(int unidad){
        
        String uniRom[]={"","I","II","III",   
                        "IV","V","VI","VII",
                         "VIII","IX"};
        numRomano=uniRom[unidad];
    }
    
    /**
     * Method decenas: Add the letter to the dozens
     * @param centena  : receive dozens of function ConverRom
     * @param decRom[]: saves dozens of possible conversions
     * @param numRomano : adds the letter 
     */
    private void decenas(int decenas){
        
        String decRom[]={"","X","XX","XXX",   
                        "XL","L","LX","LXX",
                         "LXXX","XC"};
        numRomano=decRom[decenas]+numRomano;
    }
    
     /**
     * Method centenas: Add the letter to the hundreds
     * @param centena  : receive hundreds of function ConverRom
     * @param cenRom[]: saves hundreds of possible conversions
     * @param numRomano : adds the letter 
     */
    private void centenas(int centena){
        
        String cenRom[]={"","C","CC","CCC",   
                        "CD","D","DC","DCC",
                         "DCCC","CM"};
        numRomano=cenRom[centena]+numRomano;
    }
    
    /**
     * Method millar: Add the letter to the thousands
     * @param millar  : receive thousands of function ConverRom
     * @param milRom[]: saves thousands of possible conversions
     * @param numRomano : adds the letter 
     */
    private void millar(int millar){
        
        String milRom[]={"","M","MM","MMM",   
                        "IV","","","",
                         "",""};
        numRomano=milRom[millar]+numRomano;
    }
}
