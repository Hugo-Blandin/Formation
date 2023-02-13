package day1;

import java.time.LocalDate;

public class Voiture {
	
	// Attributs d'instance 
	String marque;
	String modele;
	LocalDate dateImmatriculation;
	int vitesseMax;

	// Attribut de classe
	static int nbreVoitureCree = 0;
	
	//Constructeur avec paramètres
	public Voiture(String marque, String modele, LocalDate ld, int vitesseMax)
	{
		System.out.println("Construction d'une Voiture avec 4 paramèters");
		this.marque = marque;
		this.modele = modele;
		this.dateImmatriculation = ld;
		this.vitesseMax = vitesseMax;
		nbreVoitureCree++;
	}
	//@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", vitesseMax=" + vitesseMax
				+ ", dateImmatriculation=" + dateImmatriculation + "]";
	}
	
	public static void getNbreVoitures()  // méthode de classe
	{
		System.out.println("Nbre de voitures en mémoire : "+nbreVoitureCree);
	}
	
}
