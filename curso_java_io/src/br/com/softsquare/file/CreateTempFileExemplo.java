package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class CreateTempFileExemplo {

	public static void main(String[] args) throws IOException {

		File temp =  File.createTempFile("arquivo-temporario",".tmp");
		System.out.println("Arquivo temporario "+temp.getAbsolutePath());
		//temp.deleteOnExit();
	}

}
