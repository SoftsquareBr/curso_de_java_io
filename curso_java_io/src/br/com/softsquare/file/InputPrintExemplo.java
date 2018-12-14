package br.com.softsquare.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author softsquare
 *
 */
public class InputPrintExemplo {

	public static void main(String [] args) throws IOException{
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while((input = bf.readLine())!=null){
			System.out.println(input);
		}
			
		
			
	
		
	}
	
	
	
}
