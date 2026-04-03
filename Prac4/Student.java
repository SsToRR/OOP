package Prac4;

public class Student extends Person implements CanHavePizza {

    public Student(String name){
        super(name);
    }

    @Override
    public void receivePizza(){
        System.out.println(name + " the student received pizza!");
    }

}

