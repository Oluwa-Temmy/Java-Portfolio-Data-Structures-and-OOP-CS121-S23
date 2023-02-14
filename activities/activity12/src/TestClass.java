public class TestClass {
    public static void main(String[] args) {
        Human human1 = new Human("Jamie", 7,"girl",120,200,"American");
        GPU gpu1 = new GPU("Nvidia", "Geforce", "RTX","12GB", "$123.89", "Eggs");
        human1.displayHuman();
        System.out.println();
        gpu1.displayGPU();
        System.out.println();
    }
}
