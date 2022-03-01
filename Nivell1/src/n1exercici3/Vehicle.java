package n1exercici3;

public class Vehicle {
	
	//ATRIBUTS
	
		private String a = "Cridem un membre private dinamic";
		private static String b= "Cridem un membre private static";
		public static final String c = "Cridem un membre public, estatic i final";
		static int inicialitzacio = 0;
		static int construccio = 0;
	//CONSTRUCTORS
		
		public Vehicle() {
			
		}
		
		
		static {//solo se llama una vez cuando la classe es inicializada, es el primer que es fa
			System.out.println("Block estatic: classe Vehicle inicializada. ");
			
			inicialitzacio++;
			System.out.println("Numero de cops que s'ha inicialitzat la classe Vehicle: " + inicialitzacio);
			
		}
		
		
		{//se llama cada vez que una instancia de la classe es construida
			System.out.println("Block no estatic: instancia de la classe Vehicle construida. ");
			
			construccio++;
			System.out.println("Numero de cops que s'ha construit una instancia de la classe Vehicle: " + construccio);
		}
		
		
		
	//GETTERS Y SETTERS
		
		
		
		public String getA() {
			return a;
		}


		public void setA(String a) {
			this.a = a;
		}
		
		public static String getB() {
			return b;
		}

		public static void setB(String b) {
			Vehicle.b = b;
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
