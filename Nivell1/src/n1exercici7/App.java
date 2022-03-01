package n1exercici7;

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
		
		/*ERROR HANDLING
		 * 
		 * try{
		 * amphibian.saltar();
		 * }
		 * 
		 * catch(Exception ex){
		 * System.out.println("l'amphibian no salta");
		 * }
		 * 
		 * finally {
		 * System.out.println("The 'try catch' is finished.");
		 * }
		 * 
		 */
		//aixo no arriba a compilar, no es pot fer error handling
		//La classe amphibian no pot cridar un metode de Frog encara que l'objecte sigui una frog generalitzada.
		//L'acces al metode saltar depen de la classe actual de l'objecte cuan el fem servir.
		//Per a poder fer servir saltar necesitaria tenirlo a amphibian i fer un polimorphisme.
		
		
	}

}
