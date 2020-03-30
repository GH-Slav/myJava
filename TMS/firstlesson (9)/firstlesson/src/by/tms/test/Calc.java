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

    public static void main(String[] args) {
        B c = new C();
        C.abc();
        System.out.println(c.a);
        System.out.println(B.a);
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double sum(double a, double b) {
        return a + b;
    }
}
