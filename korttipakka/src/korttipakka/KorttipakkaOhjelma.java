package korttipakka;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Pelikortti {
	private String maa;
	private int numero;
	public Pelikortti(){
		maa = "";
		numero = 0;
		
	}
	public Pelikortti(String maa, int numero){
		this.maa = maa;
		this.numero = numero;
		
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero(int numero) {
		return numero;
	}
	public  void setMaa(String maa) {
		this.maa = maa;
	}

	public String getMaa(String Maa) {
		return maa;
	}
	 public String toString() {
	        return  maa +" "+ numero;
	    }
}
 class Korttipakka implements Korttipino {
	// Korteille luodaan arraylist
 private List<Pelikortti> kortit = new ArrayList<Pelikortti>();

//Pelikortti kortti = new Pelikortti();	
 public Korttipakka (){
     kortit = new ArrayList<Pelikortti>();
 }
 // Lisätään pelikortti listaan
 public void lisaa(Pelikortti kortti) {
     kortit.add(0,kortti);


 }
 //Poistetaan pakan päällimmäinen kortti
 public Pelikortti poista() {
     kortit.remove(kortit);

     return null;
 }
 //Palauttaa korttipinon koon
 public int annaKoko() {


     return kortit.size();
 }
//Palayttaa kaikki pakassa olevat kortit
 public Pelikortti anna(int index) {

     if (index >= 0 && index < kortit.size()) {
         return kortit.get(index);


     }
     return null;
 }
}
public class KorttipakkaOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Scanner scanner = new Scanner(System.in);
String output;

Korttipakka korttipakka = new Korttipakka();
boolean loppu = false;
do {
    System.out.print("Anna pelikortin maa(-lopettaa): ");
   output = input.next();
   // Pelikortti.setMaa(input.nextLine());

    if(!output.equals("-")){
        System.out.print("Anna pelikortin numero: ");
       int number = scanner.nextInt();
       // Pelikortti.setNumero(scanner.nextInt());
     Pelikortti peli = new Pelikortti(output, number);

        korttipakka.lisaa(peli);
    }
    else
        loppu = true;
}while(!loppu );
System.out.println();

System.out.println("Korttipakassa on " +korttipakka.annaKoko()+" korttia:");
//int x = 0;
for ( int x = 0; x < korttipakka.annaKoko(); x++) {

System.out.println(korttipakka.anna(x));
//x++;
}
}

}
