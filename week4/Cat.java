package week4;

public class Cat extends Animal {

    private String breed;

    public Cat() {
        super();
        System.out.println("Cat created");
    }

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Meow");
        }
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + ", breed=[" + breed + "]";
    }
}
