public class App {
    public static void main(String[] args) throws Exception {
        Auto a1 = new Auto();
        Auto a2 = new Auto();

       a1.naytaTiedot();
       a1.kiihdyta();
       a1.jarruta();
       a1.pysahtyy();
       a1.toottaa();

       a2.naytaTiedot();
       a2.lukitse();
       a2.kaynnistyy();
       a2.avaa();
       a2.kaynnistyy();
       a2.jarruta();
       a2.pysahtyy();
       a2.kiihdyta();
       a2.naytaTiedot();
       



        
    }
}

class Auto {

   // Ominaisuudet
    int bensanMaara;
    String merkki;
    String malli;
    boolean lukittu;

    // Muodostimet
    
    // Parametriton muodostin tai non-parameter
    public Auto() {
        merkki = "";
        malli = "";
        bensanMaara = 10;  
        lukittu = false;
    }

    // Täysparametrinen muodostin
    public Auto(String m, String v, int l) {
        merkki = m;
        malli = v;
        bensanMaara = l; 
        lukittu = false;
    } 

    public void lukitse(){
        lukittu = true;
        System.out.println("Auto lukittu.");
        
    }
    public void avaa( ){
        lukittu = false;
        System.out.println("Auto avattu.");
    }
    public void kaynnistyy() {
        if (lukittu) {
            System.out.println("Auto on lukossa. Ei voi käynnistää.");
            return;
        }
        System.out.println("Auto käynnistyy");

    }

    

    public void jarruta() {
        System.out.println("Auto jarruttaa");
        
    }

    public void pysahtyy() {
        System.out.println("Auto pysähtyi");
    }

    public void kiihdyta() {
        System.out.println("Auto kiihtyy");
        
    }

    public void toottaa() {
        System.out.println("Auto toottaa");
    }

    public void naytaTiedot() {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara + "l");
        System.out.println("Lukittu: " + (lukittu ? "Kyllä" : "Ei"));
    }

}


