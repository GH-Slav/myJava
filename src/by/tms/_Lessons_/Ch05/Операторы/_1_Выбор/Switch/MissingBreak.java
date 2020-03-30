package by.tms._Lessons_.Ch05.Операторы._1_Выбор.Switch;

public class MissingBreak {
    public static void main(String[] args) {
        for (int b = 0; b < 19; b++)
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("b меньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("b меньше 10");
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    System.out.println("b меньше 15");
                    break;
                default:
                    System.out.println("b равно 15 или b больше 15");
            }
    }
}
