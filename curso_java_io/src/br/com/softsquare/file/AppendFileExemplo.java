package br.com.softsquare.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class AppendFileExemplo {
	
	
	public static void main (String [] args) {
		try {
		String data  =  "B";
		File file = new File ("apend-file.txt");
		
		if(!file.exists()){
				file.createNewFile();
			} 
		
		FileWriter fw;
		fw = new FileWriter(file.getName(),true);
		BufferedWriter bf  = new BufferedWriter(fw);
		bf.write(data);
		bf.close();
		
		
		}
		
		
		
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
			
			System.out.println("Feito");
			
			
		}
		
	}

	
	
	
	

