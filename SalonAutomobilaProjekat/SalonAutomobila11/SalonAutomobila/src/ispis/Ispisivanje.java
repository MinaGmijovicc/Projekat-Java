/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispis;

import java.io.PrintWriter;
import salonautomobila.Boja;

public interface Ispisivanje {
    
    void ispisPonudaAutomobila(int markaAuta);
    void ispisIzabraniAuto(int godiste, Boja boja, PrintWriter writer);
    void ispisUFajl(PrintWriter writer, String podaciZaUpis);
    public PrintWriter kreirajFajl(String imeFajla);
}
