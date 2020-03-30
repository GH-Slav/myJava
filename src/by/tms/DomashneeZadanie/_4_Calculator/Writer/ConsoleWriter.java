package by.tms.DomashneeZadanie._4_Calculator.Writer;


import by.tms.DomashneeZadanie._4_Calculator.Calculator.Calc;

public class ConsoleWriter implements Writer {


    @Override
    public void write(String mes, int x) {
        System.out.println(mes);
        System.out.println(x);
    }
}
