package br.com.softsquare.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class GFileZip {
	
	
	private static final String OUTPUT_GZIP ="C:/Java IO/CursoJavaIO/ARQUIVO.gz";
	private static final String SOURCE_FILE ="C:/Java IO/CursoJavaIO/temp.txt";
	
	public static void main(String []args) throws FileNotFoundException, IOException{
		GFileZip gsc = new GFileZip();
		gsc.gzipIt();
		
	}
	
	
	public void gzipIt() throws FileNotFoundException, IOException{
		byte [] buffer = new byte[1024];
		GZIPOutputStream zo = new GZIPOutputStream(new FileOutputStream(OUTPUT_GZIP));
		FileInputStream in= new FileInputStream(SOURCE_FILE);
		int len ;
		while((len = in.read(buffer))>0){
			
			zo.write(buffer,0,len);
		}
		zo.close();
		in.close();
		System.out.println("Feito!");
	}

}
