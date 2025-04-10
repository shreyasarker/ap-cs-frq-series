# Problem 1: Feeder Class Simulation (2024)

## Problem Description:

You are tasked with simulating the behavior of a bird feeder that dispenses food to birds visiting it. The feeder has a certain amount of food, and each day, a random number of birds visit, each consuming a random amount of food. Your goal is to implement methods that simulate the daily feeding process and determine how many days the feeder can sustain the birds.

## Class Specification:

### Feeder Class:

```
public class Feeder {
    private int currentFood;

    // Constructor
    public Feeder(int initialFood) {
        currentFood = initialFood;
    }

    // Simulates one day of feeding
    public void simulateOneDay(int numBirds) {
        // Implementation goes here...
    }

    // Simulates many days of feeding
    public int simulateManyDays(int numBirds, int numDays) {
        // Implementation goes here...
    }

    // Returns the current amount of food in the feeder
    public int getCurrentFood() {
        return currentFood;
    }
}
```

## Requirements:
- **simulateOneDay:** This method should simulate one day where a random number of birds consume a random amount of food.
- **simulateManyDays:** This method should simulate several days, given a number of birds and days to simulate.
- **getCurrentFood:** This method should return the current food left in the feeder.
