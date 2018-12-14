package br.com.softsquare.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * 
 * @author softsquare
 *
 */
public class VerifyDirectoryExemplo {
	
	
	public static void main(String [] args){
		
		
		
		Path path =  Paths.get("Arquivo\\sub\\teste");
		
		if(!Files.exists(path)){
			
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
	
				e.printStackTrace();
			}
			System.out.println("Diretorio Criado! "+path);
		}else{
			
			System.out.println("Diretorio existe");
			
		}
		
		
		
		
	}
	

}
