package by.tms._Lessons_.Ch05.Операторы._3_Переход.Continue;

public class ContinueLabel {
    public static void main(String args[]) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}