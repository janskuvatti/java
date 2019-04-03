package henkilosovellus;
import java.util.Scanner;

import hlo.Henkilo;
import hlo.HenkiloSovellus;

public class HenkiloSovellus {
    private Scanner input = new Scanner(System.in);
    private Henkilo henkilo;
    public HenkiloSovellus(){
        naytaValikko();
    }
    
    private void naytaValikko() {
        System.out.println("1. Anna henkilö");
        System.out.println("2. Näytä henkilön tiedot");
        System.out.println("3. Muuta henkilön tietoja");
        System.out.println("0. Lopetus");
        System.out.print("Anna valintasi (0-3):"); 
    	int valinta = -1;
		Scanner input = new Scanner(System.in);

		valinta = input.nextInt();
        switch (valinta) {
        case 1:
            annaHenkilo();
            break;
        case 2:
            naytaTiedot();
            break;
        case 3:
            muutaTiedot();
            break;
        case 0:
        	System.exit(0);
            break;
        default:
            System.out.println("Väärä valinta!");
            break;
        }
        naytaValikko();
    }

    private void annaHenkilo() {
        henkilo = new Henkilo(null, null);
        System.out.print("Anna nimi: ");
        henkilo.setNimi(input.nextLine());
        System.out.print("Anna osoite: ");
        henkilo.setOsoite(input.nextLine());            
    }

    private void naytaTiedot() {
        if(henkilo==null){
            System.out.println("Henkilöä ole");
            return;
        }
        System.out.println(henkilo);        
    }

    private void muutaTiedot() {
        if(henkilo==null){
            System.out.println("Henkil ole");
            return;
        }
        System.out.print("Anna nimi: ");
        henkilo.setNimi(input.nextLine());
        System.out.print("Anna osoite: ");
        henkilo.setOsoite(input.nextLine());        
    }

    public static void main(String[] args) {
        new HenkiloSovellus();
    }
}

class Henkilo {
    private String nimi, osoite;

   /* public Henkilo() {
        super();
        // TODO Auto-generated constructor stub
    }*/

    public Henkilo(String nimi, String osoite) {
       // super();
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

  
    public String toString() {
        return "nimi=" + nimi + ", osoite=" + osoite;
    }    
}

