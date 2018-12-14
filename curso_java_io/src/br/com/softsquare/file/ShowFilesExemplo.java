package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class ShowFilesExemplo {
	
	public static void main(String [] args){
		showFiles(new File("C:\\program Files (x86)"));
	}
	public static void showFiles(File node){
		
		
		System.out.println(node.getAbsolutePath());
		if(node.isDirectory()){
			String [] subNode = node.list();
			for(String filename : subNode){
				showFiles(new File(node,filename));
			}
		}
		
	}
	
	

}
