package Prac4;

public class Restaurant {

    public void servePizza(CanHavePizza receiver){
        System.out.println("Restaurant serves pizza...");
        receiver.receivePizza();
    }

}

