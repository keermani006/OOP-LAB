class Employee {
    private String empName;
    private double salary;

    public void setEmpName(String name) {
        this.empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class EncapsulationExample4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Alice");
        emp.setSalary(5000);
        System.out.println("Employee: " + emp.getEmpName() + ", Salary: $" + emp.getSalary());
    }
}
