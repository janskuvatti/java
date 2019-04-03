package lampotilat;
import java.util.Scanner;
import java.util.Arrays;
public class Lampotilat {
	private Scanner input = new Scanner(System.in);
	
	public Lampotilat() {
	int lampotilat[] = new int[100];
	int lkm = kysyLampotilat(lampotilat, lampotilat.length);
	naytaLampotilat(lampotilat, lkm);
	}
	private int kysyLampotilat(int lampotilat[], final int MAX) {
		 int i;
		int lampotila = 0;
		for( i= 0; i < MAX; i++) {
		System.out.println("Anna lämpötila:" );
		lampotila = input.nextInt();
		
		 
		 if(lampotila == -999) {
				break;
			}
		 else {
			 lampotilat[i] = lampotila;
		 }
		
		}
		

		return i;
		}
	private void naytaLampotilat(int[] lampotilat, int lkm) {
		Arrays.sort(lampotilat, 0, lkm);


		System.out.print("Annoit lämpötilat: ");
	for(int x=0; x < lkm; x++) {
		System.out.print(lampotilat[x] + " ");
	}
		
	}
	
		public static void main(String[] args) {
			new Lampotilat();
	
		}


}
