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
public class ConvertInputStreamString {

	public static void main(String[] args) throws IOException {
		InputStream is = new ByteArrayInputStream("Texto de conteudos".getBytes());
		String result =  getStringFromInputStream(is);
		System.out.println(result);

	}

	public static String getStringFromInputStream(InputStream is)
			throws IOException {

		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		String line;
		br = new BufferedReader(new InputStreamReader(is));
		
		while ((line = br.readLine()) != null) {
			System.out.println("Feito");
			sb.append(line);
		}
		return sb.toString();

		
	}

}
