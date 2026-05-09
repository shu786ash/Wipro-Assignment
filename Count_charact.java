package IO_Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_charact {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
		int c , count = 0;
		while((c = br.read()) != -1) {
			count++;
		}
		System.out.println(count);
		br.close();

	}

}
