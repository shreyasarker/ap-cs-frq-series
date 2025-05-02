# 🐦 AP CS A FRQ - 2024 Feeder Simulation

This Java project simulates birds (and occasionally a bear) eating from a bird feeder over multiple days. It's based on the 2024 AP CS A Free Response Question (FRQ), paraphrased for educational purposes.

## 📘 Problem Summary

You are given a bird feeder with a certain amount of food (in grams). Every day, a number of birds (or rarely, a bear) may come and eat from it.

### Day Simulation Rules:

- **Normal Day (95%)**: Each bird eats a random amount between 10 and 50 grams.
- **Bear Day (5%)**: A bear comes and eats everything.
- If birds try to eat more than what's available, the feeder becomes empty.

The simulation runs for several days and returns how many days food was actually consumed (i.e., birds or bear ate).

## 🧪 Example Usage

```java
Feeder f = new Feeder(2400);
int result = f.simulateManyDays(10, 4);
System.out.println(result); // Might print 4
````

## 📂 Files

* `Feeder.java`: Contains the logic for day and multi-day simulation.
* `FeederTester.java`: Runs a few test scenarios.
* `README.md`: This explanation.

## 🚀 How to Run

Compile and run in your terminal:

```bash
javac Feeder.java FeederTester.java
java FeederTester
```

## 📌 Notes

* This repo does **not** reproduce any copyrighted content.
* The problem has been rephrased for fair use and instructional purposes only.

## ✅ What You Learn

* Random number simulation
* Probability logic
* Loop control and conditions

