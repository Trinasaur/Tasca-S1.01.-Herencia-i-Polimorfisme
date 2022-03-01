package n1exercici4;

public class Vehicle {
	
	//ATRIBUTS
	
	private static int numero1;
	private final int numero2;
	private final static int numero3 = 3; //no tindria sentit inicialitzar aquesta variable a un constructor, tampoc es pot
	
	//CONSTRUCTOR
	public Vehicle() {
		numero1 = 1;
		numero2 = 2;
	}
	
	public Vehicle(int numero1, int numero2) {
		Vehicle.numero1 = numero1;//cambiara numero1 per a tots els objectes Vehicle
		this.numero2 = numero2;//un cop creada la instancia de vehicle ja no es podra modificar
	}

	//GETTERS Y SETTERS
	
	public static int getNumero1() {//variable statica requereix getter static
		return numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public static int getNumero3() {
		return numero3;
	}

	public static void setNumero1(int numero1) {//les variables final no poden tenir setter
		Vehicle.numero1 = numero1;
	}
	
	//METODES
		
	public static void iniciar() {
			
		System.out.println("El vehicle s'ha iniciat");
			
	}


	public static void parar() {
		
		System.out.println("El vehicle s'ha parat");
		
	}
	
	public void accelerar() {
		
		System.out.println("El vehicle ha accelerat");
		
	}

	
}
