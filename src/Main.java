import coursework.Employee;


public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Miranda Lawson", 1, 1000);
        employee[1] = new Employee("Sarah Thomas", 2, 500);
        employee[2] = new Employee("Billy Brown", 3, 1100);
        employee[3] = new Employee("Esther Carol", 4, 2000);
        employee[4] = new Employee("Robert Son", 5, 2400);
        employee[5] = new Employee("Thomas Hol", 5, 1110);
        employee[6] = new Employee("Hall Jow", 1, 5250);
        employee[7] = new Employee("Sean Dean", 2, 2400);
        employee[8] = new Employee("Dean Sean", 3, 2300);
        employee[9] = new Employee("Ursula Ten", 4, 2500);


        System.out.println(printIdentityInfo(employee));
        System.out.println(printFullName(employee));
        System.out.println("Sum of all salaries = " + salarySum(employee));
        System.out.println("Average salary = " + calculateAverageSalary(employee));
        System.out.println("Minimum salary " + printNameSurname (employee, salaryMin(employee)));
        System.out.println("Maximum salary " + printNameSurname(employee, salaryMax(employee)));

    }

    public static String printIdentityInfo (Employee[] employee) {
        double identityInfo = 0;
        String identityInfo1 = employee[0].getName();
        for (int i = 1; i < employee.length; i++) {
            identityInfo = employee[i].getEmployeeId();
            System.out.println(employee[i].getName());
        }
        return identityInfo1;
    }

    public static int printFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].toString());
        return 0;
    }


    public static String printNameSurname(Employee[] employee, double id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getEmployeeId() == id) {
                return employee[i].toString();
            }
        }
        return null;
    }


    public static double salarySum(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public static double salaryMin(Employee[] employee) {
        double minValue1= 0;
        double minValue = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (minValue > employee[i].getSalary()) {
                minValue1 = employee[i].getEmployeeId();
                minValue = employee[i].getSalary();
            }

        }
        return minValue1;

    }

    public static double salaryMax(Employee[] employee) {
        double maxValue1 = 0;
        double maxValue = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (maxValue < employee[i].getSalary()) {
                maxValue1 = employee[i].getEmployeeId();
                maxValue = employee[i].getSalary();
            }

        }
        return maxValue1;
    }

    public static double calculateAverageSalary(Employee[] employee) {
        int counter = 0;
        double sumSalaryAverage = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee != null) {
                counter++;
                sumSalaryAverage += employee[i].getSalary();
            }
        }
        return sumSalaryAverage / counter;


    }




}