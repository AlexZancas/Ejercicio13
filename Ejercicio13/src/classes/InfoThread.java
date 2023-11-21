package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoThread extends Thread{
	public Scanner scanner;
	public ArrayList<Ciudad> listaCiudades;
	
	public InfoThread(Scanner scanner, ArrayList<Ciudad> listaCiudades) {
		this.scanner = scanner;
		this.listaCiudades = listaCiudades;
	}
	
	public void run() {
		System.out.println("Bienvenido al ministerio de Geografía, introduzca los datos de 3 ciudades");
		for(int i=0; i<3; i++) {
			Ciudad ciudad = new Ciudad();
			
			System.out.println("\nNombre de la ciudad;");
			String nombre = scanner.nextLine();
			
			System.out.println("Cantidad de habitantes:");
			int habitantes = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Superficie:");
			int superf = scanner.nextInt();
			scanner.nextLine();
			
			ciudad.setNombre(nombre);
			ciudad.setHabitantes(habitantes);
			ciudad.setSuperficie(superf);
			ciudad.setHabitantes2030();
			ciudad.setSuperfOcupada();
			
			listaCiudades.add(ciudad);
			
		}
	}

	
}
