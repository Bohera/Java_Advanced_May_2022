package StreamsFilesАndDirectories;

import java.io.*;

public class WriteEveryThirdLine_05 {
    public static void main(String[] args) throws IOException {
        String path = "Resources/input.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        BufferedWriter writer = new BufferedWriter(new FileWriter("Resources/every-third-line-out.txt"));

        String line = reader.readLine();
        int counter = 0;
        while (line != null) {
            counter++;

            if (counter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }

            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
