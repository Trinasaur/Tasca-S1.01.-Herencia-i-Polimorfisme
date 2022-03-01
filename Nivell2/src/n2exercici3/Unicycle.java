package n2exercici3;

public class Unicycle extends Cycle{
	
	static {System.out.println("La classe Unicycle ha estat inicialitzada");}
	
//ATRIBUTS
	protected static final int rodes = 1;
	
	
//CONSTRUCTOR
	public Unicycle() {
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
	public void balance(int a) {
		System.out.println("Aixo es un unicicle, aguanta en peu amb " + getRodes() + " roda.");
	}
}
