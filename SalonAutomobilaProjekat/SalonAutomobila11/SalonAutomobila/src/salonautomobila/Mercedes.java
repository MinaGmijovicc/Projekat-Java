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
public class Mercedes extends Auto {
    private String model;
    public static ArrayList<Mercedes> ponudaMercedesAutomobila = new ArrayList <Mercedes>();

    public Mercedes() {
    }

    public Mercedes(String proizvodjac, int godiste, Boja boja, double kubikaza, String model) {
        super(proizvodjac, godiste, boja, kubikaza, model);
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static ArrayList<Mercedes> getPonudaMercedesAutomobila() {
        return ponudaMercedesAutomobila;
    }

    public static void setPonudaMercedesAutomobila(ArrayList<Mercedes> ponudaMercedesAutomobila) {
        Mercedes.ponudaMercedesAutomobila = ponudaMercedesAutomobila;
    }

  
    
    public void dodajUPonudu(Mercedes m) {
        ponudaMercedesAutomobila.add(m);
    
}
    public static void printPonudaAutomobila() {
        System.out.println("Ponuda Mercedes automobila: ");
        for (int i = 0; i < ponudaMercedesAutomobila.size(); i++){
           
           Mercedes m = ponudaMercedesAutomobila.get(i);
           m.toString();
           
       }

    }
}
