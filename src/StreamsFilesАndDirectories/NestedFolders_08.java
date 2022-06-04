package StreamsFilesАndDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NestedFolders_08 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "Resources/input.txt";

        File root = new File("Resources/Files-and-Streams");

        System.out.println(Files.walk(root.toPath())
                .map(Path::toFile)
                .map(File::getName)
                //.filter(File::isDirectory)
                .collect(Collectors.joining(System.lineSeparator())));


    }
}
