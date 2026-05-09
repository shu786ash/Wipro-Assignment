package IO_Filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_file {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("Text.txt");
		FileWriter fw = new FileWriter("copy.txt");
		int c;
		while((c=fr.read()) != 1) {
			fw.write(c);
		}
		fr.close();
		fw.close();
		System.out.println("file copied");

	}

}
