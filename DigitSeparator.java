import java.util.Scanner; // import Scanner class

public class DigitSeparator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter a five-digit number: "); // prompt for input
        int number = input.nextInt(); // read the number from the user
        input.close(); // close the scanner
        
        // separate the number into its individual digits using division and remainder operations
        int digit1 = number / 10000; // get the first digit
        int digit2 = (number % 10000) / 1000; // get the second digit
        int digit3 = (number % 1000) / 100; // get the third digit
        int digit4 = (number % 100) / 10; // get the fourth digit
        int digit5 = number % 10; // get the fifth digit
        
        // print the digits separated by three spaces each
        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
    }
}