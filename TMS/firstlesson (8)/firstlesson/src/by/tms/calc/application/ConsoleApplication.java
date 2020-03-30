package by.tms.calc.application;

import by.tms.calc.reader.ConsoleReader;
import by.tms.calc.reader.Reader;

public class ConsoleApplication implements Application {
    private Reader reader = new ConsoleReader();
//    private Writer writer = new ConsoleWriter();
//    private Calculation calculation = new Calculator();



    @Override
    public void run() {
        reader.readString();
    }
}
