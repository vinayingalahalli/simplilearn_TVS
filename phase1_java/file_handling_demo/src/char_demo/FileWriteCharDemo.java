package char_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("charDemo.txt");//creates a new file
				//FileWriter fw=new FileWriter("charDemo.txt",true); //appends at the end of the file
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello from char demo");
			bw.newLine();
			bw.write("no need of conversion in char stream");
			bw.newLine();
			bw.write("if you write or read whatever but conversion is not required");
			bw.newLine();
			bw.write("char streams will be good if you are planning on UNI_CODE stuff");
			bw.newLine();
			bw.write("byte streams are faster than char streams due to byte is low level understood by machine, but char provides unicode support");
			bw.newLine();
			bw.write("so think accordingly and choose the appropriate stream.");
			System.out.println("message written successfully to the file");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
