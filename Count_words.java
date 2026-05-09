package IO_Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_words {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
		String l;
		int word = 0;
		while((l=br.readLine())!=null) {
			String arr[] = l.split(" ");
			word += arr.length;
		}
		System.out.println(word);
		br.close();

	}

}
