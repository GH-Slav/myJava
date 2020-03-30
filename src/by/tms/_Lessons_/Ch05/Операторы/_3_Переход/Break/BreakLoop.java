package by.tms._Lessons_.Ch05.Операторы._3_Переход.Break;

public class BreakLoop {
    public static void main(String[] args) {
        for (int л = 0; л < 110; л++) {
            if (л == 10) break;
            System.out.println(л);
        }
        System.out.println("цикл завершен");
    }
}
