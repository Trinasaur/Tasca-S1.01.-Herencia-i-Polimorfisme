package n1exercici8;

public class App {

	public static void main(String[] args) {
		
		
	//Creem un objecte de la classe Frog
		Frog frog = new Frog();
				
	//Avans de la generalitzacio provem els metodes
		frog.saltar();
		frog.moure(1);
		frog.mengar('c');
		frog.respirar("Hola mama!");
				
	//Generalitzacio
		Amphibian amphibian = (Amphibian) frog;
				
	//Cridem els metodes despres de la generalitzacio
		amphibian.moure(1);
		amphibian.mengar('c');
		amphibian.respirar("Hola mama!");
	//Encara que ara sigui amphibian segueix cridant els metodes modificats de Frog perque
	//aquest son els metodes als que tenia acces la instancia cuan s'ha construit.
	}

}
