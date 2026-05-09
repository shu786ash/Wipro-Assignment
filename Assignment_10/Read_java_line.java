package Assignment_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Read_java_line {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        String line;

        while ((line = br.readLine()) != null) {

            if (line.contains("Java")) {
                System.out.println(line);
            }

        }

        br.close();
    }
}
