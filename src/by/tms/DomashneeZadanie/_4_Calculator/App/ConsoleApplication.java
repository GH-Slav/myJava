package by.tms.DomashneeZadanie._4_Calculator.App;

import by.tms.DomashneeZadanie._4_Calculator.Calculator.Calc;
import by.tms.DomashneeZadanie._4_Calculator.Calculator.CalcIN;
import by.tms.DomashneeZadanie._4_Calculator.Reader.ConsoleReader;
import by.tms.DomashneeZadanie._4_Calculator.Reader.Reader;
import by.tms.DomashneeZadanie._4_Calculator.UsersServes.List.User;
import by.tms.DomashneeZadanie._4_Calculator.UsersServes.U.App;
import by.tms.DomashneeZadanie._4_Calculator.Writer.ConsoleWriter;
import by.tms.DomashneeZadanie._4_Calculator.Writer.Writer;


public class ConsoleApplication implements Application {
    Reader reader = new ConsoleReader();
    Writer writer = new ConsoleWriter();
    CalcIN calcIN = new Calc();
    App uApp = new App();
    User user = null;

    @Override
    public void run() {
        int a, b, c, R;
        System.out.println("Запуск калькулятора!");
        a = reader.getInt();
        c = reader.getOperation();
        b = reader.getInt();
        R = calcIN.calc(a, b, (char) c);
        writer.write("Результат равен ", R);
    }

    @Override
    public void runuser() {
        int u;
        System.out.println("Привет");
        System.out.println("Нажмите 1 для авторизации или 2 для регистрации!");
        uApp.userApp(u = reader.getInt());
     //   System.out.println("Привет " +  user.getИМЯЛОГИНА()); здесь не получаеться

    }


}


