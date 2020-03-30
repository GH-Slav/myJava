package by.tms.calc.application;

import by.tms.calc.calculator.Calculation;
import by.tms.calc.calculator.Calculator;
import by.tms.calc.reader.ConsoleReader;
import by.tms.calc.reader.Reader;
import by.tms.calc.writer.ConsoleWriter;
import by.tms.calc.writer.Writer;

public class ConsoleApplication implements Application {
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();
    private Calculation calculation = new Calculator();

    @Override
    public void run() {

    }
}
