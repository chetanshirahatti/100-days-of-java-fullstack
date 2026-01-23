

public class Employee {

    void calculateSalary() {
        System.out.println("Basic employee salary");
    }
}


 class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager salary with bonus");
    }
}
