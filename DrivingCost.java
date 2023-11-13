import java.util.Scanner; // import Scanner class

public class DrivingCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter the total miles driven per day: "); // prompt for miles
        double miles = input.nextDouble(); // read the miles from the user
        System.out.print("Enter the cost per gallon of gasoline: "); // prompt for cost
        double cost = input.nextDouble(); // read the cost from the user
        System.out.print("Enter the average miles per gallon: "); // prompt for average
        double average = input.nextDouble(); // read the average from the user
        System.out.print("Enter the parking fees per day: "); // prompt for parking
        double parking = input.nextDouble(); // read the parking from the user
        System.out.print("Enter the tolls per day: "); // prompt for tolls
        double tolls = input.nextDouble(); // read the tolls from the user
        input.close(); // close the scanner
        
        // calculate and display the daily driving cost using the formula: (miles / average) * cost + parking + tolls
        double drivingCost = (miles / average) * cost + parking + tolls;
        System.out.printf("Your daily driving cost is %.2f%n", drivingCost);
        
        // display the information from the Department of Health and Human Services/National Institutes of Health
        System.out.println("Car pooling can help you save money and reduce carbon emissions.");
        System.out.println("Some car-pooling websites you can check out are:");
        System.out.println("- BlaBlaCar[^1^][1]: A community-based travel network that connects drivers and passengers who are travelling to the same destination.");
        System.out.println("- RideConnect[^2^][3]: A ridesharing platform that can be used by anyone to create their own rideshare with people they trust.");
    }
}