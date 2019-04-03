package minigolf;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

import java.text.DecimalFormat;
public class MinigolfTilasto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tilasto;
		int pelaajat;
		int pisteet;
		double keskiarvo;
		int suurin;
		int pienin;
int alle =0;
	
int i =0;

boolean loppu =false;
		Scanner input = new Scanner(System.in);
		System.out.print("Anna pelaajien lukum‰‰r‰: " );
		pelaajat = input.nextInt();
		
		
		 tilasto = new int[pelaajat];
		
		do{
int lkm = i + 1;
			System.out.print("Anna pelaajan " + lkm + ". tulos: ");
			pisteet=input.nextInt();
			
			tilasto[i] = pisteet;
			
			lkm++;
	

i++;
double sum = IntStream.of(tilasto).sum();
keskiarvo = sum / pelaajat;

pienin = Arrays.stream(tilasto).min().getAsInt();
suurin =  Arrays.stream(tilasto).max().getAsInt();



		if(i == pelaajat)	{
			loppu =true;
		}
		
		}while(!loppu);		
		/* if (pisteet < keskiarvo) {
			 int lkm2 = a + 1;
				lkm2++;
				

			}	*/
		
	DecimalFormat desi = new DecimalFormat("0.00");

		System.out.println("Pelien keskiarvo oli " + desi.format(keskiarvo));
		System.out.println("Pienin peli oli " + pienin);
		System.out.println("Suurin peli oli " + suurin);
 		Arrays.sort(tilasto, 0, i);

		

		for(int a = 0; a < i; a++) {
			
			
	

			if(tilasto[a] < keskiarvo) {
				alle ++;



			}	

			input.close();	

		}	

		System.out.println(alle + " pelaajalla oli keskiarvoa pienempi tulos");		
	
	
}
}