package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class DeleteTempFileExemplo {
	
	
	public static void main(String [] args) throws IOException{
		
		File temp = File.createTempFile("arquivo-temporario", ".tmp");
		
		temp.deleteOnExit();
		
	}
	

}
