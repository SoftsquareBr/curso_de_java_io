package br.com.softsquare.file;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author softsquare
 *
 */
public class CreatePathExemplo3 {

	public static void main (String [] args) throws IOException{
		
		String filename = "test.xls";
		String workDir = System.getProperty("user.dir");
		String absolutePath = "";
		
        String meu_os = System.getProperty("os.name").toLowerCase();
   
        if (meu_os.indexOf("win")>=0 ){
        	
        	absolutePath  = workDir +  "\\"+ filename;
        	
        }else if (meu_os.indexOf("nix")>=0 || meu_os.indexOf("nux")>=0 || meu_os.indexOf("mac")>=0){
        	
        	absolutePath  = workDir +  "/"+ filename;
        	
        }else{
        	absolutePath  = workDir +  "/"+ filename;
        	
        }
		
        System.out.println("Caminho Final "+absolutePath);
        File file = new File (absolutePath);
        
        if (file.createNewFile()){
        	
        	System.out.println("Arquivo Criado no "+meu_os);
        	
        }else {
        	System.out.println("Arquivos Ja existe no "+meu_os);
        	
        }
	
		
		
	}
	
	

}
