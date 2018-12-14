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
public class WriteTempFileExemplo {

	public static void main(String[] args) throws IOException 
	{

		File temp =  File.createTempFile("arquivo-temporario",".tmp");
		BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
		bw.write("Este texto pertence ao arquivo temporario temp");
		bw.close();
		System.out.println("Arquivo temporario "+temp.getAbsolutePath()+" escrito");
		
	}

}
