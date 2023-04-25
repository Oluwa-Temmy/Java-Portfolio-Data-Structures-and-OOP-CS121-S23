package abstractClasses;
import java.util.Random;
public class HonorStudent extends Student {
    private double gpa;
    private String honor = null;
    Random randint = new Random();


    public HonorStudent(String name, String major, double gpa, String honor){
        super(name, major);
        this.gpa = gpa;
        this.honor = honor;
    }
    public double getGPA(){
        return gpa;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public String getHonor(){
        return honor;
    }
    public void setHonor(String honor){
        this.honor = honor;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("GPA: %d.2f\nHonor: %s", getGPA(), getHonor());
    }

    int randy = randint.nextInt(2);
    @Override
    public String isHonors(){
        if (randy == 1){
            return honor = "Yes";
        }
        else{
            return honor = "No";
        }
    }
}
