import java.util.Scanner;

public class MethodsActivity {
    static Scanner keyboard = new Scanner(System.in);
    double length = getLength();
    double width = getWidth();
    double area = getArea(length,width);
    MethodsActivity.displayData(length,width,area);
    public static void main(String[] args) {


        keyboard.close();
    }
    public double getLength(){
        System.out.println("What is the length of the rectangle?");
        double length = keyboard.nextInt();
        return length;
    }
    public double getWidth(){
        System.out.println("What is the width of the rectangle?");
        double width = keyboard.nextInt();
        return width;
    }
    public static double getArea(double length, double width){
        double area = length * width;
        return area;
    }
    void displayData(double length, double width, double area){
        System.out.printf("Rectangle length: %.2f\nRectangle width: %.2f\nRectangle Area: %.2f", length, width, area);
    }
}
