package task5;

public class Test {
    public static void main(String[] args) {

        // Chocolates
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Snickers", 70),
                new Chocolate("Mars", 60)
        };

        Sort.bubbleSort(chocolates);

        System.out.println("Sorted Chocolates:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        // Time
        Time[] times = {
                new Time(12, 30),
                new Time(9, 15),
                new Time(18, 45)
        };

        Sort.mergeSort(times);

        System.out.println("\nSorted Times:");
        for (Time t : times) {
            System.out.println(t);
        }

        // Employees (reuse from task4)
        task4.Employee[] employees = {
                new task4.Employee("Alice", 5000, java.time.LocalDateTime.now(), "INS1"),
                new task4.Employee("Bob", 7000, java.time.LocalDateTime.now(), "INS2"),
                new task4.Employee("Charlie", 6000, java.time.LocalDateTime.now(), "INS3")
        };

        Sort.bubbleSort(employees);

        System.out.println("\nSorted Employees:");
        for (task4.Employee e : employees) {
            System.out.println(e);
        }
    }
}