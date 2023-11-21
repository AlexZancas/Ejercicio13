package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratorThread extends Thread{
	public String filepath;
	public ArrayList<Ciudad> listaInformacion;
	
	public GeneratorThread(String filepath,ArrayList<Ciudad> listaInformacion ){
		this.filepath = filepath;
		this.listaInformacion = listaInformacion;
	}	
	public void run() {
		File file = new File(filepath);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0; i<listaInformacion.size(); i++) {
				String nombre = "\nNombre: "+listaInformacion.get(i).getNombre();
				String habitantes = "\nHabitantes: "+listaInformacion.get(i).getHabitantes();
				String superficie = "\nSuperficie: "+listaInformacion.get(i).getSuperficie();
				String habit2030 = "\nHabitantes 2030: "+listaInformacion.get(i).getHabitantes2030();
				String supOcupada = "\nSuperficie ocupada: "+listaInformacion.get(i).getSuperfOcupada();
				String toprint = nombre + habitantes + superficie + habit2030 + supOcupada;
				bw.write(toprint);
				
			}
			bw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
