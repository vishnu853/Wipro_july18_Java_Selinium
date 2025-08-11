package LabSession_July_24;

abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Display method (optional)
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Subclass for permanent employees
class PermanentEmployee extends Employee {
    private double monthlySalary;

    public PermanentEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create a PermanentEmployee
        Employee emp1 = new PermanentEmployee("Alice", 101, 50000);
        emp1.displayInfo();
        System.out.println("Salary: ₹" + emp1.calculateSalary());

        System.out.println();

        // Create a ContractEmployee
        Employee emp2 = new ContractEmployee("Bob", 202, 300, 120);
        emp2.displayInfo();
        System.out.println("Salary: ₹" + emp2.calculateSalary());
    }
}