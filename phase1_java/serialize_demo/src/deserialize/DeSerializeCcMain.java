package deserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.CreditCard;

public class DeSerializeCcMain {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis=new FileInputStream("ccSerialize.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("CC data deserialized successfully... The data is....");
			System.out.println(cc);
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 

	}

}
