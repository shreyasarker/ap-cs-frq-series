public class Feeder {
    private int currentFood;

    // Constructor to initialize the feeder with a specified amount of food
    public Feeder(int initialFood) {
        currentFood = initialFood;
    }

    // Simulates one day of feeding
    public void simulateOneDay(int numBirds) {
        int eachBirdEats = (int) (Math.random() * 41) + 10;
        int totalEaten = numBirds * eachBirdEats;
        if (totalEaten > currentFood) {
            currentFood = 0;
        } else {
            currentFood -= totalEaten;
        }
    }

    // Simulates multiple days of feeding
    public int simulateManyDays(int numBirds, int numDays) {
        int daysSoFar = 0;
        while (currentFood > 0 && daysSoFar < numDays) {
            simulateOneDay(numBirds);
            daysSoFar++;
        }
        return daysSoFar;
    }

    // Returns the current amount of food remaining in the feeder
    public int getCurrentFood() {
        return currentFood;
    }

    // Main method to test the Feeder class
    public static void main(String[] args) {
        Feeder birdFeeder = new Feeder(1000); // Initialize the feeder with 1000 grams of food
        int daysFed = birdFeeder.simulateManyDays(5, 10); // Simulate 5 birds for 10 days

        System.out.println("Feeder provided food for " + daysFed + " days.");
        System.out.println("Food remaining: " + birdFeeder.getCurrentFood() + " grams.");
    }
}
