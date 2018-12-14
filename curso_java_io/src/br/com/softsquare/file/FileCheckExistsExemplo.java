package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class FileCheckExistsExemplo {

	public static void main(String [] args){
		
		File file = new File ("Arquivos\\file.txt");
		
		if(file.exists()){
			System.out.println("Arquivo existe");
			
		}else {
			System.out.println("Arquivo inexistente");
			
		}
		
		
	}
	
	
	
}
