/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salonautomobila;

/**
 *
 * @author Tadija Tripkovic
 */
public abstract class Auto {
    private String proizvodjac;
    private int godiste;
    private double kubikaza;
    private String model;
    private Boja boja;

    public Auto() {
    }

    public Auto(String proizvodjac, int godiste, Boja boja, double kubikaza, String model) {
        this.proizvodjac = proizvodjac;
        this.godiste = godiste;
        this.boja = boja;
        this.kubikaza = kubikaza;
        this.model = model;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boja getBoja() {
        return boja;
    }

    public void setBoja(Boja boja) {
        this.boja = boja;
    }
    
    @Override
    public String toString() {
        return "\n Proizvodjac=" + proizvodjac + ", Godina proizvodnje=" + godiste + ", Boja=" + boja + ", Kubikaza=" + kubikaza + ", Model=" + model + "\n";
    }
    
    
}
