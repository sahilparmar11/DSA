import java.util.Scanner;

class Employee_Detail {
    
    private String employeeID;
    private String name;
    private String designation;
    private double salary;
    
    public Employee_Detail(String employeeID, String name, String designation, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee details:");
        
        System.out.print("Enter Employee ID: ");
        String employeeID = sc.nextLine();
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        
        Employee_Detail employee = new Employee_Detail(employeeID, name, designation, salary);
        
        System.out.println("\nEmployee Details:");
        employee.displayDetails();
        
        sc.close();
    }
}
