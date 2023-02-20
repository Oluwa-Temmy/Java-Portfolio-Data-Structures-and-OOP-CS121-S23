package packagesDemo;

public class Employee {
    public String name;
    private String id;
    private String position;
    private double pay;
    public String termination;
 public Employee(){

}
    public Employee(String name, String id, String position, double pay, String termination){
        this.name = name;
        this.id = id;
        this.position = position;
        this.pay = pay;
        this.termination = termination;
    }
    public String getEmployeeName(){
        return name;
    }
    private String getEmployeeID(){
        return id;
    }
    private double setPay(double pay){
        return this.pay = pay;
    }
    public String setTermination(String termination){
        return this.termination = termination;
    }

    public void displayEmployee(){
        System.out.printf("Employee: %s\nID: %s\nPosition: %s\nPay: $%.2f\nTermination: %s",name,id,position,pay,termination);
    }
}
