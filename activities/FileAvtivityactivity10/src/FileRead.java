import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File course_file = new File("course.txt");

        String line;


        try {
            Scanner view_file = new Scanner(course_file);
            while (view_file.hasNextLine()) {
                line = view_file.nextLine();
                System.out.println(line);
            }
            view_file.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");

        }

    }
}
