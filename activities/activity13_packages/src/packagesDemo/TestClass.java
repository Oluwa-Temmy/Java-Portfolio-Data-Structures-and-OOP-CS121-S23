package packagesDemo;

public class TestClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Johnny Bravo","556","Manager",33.88,"February 10th, 1908");
        employee1.setTermination("Love laugh live");
        System.out.println(employee1.getEmployeeName());
        //employee1.setPay(40.89);
        //employee1.getEmployeeID();
        employee1.displayEmployee();
        System.out.println();
    }




}
