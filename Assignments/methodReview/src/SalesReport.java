import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) throws FileNotFoundException {
        final int NUM_DAYS = 30;
        String filename;
        double total_sales;
        double average_sales;

        filename = getFileName();
        total_sales = getTotalSales(filename);
        average_sales = total_sales/NUM_DAYS;
        displayLayResults(total_sales, average_sales);

        System.exit(0);
    }
    public static String getFileName() {
        String file;
        file = JOptionPane.showInputDialog("Enter the name of the file containing\n 30 days of the sales amounts");
        return file;
    }
    public static double getTotalSales(String filename) throws FileNotFoundException {
        double total = 0.0;
        double sales;

        File file = new File(filename);
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            sales = Double.parseDouble(input.nextLine());
            total += sales;
        }
        input.close();
        return total;
    }
    public static void displayLayResults(double total, double average) {
        JOptionPane.showMessageDialog(null, String.format("The total sales for the period is $.2f\n" +
                "The average daily sales were $.2f", total, average));
    }
}
