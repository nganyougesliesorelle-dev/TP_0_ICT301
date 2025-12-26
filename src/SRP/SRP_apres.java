package SRP;

public class SRP_apres {
    public class Employee {
        String name;
        double salary;

        public String getName() { return name; }
        public double getSalary() { return salary; }
    }
}
class SalaryCalculator {
    public double calculateNetPay(SRP_apres.Employee emp) {
        return emp.getSalary() * 0.8;
    }
}
