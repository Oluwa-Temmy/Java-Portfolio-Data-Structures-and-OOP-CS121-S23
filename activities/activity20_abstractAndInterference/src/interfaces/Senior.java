package interfaces;

import java.util.Random;

public class Senior implements Honor{
    private String name;
    private int year;
    private String honor = "null";
    Random randint = new Random();
    public Senior(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("Name: %s\nYear: %s", getName(), getYear());
    }
    int randy = randint.nextInt(2);
    public String isHonors(){
        if (randy == 1){
            return honor = "Yes";
        }
        else {
            return honor = "No";
        }
    }
}
