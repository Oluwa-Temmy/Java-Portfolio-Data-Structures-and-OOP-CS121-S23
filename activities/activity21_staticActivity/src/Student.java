public class Student {
    private  String name;
    private int year;
    private int student_count = 1;
    private static int student_count_class = 0;


    public Student(String name, int year){
        this.name = name;
        this.year = year;
        ++student_count;
        ++student_count_class;
    }

    public int getStudent_count() {
        return student_count;
    }

    public static int getStudentCountClass() {
        return student_count_class;
    }
}
