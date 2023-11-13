import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int num1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;

    System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
    System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
    System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
    System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
  }
}