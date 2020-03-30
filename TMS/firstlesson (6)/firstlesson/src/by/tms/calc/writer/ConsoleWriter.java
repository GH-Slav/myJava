package by.tms.calc.writer;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
