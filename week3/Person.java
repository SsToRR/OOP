package week3;
//Solution by Capybara, Cat and ? lover

public class Person {

    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return gender.toString();
    }
}
