public class AppleBag {

    public static void main(String[] args) {}

    /*
     * Returns the weight of the next apple to be added to the bag, with 
     * a different weight being returned with each call.
     */
    public static double getApple() {
        int apple = (int)Math.floor(Math.random() * (20 - 5 + 1) + 5); // (max - min + 1) + min
        double weight = (double)apple / 10.0;
        return weight;
    }

    /* COMPLETE THIS METHOD
     * Precondition: 0 < allowedVariation < targetWeight
     * Write the method bagApples, which obtains the weights of apples to be 
     * added to a bag using calls to 'getApple' and returns the number of apples 
     * that are added to the bag until the combined weight exceeds targetWeight 
     * minus allowedVariation.
     * Example: If targetweight is 10.0 and allowedVariation is 0.5, the bagApples 
     * method will return the number of apples that are added until the combined 
     * weight exceeds 9.5
     */
    public static int bagApples(double targetWeight, double allowedVariation) {
        // Insert code here
        
        return 0;
    }
}