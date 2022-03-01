package n1exercici6;

public class App {

	public static void main(String[] args) {
		
	//Creem un objecte de la classe Frog
		Frog frog = new Frog();
		
	//Avans de la generalitzacio provem els metodes
		frog.moure(1);
		frog.mengar('c');
		frog.respirar("Hola mama!");
		
	//Generalitzacio
		Amphibian amphibian = (Amphibian) frog;
		
	//Cridem els metodes despres de la generalitzacio
		amphibian.moure(1);
		amphibian.mengar('c');
		amphibian.respirar("Hola mama!");
		
	}

}
