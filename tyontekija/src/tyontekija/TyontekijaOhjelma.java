package tyontekija;
import java.util.Scanner;
import java.text.DecimalFormat;
public class TyontekijaOhjelma {
	static Scanner input = new Scanner(System.in);
	class Henkilo{
		String nimi;
		String osoite;
		public void setNimi() {
			this.nimi = nimi;
		}

		
		public void setOsoite() {
			this.osoite = osoite;
		}

		public String getNimi(String numero) {
			return nimi;
		}
		
		public String getOsoite() {
			return osoite;
		}
		public String toString() {
			return ("Nimi: "+ nimi + "Osoite: "  + osoite );
		}
		class Tyontekija extends Henkilo{
			double tuntipalkka;
			public void Henkilo(){
				nimi = "";
				osoite="";
				tuntipalkka = 0.0;
			}
			public void setTuntipalkka() {
				this.tuntipalkka = tuntipalkka;
			}

			public double getTuntipalkka(double tuntipalkka) {
				return tuntipalkka;
			}
			
			public void Henkilo(String nimi, String osoite, double tuntipalkka){
			this.nimi=nimi;
			this.osoite = osoite;
			this.tuntipalkka = tuntipalkka;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Henkilo henkilo= new Henkilo();
System.out.println("Syötä työntekijan tiedot!");
System.out.print("Anna nimi");
String nimi = input.nextLine();
System.out.print("Anna osoite");
String osoite = input.nextLine();
System.out.print("Anna tuntipalkka");
double tuntipalkka = input.nextDouble();
DecimalFormat desi = new DecimalFormat("0.0");
System.out.println("TYÖNTEKIJÄTIEDOT:");
System.out.println("Nimi: " + nimi);
System.out.println("Osoite: " + osoite);
System.out.println("Tuntipalkka: " + desi.format(tuntipalkka));



	}

}
