package by.tms._Lessons_.Ch05.Операторы._1_Выбор.Switch;

public class tms_1 {
    public static void main(String[] args) {
        String a = "/start";
        switch (a) {
            case "/start":
                System.out.println("Старт");
                break;
            case "/stop":
                System.out.println("Стоп");
                break;
            default:
                System.out.println("Нет такого!");
        }
    }
}

