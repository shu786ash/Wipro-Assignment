package Assignment_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Count_word {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {

            String words[] = line.split("\\s+");

            for (String word : words) {
                if (word.equals("Java")) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("Total occurrences of 'Java': " + count);
    }
}