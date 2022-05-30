package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class CopyBytes_03 {
    public static void main(String[] args) {
        String path = "Resources/input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("Resources/output.txt");

            int read = fileInputStream.read();

            PrintWriter writer = new PrintWriter(fileOutputStream);

            while (read != -1) {
                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                  writer.println();
                } else {
                    writer.print(read);
                }
                read = fileInputStream.read();
            }
            writer.close();
        } catch (IOException ignored) {

        }
    }
}
