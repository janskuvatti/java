package lainaera;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Lainaera {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double luotto = 0;
			int era = 0;
			int kausi = 0;
			double maksu;
		
			Scanner input = new Scanner (System.in);
		
	System.out.print("Anna luotollisen ostoksen hinta: " );
				luotto = input.nextDouble();
				System.out.print("Anna kuukausierien lukum‰‰r‰: " );
					
				kausi = input.nextInt();
			maksu = luotto / kausi;
			
			DecimalFormat desi = new DecimalFormat("0.00");
			while (era <= kausi && luotto > 0) {
			
			//pyydet‰‰n seuraavan ostoksen hinta
			era++;
			luotto = luotto - maksu;		
				
				
					
					
					
				System.out.println(era + ". er‰ " + desi.format(maksu) + " euroa, luottoa j‰ljell‰ " + desi.format(luotto) + " euroa");
			
			

					
				
				

				
			}
		
		
		}
		
	

	}


