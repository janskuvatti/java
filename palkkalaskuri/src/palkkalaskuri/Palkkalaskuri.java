package palkkalaskuri;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

import java.text.DecimalFormat;
public class Palkkalaskuri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] tyotunnit;
		int tunnit;
		int tyopaivat;
		double tuntipalkka;
		double bruttopalkka;
	
int i =0;
boolean loppu =false;
		Scanner input = new Scanner(System.in);
		System.out.println("Anna tuntipalkkasi: " );
		tuntipalkka = input.nextDouble();
		System.out.print("Monenko p‰iv‰n tunnit annat: ");
		tyopaivat = input.nextInt();
		
		 tyotunnit = new int[tyopaivat];
		do{

			System.out.print("Anna tuntien m‰‰r‰ p‰iv‰ss‰: ");
			tunnit=input.nextInt();
			
			tyotunnit[i] = tunnit;
			
		

i++;
		if(i == tyopaivat)	{
			loppu =true;
		}
		}while(!loppu);		
		int sum = IntStream.of(tyotunnit).sum();



		
		bruttopalkka = sum * tuntipalkka;
		DecimalFormat desi = new DecimalFormat("0.00");
				System.out.println("Tunteja yhteens‰: " + sum);
				System.out.println("Bruttopalkkasi on: " + desi.format( bruttopalkka));
				System.out.print("Annoit tunnit: ");
				
				for(int x=0; x < tyopaivat; x++) {
					

					System.out.print( tyotunnit[x] + " ");
				}
				input.close();
				}	
			
		

		}
			
		
			
	


