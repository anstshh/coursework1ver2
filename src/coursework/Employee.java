package coursework;

public class Employee {

    private String name;
    private int department;
    private double salary;
    private int employeeId;
    private static int counter = 0;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.employeeId = ++counter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public double getSalary() {
        this.salary = salary;
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", employeeID='" + employeeId + '\'' +
                '}';
    }
}