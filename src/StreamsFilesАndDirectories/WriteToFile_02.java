package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) {
        String path = "Resources/input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("Resources/output.txt");

            int read = fileInputStream.read();

            //",", ".", "!", "?".
            //read != ',' && read != '.' && read != '!' && read != '?'
            Set<Character> punctuationCodes = Set.of(',', '.', '!', '?');
            while (read != -1) {


                if (!punctuationCodes.contains((char)read)) {

                    fileOutputStream.write(read);
                }

                read = fileInputStream.read();
            }

        } catch (IOException ignored) {

        }



    }
}
