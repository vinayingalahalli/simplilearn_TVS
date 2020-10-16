package byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
		//	fos=new FileOutputStream("byteDemo.txt"); //this will create a new file again
			fos=new FileOutputStream("byteDemo.txt",true); //using true as 2nd param you have set append to true it will now write at the end of the file
			bos=new BufferedOutputStream(fos);
			String message="\nGood evening.. how are you?";
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("Data written to file successfully");
		} catch (FileNotFoundException e) {
		System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
