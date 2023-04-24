import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student test = new Student();
        Student rwar = new Student("ick", "millie", 13,"English", "sophmore", 2.8);

        String [] c_list = {"sciene","history","psychology","humanities","gymnastics"};

        for (int i = 0; i<c_list.length;i++){
            test.addCourse(c_list[i]);
            rwar.addCourse(c_list[i]);
        }
        System.out.println(test.getStudentInfo());
        test.displayStudentCourses();

        //Removed course
        rwar.removeCourse("history");
        System.out.println("\nRemoving class\n--------------");
        System.out.println(rwar.getStudentInfo());
        rwar.displayStudentCourses();
    }


}
