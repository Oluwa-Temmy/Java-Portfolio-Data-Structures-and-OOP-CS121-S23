import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String member;

        System.out.println("Name a BTS member and I'll give you their age, height, and position");
        member = keyboard.nextLine();

        switch(member)
        {
            case "jin":
                System.out.println("Full name: Seokjin Kim\nBorn: 1992\nAge: 30\nHeight: 5ft10in\nPosition: Vocal, Visual");
                break;
            case "suga":
                System.out.println("Full name: Yoongi Min\nBorn: 1993\nAge: 30\nHeight: 5ft9in\nPosition: Lead Rapper");
                break;
            case "jhope":
                System.out.println("Full name: Hoseok Jung\nBorn: 1994\nAge:28 \nHeight: 5ft10in\nPosition: Lead Rapper, Main Dancer, Sub Vocalist");
                break;
            case "rm":
                System.out.println("Full name: Namjoon Kim\nBorn: 1994\nAge:28 \nHeight: 5ft11in\nPosition: Rapper, Leader");
                break;
            case "jimin":
                System.out.println("Full name: Jimin Park\nBorn: 1995\nAge:27 \nHeight: 5ft8in\nPosition: Lead Vocalist, Main Dancer");
                break;
            case "v":
                System.out.println("Full name: Taehyung Kim\nBorn: 1995\nAge:27 \nHeight: 5ft10in\nPosition: Vocalist, Second Visual");
                break;
            case "jungkook":
                System.out.println("Full name: Jungkook Jeon\nBorn: 1997\nAge:25 \nHeight: 5ft10in\nPosition: Main Vocalist, Lead Dancer, Sub Rapper, Center, Maknae");
                break;
            default:
                System.out.println("Name invalid, use stage name in lower case");
                break;


        }

    }
}
