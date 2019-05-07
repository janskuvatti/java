package veri;
import java.util.Scanner;
import java.util.Arrays;
public class Veriryhma {
private Scanner input= new Scanner(System.in);
public  Veriryhma() {

			
	String[] veriryhmat = new String[100];


	int lkm = kysyVeriryhmat(veriryhmat, veriryhmat.length);
	
 naytaRyhmat(veriryhmat, lkm);
}
private   int kysyVeriryhmat(String[] veriryhmat, final int MAX){
	int i;
	String ryhma = "";
	for( i= 0; i < MAX; i++) {
		System.out.println("Anna veriryhmä (- lopettaa): " );
		
		ryhma = input.nextLine();
		
		 
		 if(ryhma.equals("-")) {
				break;
			}
		 else {
		
		veriryhmat[i]=ryhma;
					 }
		
		}
		

		return i;
}
private void naytaRyhmat(String[] veriryhmat, int lkm) {
	int MAX =  100;
int oikein = 0;
String tieto;
	System.out.println("Luovutuksia oli yhteensä " + lkm);
	System.out.println("Minkä veriryhmän luovutusten määrän haluat tietää: ");
	tieto = input.nextLine();
for(int x=0; x < lkm; x++) {
	if(veriryhmat[x].equals(tieto)){
		oikein ++;
	}
}

System.out.println("Veriryhmän " + tieto + " luovutuksia oli " + oikein);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Veriryhma();	
	}

}
