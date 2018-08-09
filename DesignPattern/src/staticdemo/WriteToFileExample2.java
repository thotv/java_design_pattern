package staticdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ThoTV on 30/07/2018 !
 */
public class WriteToFileExample2 {

    private static final String FILENAME = "filename.txt";

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

            String content = "This is the content to write into file\n";

            bw.write(content);

            // no need to close it.
            //bw.close();

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
