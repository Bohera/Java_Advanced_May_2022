package StreamsFilesАndDirectories;

import java.io.*;
import java.util.Scanner;

public class SerializeCustomObject_09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        String path = "Resources/input.txt";

        Cube iceCube = new Cube();

        iceCube.color = "water";
        iceCube.height = 13;
        iceCube.length = 42;
        iceCube.depth = 69;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Resources/ice-cube.txt"));

        objectOutputStream.writeObject(iceCube);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Resources/ice-cube.txt"));

        Cube cube = (Cube)objectInputStream.readObject();


    }

    public static class Cube implements Serializable {
        String color;
        double height;
        double length;
        double depth;
    }
}
