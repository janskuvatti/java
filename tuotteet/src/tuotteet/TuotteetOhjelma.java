package tuotteet;

import java.util.Scanner;
import tuotteet.TuotteetOhjelma.Tuote.DVDTuote;
import tuotteet.TuotteetOhjelma.Tuote.KirjaTuote;

 class TuotteetOhjelma {
static class Tuote {
	String kirjanNimi;

	
	int kirjanKoodi;
	double hinta;
	double hinta2;

	String dNimi;
	int dKoodi;
	//Koodit
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public void setHinta2(double hinta2) {
		this.hinta2 = hinta2;
	}
	public void setKirjanKoodi(int kirjanKoodi) {
		this.kirjanKoodi =  kirjanKoodi;
	}
	public void setDKoodi(int dKoodi) {
		this.dKoodi =  dKoodi;
	}
	
	public int getKirjanKoodi(int kirjanKoodi) {
		return kirjanKoodi;
	}
	public int getDKoodi(int dKoodi) {
		return dKoodi;
	}
	//nimet


	public void setKirjanNimi(String kirjanNimi) {
		this.kirjanNimi = kirjanNimi;
	}
	public void setDNimi(String dNimi) {
		this.dNimi = dNimi;
	}

	public String getKirjanNimi (String kirjanNimi) {
		return kirjanNimi;
	}
	public String getDNimi(String dNimi) {
		return dNimi;	

	}

	public String toString() {
		

		return ("Nimi: " + kirjanNimi + "\nKoodi: "  + kirjanKoodi + "\nHinta: " + hinta);
	
	}

	public String toString2() {
		return ("Nimi: "+ dNimi + "\nKoodi: "  + dKoodi + "\nHinta: " + hinta2);
	}

	
	
	static class KirjaTuote extends Tuote{
		int sivut;
		String sidosasu;
		public void setSidosasu(String sidosasu) {
			this.sidosasu = sidosasu;
		}
		public void setSivut(int sivut) {
			this.sivut = sivut;
		}

		public String getSidosasu(String sidosasu) {
			return sidosasu;
		}
		public int getSivut(int sivut) {
			return sivut;	

		}
		public String toString() {
			return (super.toString() + "\nSidosasu: "+ sidosasu + "\nSivut: "  + sivut);
		}
		public void Kirja(){
			kirjanNimi = "";
			kirjanKoodi = 0;
			sidosasu = "";
			sivut = 0;
			}
		public void Kirja(String kirjanNimi, int kirjanKoodi, String sidosasu, int sivut){
			this.kirjanNimi = kirjanNimi;
			this.kirjanKoodi = kirjanKoodi;
			this.sidosasu = sidosasu;
			this.sivut = sivut;
			}
	}
	static class DVDTuote extends Tuote{
		int kesto;
		String ika;
		public void setIka(String ika) {
			this.ika = ika;
		}
		public void setKesto(int kesto) {
			this.kesto = kesto;
		}

		public String getIka(String ika) {
			return ika;
		}
		public int getKesto(int kesto) {
			return kesto;	

		}
		public String toString2() {
			return (super.toString2() + "\nKesto: "+ kesto + "\nIkäsuositus: "  + ika);
		}
		public void Dvd(){
			this.dNimi = "";
			this.dKoodi = 0;
			this.kesto = 0;
			this.ika = "";
			}
		public void Dvd(String dNimi, int dKoodi, String ika, int kesto, double hinta2){
			this.dNimi = dNimi;
			this.dKoodi = dKoodi;
			this.hinta2 = hinta2;
			this.kesto = kesto;
			this.ika = ika;
			}
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Tuote tuote = new Tuote();
	KirjaTuote kirja = new KirjaTuote();
	DVDTuote dvd = new DVDTuote();
Scanner input = new Scanner(System.in);
System.out.println("Syötä kirjatuotteen tiedot!");
System.out.print("Anna tuotekoodi: ");
int kirjanKoodi = input.nextInt();
kirja.setKirjanKoodi(kirjanKoodi);
System.out.println("Anna nimi: ");
String kirjanNimi = input.nextLine();
kirja.setKirjanNimi(input.nextLine());


System.out.print("Anna hinta: ");
String help= input.nextLine();
double hinta = Double.parseDouble(help);
kirja.setHinta(hinta);
//input.next();

System.out.print("Anna sivumäärä: ");
int sivut = input.nextInt();
kirja.setSivut(sivut);

System.out.print("Anna sidosasu: ");
String sidosasu = input.next();
kirja.setSidosasu(sidosasu);

System.out.println("Syötä dvdtuotteen tiedot!");
System.out.print("Anna tuotekoodi: ");
int dKoodi = input.nextInt();
dvd.setDKoodi(dKoodi);
System.out.print("Anna nimi: ");
String dNimi = input.nextLine();

dvd.setDNimi(input.nextLine());


System.out.print("Anna hinta: ");
double hinta2 = input.nextDouble();
dvd.setHinta2(hinta2);

System.out.print("Anna kesto(min): ");
int kesto = input.nextInt();
dvd.setKesto(kesto);
System.out.print("Anna ikäsuositus: ");
String ika = input.next();
dvd.setIka(ika);
System.out.println("KIRJATUOTTEEN TIEDOT:");
System.out.println(kirja.toString());

System.out.println("DVDTUOTTEEN TIEDOT:");
System.out.println(dvd.toString2());




	}

}