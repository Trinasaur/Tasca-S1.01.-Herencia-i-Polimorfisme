package n2exercici2;


public class App {

	public static void main(String[] args) {
		
		Cycle c = (Cycle) new Unicycle();
		
		ride(c);
		
		c = (Cycle) new Bicycle();
		
		ride(c);
		
		c = (Cycle) new Tricycle();
		
		ride(c);
		
		System.out.println("Cada subclasse de Cycle crida el seu propi numero de rodes encara que estigui generalitzat");
	}
	
//METODES
	
	public static void ride(Cycle c) {
		System.out.println("Let's ride!" + c.wheels());
		//si el metode wheels fos static tornaria 0 sempre
		
	}
	
	
	
	
	

}
