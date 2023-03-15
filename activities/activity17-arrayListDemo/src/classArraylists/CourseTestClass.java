package classArraylists;

import java.util.Scanner;

public class CourseTestClass {
    public static void main(String[] args) {
        CourseInfo help1 = new CourseInfo();
        Scanner keyboard = new Scanner(System.in);


        while (!(keyboard.nextLine().equals("q"))){
            System.out.println("What is your course name?");
            String course = keyboard.nextLine();
            help1.addCourseName(course);

            System.out.println("What is your gpa?");
            Double gpa = Double.parseDouble(keyboard.nextLine());
            help1.addGPA(gpa);

            System.out.println("What is your Grade?");
            String grade = keyboard.nextLine();
            help1.addGrade(grade);

            System.out.println("What is your score");
            int score = Integer.parseInt(keyboard.nextLine());
            help1.addScore(score);

            help1.displayInfo();

        }
    }
}
