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
		System.out.print("Anna n�ytett�v�n henkil�n nimi: ");
		String etsi = input.nextLine();
		int i = 0;
		// Viite on null, koska etsitty� ei viel� ole l�ytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty l�ytynyt
		boolean loytynyt = false;

		// Silmukkaa suoritetaan niin kauan kuin etsitty� ei ole k�ytynyt ja listalla on olioita
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

		// Jos etsitty tili l�ytyi
		if (loytynyt) {
	         System.out.println("Nimi: " + Henkilot.get(i).getNimi());
	         System.out.println("Osoite: " +  Henkilot.get(i).getOsoite());
	         System.out.println("Pituus: " +  Henkilot.get(i).getPituus());
			//DecimalFormat desi = new DecimalFormat("0.00");

	         System.out.println("Painoindeksi: " + Henkilot.get(i).getPainoindeksi());


		} else {
			System.out.println("Henkil�� ei ole ");
		}	
	}
	private void naytaHenkilot() {
		for (int i = 0; i < Henkilot.size(); i++) {
			// Haetaan tili listalta List-luokan get-metodilla
			//Henkilo henkilo = Henkilot.get(i);
			// N�ytet��n tiedot Tili-luokan metodeilla
			System.out.println("Nimi: " + Henkilot.get(i).getNimi());
			System.out.println("Osoite: " + Henkilot.get(i).getOsoite());
			System.out.println("Pituus: " + Henkilot.get(i).getPituus());

			System.out.println("Painoindeksi: " + Henkilot.get(i).getPainoindeksi());


		}   	
	}
	private void etsiHenkilo() {
		int i = 0;
		// Viite on null, koska etsitty� ei viel� ole l�ytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty l�ytynyt
		boolean loytynyt = false;
Scanner input = new Scanner(System.in);
System.out.print("Anna perustietoja muutettavan henkil�n nimi: ");
String etsi = input.nextLine()	;
// Silmukkaa suoritetaan niin kauan kuin etsitty� ei ole k�ytynyt ja listalla on olioita
		while (!loytynyt && i < Henkilot.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			henkilo = Henkilot.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
			if (henkilo.getNimi().equals(etsi)) {
				loytynyt = true;
				muutaNimiJaOsoite();
			} else {
				System.out.println("Henkil�� ei ole");
				i++;
			}
		}
		//return henkilo;
	}
	private void etsiHenkilo(double pituus) {
		int i = 0;
		// Viite on null, koska etsitty� ei viel� ole l�ytynyt
		Henkilo henkilo = null;
		// kertoo, onko etsitty l�ytynyt
		boolean loytynyt = false;
Scanner input = new Scanner(System.in);
System.out.print("Kenen henkil�n tiedot haluat muuttaa: ");

String etsi = input.nextLine()	;
// Silmukkaa suoritetaan niin kauan kuin etsitty� ei ole k�ytynyt ja listalla on olioita
		while (!loytynyt && i < Henkilot.size()) {
			// Haetaan listasta olio List-luokan get-metodilla
			henkilo = Henkilot.get(i);
			// Vertaillaan listalta haetun olion tilinumeroa parametrina tulleeseen tilinumeroon
			if (henkilo.getNimi().equals(etsi)) {
				loytynyt = true;
				muutaKoko();
			} else {
				System.out.println("Henkil�� ei ole");
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
			System.out.println("\n1. Lis�� henkil�");
			System.out.println("2. N�yt� henkil�n tiedot");
			System.out.println("3. Muuta henkil�n nimi ja osoite");
			System.out.println("4. Muuta henkil�n koko");
			System.out.println("5. N�yt� kaikki henkil�t");

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
