package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class FileMoveDirExemplo {
	
	
	public static void main (String [] args){
		
		
		File afile = new File ("A\\Afile.txt");
		
		if (afile.renameTo(new File("B\\"+afile.getName()))){
			System.out.println("Arquivo Movido");
		}else {
			
			System.out.println("Arquivo não movido");
		}
		
	}
	
	
	
	

}
