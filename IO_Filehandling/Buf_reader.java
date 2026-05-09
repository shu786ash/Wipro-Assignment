package IO_Filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
////import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Buf_reader {
//
//	public static void main(String[] args) throws IOException {
//		File f1 = new File("Text.txt");
//		f1.createNewFile();//create file
//		BufferedWriter bw = new BufferedWriter(new FileWriter("Text.txt"));
//		bw.write("Hello welcome to learning in wipro!");//
//		bw.close();
//		BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
//		String l1;
//		while((l1=br.readLine())!= null) {
//			System.out.println(l1);
//		}
//		
//		br.close();
//
//	}
//
//}
//replace word problem
    public static void main(String[] args) throws IOException {

        File f1 = new File("Text.txt");
        f1.createNewFile();

        BufferedWriter bw = new BufferedWriter(new FileWriter("Text.txt"));
        bw.write("Python ,python is easy to learn\n");
        bw.write("Python is easy to write\n");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
        String l1;
        String result = "";

        while ((l1 = br.readLine()) != null) {
            l1 = l1.replace("Python", "java");
            l1 = l1.replace("python", "Java");
           // result += l1;
            System.out.println(l1);
        }
        br.close();

    
    }
}