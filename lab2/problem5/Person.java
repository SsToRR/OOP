package problem5;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void leavePetWith(Person other) {
        if (!hasPet()) {
            System.out.println(name + " has no pet.");
            return;
        }
        other.assignPet(pet);
        pet = null;
    }

    public void retrievePetFrom(Person other) {
        if (other.hasPet()) {
            this.pet = other.pet;
            other.removePet();
        }
    }

    public abstract String getOccupation();

    public String toString() {
        return name + " (" + getOccupation() + ") pet: " +
                (pet == null ? "none" : pet.getName());
    }
}

