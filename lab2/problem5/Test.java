package problem5;

public class Test {

    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new phdStudent("Alice", 26, "CS", "AI");

        Animal murka = new Kotik("Murka", 5);
        Animal rex = new Dog("Rex", 3);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("\nJohn leaves Murka with Alice:");
        john.leavePetWith(alice);

        registry.printPeople();

        System.out.println("\nJohn retrieves Murka back:");
        john.retrievePetFrom(alice);

        registry.printPeople();

        //assigning dog
        alice.assignPet(rex);

        //leaving dog
        john.assignPet(rex);
        john.leavePetWith(alice);
        
    }
}