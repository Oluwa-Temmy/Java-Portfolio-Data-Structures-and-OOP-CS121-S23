package abstractClasses;

public class abstactTest {
    public static void main(String[] args) {
        HonorStudent jeff = new HonorStudent("jeff", "music", 3.0, "null");
        BadStudent wick = new BadStudent("wick", "rock n' roll", 3, "null");

        System.out.printf("Is the student an honors Student?\nAnswer: %s\n\n", jeff.isHonors());
        System.out.printf("Is this student bard?\nAnswer: %s\n\n\n", wick.isHonors());
    }
}
