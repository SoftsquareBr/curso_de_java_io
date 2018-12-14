package br.com.softsquare.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 * 
 * @author softsquare
 *
 */
public class WriteFileEncodeExemplo {
	
	
	
	public static void main(String [] args) throws IOException{
		File filedir = new File("temp.txt");
		
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filedir),"ISO-8859-1"));
	    out.append("WebSite UTF8 ").append("\r\n").append("\r\n");
	    out.append("?? UTF8 ").append("«««").append("\r\n");
	    out.append("????????? UTF8 ").append(" ¡¡¡¡ ").append("\r\n");
	    out.close();
		
	}
	
	

}
