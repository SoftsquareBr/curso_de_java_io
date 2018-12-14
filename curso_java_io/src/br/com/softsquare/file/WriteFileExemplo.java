package br.com.softsquare.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class WriteFileExemplo {
	
	
	public static void main(String []args){
		
		
		String texto = "Escrevendo em arquivos curso Java IO";
		
		File file = new File ("C:/Teste/texto.txt");
		if (file.exists()){
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		try {
			
			FileWriter fw;
			fw = new FileWriter(file.getAbsoluteFile());
			
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(texto);
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Feito");
	
		
		
		
			
	
		
		
		
		
	}

}
