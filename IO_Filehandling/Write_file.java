package IO_Filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_file {

	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		File file = new File("my_file.txt");
		file.createNewFile();
		FileWriter wr = new FileWriter("my_file.txt");
		wr.write("Let's learn java programming\t, Selenium automation\\n");
		wr.close();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
