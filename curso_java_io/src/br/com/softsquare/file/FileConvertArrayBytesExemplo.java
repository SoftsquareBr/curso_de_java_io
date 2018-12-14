package br.com.softsquare.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class FileConvertArrayBytesExemplo {
	
	
	public static void main(String [] args) throws IOException{
		
		
		FileInputStream fileInputstream = null;
		File file = new File("temp.txt");
		byte[] bFile = new byte[(int) file.length()];
		fileInputstream = new FileInputStream(file);
		fileInputstream.read();
		fileInputstream.close();
		
		for(int i =0; i<bFile.length; i++){
			System.out.println((char)bFile[i]);
		}
		
	}

}
