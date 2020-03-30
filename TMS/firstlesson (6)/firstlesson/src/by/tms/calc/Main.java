package by.tms.calc;

import by.tms.calc.application.Application;
import by.tms.calc.application.ConsoleApplication;

public class Main {
    public static void main(String[] args) {
        Application application = new ConsoleApplication();
        application.run();
    }
}
