package classArraylists;

import java.util.ArrayList;

public class CourseInfo {
    private ArrayList<String> course_name = new ArrayList<>();
    private ArrayList<Integer> score = new ArrayList<>();
    private ArrayList<Double> gpa = new ArrayList<>();
    private ArrayList<String> grade = new ArrayList<>();

    public void addCourseName(String CourseName){
        course_name.add(CourseName);
    }
    public void addScore(int Score){
        score.add(Score);
    }
    public void addGPA(Double GPA){
        gpa.add(GPA);
    }
    public void addGrade(String Grade){
        grade.add(Grade);
    }

    public void displayInfo(){
        System.out.println("Course  Score  GPA  Grade");
        for (int i = 0;i< course_name.size();i++){
            System.out.printf("%s %7d %5.2f %7s\n", course_name.get(i), score.get(i), gpa.get(i), grade.get(i));
        }
    }
}
