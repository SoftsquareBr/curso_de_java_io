package br.com.softsquare.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class CopyDirExemplo {

	public static void main(String[] args) throws IOException {

		File srcFolder = new File("Arquivo");
		File destFolder = new File("Arquivo_novo");

		if (!srcFolder.exists()) {
			System.out.println("Diretorio não existe");
			System.exit(0);
		} else {
			copyFolder(srcFolder, destFolder);
		}
		System.out.println("Feito!");
	}

	public static void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			if (!dest.mkdir()) {
				dest.mkdir();
				System.out
						.println("Diretorio " + src + " copiado para " + dest);
			}

			String files[] = src.list();
			for (String file : files) {

				File srcFile = new File(src, file);
				File desFile = new File(dest, file);
				copyFolder(srcFile, desFile);

			}

		} else {

			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while((length = in.read(buffer))>0){
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			System.out.println("Arquivos copiados de "+src+" para "+dest);
		}

	}

}
