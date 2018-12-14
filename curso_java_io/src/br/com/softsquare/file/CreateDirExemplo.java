package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class CreateDirExemplo {

	public static void main(String [] args){
		
		
		File file = new File("Directory\\xxx");
		if(!file.exists()){
			if(file.mkdir()){
				System.out.println("Diretorio Criado");
			}else{
				System.out.println("Diretorio não Criado");
			}
			
		}else{
			System.out.println("Diretorio já existe");
		}
		
		
		File files = new File("Directorys\\sub\\sub2");
		if(!files.exists()){
			if(files.mkdirs()){
				System.out.println(" 2 Diretorios Criados");
			}else{
				System.out.println(" 2 Diretorios não Criados");
			}
			
		}else{
			System.out.println(" 2 Diretorios já existe");
		}
		
		
	}
	
	
}
