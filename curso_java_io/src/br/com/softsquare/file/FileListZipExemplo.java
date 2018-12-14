package br.com.softsquare.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class FileListZipExemplo {
	
	List<String> filelist;
	private static final String OUTPUT_ZIP ="MEUS_ARQUIVO.zip";
	private static final String SOURCE_FOLDER ="TESTE";
	
	 FileListZipExemplo(){
		filelist = new ArrayList<String>();
	}
	
	
	
	public static void main(String [] args) throws IOException{	
		FileListZipExemplo filezipex = new FileListZipExemplo();
		filezipex.generateFileList(new File(SOURCE_FOLDER));
		filezipex.zipIt(OUTPUT_ZIP);
	}
	
	public void zipIt(String zipFile) throws IOException{
		
		byte[] buffer = new byte[1024];
		
		FileOutputStream fos = new FileOutputStream(zipFile);
		ZipOutputStream zos = new ZipOutputStream(fos);
		System.out.println("Saida do Zip "+zipFile);
		
		for(String file: this.filelist){
			System.out.println("Arquivo adicionado "+file);
			ZipEntry ze = new ZipEntry(file);
			zos.putNextEntry(ze);
			FileInputStream in = new FileInputStream(SOURCE_FOLDER+File.separator+file);
			int len;
			while((len=in.read(buffer))>0){
				zos.write(buffer,0,len);
			}
			in.close();
			zos.closeEntry();
			zos.close();
			
		}
		
		
	}
	/**
	 * generateFileList
	 * este metodo serve para verificar os arquivos e produzir um list de entrada
	 * @param node
	 */
	public void generateFileList(File node){
		
		
		if(node.isFile()){
			filelist.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}
		
		if(node.isDirectory()){
			String [] subNode = node.list();
			for(String filename : subNode){
				generateFileList(new File(node,filename));
			}
		}
	}
	
   private String generateZipEntry(String file){
	   return file.substring(SOURCE_FOLDER.length()+1,file.length());
   }
	
	

}
