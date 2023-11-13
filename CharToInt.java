public class CharToInt {

    public static void main(String[] args) {
        // declare and initialize an array of characters
        char[] chars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
        
        // loop through the array and print the integer equivalent of each character
        for (char c : chars) {
            System.out.printf("The integer equivalent of %c is %d%n", c, (int) c);
        }
    }
}