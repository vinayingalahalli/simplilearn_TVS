package byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByeDemo {

	public static void main(String[] args) {
		
		//Below is try with resources added from Java7 where you dont have to put finally to release/close 
		//your resources, it'll be taken care by jvm itself
		try(FileInputStream fis=new FileInputStream("byteDemo.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);
				){
			StringBuilder sb=new StringBuilder();
			System.out.println("Bytes before read "+bis.available());
			//System.out.println("Read : "+(char)bis.read());
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Bytes after read "+bis.available());
			System.out.println("\nMessage from the file is ");
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
