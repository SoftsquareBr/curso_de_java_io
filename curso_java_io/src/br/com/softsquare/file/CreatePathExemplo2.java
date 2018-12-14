package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author softsquare
 *
 */
public class CreatePathExemplo2 {

	public static void main (String [] args) throws IOException{
		
		
		
		String filename ="newFile.txt";
		String workinDir = System.getProperty("user.dir");
		
		File file = new File (workinDir,filename);
		
		System.out.println("Caminho final "+file.getAbsolutePath());
		
		if (file.createNewFile()){
			System.out.println("Arquivo Criado");
		}else {
			System.out.println("Arquivo ja existe");
		}

	
		
		
	}
	
	

}
