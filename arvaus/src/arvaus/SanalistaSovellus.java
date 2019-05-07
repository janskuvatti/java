package arvaus;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SanalistaSovellus {
	private List<String> sanaLista = new ArrayList<String>();

	private void lisaaSana() {
	Scanner input = new Scanner(System.in);
	System.out.print("Anna sana: ");
	String sana = input.nextLine();
	String lista = new String(sana);

	sanaLista.add(sana);
	return;
	}

	private void listaaSanat() {
		for (int i = 0; i < sanaLista.size(); i++) {
			// Haetaan listasta indeksillä i oleva merkkijono
			System.out.println(sanaLista.get(i));
		}
	}

	private void laskeSanat() {
		int a = 0;
		int i =0;
String lista = null;

		Scanner input = new Scanner(System.in);
		System.out.print("Anna sana, minkä esiintymiskerrat lasketaan: ");
		String etsi = input.nextLine();
	//	Collections.frequency(sanaLista, etsi)
		// Viite on null, koska etsittyä ei vielä ole löytynyt
		// kertoo, onko etsitty löytynyt
		boolean loytynyt = false;

		// Silmukkaa suoritetaan niin kauan kuin etsittyä ei ole köytynyt ja listalla on olioita
		while (!loytynyt && i < sanaLista.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
	String		sana = sanaLista.get(i);
			
			if (sana.equals(etsi)) {
				
				loytynyt = true;
			
				break;

			} else {
				break;
			}
		}

		// Jos etsitty tili löytyi
		
			if (sanaLista.contains(etsi)) {	
			
				System.out.println("Sana " + etsi + " esiintyi  " + Collections.frequency(sanaLista, etsi)  + " kertaa" );	
	

			}
		 else {
		System.out.println("Sanaa " + etsi + " ei ollut listassa");
		
		
		 }

	}
	

	private void poistaSana() {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Anna sana, joka poistetaan: ");
		String poista = input.nextLine();
		for (int i = 0; i < sanaLista.size(); i++) {
		if(sanaLista.contains(poista)) {
			// Poistetaan listasta indeksillä i oleva merkkijono
			sanaLista.remove(poista);
			System.out.println("Jokainen sana " + poista + " on poistettu listasta");
		} else {
			System.out.println("Sanaa " + poista 
					+ " ei ollut listassa");
			break;
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanalistaSovellus ohjelma = new SanalistaSovellus();

		int valinta;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1 = Lisää sana");
			System.out.println("2 = Listaa sanat");
			System.out.println("3 = Laske sanat");
			System.out.println("4 = Poista sanat");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi: ");

			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				ohjelma.lisaaSana();
				break;

			case 2:
				ohjelma.listaaSanat();
				break;

			case 3:
				ohjelma.laskeSanat();
				break;

			case 4:
				ohjelma.poistaSana();
				break;
				
			
			}
		} while (valinta != 0);
	}

}
