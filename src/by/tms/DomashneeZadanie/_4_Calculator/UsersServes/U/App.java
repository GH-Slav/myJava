package by.tms.DomashneeZadanie._4_Calculator.UsersServes.U;

import by.tms.DomashneeZadanie._4_Calculator.Reader.ConsoleReader;

public class App {
    ConsoleReader readUser = new ConsoleReader();
    public void userApp(int v) {

        switch (v) {
            case 1:
                System.out.println("Пожалуйста авторизуйтесь в калькуляторе!");
                readUser.getAuth();
                break;
            case 2:
                System.out.println("Пожалуйста зарегистриуйтесь в калькуляторе!");
                readUser.getReg();
                userApp(1);
                break;
            default:
                System.out.println("Ошибка!!!!!!!!");
                userApp(v);
        }
    }
}