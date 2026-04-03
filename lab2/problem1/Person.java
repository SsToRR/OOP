package problem1;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
    	if(this == o) return true; //exact object?
    	if(!(o instanceof Person)) return false; //is object Person?
    	
    	Person p = (Person) o;
    	return age == p.age && Objects.equals(name, p.name); //compares even if they are null 
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

