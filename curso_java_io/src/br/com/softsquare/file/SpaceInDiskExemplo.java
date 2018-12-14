package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class SpaceInDiskExemplo {
	
	
	
	public static void main(String [] args)
	{
		File file = new File("C:");
	
		long totalSpace = file.getTotalSpace();
		long usableSpace = file.getUsableSpace();
		long freeSpace = file.getFreeSpace();
		
		System.out.println("Tamanho total : "+totalSpace);
		System.out.println("Espaço aproveitavel : "+usableSpace);
		System.out.println("Espaço Livre : "+freeSpace);
		
		System.out.println("Tamanho total : "+totalSpace /1024/1024+" mb");
		System.out.println("Espaço aproveitavel : "+usableSpace /1024/1024+" mb");
		System.out.println("Espaço Livre : "+freeSpace /1024/1024+" mb");
		
	}
	
	

}
