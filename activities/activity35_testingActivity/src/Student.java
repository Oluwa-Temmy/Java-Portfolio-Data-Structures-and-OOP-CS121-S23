public class Student {
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String getCourse(){
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setName(String name) {
        this.name = name;
    }
}
