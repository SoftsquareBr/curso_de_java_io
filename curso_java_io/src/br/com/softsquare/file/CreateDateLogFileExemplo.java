package br.com.softsquare.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 
 * @author softsquare
 *
 */
public class CreateDateLogFileExemplo {

	public static void main(String[] args) {

	
		try {
			Process proc;
			proc = Runtime.getRuntime().exec("cmd  C:\\logfile.log ");
			BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String data = "";

			for (int i = 0; 1 < 6; i++) 
			{
				data = br.readLine();
				System.out.println("Extraido o valor : " + data);
				StringTokenizer st = new StringTokenizer(data);
				String date = st.nextToken();
				String time = st.nextToken();

				System.out.println("Criada data" + date);
				System.out.println("Criado tempo" + time);
			}
			
	

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// System.out.println("Extraido o valor"+data);
		
		

	}

}
