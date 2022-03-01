package n1exercici4;

public class App {

	public static void main(String[] args) {
		
		
		//METODES STATICS
		Vehicle.iniciar();
		Vehicle.parar();
		
		//METODES DINANICS
		Vehicle vehicle = new Vehicle(1,2);
		vehicle.accelerar();
		
		//Fem servir les variables estatic, final i estatic final
		
		//Variable static
		System.out.println(Vehicle.getNumero1());//static
		Vehicle.setNumero1(0);//es pot modificiar
		System.out.println(Vehicle.getNumero1());//static
		
		//Variable final
		System.out.println(vehicle.getNumero2());//final
		//no es pot modificar, es especifica de la instancia que fem servir
		
		//Variable final
		System.out.println(Vehicle.getNumero3());//static final
		//no es pot modificar, es generica de tota la classe vehicle
		
	}

}
