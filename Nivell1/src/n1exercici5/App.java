package n1exercici5;

public class App {

	public static void main(String[] args) {
		
		
		//Metode correr Sobrecarregat
		Gat gat = new Gat();
		
		//METODES DE ANIMAL
		gat.correr();
		gat.correr(1);
		gat.correr('c');
		gat.correr("Hola mama!");
		
		//METODE DE GAT
		gat.correr(0.111);
		
	}

}
