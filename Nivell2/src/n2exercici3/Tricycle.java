package n2exercici3;

public class Tricycle extends Cycle{
	
	static {System.out.println("La classe Tricycle ha estat inicialitzada");}
	
//ATRIBUTS
	protected static final int rodes = 3;
	
//CONSTRUCTOR
	public Tricycle() {
		super();
		
	}
	
//GETTERS Y SETTERS
	public static int getRodes() {
		return rodes;
	}

//METODES
	public int wheels() {
		return rodes;
	}
}
