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
import java.util.*;
public class RomanosMetodos {
    
    private int numero=0;
    private String numRomano="";

    public RomanosMetodos(int numero) {
        this.numero=numero;
    }
    
    public boolean valiadacion(){
        if (this.numero<5000 && this.numero>0){
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
    
    private void unidades(int unidad){
        
        String uniRom[]={"","I","II","III",   
                        "IV","V","VI","VII",
                         "VIII","IX"};
        numRomano=uniRom[unidad];
    }
    private void decenas(int decenas){
        
        String decRom[]={"","X","XX","XXX",   
                        "XL","L","LX","LXX",
                         "LXXX","XC"};
        numRomano=decRom[decenas]+numRomano;
    }
    private void centenas(int centena){
        
        String cenRom[]={"","C","CC","CCC",   
                        "CD","D","DC","DCC",
                         "DCCC","CM"};
        numRomano=cenRom[centena]+numRomano;
    }
    private void millar(int millar){
        
        String milRom[]={"","M","MM","MMM",   
                        "IV","V","","",
                         "",""};
        numRomano=milRom[millar]+numRomano;
    }
    
    
}
