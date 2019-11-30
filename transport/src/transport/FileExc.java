package transport;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExc {

	public static void main(String[] args) throws Exception{
		File dir = new File("C:/WorkSpace/java/transport/Temp/images");
		File file1 = new File("C:/WorkSpace/java/transport/Temp/file1.txt");
		File file2 = new File("C:/WorkSpace/java/transport/Temp/file2.txt");
		File file3 = new File("C:/WorkSpace/java/transport/Temp/file3.txt");

		if(dir.exists() == false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		File temp = new File("C:/WorkSpace/java/transport/Temp");
		File[] contents = temp.listFiles();
		
		System.out.println("Time \t\t\t Type \t\t Byte \t Name");
		System.out.println("===================================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t <DIR> \t\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
				
			System.out.println();
		}
	}
}
