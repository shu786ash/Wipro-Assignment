package Assignment_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_count {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        int linecnt = 0;
        int wordcnt = 0;
        int charcnt = 0;

        String line;

        while ((line = br.readLine()) != null) {
            linecnt++;

            charcnt += line.length();

            String words[] = line.split("\\s+");
            wordcnt += words.length;
        }

        br.close();

        System.out.println("Lines:" + linecnt+" Words: "+ wordcnt+" characters: "+charcnt);
    }
}