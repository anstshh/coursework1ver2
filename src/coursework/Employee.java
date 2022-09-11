package coursework;

public class Employee {

    private String name;
    private int department;
    private double salary;
    private int employeeID;
    private static int uniqueID = Integer.parseInt("0");

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        employeeID = Employee.getNextUniqueID();
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

    //public void salaryRaise(double percentage) {
    // double raise = salary * percentage / 100;
    // salary += raise;
    //}

    public static int getNextUniqueID() {
        int id = Integer.parseInt(String.valueOf(uniqueID));
        ++id;
        uniqueID = Integer.parseInt(Integer.toString(id));
        return Integer.parseInt(String.valueOf(uniqueID));
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}