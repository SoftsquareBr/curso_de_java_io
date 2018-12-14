package br.com.softsquare.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author softsquare
 *
 */
public class EncodeUTF8Exemplo {

	public static void main(String[] args) throws IOException {
	
		
		File filedir = new File("temp.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filedir),"ISO-8859-1"));

		String str;
		while((str = in.readLine())!=null){
			System.out.println(str);
			
		}
		in.close();
		
		
	}

}
