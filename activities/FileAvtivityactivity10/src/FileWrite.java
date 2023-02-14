import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String header = "course credit score";
        try {
            FileWriter output_file = new FileWriter("course.txt",true);
            PrintWriter output = new PrintWriter(output_file);
            System.out.println("What course are you taking?");
            String course = input.nextLine();
            System.out.println("What are your credits?");
            int credit = Integer.parseInt(input.nextLine());
            System.out.println("What is your score?");
            int score = Integer.parseInt(input.nextLine());

            System.out.println("check course.txt");
            output.printf("%s\n%-7s %3d %5d\n", header, course, credit, score);
            output.close();
        }
        catch (IOException e) {
            System.err.println("File not found");
        }
        input.close();

    }
}
