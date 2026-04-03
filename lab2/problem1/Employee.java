package problem1;

import java.util.Objects;

public class Employee extends Person {

    private String employeeId;

    public Employee(String name, int age, String id) {
        super(name, age);
        this.employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public boolean equals(Object o) {

        if (!super.equals(o)) return false; //method from Person
        if (!(o instanceof Employee)) return false; // object ? Employee
        
        Employee e = (Employee) o;

        return Objects.equals(employeeId, e.employeeId); // check ids
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }
}

