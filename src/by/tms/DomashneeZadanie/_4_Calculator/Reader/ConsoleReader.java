package by.tms.DomashneeZadanie._4_Calculator.Reader;

import by.tms.DomashneeZadanie._4_Calculator.UsersServes.List.User;
import by.tms.DomashneeZadanie._4_Calculator.UsersServes.Serves.Auth;
import by.tms.DomashneeZadanie._4_Calculator.UsersServes.Serves.Reg;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    Scanner scan = new Scanner(System.in);
    private Auth auth = new Auth();
    private Reg reg = new Reg();

    @Override
    public int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scan.next();
            num = getInt();
        }
        return num;
    }


    @Override
    public int getOperation() {
        System.out.println("Введите операцию:");
        int operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }

    @Override
    public void getAuth() {
        System.out.println("Введите логин");
        String v1 = scan.nextLine();
        System.out.println("Введите пароль");
        String vv1 = scan.nextLine();
        auth.авто(v1, vv1);
    }


    @Override
    public void getReg() {
        System.out.println("Введите логин");
        String v2 = scan.nextLine();
        System.out.println("Введите пароль");
        String vv2 = scan.nextLine();
        User user = new User(v2, vv2);
        reg.рег(user);
    }


}

