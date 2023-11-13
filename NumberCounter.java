import java.util.Scanner; // import Scanner class

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter five numbers: "); // prompt for input
        
        // declare and initialize variables to store the counts
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        
        // loop five times and read each number from the user
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt(); // read a number
            
            // check if the number is negative, positive or zero and increment the corresponding count
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        
        input.close(); // close the scanner
        
        // print the counts of negative, positive and zero numbers
        System.out.printf("The number of negative numbers is %d%n", negativeCount);
        System.out.printf("The number of positive numbers is %d%n", positiveCount);
        System.out.printf("The number of zeros is %d%n", zeroCount);
    }
}