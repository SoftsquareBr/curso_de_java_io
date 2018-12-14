package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class DeleteDirExemplo {
	
	
	private static final String SRC_FOLDER = "Directorys";
	
	public static void main(String [] args){
		
		File directory = new File(SRC_FOLDER);
		
		if(!directory.exists()){
			System.out.println("Diretorio não existe");
			System.exit(0);
		}else{
			
			delete(directory);
			System.exit(0);
			
		}
		
	
	}
	public static void delete(File file){
		
		if(file.isDirectory()){
			
			if(file.list().length==0){
				file.delete();
				System.out.println("Diretorio foi deletado "+file.getAbsolutePath() );
			}else{
				String files[] = file.list();
				for(String temp: files){
					File filedelete = new File(file,temp);
					delete(filedelete);
				}
				
			}
			
		}else{
			file.delete();
			System.out.println("Arquivo deletado "+file.getAbsolutePath());
		}
		
	}
	

}
