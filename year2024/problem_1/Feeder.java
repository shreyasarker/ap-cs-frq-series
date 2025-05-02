package year2024.problem_1;

import java.util.Random;

public class Feeder {
    private int currentFood;
    private static final Random rand = new Random();

    public Feeder(int initialFood) {
        currentFood = Math.max(0, initialFood);
    }

    public void simulateOneDay(int numBirds) {
        if (currentFood == 0)
            return;

        int chance = rand.nextInt(100); // 0 to 99
        if (chance < 5) {
            // 5% chance a bear comes and eats all the food
            currentFood = 0;
        } else {
            // 95% chance birds eat
            int foodPerBird = rand.nextInt(41) + 10; // 10 to 50
            int totalConsumed = foodPerBird * numBirds;
            if (totalConsumed >= currentFood) {
                currentFood = 0;
            } else {
                currentFood -= totalConsumed;
            }
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        int daysWithFood = 0;
        for (int i = 0; i < numDays; i++) {
            if (currentFood == 0)
                break;
            simulateOneDay(numBirds);
            daysWithFood++;
        }
        return daysWithFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }
}
