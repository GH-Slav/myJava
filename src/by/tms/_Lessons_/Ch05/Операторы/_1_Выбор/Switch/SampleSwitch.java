package by.tms._Lessons_.Ch05.Операторы._1_Выбор.Switch;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++)
            switch (i) {
                case 0:
                    System.out.println("Ноль");
                    break;
                case 1:
                    System.out.println("Один");
                    break;
                case 2:
                    System.out.println("Два");
                    break;
                case 3:
                    System.out.println("Три");
                    break;
                case 4:
                    System.out.println("Четыре");
                    break;
                default:
                    System.out.println("Число больше четыре");
            }
    }
}
