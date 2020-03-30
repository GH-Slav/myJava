package by.tms._Lessons_.Ch05.Операторы._3_Переход.Break;

public class BreakLoop3 {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд_" + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // выход из цикла, значение
                                    //переменной j равно 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
