import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        try {
            FileWriter file_write = new FileWriter("course.txt", true);
            PrintWriter out = new PrintWriter(file_write);
            System.out.println("What is your course?");
            String course = keyboard.nextLine();
            System.out.println("What are the credits?");
            int credits = keyboard.nextInt();
            System.out.println("What is your score?");
            int score = keyboard.nextInt();
            keyboard.nextLine();
            out.printf("%-7s %3d %5d\n", course, credits, score);
            out.close();
            keyboard.close();
            file_write.close();
            }
        catch (IOException e){
            System.err.println("File not found");
        }
    }
}
