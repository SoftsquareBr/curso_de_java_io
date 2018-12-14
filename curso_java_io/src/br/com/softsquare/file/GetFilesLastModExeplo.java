package br.com.softsquare.file;

import java.io.File;
import java.text.SimpleDateFormat;
/**
 * 
 * @author softsquare
 *
 */
public class GetFilesLastModExeplo {
	
	
	
	public static void main(String []args){
		
		File file = new File("C:\\logfile.log");
		System.out.println("Antes da formata��o "+file.lastModified());
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Depois da formata��o "+sf.format(file.lastModified()));
		
	}

}
