package transport;

import java.io.*;
import java.text.SimpleDataFormat;
import java.util.Date;

public class FileExc {

	public static void main(String[] args) throws Exception{
		File dir = new File("C:/WorkSpace/java/transport/Temp/images");
		File file1 = new File("C:/WorkSpace/java/transport/Temp/file1.txt");
		File file2 = new File("C:/WorkSpace/java/transport/Temp/file2.txt");
		File file3 = new File("C:/WorkSpace/java/transport/Temp/file3.txt");

		if(dir.exists() == false) {dir.mkdir();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		File temp = new File("C:/WorkSpace/java/transport/Temp");
		File[] contents = temp.listFile();
		
		System.out.println("Time \t\t\t Type \t\t Byte \t Name");
		System.out.println("===================================");
	}

}
