public class Character {
    private String name;
    private int age;
    private String fave_color;
    private int fave_num;

    public Character(){
        name = "Racheal";
        age = 12;
        fave_color = "Blue";
        fave_num = 21;
    }
    public Character(String fave_color){
        this.fave_color = fave_color;
    }
    public Character(String name, String fave_color, int fave_num){
        this.name = name;
        this.fave_color = fave_color;
        this.fave_num = fave_num;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge( int age) {
        this.age = age;
    }
    public void setName(String newName, int age) {
        this.name = name;
        if(age>10){
            name = newName;
        }
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void displayCharacter(){
        System.out.printf("Name: %s\nAge: %d\nFavorite Color: %s\nFavorite Number: %d\n-------------", name, age,fave_color,fave_num);
    }
}
