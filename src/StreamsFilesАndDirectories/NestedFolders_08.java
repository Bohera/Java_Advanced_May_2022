package StreamsFilesАndDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NestedFolders_08 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "Resources/input.txt";

        File root = new File("Resources/Files-and-Streams");

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);

        int count = 0;

        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    dirs.offer(nestedFile);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");

//        System.out.println(Files.walk(root.toPath())
//                .map(Path::toFile)
//                .map(File::getName)
//                //.filter(File::isDirectory)
//                .collect(Collectors.joining(System.lineSeparator())));




    }
}
