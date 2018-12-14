package br.com.softsquare.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 
 * @author softsquare
 *
 */
public class ContentHexExemplo {

	@SuppressWarnings("resource")
	public static void main(String [] args) throws NoSuchAlgorithmException, IOException{
		
		String datafile="temp.txt";
		MessageDigest md = MessageDigest.getInstance("SHA1");
		FileInputStream fi = new FileInputStream(datafile);
		byte[] databyte = new byte[1024];
		int nread = 0;
		while((nread =fi.read(databyte))!=-1){
			System.out.println("Lendo....");
			md.update(databyte,0,nread);
		}
		byte[] mdbytes = md.digest();
		StringBuffer sb = new StringBuffer("");
		for(int i =0; i<mdbytes.length;i++){
			sb.append(Integer.toString((mdbytes[i]&0xff)+0x100,16).substring(1));
		}
		System.out.println("Digest hex format :"+sb.toString());
		
	}
	
	
	
}
