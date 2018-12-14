package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class CreatePathExemplo {

	public static void main (String [] args){

		String filename = "arquivo_curso.txt";
		String workingDir = System.getProperty("user.dir");
		String absoluteFilePath ="";
		absoluteFilePath = workingDir +File.separator + filename;
		System.out.println("Caminho Final "+absoluteFilePath);
		
		File file = new File(absoluteFilePath);
		
		try {
			if (file.createNewFile()){
				System.out.println("Arquivo Criado");
				
			}else {
				
				System.out.println("Arquivo Ja existe");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
