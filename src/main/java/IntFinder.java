import java.util.Scanner;

public class IntFinder {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the max value: ");
        int max = myScan.nextInt();
        System.out.println("Enter the quantity of values: ");
        int n = myScan.nextInt();
        myScan.close();

        System.out.println(analyzeInts(max, n));
    }

    // Returns the next int from a list
    public static int getInt() {
        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int digit = myInt.nextInt();
        myInt.close();
        return digit;
    }

    /* COMPLETE THIS METHOD
     * Precondition: max > 0, n > 0
     * Write the method analyzeInts, which obtains n values using the getInt 
     * method and returns the proportion of the obtained values that meet all 
     * the following criteria.
     * Value is greater than 0
     * Value is less than max
     * Value is divisible by 3
     * Example: if max is 15 and the values obtained by getInt are 15, 16, -13, 
     * -5, 3, 12, 9, and 18, then analyzeInts should return 0.5 because four out 
     * of eight values (15, 3, 12, and 9) meet all the criteria.
     */
    public static double analyzeInts(int max, int n) {
        // Insert code here

        return 0.0;
    }
}
