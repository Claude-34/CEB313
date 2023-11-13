import java.util.Scanner; // import Scanner class

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter your weight in pounds: "); // prompt for weight
        double weight = input.nextDouble(); // read the weight from the user
        System.out.print("Enter your height in inches: "); // prompt for height
        double height = input.nextDouble(); // read the height from the user
        input.close(); // close the scanner
        
        // convert the weight and height to kilograms and meters
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        
        // calculate and display the BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.printf("Your BMI is %.2f%n", bmi);
        
        // display the information from the Department of Health and Human Services/National Institutes of Health
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}