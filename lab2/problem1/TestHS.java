package problem1;

import java.util.HashSet;

public class TestHS {

    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee("Miras", 18, "24B01"));
        employees.add(new Employee("Miras", 18, "24B01")); // duplicate
        employees.add(new Employee("Ali", 19, "24B02"));

        System.out.println("Total employees: " + employees.size());

        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
}
