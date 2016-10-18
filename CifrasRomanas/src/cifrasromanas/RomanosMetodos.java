/*
 * Author: Jose Giménez , Cristian Gutiérrez
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
    
    private int numero;
    private String numRomano="";
    
    public RomanosMetodos() {
    }

    public RomanosMetodos(int numero) {
        this.numero=numero;
    }
    
    public boolean validacion(){
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

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /*
    *Function : ConverRom
    *Unidades: Dividimos num entre 10 y nos quedamos el resto 
    *Unidades de millar : (numero menos unidad ) lo dividimos entre 1000
    *Centenas: (restamos numero - unidades-unidades de millar * 1000)y dividimos entre 100
    *Decenas : (restamos numero - unidades -unidades de millar * 1000)-(centenas *100)
    *dividimos entre 10
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
                        "IV","","","",
                         "",""};
        numRomano=milRom[millar]+numRomano;
    }
}
