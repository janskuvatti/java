package kokonaisluku;
import java.util.Scanner;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
public class KokonaislukuOhjelma {
		public static void main(String[] args) throws Exception {
		ArrayList <Object>luvut = new ArrayList<Object>();

			 final int LKM = 10;
			Scanner input = new Scanner(System.in);
			String kluku = "";
			int i=0;
			//luvut != null && i < LKM
			//double dluku = 0;
			for(int x = 0; x <= LKM; x++){
				System.out.print("Anna " + (i+1)+". kokonaisluku: " );

			String mjono = null;
			
			try {
				kluku = input.nextLine(); //KRIITTINEN LAUSE
				mjono = "" + kluku;
				if (kluku.contains("+")) {
					throw new Exception();
				}else{
					int luku = Integer.parseInt(kluku); //KRIITTINEN LAUSE
				luvut.add(kluku);
				i++;
				}}
			
			catch (NumberFormatException e) {
				System.out.println("Syötä kokonaisluku numeronäppäimillä!");

			} catch (NullPointerException e) {
				System.out.println("Syötä kokonaisluku numeronäppäimillä!");

			}
			
				catch (Exception e) {
					System.out.println("Syötä kokonaisluku numeronäppäimillä!");
					//input.nextLine();

				}
			int apu;
			 // tulosta viimeinen luku
			for (int a = 0; a <= luvut.size(); a++) {
				System.out.print(luvut.get(a) + " ");

			}
		}
		}
			

}