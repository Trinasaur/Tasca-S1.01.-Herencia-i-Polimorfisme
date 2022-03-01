package n1exercici3;

public class App {

	public static void main(String[] args) {
		
		
		
	//LA CARREGA DE LA CLASE TE LLOC AL CREAR LA PRIMERA INSTANCIA DE AQUESTA:
		System.out.println("\nCOMPROBEM: Com el procés de càrrega es dona al crear el primer objecte Vehicle.");
		Vehicle cotxe = new Vehicle();
		
	//non-static block, static block
		System.out.println("\nCOMPROBEM: Que el procés de càrrega no es dona al cridar un métode static de Vehicle.");
		
		System.out.println("Fem servir el metode iniciar()");
		Vehicle.iniciar();
		
		System.out.println("\nCOMPROBEM: Que el procés de càrrega no es dona al fer servir el constructor.");
		
		System.out.println("Fem servir el constructor");
		Vehicle cotxe2 = new Vehicle();
		
		
		System.out.println("\nCOMPROBEM: Que el procés de càrrega no es dona al accedir a un camp static public");
		
		System.out.println(Vehicle.c);
		
		
		System.out.println("\nCOMPROBEM: Que el procés de càrrega no es dona al accedir a un camp static private amb un get");
		
		System.out.println(Vehicle.getB());
		
		System.out.println("\nCOMPROBEM: Que el procés de càrrega no es dona al accedir a un mebre dinamic private amb un get");
		
		System.out.println(cotxe.getA());
		System.out.println(cotxe2.getA());
	
		
		//PER A COMPROBAR SI EL PROCESS DE CARREGA ES DONA per l'accés a un membre estàtic d'aquesta necesitem una clase
		//que no hagi estat ya carregada al crear un objecte d'aquesta, per aixo fem servir Vehicle2
		
		System.out.println("\nCOMPROBEM: Com el procés de càrrega si dona al accedir a un membre estatic per "
				+ "primera vegada amb Vehicle2.");
		
		System.out.println(Vehicle2.c);
		//Hem de fer c statica, pero no final, per a que es doni la carrega.
	}

}
