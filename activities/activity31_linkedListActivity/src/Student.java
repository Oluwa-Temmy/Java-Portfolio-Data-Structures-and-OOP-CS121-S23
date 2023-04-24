import java.util.LinkedList;

public class Student {
    private String first_name;
    private String last_name;
    private int id;
    private String major;
    private String class_standing;
    private double gpa;
    private LinkedList course_list = new LinkedList<>();

    Student(){
        first_name = "john";
        last_name = "doe";
        id = 0;
        major = "coumputer science";
        class_standing = "freshman";
        gpa = 4.0;
    }
    Student(String first_name, String last_name, int id, String major, String class_standing, double gpa){
        this.first_name= first_name;
        this.last_name = last_name;
        this.id = id;
        this.major = major;
        this.class_standing = class_standing;
    }

    public Object addCourse(String course){
        return course_list.add(course);
    }
    public Object removeCourse(String course){
        return course_list.remove(course);
    }
    public Object getStudentInfo(){
        return course_list;
    }
    public void displayStudentCourses(){
        for (int i = 0; i<course_list.size();i++){
            System.out.println(course_list.get(i));
        }
    }
}
