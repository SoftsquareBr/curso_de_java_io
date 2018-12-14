package br.com.softsquare.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class WriteFileExemplo2 {
	
	
	@SuppressWarnings("resource")
	public static void main (String [] args) throws IOException{
		
		
		FileOutputStream ftop ;
		File file;
		String texto ="Texto de escrita exercicio 2";
		
		file = new File("C:/Teste/ARQUIVO_ESCRITA.txt");
		ftop = new FileOutputStream(file);
		byte[] contentBytes = texto.getBytes();
		
		if(!file.exists()){
		
				file.createNewFile();
				

		}
		
	
			ftop.write(contentBytes);
			
	
			System.out.println("Feito!");
			
	
		
		
	}

}
