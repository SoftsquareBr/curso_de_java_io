package br.com.softsquare.file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * 
 * @author softsquare
 *
 */
public class ReadFileVariableExemplo {

	public static void main(String[] args) throws IOException 
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("adres.ser"));
		byte[] dataBytes = new byte[dis.available()];
		dis.readFully(dataBytes);
		dis.close();
		String content = new String(dataBytes,0,dataBytes.length);
		System.out.println(content);
		
	}

}
