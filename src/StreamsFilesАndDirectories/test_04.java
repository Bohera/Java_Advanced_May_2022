package StreamsFilesАndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test_04 {
    public static void main(String[] args) {
        String path = "C:\\Users\\PC\\Desktop\\04.Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            System.out.println("File was found it's ok");

            int oneByte = fileInputStream.read();

            while (oneByte != -1) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot read from file");
        } finally {
            //ADD code - zatvarqne na kod primerno
        }


    }
}
