package n2exercici3;

public class Bicycle extends Cycle{
	
	static {System.out.println("La classe Bicycle ha estat inicialitzada");}
	
//ATRIBUTS
	protected static final int rodes = 2;
	
//CONSTRUCTOR
	
	public Bicycle() {
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
	
	public void balance(char a) {//posem una implimentacio diferent
		System.out.println("Aixo es un bicicle, aguanta en peu amb " + rodes + " rodes.");
	}
}
