package n3exercici1;

public class Base {
	
	
	static {System.out.println("La classe Base ha estat inicialitzada");}
	
	
	//METODES
	public void metode1() {
		metode2();
	}
	public void metode2() {
		System.out.println("Base: El Ratolí vol ensumar.");
	}
}

