package br.com.softsquare.file;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * 
 * @author softsquare
 *
 */
public class ConvertStringInputStream {

	
	public static void main(String [] args) throws IOException{
		
		String str = "Esta é uma String ~vavava";
		InputStream is = new ByteArrayInputStream(str.getBytes());
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		is.close();
		
	}
	
	
}
