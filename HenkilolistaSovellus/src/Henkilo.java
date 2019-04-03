
public class Henkilo {
	static String nimi;
	static String osoite;
static double pituus;
static double paino;
 static double painoindeksi;
	

	// get-metodi palauttaa attribuutin arvon
	// system.out.println("Saldo: " + tili2.getSaldo());
	public  void setNimi(String nimi) {
		this.nimi = nimi;
		return;
	}

	// T‰t‰ metodia ei olisi j‰rkev‰‰ toteuttaa luokkaan!
	// Oikeasti tilin saldoa ei voida muuttaa
	// tili2.setSaldo(1000.0);
	public void setOsoite(String osoite) {
		this.osoite = "Jyv‰skyl‰";
	}

	// T‰t‰ metodia ei olisi j‰rkev‰‰ toteuttaa luokkaan!
	// Oikeasti tilin numeroa ei voida muuttaa
	public String getNimi() {
		return nimi;
	}
	
	public String getOsoite() {
		return osoite;
	}
	public double getPituus() {
	return pituus;	
	}
	static double getPaino() {
		 	 return paino;
	}
	public double getPainoindeksi() {
		 
		double painoindeksi =  paino / (pituus * pituus);
	 return painoindeksi;
	}
	public String toString() {
		return "Anna nimi: "+ nimi + " Anna osoite: "  + osoite +  "nimi= " + nimi + ", osoite= " + osoite;
	}
	// Parametriton konstruktori
		public Henkilo() {
			nimi = "0";
			osoite = "0";
		}

		// Parametrillinen konstruktori eli olio luodaan halutuilla tiedoilla
	 	
		public Henkilo(String nimi, String osoite, double pituus, double paino, double painoindeksi) {
			this.nimi = nimi;
			this.osoite = osoite;
			this.pituus = pituus;
			this.paino = paino;
			this.painoindeksi = painoindeksi;
		}
	

}
