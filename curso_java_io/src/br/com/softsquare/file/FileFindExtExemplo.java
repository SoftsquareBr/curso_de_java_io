package br.com.softsquare.file;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 
 * @author softsquare
 *
 */
public class FileFindExtExemplo
   {
	
	private static final String  FILE_DIR = "Arquivos";
	private static final String  FILE_TEXT_EXT = ".jpg";
	
	public static void main(String [] args){
		
		new FileFindExtExemplo().listFile(FILE_DIR, FILE_TEXT_EXT);
		
	}
	
	public void listFile(String folder,String ext)
	{
		
		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File (folder);
		if(dir.isDirectory()==false){
			System.out.println("Diretorio não existe");
			return;
		}
		String []list = dir.list(filter);
		
		if(list.length==0){
			
			System.out.println("Não existe arquivos");
			return;
			
		}
		for (String file :list){
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			
			System.out.println("Arquivos encontrados"+temp);
		}
		
	}
	
	public class GenericExtFilter implements FilenameFilter
	{

		
		private String ext;
		public GenericExtFilter(String ext){
			this.ext = ext;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			
			return (name.endsWith(ext));
		}
		
	}

}
