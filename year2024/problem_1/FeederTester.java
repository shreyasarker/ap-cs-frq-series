package year2024.problem_1;

public class FeederTester {
    public static void main(String[] args) {
        Feeder f = new Feeder(2400);
        int days = f.simulateManyDays(10, 4);
        System.out.println("Birds/Bear found food on: " + days + " day(s)");
        System.out.println("Food left: " + f.getCurrentFood() + " grams");

        Feeder f2 = new Feeder(250);
        int days2 = f2.simulateManyDays(10, 5);
        System.out.println("Birds/Bear found food on: " + days2 + " day(s)");
        System.out.println("Food left: " + f2.getCurrentFood() + " grams");

        Feeder f3 = new Feeder(0);
        int days3 = f3.simulateManyDays(5, 10);
        System.out.println("Birds/Bear found food on: " + days3 + " day(s)");
        System.out.println("Food left: " + f3.getCurrentFood() + " grams");
    }
}
