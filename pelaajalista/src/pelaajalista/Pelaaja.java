package pelaajalista;

public class Pelaaja {
private String pelinumero;	
private String nimi;
private String paikka;


public void setPelinumero() {
	this.pelinumero = pelinumero;
}
public void setNimi() {
	this.nimi = nimi;
}
public void setPaikka() {
	this.paikka = paikka;
}


public String getPelinumero() {
	return pelinumero;
}

public String getNimi() {
	return nimi;
}

public String getPaikka() {
	return paikka;
}

@Override
public String toString() {
	return "[pelinumero: " + pelinumero + " nimi: " + nimi + 
			", paikka: " + paikka + "]";
}

	public  Pelaaja(String pelinumero, String nimi, String paikka) {
		// TODO Auto-generated constructor stub
		this.pelinumero = pelinumero;
		this.nimi = nimi;
		this.paikka = paikka;
		}
	public String getNumero(String numero) {
		// TODO Auto-generated method stub
		return numero;
	}
	public Object getPeliumero(String pelinumero) {
		// TODO Auto-generated method stub
		return pelinumero;
	}
				
	
}