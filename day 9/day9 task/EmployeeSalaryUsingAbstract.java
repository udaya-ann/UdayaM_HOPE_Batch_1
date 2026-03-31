abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeSalaryUsingAbstract {
public static void main(String[] args) {
    Employee fullTimeEmp = new FullTimeEmployee("Shruthi", 101, 5000);
    Employee partTimeEmp = new PartTimeEmployee("Udaya", 102, 20, 80);

    System.out.println("Full-Time Employee Salary: " + fullTimeEmp.calculateSalary());
    System.out.println("Part-Time Employee Salary: " + partTimeEmp.calculateSalary());
}
    
}