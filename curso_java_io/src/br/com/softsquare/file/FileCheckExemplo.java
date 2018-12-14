package br.com.softsquare.file;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 
 * @author softsquare
 *
 */
public class FileCheckExemplo 
{
	private static final String FILE_DIR ="C:\\Teste";
	private static final String FILE_TEXT_EXT =".docx";
	
	public static void main(String args[]){
		new FileCheckExemplo().deleteFile(FILE_DIR, FILE_TEXT_EXT);
	}
	
	
	public void deleteFile(String pasta, String extensao)
	{
		GenericExtFilter filter = new GenericExtFilter(extensao);
		
		File dir = new File (pasta);
		String [] list = dir.list(filter);
	     if (list.length==0)return;
		File fileDelete;
		
	   for (String file :list)
	   {
		String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
		fileDelete = new File(temp);
		boolean isdeleted = fileDelete.delete();
		System.out.println("arquivo "+temp+" foram deletados "+isdeleted);
	    }	
	}
	
	
	public class GenericExtFilter implements FilenameFilter
	{

		private String extensao ;	
		public  GenericExtFilter (String extensao)
		{
			this.extensao= extensao;
		}
		
		public boolean accept(File dir,String name)
		{
			return (name.endsWith(extensao));
		}
		
	}
	
	

}
