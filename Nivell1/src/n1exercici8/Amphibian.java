package n1exercici8;

public class Amphibian {
	
	static {System.out.println("La classe Amphibian ha estat inicialitzada");}
	
	//ATRIBUTS
	
	private final String name = "amphibian";
	//ponemos algo que diferencia el output entre frog y amphibian, 
	//asi vemos que la frog sigue llamandose frog al generalizarla
	
	
	//CONSTRUCTOR
	public Amphibian () {
		
	}
	
	
	//GETTERS Y SETTERS

	
	
	//METODES
	public void correr() {
		
	}
	
	public void moure(int a) {
		System.out.println(a+ name);
	}
	
	public void respirar(String b) {
		System.out.println(b+ name);
	}
	
	public void mengar(char c) {
		System.out.println(c+ name);
	}
	
	
	
}
