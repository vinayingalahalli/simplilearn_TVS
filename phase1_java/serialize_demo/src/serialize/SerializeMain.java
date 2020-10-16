package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.CreditCard;

public class SerializeMain {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("ccSerialize.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
			
			CreditCard cc=new CreditCard(1234567890123456L, "Sachin R Tendulkar", "XYZ Bank", "RuPay", 227);
			oos.writeObject(cc);
			System.out.println("CC object with below data serialized successfully");
			System.out.println(cc);
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
