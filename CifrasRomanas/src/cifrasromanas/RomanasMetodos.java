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
public class RomanasMetodos {
    
    private int numero=0;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public RomanasMetodos() {
    }
    
    public boolean valiadacion(){
        if (this.numero<5000 && this.numero>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
