class Employee {

    int empId;
    String name;

    // Constructor
    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Method to generate email
    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {

    String department;

    // Constructor
    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    // Override email generation
    @Override
    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}

public class CompanyApp {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Neelu");
        Manager m1 = new Manager(102, "Amit", "HR");

        System.out.println("Employee Email: " + e1.generateEmail());
        System.out.println("Manager Email: " + m1.generateEmail());
    }
}