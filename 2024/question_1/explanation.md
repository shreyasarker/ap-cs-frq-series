# Explanation for Problem 1: Feeder Class Simulation

## Overview:
In this problem, we simulate a bird feeder that dispenses food to visiting birds. The goal is to determine how many days the feeder can sustain the birds based on the food available and the number of birds that visit each day.

### Code Breakdown:

1. **Feeder Class:**
   - The `Feeder` class has an instance variable `currentFood`, which keeps track of the amount of food left in the feeder.
   
2. **Constructor:**
   - The constructor `Feeder(int initialFood)` initializes the `currentFood` with the specified value.
   
3. **simulateOneDay Method:**
   - This method simulates one day of feeding. The number of birds is passed as a parameter, and each bird eats a random amount of food between 10 and 50 grams. If the total food eaten exceeds the available food, the feeder runs out of food.
   
4. **simulateManyDays Method:**
   - This method simulates multiple days of feeding, where each day a certain number of birds visit. It keeps track of the number of days the feeder can provide food before it runs out.

5. **getCurrentFood Method:**
   - This method simply returns the remaining amount of food in the feeder.

### Example:
For the test case:
```java
Feeder birdFeeder = new Feeder(1000);
int daysFed = birdFeeder.simulateManyDays(5, 10);
System.out.println("Feeder provided food for " + daysFed + " days.");
System.out.println("Food remaining: " + birdFeeder.getCurrentFood() + " grams.");
