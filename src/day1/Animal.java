package day1;

public class Animal {
	//1) instance
	String nom;
	int age;
	//création d'un constructeur
	public Animal() {
		System.out.println("Constructeur d'un animal");
	}
	public Animal(String nom, int age) {
		System.out.println("Construction d'un Animal avec deux paramèters");
		this.nom = nom;
		this.age = age;
	}
}
