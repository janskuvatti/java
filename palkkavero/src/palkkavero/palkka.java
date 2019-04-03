package palkkavero;
import java.util.Scanner;
import java.text.DecimalFormat;
public class palkka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ika ;
	        double  veroprosentti, tyottomyysvakuutus, bruttopalkka, tyoelakevakuutus, palkka, loppupalkka;
	        final double TYOTTOMYYSVAKUUTUS = 0.0115;

	        // Kysyt‰‰n tiedot k‰ytt‰j‰lt‰
	        System.out.print("Anna palkka: ");

	        // Luetaan k‰ytt‰j‰lt‰ saatu tieto
	        Scanner input = new Scanner(System.in);
	        bruttopalkka = input.nextDouble();

	        System.out.print("Anna veroprosentti: ");
	        veroprosentti = input.nextDouble();

	        System.out.print("Anna ik‰: ");
ika = input.nextInt();


	        

	        // Laskeminen
	       palkka = bruttopalkka * veroprosentti / 100;
	       tyottomyysvakuutus = bruttopalkka * TYOTTOMYYSVAKUUTUS;
	       if(ika < 53) {
	    	   tyoelakevakuutus = bruttopalkka * 0.0555;
	       }
	       else {
	    	   tyoelakevakuutus = bruttopalkka * 0.0705;
	    	   
	       }
	       loppupalkka = bruttopalkka - palkka - tyottomyysvakuutus - tyoelakevakuutus;

	        // Vastaus
	       DecimalFormat desi = new DecimalFormat("0");
	        DecimalFormat desimaalit = new DecimalFormat("0.00");
	        System.out.println("Bruttopalkka " + desi.format(bruttopalkka));
	        System.out.println("Veron osuus " + desimaalit.format(palkka));
	        System.out.println("Tyˆel‰kevakuutusmaksun osuus " + desimaalit.format(tyoelakevakuutus));
	        System.out.println("Tyˆttˆmyysvakuutuksen osuus " + desimaalit.format(tyottomyysvakuutus));
	        System.out.println("K‰teen j‰‰ "  + desimaalit.format(loppupalkka));
	        
    		
	}
}
