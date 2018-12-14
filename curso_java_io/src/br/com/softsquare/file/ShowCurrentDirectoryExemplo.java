package br.com.softsquare.file;
/**
 * 
 * @author softsquare
 *
 */
public class ShowCurrentDirectoryExemplo {

	public static void main(String[] args) {

		String workingDir = System.getProperty("user.dir");
		System.out.println("Atual diretorio " + workingDir);

	}

}
