package br.com.softsquare.file;

import java.io.File;
/**
 * 
 * @author softsquare
 *
 */
public class CheckDirEmptyExemplo {

	public static void main(String[] args) {
		File file = new File("B");
		if (file.isDirectory()) {

			if (file.list().length > 0) {
				System.out.println("Diretorio não esta vazio");
			} else {
				System.out.println("Diretorio esta vazio");
			}

		} else {
			System.out.println("Este diretorio não existe ");
		}

	}

}
