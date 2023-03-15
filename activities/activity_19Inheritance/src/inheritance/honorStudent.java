package inheritance;

public class honorStudent extends Student{
    private String scholarship;

    public honorStudent(String name, int id, String course, String scholarship){
        super(name, id, course);
        this.scholarship = scholarship;
    }
    public String getScholarship(){
        return scholarship;
    }
    public String setScholarship(String scholarship){
        return this.scholarship = scholarship;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\nCourse: %s\nScholarship: %s\n",
                getName(),getId(),getCourse(),getScholarship());
    }
}
