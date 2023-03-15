package inheritance;

public class troubleStudent extends Student{
    private int reports;

    public troubleStudent(String name, int id, String course, int reports){
        super(name, id, course);
        this.reports = reports;
    }

    public int getReports() {
        return reports;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\nCourse: %s\nReports: %s\n",
                getName(),getId(),getCourse(),getReports());
    }
}
