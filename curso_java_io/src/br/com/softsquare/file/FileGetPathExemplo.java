package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class FileGetPathExemplo {
	
	
	public static void main(String [] args) throws IOException{
		
		
		
		File temp = File.createTempFile("eu-sou-txt-file",".jpg") ;
		
		String absPath =temp.getAbsolutePath();
		System.out.println("Caminho do Arquivo "+absPath);
		String  filepath = absPath.substring(0,absPath.lastIndexOf(File.separator));
		System.out.println("Caminho do Arquivo "+filepath);
		
	}
	

}
