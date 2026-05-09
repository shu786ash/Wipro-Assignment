package Assignment_10;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append_file {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("text for append: ");
        String data = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt", true));

        bw.write(data);
        bw.newLine();
        bw.close();
        sc.close();

        System.out.println("Data appende");
    }
}
