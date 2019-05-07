package arvaus;
import java.util.Scanner;
public class Arvaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arvaus = 0;
		int lukumaara=0;
		int vastaus = 78;
		Scanner input = new Scanner (System.in);

		do {
			System.out.print("Arvaa lukua väliltä 1-100: ");
			arvaus = input.nextInt();
			if (arvaus < 78) {
				lukumaara++;
			System.out.print("Arvaa suurempi luku");
			}else {System.out.print("Arvaa pienempi luku");
			}
			
		}while(arvaus == 78);
		
		
		
		}
	}


