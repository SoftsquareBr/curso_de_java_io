package br.com.softsquare.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * 
 * @author softsquare
 *
 */
public class Serializar {
	
	public static void main(String [] args) throws IOException{
		

		Serializar serialize = new Serializar();
		serialize.serializeAddress("Rua antonio Loureiro","Brasil");
		
	}

	public void serializeAddress(String street,String country) throws IOException{
		
		Address adres = new Address();
		adres.setStreet(street);
		adres.setCountry(country);
		
		FileOutputStream fileout = new FileOutputStream("adres.class");
		ObjectOutputStream objOut = new ObjectOutputStream(fileout);
		fileout.close();
		objOut.close();
		System.out.println("Feito ");
		
	}
	
}
