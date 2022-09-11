import coursework.Employee;

public class Main {

    public static String resultPersonalData(Employee[] employee) {
        double tmp1 = 0;
        String tmp = employee[0].getName();
        for (int i = 1; i < employee.length; i++) {
            tmp1 = employee[i].getEmployeeID();
            System.out.println(employee[i].getName());
        }
        return tmp;
    }

    public static int resultFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++)
            System.out.println(employee[i].toString());
        return 0;
    }


    public static String resultNameToString(Employee[] employee, int id) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getEmployeeID() == id) {
                return employee[i].toString();
            }
        }
        return "none";
    }


    public static double salarySum(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public static int salaryMin(Employee[] employee) {
        int tmp1 = 0;
        double tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp > employee[i].getSalary()) {
                tmp1 = employee[i].getEmployeeID();
                tmp = employee[i].getSalary();
            }

        }
        return tmp1;
    }

    public static double salaryAverage(Employee[] employee) {
        return salarySum(employee) / employee.length;
    }

    public static int salaryMax(Employee[] employee) {
        int tmp1 = 0;
        double tmp = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (tmp < employee[i].getSalary()) {
                tmp1 = employee[i].getEmployeeID();
                tmp = employee[i].getSalary();
            }

        }
        return tmp1;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Miranda Lawson", 1, 1000); // и таких ровно 10
        employee[1] = new Employee("Sarah Thomas", 2, 500);
        employee[2] = new Employee("Billy Brown", 3, 1100);
        employee[3] = new Employee("Esther Carol", 4, 2000);
        employee[4] = new Employee("Robert Son", 5, 2400);
        employee[5] = new Employee("Thomas Hol", 5, 1110);
        employee[6] = new Employee("Hall Jow", 1, 5250);
        employee[7] = new Employee("Sean Dean", 2, 2400);
        employee[8] = new Employee("Dean Sean", 3, 2300);
        employee[9] = new Employee("Ursula Tenn", 4, 2500);



        System.out.println(resultFullName(employee));
        System.out.println(resultPersonalData(employee));
        System.out.println("sum = " + salarySum(employee));
        System.out.println("ave = " + salaryAverage(employee));
        System.out.println(" min " + resultNameToString(employee, salaryMin(employee)));
        System.out.println(" max " + resultNameToString(employee, salaryMax(employee)));

    }


}