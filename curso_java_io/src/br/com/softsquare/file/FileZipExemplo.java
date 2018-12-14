package br.com.softsquare.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class FileZipExemplo {
	
	
	public static void main(String []args ) throws IOException{
		
		byte[] buffer = new byte[1024];
		
		FileOutputStream fos = new FileOutputStream("MeuArquivo.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		ZipEntry ze = new ZipEntry("temp.txt");
		zos.putNextEntry(ze);
		FileInputStream in = new FileInputStream("temp.txt");
		int len ;
		while((len = in.read(buffer))>0){
			zos.write(buffer, 0, len);
		}
		in.close();
		zos.closeEntry();
		zos.close();
		System.out.println("Feito!");
		
		
		
		
	}
	

}
