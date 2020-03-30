package by.tms.test;

public class CalcV2 implements Calculation {

    private StringBuilder history = new StringBuilder();

    @Override
    public double calc(double a, double b, String op) {
        System.out.println("Hello");
        switch (op){
            case "sum":
                double sum = sum(a, b);
                history.append("Result ").append(sum);
                return sum;
            case "sub":
                return sub(a, b);
            default: return 0;
        }
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double sum(double a, double b) {
        return a + b;
    }
}
