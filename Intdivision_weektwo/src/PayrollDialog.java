import javax.swing.JOptionPane;

public class PayrollDialog {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;
        double yearlyPay;


        name = JOptionPane.showInputDialog("what is your name?");
        hours = Integer.parseInt(JOptionPane.showInputDialog("How long do u work bruh?"));
        payRate = Double.parseDouble(JOptionPane.showInputDialog("what do they pay u at ur 9-5?"));
        grossPay = hours * payRate;
        yearlyPay = grossPay*360;
        JOptionPane.showMessageDialog(null, String.format("alright %s" +
                                        "\n your gross pay is $%.2f", name, grossPay));
        JOptionPane.showMessageDialog(null, String.format("damn, you really are broke.\n thats $%.2f" + " a yer. broke ass mf", yearlyPay));

        System.exit(0);
    }
}
