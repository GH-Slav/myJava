package by.tms.test;

public class Calc implements Calculation {
    @Override
    public double calc(double a, double b, String op) {
        switch (op) {
            case "sum":
                return sum(a, b);
            case "sub":
                return sub(a, b);
            default:
                return 0;
        }
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double sum(double a, double b) {
        return a + b;
    }
}
