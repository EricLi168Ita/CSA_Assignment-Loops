public class AppleBag {

    public static void main(String[] args) {
        double targetWeight = 10.0;
        double allowedVariation = 0.5;
        int applesAdded = bagApples(targetWeight, allowedVariation);
        System.out.println("Apples added: " + applesAdded);
    }

    // Returns the weight of the next apple to be added to the bag
    public static double getApple() {
        int apple = (int) Math.floor(Math.random() * (20 - 5 + 1) + 5); // Random apple weight between 5 and 20 grams
        return apple / 10.0; // Convert to weight between 0.5 and 2.0 kilograms
    }

    public static int bagApples(double targetWeight, double allowedVariation) {
        double totalWeight = 0.0;
        int numApples = 0;

        // Keep adding apples until the total weight exceeds the target weight minus allowed variation
        while (totalWeight <= (targetWeight - allowedVariation)) {
            double appleWeight = getApple();
            totalWeight += appleWeight;
            numApples++;
        }

        return numApples;
    }
}
