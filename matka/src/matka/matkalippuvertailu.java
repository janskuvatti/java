package matka;
import java.util.Scanner;
import java.text.DecimalFormat;
public class matkalippuvertailu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 int matkat ;
	        double  matkalippu, kuukausilippu, yksittaismatkat, kertavahennys, kuukausivahennys;
	

	        // Kysyt��n tiedot k�ytt�j�lt�
	        System.out.print("Montako matkaa teet kuukaudessa: ");

	        // Luetaan k�ytt�j�lt� saatu tieto
	        Scanner input = new Scanner(System.in);
	        matkat = input.nextInt();

	        System.out.print("Anna yksitt�isen lipun hinta: ");
	        matkalippu = input.nextDouble();

	        System.out.print("Anna kuukausilipun hinta:  ");
kuukausilippu = input.nextDouble();


	        

	        // Laskeminen
	  yksittaismatkat = matkat*matkalippu;
	  kertavahennys =  kuukausilippu - (matkat * matkalippu);
	  kuukausivahennys = (matkat * matkalippu) -  kuukausilippu ;
	  DecimalFormat desimaalit = new DecimalFormat("0.00");
	  if (yksittaismatkat > kuukausilippu) {
		  System.out.println("Kuukausilippu on " + desimaalit.format(kuukausivahennys) + " euroa halvempi kuin yksitt�inen");
	  }
	  else  if (yksittaismatkat < kuukausilippu){
		  System.out.println("Yksitt�inen lippu on " + desimaalit.format(kertavahennys)  + " euroa halvempi kuin kuukausilippu");
	  }
	  else {
		  System.out.println("...");
	  }

	        // Vastaus
	      

	}

}
