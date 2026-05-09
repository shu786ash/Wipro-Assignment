package IO_Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class count_line {
	public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
	int count = 0;
	while(br.readLine() != null) {
		count++;
	}
	System.out.println(count);

}
}