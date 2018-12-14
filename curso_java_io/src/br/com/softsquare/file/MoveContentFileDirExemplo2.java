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
public class MoveContentFileDirExemplo2 {
	
	
	public static void main (String [] args) throws IOException
	{
		InputStream inputS = null;
		OutputStream outputS = null;
		File afile = new File("A\\Afile.txt");
		File bfile = new File("B\\Bfile.txt");
		
		inputS = new FileInputStream(afile);
		outputS = new FileOutputStream(bfile);
		
		byte[] buffer = new byte[1024];
		int length;
		
		while((length = inputS.read(buffer)) >0)
		{
			outputS.write(buffer,0,length);
		}
		
		inputS.close();
		outputS.close();
		afile.delete();
		System.out.println("Arquivo copiado com sucesso!");

		
	}
	
	
	
	

}
