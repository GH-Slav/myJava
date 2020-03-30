package by.tms.calc.reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String readString() {
        return scanner.nextLine();
    }

    @Override
    public Integer readInteger() {
        return scanner.nextInt();
    }
}
