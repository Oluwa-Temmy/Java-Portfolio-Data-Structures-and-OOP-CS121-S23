package inheritance;

public class testSuperClass {
    public static void main(String[] args) {
        Student student1 = new Student("Kayla", 67, "CS");
        troubleStudent tstudent2 = new troubleStudent("Zach", 67, "English", 9);
        honorStudent hStudent = new honorStudent("Queen", 87, "Science", "Myers Award");

        System.out.println(tstudent2);
        System.out.println(hStudent);

    }
}
