import java.util.Scanner; // import Scanner class

public class PopulationEstimator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter the current world population: "); // prompt for population
        long population = input.nextLong(); // read the population from the user
        System.out.print("Enter the annual world population growth rate (in percentage): "); // prompt for growth rate
        double growthRate = input.nextDouble(); // read the growth rate from the user
        input.close(); // close the scanner
        
        // calculate and display the estimated world population after one, two, three, four and five years
        System.out.println("Estimated world population:");
        for (int year = 1; year <= 5; year++) {
            // calculate the estimated population using the formula: P(t) = P(0) * (1 + r)^t
            // where P(t) is the population after t years, P(0) is the initial population, and r is the growth rate
            long estimatedPopulation = (long) (population * Math.pow(1 + growthRate / 100, year));
            System.out.printf("After %d year(s): %d%n", year, estimatedPopulation);
        }
    }
}