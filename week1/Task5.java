package week1;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int balance = 0;
		while(true) {
			System.out.println("Your current balance is: " + balance);
			System.out.println("Please enter your money: ");
			
			Scanner scanner = new Scanner(System.in);
			
			int money = scanner.nextInt();
			balance += money;
			
			System.out.println("You inserted " + money + "KZT!");			
		}	
	}

}
