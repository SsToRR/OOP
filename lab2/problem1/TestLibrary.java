package problem1;

public class TestLibrary {

    public static void main(String[] args) {

        book b1 = new book("Clean Code", "Robert Martin", 2008, 464);
        book b2 = new book("Java Basics", "John Doe", 2020, 300);

        System.out.println(b1);
        System.out.println(b2);
    }
}

