package n1exercici3;

public class Vehicle2 {
	
	//ATRIBUTS
	
		private String a = "Cridem un membre private dinamic";
		private static String b= "Cridem un membre private static";
		public static String c = "Cridem un membre public, estatic";
		static int inicialitzacio = 0;
		static int construccio = 0;
	//CONSTRUCTORS
		
		public Vehicle2() {
			
		}
		
		
		static {//solo se llama una vez cuando la classe es inicializada, es el primer que es fa
			System.out.println("Block estatic: classe Vehicle2 inicializada. ");
			
			inicialitzacio++;
			System.out.println("Numero de cops que s'ha inicialitzat la classe Vehicle2: " + inicialitzacio);
			
		}
		
		
		{//se llama cada vez que una instancia de la classe es construida
			System.out.println("Block no estatic: instancia de la classe Vehicle2 construida. ");
			
			construccio++;
			System.out.println("Numero de cops que s'ha construit una instancia de la classe Vehicle2: " + construccio);
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
			Vehicle2.b = b;
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
