package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class DeleteFileExemplo {

	public static void main (String [] args){
		
		
		File file = new File ("C:\\Teste\\shellscript.sh");
		
		
		if (file.delete()){
			System.out.println("Arquivo deletado");
		}else{
			System.out.println("Não foi possivel executar essa operação");
		}
		
	}
	
	
	
	
	
}
