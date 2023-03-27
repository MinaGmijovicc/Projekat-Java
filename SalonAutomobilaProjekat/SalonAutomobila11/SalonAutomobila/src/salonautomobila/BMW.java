 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonautomobila;

import java.util.ArrayList;

/**
 *
 * @author Tadija Tripkovic
 */
public class BMW extends Auto {
    private String model;
    public static ArrayList<BMW> ponudaBMWAutomobila = new ArrayList <BMW>();

    public BMW() {
    }

    public BMW(String proizvodjac, int godiste, Boja boja, double kubikaza, String model) {
        super(proizvodjac, godiste, boja, kubikaza, model);
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static ArrayList<BMW> getPonudaBMWAutomobila() {
        return ponudaBMWAutomobila;
    }

    public static void setPonudaBMWAutomobila(ArrayList<BMW> ponudaBMWAutomobila) {
        BMW.ponudaBMWAutomobila = ponudaBMWAutomobila;
    }

   
   
   public void dodajUPonudu(BMW b) {
        ponudaBMWAutomobila.add(b);
    
}
   public static void printPonudaAutomobila() {
        System.out.println("Ponuda BMW automobila: ");
        for (int i = 0; i < ponudaBMWAutomobila.size(); i++){
           
           BMW b = ponudaBMWAutomobila.get(i);
           b.toString();
           
       }

    }
}
