/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korisnici;
import salonautomobila.Boja;

/**
 *
 * @author Tadija Tripkovic
 */
public class Korisnik {
    private String ime, prezime;
    private int marka;
    private int godiste;
    private Boja boja;

    public Korisnik() {
    }

    public Korisnik(String ime, String prezime, int marka, int godiste, Boja boja) {
        this.ime = ime;
        this.prezime = prezime;
        this.marka = marka;
        this.godiste = godiste;
        this.boja = boja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getMarka() {
        return marka;
    }

    public void setMarka(int marka) {
        this.marka = marka;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public Boja getBoja() {
        return boja;
    }

    public void setBoja(Boja boja) {
        this.boja = boja;
    }

    @Override
    public String toString() {
        return "Korisnik: "  + ime +" " + prezime + "\n\n Izbor automobila: " + marka + ",\n\n godiste=" + godiste + ",\n\n boja=" + boja;
    }
    
    
}
