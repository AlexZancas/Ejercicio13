import java.util.ArrayList;
import java.util.Scanner;

import classes.Ciudad;
import classes.DirectoryThread;
import classes.GeneratorThread;
import classes.InfoThread;

public class Main {

	public static void main(String[] args) {
		String path =  "C:\\Users\\ajzancas\\Documents\\Java\\TalentCamp\\PruebaFiles\\resultado\\ciudades.txt";
		ArrayList<Ciudad> listaCiudades = new ArrayList<Ciudad>();
		Scanner scanner = new Scanner(System.in);
		
		InfoThread infoThread = new InfoThread(scanner, listaCiudades);
		infoThread.start();
		try {
			infoThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DirectoryThread directoryThread = new DirectoryThread();
		directoryThread.start();
		try {
			directoryThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GeneratorThread generatorThread = new GeneratorThread(path, listaCiudades);
		generatorThread.start();
		try {
			generatorThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
