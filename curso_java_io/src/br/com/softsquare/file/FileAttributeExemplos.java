package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class FileAttributeExemplos {

	public static void main(String[] args)
	{

		File file = new File("Arquivos/Bfile.txt");
		file.setWritable(true);

		if (file.canWrite()) 
		{
			System.out.println("Este arquivo pode ser escrito");
		} else 
		{
			System.out.println("Não pode ser escrito");
		}

		file.setWritable(true);

		if (file.canWrite()) 
		{
			System.out.println("Este arquivo pode ser escrito");
		} else
		{
			System.out.println("Não pode ser escrito");
		}

	}

}
