package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class CreateFileExemplo 
{
	
	
	public static void main (String [] args)
	{
		
		
		File file = new File ("texto.txt");
		try {
			if (file.createNewFile()){
				System.out.println("Arquivo Criado");
			}else {
				System.out.println("Arquivo ja existe");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	

}
