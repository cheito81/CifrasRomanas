/*
 * Author: Jose Giménez , Cristian Gutiérrez.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasromanastest;

import cifrasromanas.RomanosMetodos;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author cristian
 */
@RunWith(Parameterized.class)
public class TestCifrasRomanas {
    
   @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "MCC", 1200 }, { "MC", 1200 },{ "IVCC", 4200 } 
           });
    }

    private String expected;
    private int input;
    public TestCifrasRomanas (String expected,int input){
        this.expected=expected;
        this.input=input;
    }
    
    
     @Test
     public void converRomanosTest() {
     RomanosMetodos rom=new RomanosMetodos();
     rom.setNumero(input);
     assertEquals(expected, rom.converRom());
     
     }
}
