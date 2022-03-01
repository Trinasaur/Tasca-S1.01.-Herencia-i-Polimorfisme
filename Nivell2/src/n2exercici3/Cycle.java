package n2exercici3;

public class Cycle {
	
	static {System.out.println("La classe Cycle ha estat inicialitzada");}
	
//ATRIBUTS
	protected static int rodes;

	
//CONSTRUCTOR
	public Cycle() {
		rodes = 0;
	}

	
//GETTERS Y SETTERS
	public static int getRodes() {
		return rodes;
	}


	public static void setRodes(int rodes) {
		Cycle.rodes = rodes;
	}
	
	
//METODES
	public int wheels() {
		return rodes;
	}
	public void balance() {//aixo existeix per ajugar al polimorfisme
		System.out.println("*");
	}


	

}
