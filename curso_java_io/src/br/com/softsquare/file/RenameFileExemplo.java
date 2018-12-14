package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class RenameFileExemplo {
	
	
   public static void main(String [] args){
	   
	   File oldFile = new File("texto.txt");
	   File newfile = new File("arquivo_renomeado.txt");
	   
	   if(oldFile.renameTo(newfile)){
		   
		   System.out.println("Renomeado com sucesso!");
	   }else{
		   System.out.println("Não renomeado ");
	   }
	   
   }
	
	

}
