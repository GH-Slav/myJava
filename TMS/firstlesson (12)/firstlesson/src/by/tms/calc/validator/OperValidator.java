package by.tms.calc.validator;

public class OperValidator {
    public static boolean valid(String operation){
        int length = operation.length();
        return length == 3;
    }
}
