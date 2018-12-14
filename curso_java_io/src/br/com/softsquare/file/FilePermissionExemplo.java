package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class FilePermissionExemplo {

	public static void main(String[] args) {

	/*	
		try {
			Runtime.getRuntime().exec("chmod 777 Teste");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		File file = new File("/Teste/shellscript.sh");

		if (file.exists())
		{
			System.out.println("Segue executando " + file.canExecute());
			System.out.println("Segue escrevendo " + file.canWrite());
			System.out.println("Segue lendo " + file.canRead());
		}

		file.setExecutable(false);
		file.setReadable(false);
		file.setWritable(false);

		System.out.println("Segue executando " + file.canExecute());
		System.out.println("Segue escrevendo " + file.canWrite());
		System.out.println("Segue lendo " + file.canRead());

		try {
			if (file.createNewFile()) 
			{
				System.out.println("Arquivo Criado");

			} else {
				System.out.println("Arquivo ja existe");

			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
