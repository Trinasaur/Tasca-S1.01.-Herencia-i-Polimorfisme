package n2exercici3;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Cycle c = (Cycle) new Unicycle();
		
		ride(c);
		
		c = (Cycle) new Bicycle();
		
		ride(c);
		
		c = (Cycle) new Tricycle();
		
		ride(c);
		
		//Crea instàncies de tres tipus i generalitza-les per a formar un array d'objectes Cycle. 
		Tricycle tricycle = new Tricycle();
		Bicycle bicycle = new Bicycle();
		Unicycle unicycle = new Unicycle();
				
		ArrayList<Cycle> ciclismo = new ArrayList<Cycle>();
				
		ciclismo.add((Cycle)unicycle);
		ciclismo.add((Cycle)bicycle);
		ciclismo.add((Cycle)tricycle);
				
		//Tracta d'invocar balance() a cada element de l'array.
		for (int i=0; i<3;i++) {
			if (ciclismo.get(i) instanceof Unicycle) {
				unicycle = (Unicycle) ciclismo.get(i);
				unicycle.balance();//aquesta linea esta per veure el polimorfisme
				unicycle.balance(1);
			} else if (ciclismo.get(i) instanceof Bicycle) {
				bicycle = (Bicycle) ciclismo.get(i);
				bicycle.balance();
				bicycle.balance('a');
			} else if (ciclismo.get(i) instanceof Tricycle) {
				tricycle = (Tricycle) ciclismo.get(i);
				tricycle.balance();
				//tricycle.balance('a');
				
				//trycicle no tenia acces a ninguna forma del metode balance al ser inicialitzada
				//aixi que segueix sense tenirne encara que la generalitzem a cycle
				
			} else {System.out.println("No tiene balance");}
		}
	}
	
	
//METODES
	public static void ride(Cycle c) {
		System.out.println("Let's ride!" + c.wheels());//si el metode wheels fos static tornaria 0 sempre
		
	}
	

}
