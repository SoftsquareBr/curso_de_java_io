package br.com.softsquare.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
/**
 * 
 * @author softsquare
 *
 */
public class DescompresGzip {

	
	private static final String INPUT_GZIP="C:/Java IO/CursoJavaIO/ARQUIVO.gz";
	private static final String OUTPUTGZIP ="C:/Java IO/CursoJavaIO/temp.txt";
	
	public static void main(String []args) throws FileNotFoundException, IOException{
		DescompresGzip gsc = new DescompresGzip();
		gsc.gzipIt();
		
	}
	
	
	public void gzipIt() throws FileNotFoundException, IOException{
		byte [] buffer = new byte[1024];
		GZIPInputStream zoout = new GZIPInputStream(new FileInputStream(INPUT_GZIP));
		FileOutputStream out = new FileOutputStream(OUTPUTGZIP);
		int len ;
		while((len = zoout.read(buffer))>0){
			
			out.write(buffer,0,len);
		}
		zoout.close();
		out.close();
		System.out.println("Feito!");
	}

}
