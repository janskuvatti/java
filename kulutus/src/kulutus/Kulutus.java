package kulutus;
import java.util.Scanner;

import java.text.DecimalFormat;

public class Kulutus {
	
 static int kysyKilometrit() {
	int kilometrit;	
	Scanner input = new Scanner(System.in);
	System.out.print("Anna ajetut kilometrit: ");
	

	kilometrit = input.nextInt();
	return kilometrit;
	}

   static int kysyTankkaus() {
int tankkaus;
Scanner input = new Scanner(System.in);

		System.out.print("Anna tankattu m‰‰r‰: ");

		tankkaus = input.nextInt();	
		

		return tankkaus;
	}

	 static double laskeKulutus(int kilometrit, int tankkaus) {
		 
		double kulutus =  (double) tankkaus / kilometrit*100;
		return kulutus;
	}
static void  naytaKulutus(double kulutus) {
		

		DecimalFormat desi = new DecimalFormat("0.00");

		System.out.println("Kulutus/100km on " + desi.format(kulutus) + " litraa");
	}
	
	public static void main(String[] args) {
double kulutus = laskeKulutus(kysyKilometrit(),  kysyTankkaus());

		naytaKulutus(kulutus);

	
	}

}
