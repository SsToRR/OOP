package practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] expressions = input.split(" ");

        for (String expr : expressions) {

            try {
                StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand = Double.parseDouble(leftString);
                double rightOperand = Double.parseDouble(rightString);

                double result = 0;

                switch (operator) {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        if (rightOperand == 0)
                            throw new ArithmeticException();
                        result = leftOperand / rightOperand;
                        break;
                }

                System.out.println(expr + " = " + result);

            } catch (NoSuchElementException e) {
                System.out.println(expr + " → Invalid syntax");

            } catch (NumberFormatException e) {
                System.out.println(expr + " → Not a number");

            } catch (ArithmeticException e) {
                System.out.println(expr + " → Division by zero");
            }
        }
    }
}
