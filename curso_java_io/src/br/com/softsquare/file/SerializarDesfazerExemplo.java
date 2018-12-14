package br.com.softsquare.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * 
 * @author softsquare
 *
 */
public class SerializarDesfazerExemplo {
	
	
	public static void main(String [] args) throws ClassNotFoundException, IOException{
		
		SerializarDesfazerExemplo deserialize = new SerializarDesfazerExemplo();
		Address adres = deserialize.deserializeAdrress();
		System.out.println(adres);
		
	}
    public Address deserializeAdrress() throws IOException, ClassNotFoundException{
    	Address adres ;
    	
    	
    	FileInputStream fout = new FileInputStream("adres.class"); 
    	ObjectInputStream objinput = new ObjectInputStream(fout);
    	adres =  (Address) objinput.readObject();
    	objinput.close();
		return  adres;
    	
    }
	
}
