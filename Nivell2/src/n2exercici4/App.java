package n2exercici4;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		//Crea instàncies de tres tipus i generalitza-les per a formar un array d'objectes Cycle.
		
		Ratolí mickey = new Ratolí();
		System.out.println("-");
		
		Jerbu audrey = new Jerbu();
		System.out.println("-");
		
		Hamster hamtaro = new Hamster();
		System.out.println("-");
		
		//Cada instancia tindra acces als seus propis metodes peque aixi ha estat inicialitzada.
		
		ArrayList<Rossegador> colonia = new ArrayList<Rossegador>();
				
		colonia.add(mickey);
		colonia.add(audrey);
		colonia.add(hamtaro);
				
		//Tracta d'invocar correr(), ensumar() i rossegar() a cada element de l'array.
		for (int i=0; i<3;i++) {
			colonia.get(i).correr();
			colonia.get(i).ensumar();
			colonia.get(i).rossegar();
		}
	}
	
	
//METODES
	

}
