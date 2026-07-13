package Task3;

public class Employee {
    String name;
    double salary;
    String designation;

    void newEmployee(String name) {
        this.name = name;
        this.salary = 30000;
        this.designation = "junior";

    }

    void calculateTax() {
    double tax;

    if (this.salary > 30000 && this.salary <= 50000) {
        tax = this.salary * 0.1;
    } 
    else if (this.salary > 50000) {
        tax = this.salary * 0.3;
    } 
    else {
        System.out.println("No need to pay tax");
        return;
    }

    String s = this.name + " Tax Amount: " + tax + " Tk";
    System.out.println(s);
}

    void promoteEmployee(String designation) {
        this.designation = designation;
        if (designation.equals("senior")) {
            this.salary = salary + 25000;
            System.out.println(this.name + " has been promoted to senior");
            System.out.println("New salary : " + this.salary + "Tk");

        }
        if (designation.equals("lead")) {
            this.salary = salary + 50000;
            System.out.println(this.name + " has been promoted to lead");
            System.out.println("New salary : " + this.salary + "Tk");
        }
        if (designation.equals("manager")) {
            this.salary = salary + 75000;
            System.out.println(this.name + " has been promoted to manager");
            System.out.println("New salary : " + this.salary + "Tk");
        }
    }

    void displayInfo() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Designation: " + this.designation);
    }

}
