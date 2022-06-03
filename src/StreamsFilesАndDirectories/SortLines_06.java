package StreamsFilesАndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines_06 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "Resources/input.txt";
        List<String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path outputPath = Path.of("Resources/output.txt");


        Files.write(outputPath ,sortedLines , StandardOpenOption.WRITE);
    }
}
