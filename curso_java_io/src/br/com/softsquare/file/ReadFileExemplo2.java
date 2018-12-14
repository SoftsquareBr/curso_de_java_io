package br.com.softsquare.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class ReadFileExemplo2 {
	
	
	
	public static void main (String []args){
		
		
		
		BufferedReader br = null;
		
		String Linha ;
		try
		{
			
			br = new BufferedReader(new FileReader("C:\\Teste\\texto.txt"));
		} catch (FileNotFoundException e1) {
		
			e1.printStackTrace();
		}
		
		try
		{
			while((Linha = br.readLine())!= null){
				
				System.out.println("saida: "+Linha);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	

}
