package abstractClasses;

import java.util.Random;

public class BadStudent extends Student{
    private int reports;
    private String baddy = null;
    Random randint = new Random();


    public BadStudent(String name, String major, int reports, String baddy){
        super(name, major);
        this.reports = reports;
        this.baddy = baddy;
    }
    public double getReports(){
        return reports;
    }
    public void setReports(int reports){
        this.reports = reports;
    }
    public String getHonor(){
        return baddy;
    }
    public void setHonor(String honor){
        this.baddy = baddy;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("GPA: %d.2f\nHonor: %s", getReports(), getHonor());
    }

    int randy = randint.nextInt(2);
    @Override
    public String isHonors(){
        if (randy == 1){
            return baddy = "Yes";
        }
        else{
            return baddy = "No";
        }
    }
}

