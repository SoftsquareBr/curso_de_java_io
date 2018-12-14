package br.com.softsquare.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
/**
 * 
 * @author softsquare
 *
 */
public class FileReadLineExemplo {

	
	@SuppressWarnings("resource")
	public static void main(String [] args) throws IOException{
		
		
		File file = new File("Arquivos\\Bfile.txt");
		
		if(file.exists()){
			
			FileReader fr = new FileReader(file);
			LineNumberReader ln = new LineNumberReader(fr);
			
			int linereader =0;
			
			while(ln.readLine()!=null){
				linereader++;
			}
			System.out.println("Este arquivo contem "+linereader+" linhas");
			
			
		}else{
			System.out.println("Arquivo não existe");
		}
		
		
		
		
	}
	
	
}
