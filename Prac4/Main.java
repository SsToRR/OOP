package Prac4;

public class Main {

    public static void main(String[] args){

        Restaurant r = new Restaurant();

        Student s1 = new Student("Miras");
        Student s2 = new Student("Ali");

        Cat c1 = new Cat("Barsik");

        r.servePizza(s1);
        r.servePizza(s2);
        r.servePizza(c1);

    }

}
