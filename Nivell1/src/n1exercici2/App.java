package n1exercici2;

public class App {

	public static void main(String[] args) {
		
		
		//METODES STATICS
		Vehicle.iniciar();
		Vehicle.parar();
		
		//METODES DINANICS
		Vehicle vehicle = new Vehicle();
		vehicle.accelerar();
		
	}

}
