public class Main {
    public static void main(String[] args) {
        Student faker = new Student("faker", 3);
        Student susy = new Student("susy", 4);

        System.out.printf("Number of students, faker: %d\n", faker.getStudent_count());
        System.out.printf("Number of students, susy: %d\n", susy.getStudent_count());
        System.out.printf("Number of students, class: %d\n", Student.getStudentCountClass());
    }
}
