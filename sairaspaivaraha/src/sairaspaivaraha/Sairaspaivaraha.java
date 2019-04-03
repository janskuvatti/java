package sairaspaivaraha;
import java.util.Scanner;

import java.text.DecimalFormat;
public class Sairaspaivaraha{
	
	public static double annaVuositulot() {
		double vuositulot;
		Scanner input = new Scanner(System.in);

		System.out.print("Anna vuositulosi: ");
		vuositulot = input.nextDouble();

		input.close();

		return vuositulot;
	}
public static double laskePaivaraha(double vuositulot) {	
	double paivaraha;
	if(vuositulot <= 1399) {
		paivaraha = 0.0;
	}
	else	if(vuositulot > 1399 && vuositulot <= 36419) {
			
		
		paivaraha = 0.7 * vuositulot  / 300.0;
	
	}
	else	if( vuositulot > 6419 && vuositulot <= 56032) {
		paivaraha = 84.98+0.4 * (vuositulot - 36419) /300.0;
	}
	else {
		paivaraha=111.13 + 0.25 * (vuositulot - 56032) / 300.0;
	}
	return paivaraha;
}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

double vuositulot, paivaraha;
DecimalFormat desi = new DecimalFormat("0.00");
vuositulot = annaVuositulot();
if(vuositulot  > 0) {
	paivaraha = laskePaivaraha(vuositulot);
	System.out.println("Vuosituloilla " + desi.format(vuositulot) + " sairaspäiväraha on " + desi.format(paivaraha) + " euroa/päivä.");
}
		
	}

}
