package n1exercici8;

public class Frog extends Amphibian {
	
	private final String name = "Frog";
	
	static {System.out.println("La classe Frog ha estat inicialitzada");}
	{System.out.println("Instancia de la classe Frog construida");}
	
//CONSTRUCTOR
	public Frog () {
		super();
	}
	
//METODES
	public void saltar() {
		System.out.println("saltar" + name);
	}
	public void moure(int a) {
		System.out.println(a+ name + " una granota corren seria terrorifica");
	}
	
	public void respirar(String b) {
		System.out.println(b+ name + " algunes granotes respiran tambe per la esquena");
	}
	
	public void mengar(char c) {
		System.out.println(c+ name + " les granotes mengen grills");
	}
}
