package StreamsFilesAndDirectoriesExercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture_09 {
    public static void main(String[] args) {

        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream("Resources/Whiteboard[1]-01.png");
        FileOutputStream fos = new FileOutputStream( "Resources/Whiteboard[1]-01_Copy.png")) {
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
