package IO_Filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
////import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Append_file {
   public static void main(String args[]) throws IOException {
	   FileWriter wt = new FileWriter("Text.txt",true);
	   wt.write("\n this is appended text");
   }
}
