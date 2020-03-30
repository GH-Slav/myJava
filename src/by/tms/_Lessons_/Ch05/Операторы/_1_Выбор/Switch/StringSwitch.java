package by.tms._Lessons_.Ch05.Операторы._1_Выбор.Switch;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "Два";

        switch (str) {
            case "Один":
                System.out.println("1");
                break;
            case "Два":
                System.out.println("2");
                break;
            case "Три":
                System.out.println("3");
                break;
            default:
                System.out.println("НЕТУ");
        }
    }
}
