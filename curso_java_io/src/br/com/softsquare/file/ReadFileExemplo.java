package br.com.softsquare.file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class ReadFileExemplo {
	

	@SuppressWarnings("resource")
	public static void main (String [] args)
	{
		try
		{
		
		File file = new File("C:\\Teste\\texto.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			try {
			
					System.out.println("Saida : "+dis.available());
					System.out.println("Saida : "+bis.toString());
					System.out.println("Saida : "+file.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) 
		{
			
		
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
