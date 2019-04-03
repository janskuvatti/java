package kantaasiakas;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kantaasiakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String asiakas;
		double summa,  alennus;

		Scanner input = new Scanner(System.in);
		System.out.print("Anna ostosten summa: ");
		summa = input.nextDouble();

		System.out.print("Oletko kanta-asiakas (kyllä, ei): ");
		asiakas = input.next();

		    
		if (asiakas.matches("kyllä")) {
			if(summa < 1000){
			alennus = summa * 0.5 / 100;

			DecimalFormat desi = new DecimalFormat("0,00");
			System.out.println("Ostosten loppusumma on " + desi.format("alennus"));
			
		}
			
			}
		else if (asiakas.equals("kyllä")) {
			if (summa > 1000 ) {
				alennus = summa * 1.0 / 100;

				DecimalFormat desi = new DecimalFormat("0,00");
				System.out.println("Ostosten loppusumma on " + desi.format("alennus"));
			
			}
		}
		else {
	
							
	

			

		DecimalFormat desi = new DecimalFormat("0,00");
		System.out.println("Ostosten loppusumma on " + desi.format("summa"));
		}
			
     }


	}


