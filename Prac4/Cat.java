package Prac4;

public class Cat extends Animal implements CanHavePizza {

    public Cat(String name){
        super(name);
    }

    @Override
    public void receivePizza(){
        System.out.println(name + " the cat happily eats pizza!");
    }

}
