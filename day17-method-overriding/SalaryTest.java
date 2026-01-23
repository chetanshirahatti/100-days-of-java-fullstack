

public class SalaryTest {

    public static void main(String[] args) {


        // Here objects of Employee and Manager are created. Hence both methods are called.
        Employee e1 = new Employee();
        Employee e2 = new Manager();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
