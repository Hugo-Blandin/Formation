package day1;
import java.time.LocalDate;
public class TestVoiture {

	public static void main(String[] args) {
		//nbreVoiture = 0
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

	}

}
