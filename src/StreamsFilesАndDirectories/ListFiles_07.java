package StreamsFilesАndDirectories;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ListFiles_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String path = "Resources/input.txt";

        File root = new File("E:\\Java\\Problem Solving\\Java Advanced GIT\\Java_Advanced_May_2022\\Resources\\Files-and-Streams\\");
        Arrays.stream(root.listFiles())
                .filter(File::isFile)
                .forEach(f -> System.out.println(f.getName() + ": " + "[" +  f.length() + "]"));


    }

}
