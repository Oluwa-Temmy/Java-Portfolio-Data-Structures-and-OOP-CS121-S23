package abstractClasses;

public abstract class Student {
    private String name;
    private String major;

    public Student(String name, String major){
        this.name = name;
        this.major = major;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public String getMajor(){
        return major;
    }
    public void  setMajor(String major){
        this.name = major;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nMajor: %s", name, major);
    }
    public abstract String isHonors();
}
