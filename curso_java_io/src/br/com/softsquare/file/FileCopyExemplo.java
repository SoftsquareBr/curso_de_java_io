package br.com.softsquare.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class FileCopyExemplo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		InputStream inputStrem = null;
		OutputStream outputStream = null;
		File afile = new File("Afile.txt");
		File bfile = new File("Bfile.txt");
		inputStrem = new FileInputStream(afile);
		outputStream = new FileOutputStream(bfile);
		byte [] buffer = new byte[1024];
		
		int length;
		while((length = inputStrem.read(buffer))>0){
			outputStream.write(buffer, 0, length);
			
		}
		
		
	}

}
