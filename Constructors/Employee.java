class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary updated to: " + this.salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID (public): " + this.employeeID);
        System.out.println("Department (protected): " + this.department);
        System.out.println("Salary (private via public getter): " + this.getSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Sales", 50000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
        employee.setSalary(55000.0);
        System.out.println();

        Manager manager = new Manager(202, "IT", 90000.0);
        manager.displayManagerDetails();
        manager.setSalary(95000.0);
    }
}
