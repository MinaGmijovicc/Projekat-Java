package salonautomobila;

import ispis.Ispisivanje;
import java.util.Scanner;
import korisnici.Korisnik;
import static salonautomobila.Boja.*;
import java.io.*;
import static salonautomobila.BMW.ponudaBMWAutomobila;
import static salonautomobila.Fiat.ponudaFiatAutomobila;
import static salonautomobila.Mercedes.ponudaMercedesAutomobila;
import static salonautomobila.Opel.ponudaOpelAutomobila;


public class SalonAutomobila implements Ispisivanje{
    //polja klase
    public static boolean radiDalje = true; 
    public static int ID = 1;
    private static Scanner sc = new Scanner(System.in);
    
   
    public SalonAutomobila() {
    }
    
    public void kreirajPonudu(){
        
        Fiat f1 = new Fiat("Fiat", 2007, crna, 1900, "Punto");
        Fiat f2 = new Fiat("Fiat", 2008, siva, 2000, "Stilo");
        Fiat f3 = new Fiat("Fiat", 2009, bela, 2000, "Panda");
        Fiat f4 = new Fiat("Fiat", 2007, plava, 2500, "Tipo");
        
        f1.dodajUPonudu(f1);
        f2.dodajUPonudu(f2);
        f3.dodajUPonudu(f3);
        f4.dodajUPonudu(f4);
        
        Mercedes m1 = new Mercedes("Mercedes", 2008, plava, 3000, "" );
        Mercedes m2 = new Mercedes("Mercedes", 2004, bela, 1900, "" );
        Mercedes m3 = new Mercedes("Mercedes", 2008, crna, 2000, "" );
        Mercedes m4 = new Mercedes("Mercedes", 2010, plava, 2500, "" );
        
        m1.dodajUPonudu(m1);
        m2.dodajUPonudu(m2);
        m3.dodajUPonudu(m3);
        m4.dodajUPonudu(m4);
        
        BMW b1 = new BMW("BMW", 2006, bela, 2500, "x1");
        BMW b2 = new BMW("BMW", 2008, siva, 3000, "x4");
        BMW b3 = new BMW("BMW", 2010, zelena, 2000, "i8");
        BMW b4 = new BMW("BMW", 2000, crna, 1900, "M135i");
        
        
        b1.dodajUPonudu(b1);
        b2.dodajUPonudu(b2);
        b3.dodajUPonudu(b3);
        b4.dodajUPonudu(b4);
        
        Opel o1 = new Opel("Opel", 2007, crna, 1200, "Corsa");
        Opel o2 = new Opel("Opel", 2007, siva, 1600, "Astra");
        Opel o3 = new Opel("Opel", 2007, crna, 1200, "Insignia");
        Opel o4 = new Opel("Opel", 2007, crna, 1200, "Adam");
        
        o1.dodajUPonudu(o1);
        o2.dodajUPonudu(o2);
        o3.dodajUPonudu(o3);
        o4.dodajUPonudu(o4);
           
        
      
    }
    
    public void pretrazujPonovo() {
        System.out.println("Zelite li da ponovo pretrazujete? ");
            System.out.println("1. DA");
            System.out.println("2. NE");
            String ponovo = sc.next();
            
            if(ponovo.equals("da") || ponovo.equals("DA")){
                radiDalje = true;
            }
            else {
                radiDalje = false;
                System.out.println("Hvala na poseti. Dovidjenja! :) \n\n" );
            }
    }
    
    public static void main(String[] args) {
        
        SalonAutomobila salon = new SalonAutomobila();
        
       
        salon.kreirajPonudu();
        
        //interakcija sa korisnikom
        while(radiDalje){
            System.out.println("Dobrodosli u salon automobila Hit ");
            System.out.println("Unesite svoje ime i prezime: ");
            String ime = sc.next();
            String prezime = sc.next();

            System.out.println("Koji auto zelite kupiti(izaberite broj)?");
            System.out.println("1. Mercedes");
            System.out.println("2. BMW");
            System.out.println("3. Opel");
            System.out.println("4. Fiat");

            int markaAuta = sc.nextInt();
            System.out.println("Izabrali ste opciju " + markaAuta);
            
            //provera da li je ispravan broj unet
            //oporavili smo se od greske koja je izazvana jer je korisnik lose uneo broj
            //while petlja krece ispocetka da radi, ponovo pokrece nas program
            if(markaAuta > 4 || markaAuta < 1){
                radiDalje = true;
                System.out.println("Uneli ste neodgovaracuju vrednost. Pokusajte ponovo! \n\n");
                continue;
            }
            
            System.out.println("Zelite li da vidite kompletnu ponudu za marku " + markaAuta);
            String prikazKompletno = sc.next();
            
            if(prikazKompletno.equals("da") || prikazKompletno.equals("DA")){
                salon.ispisPonudaAutomobila(markaAuta);
                salon.pretrazujPonovo();
            }
            
            System.out.println("Unesite kriterijume za pretragu");
            System.out.println("Godina proizvodnje? ");
            int godiste = sc.nextInt();
             
            //novo - provera da li je ispravna godina uneta
            //continue iskace iz okruzujuceg bloka
            if(godiste < 1900 || godiste > 2020){
                radiDalje = true;
                System.out.println("Uneli ste neodgovarajucu vrednost. Pokusajte ponovo!  \n\n");
                continue;
            }
            
            System.out.println("Boja? ");
            String boja = sc.next();
            //valueOf konvertuje String promenljivu u prom tipa Boja(enum)
            Boja b = Boja.valueOf(boja);
            
            Korisnik k1 = new Korisnik(ime, prezime, markaAuta, godiste, b);
            //spremamo uslove da upisujemo u fajl
            //kreiramo fajl, kreiramo writer objekat
            PrintWriter writer = salon.kreirajFajl("AutoPretraga"+ (ID++) +".txt") ;
            //ovde radimo sam upis u fajl
            salon.ispisUFajl(writer, k1.toString());
            
            salon.ispisIzabraniAuto(godiste, b, writer);
            salon.pretrazujPonovo();
        
            
            writer.close();
        }  
    }

    @Override
    public void ispisPonudaAutomobila(int markaAuta) {
        
        if(markaAuta == 1) {
            System.out.println("Ponuda Mercedes automobila: \n");
        
            for (int i = 0; i < ponudaMercedesAutomobila.size(); i++){

               Mercedes m = ponudaMercedesAutomobila.get(i);
               System.out.println(m.toString()); 
        }
        }
            if(markaAuta == 2){
            System.out.println("Ponuda BMW automobila: \n");
            
        for (int i = 0; i < ponudaBMWAutomobila.size(); i++){
           
           BMW b = ponudaBMWAutomobila.get(i);
            System.out.println(b.toString());
        }
       }
        if(markaAuta == 3){
        System.out.println("Ponuda Opel automobila: \n");
        
        for (int i = 0; i < ponudaOpelAutomobila.size(); i++){
           
           Opel o = ponudaOpelAutomobila.get(i);
          System.out.println(o.toString());
        }
       }
  
        if(markaAuta == 4){
            System.out.println("Ponuda Fiat automobila: \n");
        
            for (int i = 0; i < ponudaFiatAutomobila.size(); i++){

               Fiat f = ponudaFiatAutomobila.get(i);
               System.out.println(f.toString()); 
            }   
        }
    }
        
    
    @Override
    public void ispisIzabraniAuto(int godiste, Boja boja, PrintWriter writer){
        System.out.println("Pronadjeno u ponudi: \n");
        
        System.out.println("Po kriterijumu godiste: \n");
        for(Fiat f : ponudaFiatAutomobila){
            if(f.getGodiste() == godiste){
                System.out.println(f.toString());
                ispisUFajl(writer, f.toString());
            }
        }
        
         System.out.println("Po kriterijumu boja: \n");
         for(Fiat f : ponudaFiatAutomobila){
            if(f.getBoja()== boja){
                System.out.println(f.toString());
                ispisUFajl(writer, f.toString());
            }
        }
    }

     @Override
    public PrintWriter kreirajFajl(String imeFajla){
        PrintWriter podaci = null;
        try {
            FileWriter fajl = new FileWriter(imeFajla);
            podaci = new PrintWriter(new BufferedWriter(fajl));
        } catch (IOException ex) {
            System.out.println("Greska u izvrsavanju: I/OException!");
            System.exit(0);
        }
       return podaci;
    }
    @Override
    public void ispisUFajl(PrintWriter podaci, String podaciZaUpis) {
            podaci.print(podaciZaUpis);
           
    }
}
    
    
    
    
    

