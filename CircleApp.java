import java.util.Scanner; // import Scanner class

public class CircleApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter the radius of the circle as an integer: "); // prompt for input
        int radius = input.nextInt(); // read the radius from the user
        input.close(); // close the scanner
        
        // print the diameter, circumference and area using the formulas and Math.PI constant
        System.out.printf("The diameter of the circle is %d%n", 2 * radius); 
        System.out.printf("The circumference of the circle is %.2f%n", 2 * Math.PI * radius);
        System.out.printf("The area of the circle is %.2f%n", Math.PI * radius * radius);
    }
}