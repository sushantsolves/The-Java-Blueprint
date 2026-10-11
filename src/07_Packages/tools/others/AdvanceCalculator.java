package tools.other;

public class AdvancedCalculator {

    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }

        return a / b;
    }

    public double square(double n) {
        return n * n;
    }
}