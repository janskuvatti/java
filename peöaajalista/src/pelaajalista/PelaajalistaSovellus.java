package pelaajalista;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
public class PelaajalistaSovellus{

	private  ArrayList<Pelaaja> Pelaajat = new ArrayList<Pelaaja>();



	


	private void teePelaaja() {

Scanner input =new Scanner(System.in);
        System.out.print("Anna pelinumero: ");
        String pelinumero = input.nextLine();
        System.out.print("Anna pelaajan nimi: ");
        String nimi = input.nextLine();
        System.out.print("Anna pelipaikka: ");
        String paikka = input.nextLine();
Pelaaja pelaaja= new Pelaaja(pelinumero, nimi, paikka); // Creating a new object
        Pelaajat.add(pelaaja);
    }


	

private void haePelaaja(){
	
//	int i =0;
	Scanner input = new Scanner(System.in);
	System.out.print("Anna pelinumero: ");
	String numero = input.nextLine();
	int i = 0;
	// Viite on null, koska etsittyä ei vielä ole löytynyt
	Pelaaja pelaaja = null;
	// kertoo, onko etsitty löytynyt
	boolean loytynyt = false;

	// Silmukkaa suoritetaan niin kauan kuin etsittyä ei ole köytynyt ja listalla on olioita
	while (!loytynyt && i < Pelaajat.size()) {
		// Haetaan listasta olio List-luokan get-metodilla
		pelaaja = Pelaajat.get(i);
		// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
		if (pelaaja.getPelinumero().equals(numero)) {
			loytynyt = true;
		} else {
			i++;
		}
	}

	// Jos etsitty tili löytyi
	if (loytynyt) {
		 System.out.println("Pelinumero: " + Pelaajat.get(i).getPelinumero());
         System.out.println("Nimi: " + Pelaajat.get(i).getNimi());
         System.out.println("Pelipaikka: " +  Pelaajat.get(i).getPaikka());
	} else {
		System.out.println("Pelaaja ei ole numerolla " + numero);
	}
		
}				
    

public void listaaPelaajat(){
	for (int i = 0; i < Pelaajat.size(); i++) {
		// Haetaan listasta indeksillä i oleva merkkijono
		//System.out.println(Pelaajat.get(i));
	     System.out.println("Pelinumero: " + Pelaajat.get(i).getPelinumero());
	             System.out.println("Nimi: " + Pelaajat.get(i).getNimi());
	             System.out.println("Pelipaikka: " +  Pelaajat.get(i).getPaikka());
	           
	         }        
	}
	

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub

		PelaajalistaSovellus sovellus = new PelaajalistaSovellus();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Lisää pelaaja");
			System.out.println("2. Hae pelaaja");
			System.out.println("3. Näytä pelaajat");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
			sovellus.teePelaaja();	
				break;
			case 2:
				sovellus.haePelaaja();
				break;
			case 3:
				sovellus.listaaPelaajat();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}

}
