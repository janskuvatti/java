package vedenkulutus;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
public class Vedenkulutus {

	public static void main(String[] args) {
		int[] vesimittari;
		int kulutus;

	
int i = 1;
boolean loppu =false;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vesimittarin alkulukema: " );
		kulutus = input.nextInt();
	
		
		 vesimittari = new int[kulutus];
	
		do{

	
			

			System.out.print("Anna " + i + ". vesimittarin lukema: ");
			kulutus=input.nextInt();

			vesimittari[i] = kulutus;
			
		
			

		if(i == 6)	{
			loppu =true;
		}
		}while(!loppu);		

		

				
				
				for(int x=1; x <= 6; x++) {
					

					System.out.println("Kuukauden "  + x  + " kulutus oli " + vesimittari[x]);
				}
	}

}
