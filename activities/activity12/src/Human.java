public class Human {
    String name;
    int age;
    String gender;
    int height_ft;
    int weight_lb;
    String nationality;


    void displayHuman(){
        System.out.printf("Human Name: %s\nHuman Age: %d\nHuman Gender: %s\nHuman Height: %d\nHuman Weight: %d\nHuman Nationality: %s\n",
                name,age,gender,height_ft,weight_lb,nationality);
    }
    public Human(String name, int age, String gender, int height, int weight, String nationality){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height_ft = height;
        this.weight_lb = weight;
        this.nationality = nationality;
    }


}
