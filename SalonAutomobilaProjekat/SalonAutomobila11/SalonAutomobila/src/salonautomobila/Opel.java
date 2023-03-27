/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonautomobila;

import java.util.ArrayList;
import static salonautomobila.Mercedes.ponudaMercedesAutomobila;

/**
 *
 * @author Tadija Tripkovic
 */
public class Opel extends Auto {
    private String model;
    public static ArrayList<Opel> ponudaOpelAutomobila = new ArrayList <Opel>();

    public Opel() {
    }

    public Opel(String proizvodjac, int godiste, Boja boja, double kubikaza, String model) {
        super(proizvodjac, godiste, boja, kubikaza, model);
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static ArrayList<Opel> getPonudaOpelAutomobila() {
        return ponudaOpelAutomobila;
    }

    public static void setPonudaOpelAutomobila(ArrayList<Opel> ponudaOpelAutomobila) {
        Opel.ponudaOpelAutomobila = ponudaOpelAutomobila;
    }

   
    
     public void dodajUPonudu(Opel o) {
        ponudaOpelAutomobila.add(o);
    
}
     public static void printPonudaAutomobila() {
        System.out.println("Ponuda Opel automobila: ");
        for (int i = 0; i < ponudaOpelAutomobila.size(); i++){
           
          Opel o = ponudaOpelAutomobila.get(i);
           o.toString();
           
       }

    }
}
