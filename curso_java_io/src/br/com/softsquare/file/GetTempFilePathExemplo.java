package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class GetTempFilePathExemplo {
	
	
	public static void main(String []args) throws IOException{
		
		File temp = File.createTempFile("arquivo-x", ".tmp");
		System.out.println("Diretorio do arquivo temporario "+temp.getAbsoluteFile());
		String absPath = temp.getAbsolutePath();
		String tempFilePath = absPath.substring(0,absPath.lastIndexOf(File.separator));
		System.err.println("Diretorio do arquivo temp "+tempFilePath);
	}	

}
