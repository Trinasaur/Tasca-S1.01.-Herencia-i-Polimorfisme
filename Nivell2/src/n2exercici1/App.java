package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		Cycle c = (Cycle) new Unicycle();
		
		ride(c);
		
		c = (Cycle) new Bicycle();
		
		ride(c);
		
		c = (Cycle) new Tricycle();
		
		ride(c);
	}
	
	public static void ride(Cycle c) {
		System.out.println("Let's ride!");
	}

}
