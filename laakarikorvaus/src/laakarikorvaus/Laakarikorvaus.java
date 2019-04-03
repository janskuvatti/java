package laakarikorvaus;
import java.util.Scanner;

import java.text.DecimalFormat;



public class Laakarikorvaus {
	 public static double laskeKorvaus(int kesto) {
		double korvaus;
		

		if(kesto <= 10) {
			
			korvaus = 8.00;
		}
		else if(kesto <= 20) {
			korvaus = 11.00;
		}
		else {
			korvaus = 13.50;
		}
	return korvaus;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int kesto;
double korvaus;

DecimalFormat desi = new DecimalFormat("0.00");
Scanner input = new Scanner(System.in);
System.out.print("Anna k‰ynnin kesto: ");
kesto = input.nextInt();

korvaus = laskeKorvaus(kesto);
if(kesto > 0) {

	System.out
			.println("Kestoltaan " + kesto + " minuutin yleisl‰‰k‰rik‰ynnist‰ kelakorvaus on " + desi.format(korvaus) + " euroa");

}
	}
	
}
