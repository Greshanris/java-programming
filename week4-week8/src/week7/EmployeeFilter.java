package week7;

/*
Filter employees
 */

import java.util.ArrayList;

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rishav", 45000));
        employees.add(new Employee("Nishant", 90330));
        employees.add(new Employee("Samaya", 29323));
        employees.add(new Employee("Muktinath", 23445));
        employees.add(new Employee("Sushant", 23333));
        employees.add(new Employee("Roshan",50032));
        employees.add(new Employee("Bibesh", 344332));

        // Using Lambda in shortcut
        employees.forEach(employee -> {
            if (employee.getSalary() > 30000) {
                System.out.println("Name: " + employee.getName() + " , Salary: " + employee.getSalary());
            }
        });
    }
}
