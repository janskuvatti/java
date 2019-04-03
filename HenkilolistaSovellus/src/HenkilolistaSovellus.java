import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class HenkilolistaSovellus {
	private  ArrayList<Henkilo> Henkilot = new ArrayList<Henkilo>();
	private void teeHenkilo() {
Scanner input = new Scanner(System.in);
System.out.print("Anna nimi: ");
String nimi =input.nextLine();
System.out.print("Anna osoite: ");
String osoite = input.nextLine();
System.out.print("Anna pituus: ");
double pituus = input.nextDouble();
System.out.print("Anna paino: ");
int paino = input.nextInt();
double painoindeksi =  paino / (pituus * pituus);

Henkilo henkilo = new Henkilo(nimi, osoite, pituus, paino, painoindeksi);
Henkilot.add(henkilo);
}
	private void naytaHenkilo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna näytettävän henkilön nimi: ");
		String etsi = input.nextLine();
		int i = 0;
		// Viite on null, koska etsittyä ei vielä ole löytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty löytynyt
		boolean loytynyt = false;

		// Silmukkaa suoritetaan niin kauan kuin etsittyä ei ole köytynyt ja listalla on olioita
		while (!loytynyt && i < Henkilot.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			henkilo = Henkilot.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
			if (henkilo.getNimi().equals(etsi)) {
				loytynyt = true;
			} else {
				i++;
			}
		}

		// Jos etsitty tili löytyi
		if (loytynyt) {
	         System.out.println("Nimi: " + Henkilot.get(i).getNimi());
	         System.out.println("Osoite: " +  Henkilot.get(i).getOsoite());
	         System.out.println("Pituus: " +  Henkilot.get(i).getPituus());
			//DecimalFormat desi = new DecimalFormat("0.00");

	         System.out.println("Painoindeksi: " + Henkilot.get(i).getPainoindeksi());


		} else {
			System.out.println("Henkilöä ei ole ");
		}	
	}
	private void naytaHenkilot() {
		for (int i = 0; i < Henkilot.size(); i++) {
			// Haetaan tili listalta List-luokan get-metodilla
			//Henkilo henkilo = Henkilot.get(i);
			// Näytetään tiedot Tili-luokan metodeilla
			System.out.println("Nimi: " + Henkilot.get(i).getNimi());
			System.out.println("Osoite: " + Henkilot.get(i).getOsoite());
			System.out.println("Pituus: " + Henkilot.get(i).getPituus());

			System.out.println("Painoindeksi: " + Henkilot.get(i).getPainoindeksi());


		}   	
	}
	private void etsiHenkilo() {
		int i = 0;
		// Viite on null, koska etsittyä ei vielä ole löytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty löytynyt
		boolean loytynyt = false;
Scanner input = new Scanner(System.in);
System.out.print("Anna perustietoja muutettavan henkilön nimi: ");
String etsi = input.nextLine()	;
// Silmukkaa suoritetaan niin kauan kuin etsittyä ei ole köytynyt ja listalla on olioita
		while (!loytynyt && i < Henkilot.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			henkilo = Henkilot.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
			if (henkilo.getNimi().equals(etsi)) {
				loytynyt = true;
				muutaNimiJaOsoite();
			} else {
				System.out.println("Henkilöä ei ole");
				i++;
			}
		}
		//return henkilo;
	}
	private void etsiHenkilo(double pituus) {
		int i = 0;
		// Viite on null, koska etsittyä ei vielä ole löytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty löytynyt
		boolean loytynyt = false;
Scanner input = new Scanner(System.in);
System.out.print("Kenen henkilön tiedot haluat muuttaa: ");

String etsi = input.nextLine()	;
// Silmukkaa suoritetaan niin kauan kuin etsittyä ei ole köytynyt ja listalla on olioita
		while (!loytynyt && i < Henkilot.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			henkilo = Henkilot.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
			if (henkilo.getNimi().equals(etsi)) {
				loytynyt = true;
				muutaKoko();
			} else {
				System.out.println("Henkilöä ei ole");
				i++;
				break;
			}
		}
		//return henkilo;
	}
	private void muutaNimiJaOsoite() {
	 etsiHenkilo();
		Scanner input = new Scanner(System.in);

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna osoite: ");
		String osoite  = input.nextLine();
		Henkilo.nimi = nimi;	
		Henkilo.osoite = osoite;
	}
	private void muutaKoko() {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna pituus: ");
	double pituus = input.nextDouble();
		System.out.print("Anna paino: ");
double paino = input.nextDouble();
Henkilo.pituus = pituus;	
		Henkilo.paino = paino;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HenkilolistaSovellus ohjelma = new HenkilolistaSovellus();

		int valinta = -1;
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		do {
			System.out.println("\n1. Lisää henkilö");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön nimi ja osoite");
			System.out.println("4. Muuta henkilön koko");
			System.out.println("5. Näytä kaikki henkilöt");

			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-5): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
		ohjelma.teeHenkilo();	
				break;
			case 2:
				ohjelma.naytaHenkilo();
				break;
			case 3:
				ohjelma.muutaNimiJaOsoite();
				break;
			case 4:
				ohjelma.muutaKoko();
				break;
			case 5:
				ohjelma.naytaHenkilot();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}

}
