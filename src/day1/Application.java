package day1;

public class Application {

	public static void main(String[] args) {
		//System.out.println("Hello JAVA");// TODO Auto-generated method stub
		// 1) Création d'une instance
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		System.out.println(a1.nom); //null
		System.out.println(a1.age); //0
		
		Animal a3 = new Animal("Rex",3);
		System.out.println("Nom : " + a3.nom);
		System.out.println("Age : " + a3.age);

	}

}
