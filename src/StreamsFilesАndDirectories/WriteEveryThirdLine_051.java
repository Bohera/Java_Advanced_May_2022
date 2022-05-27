package StreamsFilesАndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteEveryThirdLine_051 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        List<String> strings = Files.readAllLines(Paths.get(path));

        for (int i = 3; i < strings.size(); i += 3) {
            System.out.println(strings.get(i));
        }


    }
}
