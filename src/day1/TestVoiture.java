package day1;
import java.time.LocalDate;
import java.util.Scanner;
public class TestVoiture {

	public static void main(String[] args) {
		/*
		 * //nbreVoiture = 0
		Voiture.getNbreVoitures();
		Voiture v1 = new Voiture("MarioKart", "kart", LocalDate.of(2015, 10, 1), 3000);
		//nbreVoiture = 1
		//System.out.println(v1.toString());
		Voiture.getNbreVoitures();
		System.out.println(v1);
		
		Voiture v2 = new Voiture("Smart", "Hugo", LocalDate.of(2014, 11, 2), 200);
		System.out.println(v2);
		//nbreVoiture = 2
		Voiture v3 = new Voiture("VoitureDeOuiOui", "disney", LocalDate.of(2022, 01, 01), 10);
		//nbreVoiture = 3
		System.out.println(v3);
		
		Voiture.getNbreVoitures(); // appel à la  méthode de classe
		*/
		System.out.println("tapez les information de votre voitur : ");
		System.out.println("****");
		System.out.println("tapez la marque : ");
		Scanner sc = new Scanner(System.in);
		String marque = sc.nextLine();
		//System.out.println("marque = "+marque);
		System.out.println("tapez le modele : ");
		String modele = sc.nextLine();
		System.out.println("tapez la date d'immatriculation : ");
		String ld = sc.nextLine();
		LocalDate dateImmat = LocalDate.parse(ld);
		System.out.println("tapez la vitesse max : ");
		int vitesseMax = sc.nextInt();
		System.out.println("Marque = "+marque);
		System.out.println("Modele = "+modele);
		System.out.println("DateImmat = "+dateImmat);
		System.out.println("VitesseMax = "+vitesseMax);

		
	}

}
