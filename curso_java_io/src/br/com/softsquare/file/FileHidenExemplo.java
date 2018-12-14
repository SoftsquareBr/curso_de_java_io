package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class FileHidenExemplo {

	public static void main(String [] args)
	{
		File file = new File ("Arquivos/hiden-file.txt");
		
		if(file.isHidden()){
			System.out.println("O arquivo esta escondido");
		}else{
			System.out.println("Arquivo não esta escondido");
		}
	}
	
	
	
}
