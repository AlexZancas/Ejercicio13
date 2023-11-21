package classes;

import java.io.File;
import java.io.IOException;

public class DirectoryThread extends Thread{

	public void run(String filepath) {
		File file = new File(filepath);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
