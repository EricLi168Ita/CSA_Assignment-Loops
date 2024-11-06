import java.util.Scanner;

public class IntFinder {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the max value: ");
        int max = myScan.nextInt();
        System.out.println("Enter the quantity of values: ");
        int n = myScan.nextInt();
        System.out.println(analyzeInts(max, n));
        myScan.close();
    }

    // Returns the next int from the user
    public static int getInt() {
        Scanner myInt = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int digit = 0;
        if (myInt.hasNextInt())
            digit = myInt.nextInt();
        return digit;
    }

    // Analyzes the n integers provided by the user, checking the criteria
    public static double analyzeInts(int max, int n) {
        int count = 0;

        // Obtain n integers and check the criteria
        for (int i = 0; i < n; i++) {
            int value = getInt();

            // Check if value meets all the conditions
            if (value > 0 && value < max && value % 3 == 0) {
                count++;
            }
        }

        // Return the proportion of integers that meet the criteria
        return (double) count / n;
    }
}
