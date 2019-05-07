package kantaasiakas;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Kantaasiakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alennus,  loppusumma;
	double summa;

	String asiakas;
	String teksti;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Anna ostosten summa: ");
	summa = input.nextDouble();
	
	 
	System.out.print("Oletko kanta-asiakas (kyllä, ei): ");
	asiakas = input.next();

	if (asiakas.equals("kyllä") ) {
if(summa > 1000) {
		alennus = 1.0;
		loppusumma = summa - (summa * (alennus / 100));
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Ostosten loppusumma on " + des.format(loppusumma));	

	


}
		
		
	}

else if (asiakas.equals("kyllä") )
{
if (summa < 1000) {
alennus = 0.5;
loppusumma = summa - (summa * (alennus / 100));
DecimalFormat des = new DecimalFormat("0,00");
System.out.println("Ostosten loppusumma on " + des.format(loppusumma));	
     }
	}	
		

	/*else if (asiakas.equals("ei")   {
	System.out.println("Ostosten loppusumma on " + summa);
	}
				
		else {
		
		System.out.println("Ostosten loppusumma on " + summa);
		
		
		}	*/
		


	
	}
}
	


	

	


	

	
	


