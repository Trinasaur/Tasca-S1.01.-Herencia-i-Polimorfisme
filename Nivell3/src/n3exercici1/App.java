package n3exercici1;

public class App {

	public static void main(String[] args) {
		
		//Creem una instancia de la classe derivada, aixo incialitza les dues classes, la derivada y la seva superclasse.
		Derivada derivada = new Derivada();
		
		System.out.println("hOLA");//Per a veure que les dos classes s'inicialitcen abans de fer l'upcasting.
		
		Base base = (Base) derivada;
		
		base.metode1();
		
	//El metode1 ha cridat el metode2 de la derivada y no de la base. Aixo es deu a que els metodes que estan disponibles
	//per a una instancia estan decidits en el moment de inicialitzarla. El upcasting no li treu acces al metode2() de Derivada.

	}

}
