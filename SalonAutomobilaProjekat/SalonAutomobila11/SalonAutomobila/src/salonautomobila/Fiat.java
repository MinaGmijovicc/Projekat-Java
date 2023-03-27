/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonautomobila;

import ispis.Ispisivanje;
import java.util.ArrayList;

/**
 *
 * @author Tadija Tripkovic
 */
public class Fiat extends Auto {
    
    public static ArrayList<Fiat> ponudaFiatAutomobila = new ArrayList <Fiat>();
    
    public Fiat() {
        
    }

    public Fiat(String proizvodjac, int godiste, Boja boja, double kubikaza, String model) {
        super(proizvodjac, godiste, boja, kubikaza, model);
        
    }

    public ArrayList getPonudaFiatAutomobila() {
        return ponudaFiatAutomobila;
    }

    public void setPonudaFiatAutomobila(ArrayList ponudaFiatAutomobila) {
        this.ponudaFiatAutomobila = ponudaFiatAutomobila;
    }
    
    public void dodajUPonudu(Fiat f) {
        ponudaFiatAutomobila.add(f);
}
     public static void printPonudaAutomobila() {
        System.out.println("Ponuda Fiat automobila: ");
        for (int i = 0; i < ponudaFiatAutomobila.size(); i++){
           
           Fiat f = ponudaFiatAutomobila.get(i);
           f.toString();
           
       }

    }
    
}
